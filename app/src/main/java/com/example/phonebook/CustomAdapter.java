package com.example.phonebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contacts> {

    private ArrayList<Contacts> users;

    public CustomAdapter(@NonNull Context context, ArrayList<Contacts> users) {
        super(context, R.layout.list_item);
        this.users = users;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View custom_view = inflater.inflate(R.layout.list_item, parent, false);
        ImageView imageView = custom_view.findViewById(R.id.image);
        TextView textViewNameOf = custom_view.findViewById(R.id.name);
        TextView textViewPhoneOf = custom_view.findViewById(R.id.phone);
        imageView.setImageResource(users.get(position).getImage());
        textViewNameOf.setText(users.get(position).getName());
        textViewPhoneOf.setText(users.get(position).getPhone());

        return custom_view;
    }

    @Override
    public int getCount(){
        return users.size();
    }
}
