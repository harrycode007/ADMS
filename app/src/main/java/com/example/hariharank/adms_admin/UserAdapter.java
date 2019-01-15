package com.example.hariharank.adms_admin;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    ArrayList<User> users;
    public UserAdapter(ArrayList<User> u){
        users=u;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user,viewGroup,false);
        UserViewHolder user=new UserViewHolder(v);
        return user;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

        userViewHolder.nam.setText(users.get(i).name);
        userViewHolder.roll_no.setText(users.get(i).rollno);
        if(users.get(i).isDelivered==0){
            userViewHolder.tracking.setText("Pending");
        }
        else{
            userViewHolder.tracking.setText("Delivered");
        }
    }

    @Override
    public int getItemCount() {
        try {
            return users.size();
        }
        catch (NullPointerException n){

        }
        return 0;
    }

    }

