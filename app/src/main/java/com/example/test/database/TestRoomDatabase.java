package com.example.test.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Lists.class}, version = 1, exportSchema = false)
public abstract class TestRoomDatabase extends RoomDatabase {
    public abstract TestDAO testDAO();

    private static TestRoomDatabase INSTANCE;
    public static TestRoomDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    TestRoomDatabase.class, "test_db").build();
        }
        return INSTANCE;
    }
}
