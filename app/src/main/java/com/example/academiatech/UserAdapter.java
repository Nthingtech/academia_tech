package com.example.academiatech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.model.User;

import java.text.SimpleDateFormat;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter {

    private List<User> users;
    private Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_client,
                parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        UserViewHolder userViewHolder = (UserViewHolder) holder;
        User user = users.get(position);
        userViewHolder.id.setText(Long.toString(user.getId()));
        userViewHolder.name.setText(user.getName());
        userViewHolder.gender.setText(user.getGender());
        userViewHolder.birthdate.setText(dateFormat.format(user.getBirthdate()));
        userViewHolder.email.setText(user.getEmail());
        userViewHolder.nickname.setText(user.getNickName());


    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
