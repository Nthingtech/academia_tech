package com.example.academiatech;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.dao.UserDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivityRegister extends AppCompatActivity {

    private EditText registerName;
    private EditText registerEmail;
    private EditText registerGender;
    private EditText registerBirthdate;
    private EditText registerNickName;
    private EditText registerPwd;
    private EditText registerRepeatPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        User user = new User();

        registerName = findViewById(R.id.registerName);
        registerEmail = findViewById(R.id.registerEmail);
        registerBirthdate = findViewById(R.id.registerBirthdate);
        registerNickName = findViewById(R.id.registerNickName);
        registerPwd = findViewById(R.id.registerPwd);
        registerRepeatPwd = findViewById(R.id.registerRepeatPwd);
        registerGender = findViewById(R.id.registerGender);
    }

    public void register(View view) {
        AppDatabase db = AppDatabase.getInstance(this);
        UserDao userDao = db.userDao();
        String name = registerName.getText().toString();
        String email = registerEmail.getText().toString();
        String gender = registerGender.getText().toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthdate;
        try {
            birthdate = dateFormat.parse(registerBirthdate.getText().toString());
        } catch (ParseException e) {
            birthdate = new Date();
        }

        String nickname = registerNickName.getText().toString();
        String password = registerPwd.getText().toString();
        String passwordRepeat = registerRepeatPwd.getText().toString();

        User u = new User(name, email, gender, birthdate, nickname, password, passwordRepeat);
        userDao.insertUser(u);

        finish();
    }


}