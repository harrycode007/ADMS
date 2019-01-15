package com.example.hariharank.adms_admin;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView nam;
    TextView roll_no;
    TextView tracking;

    public UserViewHolder(View v){
        super(v);
        nam = v.findViewById(R.id.name);
        roll_no = v.findViewById(R.id.roll);
        tracking = v.findViewById(R.id.request);
    }

}
