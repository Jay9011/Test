package com.example.test.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "test_table")
public class Lists {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "uid")
    private int uid;
    private String word;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Lists(String word) {
        this.word = word;
    }

    public int getUid() {
        return uid;
    }

    public String getWord() {
        return word;
    }

}
