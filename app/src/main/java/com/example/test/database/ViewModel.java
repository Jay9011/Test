package com.example.test.database;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {

    private TestRepository mRepository;

    private LiveData<List<Lists>> mLists;

    public ViewModel(@NonNull Application application) {
        super(application);
        mRepository = new TestRepository(application);
        mLists = mRepository.getAll();
    }

    public LiveData<List<Lists>> getAll() {return mLists;}

    public void insert(Lists lists) {mRepository.insert(lists);}
}
