package com.example.test.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TestDAO {
    @Insert
    void insert(Lists lists);

    @Update
    void update(Lists lists);

    @Delete
    void delete(Lists lists);

    @Query("DELETE FROM test_table")
    void deleteAll();

    @Query("SELECT * FROM test_table")
    LiveData<List<Lists>> getAll();
}
