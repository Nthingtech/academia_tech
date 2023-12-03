package com.example.academiatech;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    final TextView id;
    final TextView name;
    final TextView gender;
    final TextView birthdate;
    final TextView email;
    final TextView nickname;

    public UserViewHolder(View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.item_id);
        name = itemView.findViewById(R.id.item_name);
        gender = itemView.findViewById(R.id.item_gender);
        birthdate = itemView.findViewById(R.id.item_birthdate);
        email = itemView.findViewById(R.id.item_email);
        nickname = itemView.findViewById(R.id.item_nickName);
    }
}
