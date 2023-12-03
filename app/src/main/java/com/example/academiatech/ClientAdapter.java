package com.example.academiatech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.model.User;

import java.text.SimpleDateFormat;
import java.util.List;

public class ClientAdapter extends RecyclerView.Adapter {

    private List<User> users;
    private Context context;

    public ClientAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    //@NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_client,
                parent, false);
        return new ClientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ClientViewHolder clientViewHolder = (ClientViewHolder) holder;
        User user = users.get(position);
        clientViewHolder.id.setText(Long.toString(user.getId()));
        clientViewHolder.name.setText(user.getName());
        clientViewHolder.gender.setText(user.getGender());
        clientViewHolder.birthdate.setText(dateFormat.format(user.getBirthdate()));
        clientViewHolder.email.setText(user.getEmail());
        clientViewHolder.nickname.setText(user.getNickName());


    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
