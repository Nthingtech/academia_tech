package com.example.academiatech.db;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.academiatech.DateConverter;
import com.example.academiatech.dao.ExerciseDao;
import com.example.academiatech.dao.ExerciseExerciseItemDao;
import com.example.academiatech.dao.ExerciseItemDao;
import com.example.academiatech.dao.FuncionarioTesteDao;
import com.example.academiatech.dao.PrescriptionDao;
import com.example.academiatech.dao.PrescriptionTrainingDao;
import com.example.academiatech.dao.TrainingDao;
import com.example.academiatech.dao.TrainingExerciseItemDao;
import com.example.academiatech.dao.UserDao;
import com.example.academiatech.dao.UserPrescriptionDao;
import com.example.academiatech.model.Exercise;
import com.example.academiatech.model.ExerciseItem;
import com.example.academiatech.model.FuncionarioTeste;
import com.example.academiatech.model.Prescription;
import com.example.academiatech.model.Training;
import com.example.academiatech.model.User;

@Database(entities = {User.class, Prescription.class, Training.class, Exercise.class,
        ExerciseItem.class, FuncionarioTeste.class}, version = 1)
@TypeConverters(DateConverter.class)
abstract public class AppDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "acad.db";
    private static AppDatabase sInstance;
    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();

    public static AppDatabase getInstance(final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase(context.getApplicationContext());
                    sInstance.updataDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context, AppDatabase.class,
                DATABASE_NAME).allowMainThreadQueries().build();
    }

    public abstract FuncionarioTesteDao funcionarioTesteDao();

    public abstract UserDao userDao();

    public abstract PrescriptionDao prescriptionDao();

    public abstract TrainingDao trainingDao();

    public abstract ExerciseDao exerciseDao();

    public abstract ExerciseItemDao exerciseItemDao();

    public abstract UserPrescriptionDao userPrescriptionDao();

    public abstract PrescriptionTrainingDao prescriptionTrainingDao();

    public abstract TrainingExerciseItemDao trainingExerciseItemDao();

    public abstract ExerciseExerciseItemDao exerciseExerciseItemDao();

    private void setDatabaseCreated() {
        mIsDatabaseCreated.postValue(true);
    }

    private void updataDatabaseCreated(final Context context) {
        if (context.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated();
        }
    }

}
