package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.dao.UserDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.User;

import java.util.List;

public class MainActivityListaClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_client);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewClient);
        AppDatabase db = AppDatabase.getInstance(this);
        UserDao userDao = db.userDao();
        List<User> users = userDao.getUsers();
        recyclerView.setAdapter(new ClientAdapter(users, this));
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void backMainPrincipal(View view) {
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);
    }
}