package com.example.academiatech;

import androidx.room.TypeConverter;

import java.time.LocalDate;
import java.util.Date;

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp==null?null:new Date(timestamp);
    }
    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date==null?null: date.getTime();
    }
}