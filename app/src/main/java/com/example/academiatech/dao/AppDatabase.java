package com.example.academiatech.dao;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.academiatech.DateConverter;
import com.example.academiatech.model.Exercise;
import com.example.academiatech.model.ExerciseItem;
import com.example.academiatech.model.ExerciseItemTraining;
import com.example.academiatech.model.FuncionarioTeste;
import com.example.academiatech.model.Prescription;
import com.example.academiatech.model.PrescriptionTraining;
import com.example.academiatech.model.Training;
import com.example.academiatech.model.User;
import com.example.academiatech.model.UserPrescription;

@Database(entities = {User.class, Prescription.class, Training.class, Exercise.class,
ExerciseItem.class, UserPrescription.class, PrescriptionTraining.class, ExerciseItemTraining.class, FuncionarioTeste.class}, version=1)
@TypeConverters(DateConverter.class)
abstract public class AppDatabase extends RoomDatabase {
    private static AppDatabase sInstance;
    public static final String DATABASE_NAME="teste.db";
    public abstract FuncionarioTesteDao funcionarioTesteDao();
    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();
    public static AppDatabase getInstance(final Context context) {
        if ( sInstance == null ) {
            synchronized (AppDatabase.class) {
                if ( sInstance==null ) {
                    sInstance = buildDatabase(context.getApplicationContext());
                    sInstance.updataDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }
    private void setDatabaseCreated() {
        mIsDatabaseCreated.postValue(true);
    }

    private static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context,AppDatabase.class,
                DATABASE_NAME).allowMainThreadQueries().build();
    }

    private void updataDatabaseCreated(final Context context) {
        if( context.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated(); //TODO REFATORAR
        }
    }

}
