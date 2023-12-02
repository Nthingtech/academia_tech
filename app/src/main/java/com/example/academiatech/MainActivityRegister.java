package com.example.academiatech;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.dao.UserDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.User;
import com.example.academiatech.model.enums.Gender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivityRegister extends AppCompatActivity {

    private EditText registerName;
    private EditText registerEmail;
    private RadioButton radioButtonMasc;
    private RadioButton radioButtonFem;
    private EditText registerBirthdate;
    private EditText registerNickName;
    private EditText registerPwd;
    private EditText registerRepeatPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        radioButtonMasc = findViewById(R.id.radioButtonMasc);
        ColorStateList colorStateList = ColorStateList.valueOf(Color.BLACK);
        radioButtonMasc.setButtonTintList(colorStateList);

        radioButtonFem = findViewById(R.id.radioButtonFem);
        ColorStateList colorStateList1 = ColorStateList.valueOf(Color.BLACK);
        radioButtonFem.setButtonTintList(colorStateList1);

        RadioGroup genderGroup = findViewById(R.id.radioGroup2);
        User user = new User();

        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButtonMasc) {
                    user.setGender(Gender.MASCULINO);
                } else if (checkedId == R.id.radioButtonFem) {
                    user.setGender(Gender.FEMININO);
                }

            }
        });
        registerName = findViewById(R.id.registerName);
        registerEmail = findViewById(R.id.registerEmail);
        registerBirthdate = findViewById(R.id.registerBirthdate);
        registerNickName = findViewById(R.id.registerNickName);
        registerPwd = findViewById(R.id.registerPwd);
        registerRepeatPwd = findViewById(R.id.registerRepeatPwd);
    }

    public void register(View view) {
        AppDatabase db = AppDatabase.getInstance(this);
        UserDao userDao = db.userDao();
        String name = registerName.getText().toString();
        String email = registerEmail.getText().toString();

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

        User u = new User(name, email, birthdate, nickname, password, passwordRepeat);
        userDao.insertUser(u);

        finish();
    }


}