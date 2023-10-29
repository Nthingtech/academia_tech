package com.example.academiatech;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.dao.AppDatabase;
import com.example.academiatech.dao.FuncionarioTesteDao;
import com.example.academiatech.model.FuncionarioTeste;

import java.util.Date;

public class DatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        AppDatabase db = AppDatabase.getInstance(this);
        FuncionarioTesteDao dao = db.funcionarioTesteDao();
        FuncionarioTeste f = new FuncionarioTeste(1,"teste", new Date(),
                1000,"teste");
        dao.insert(f); //TODO REFATORAR
    }

}