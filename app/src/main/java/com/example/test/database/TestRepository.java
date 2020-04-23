package com.example.test.database;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class TestRepository {
    private TestDAO mTestDAO;
    private LiveData<List<Lists>> mLists;

    public TestRepository(Application application) {
        TestRoomDatabase db = TestRoomDatabase.getInstance(application);
        mTestDAO = db.testDAO();
        mLists = mTestDAO.getAll();
    }

    public LiveData<List<Lists>> getAll(){
        return mLists;
    }

    public void insert(Lists lists) {

    }

    private static class insertAsyncTask extends AsyncTask<Lists, Void, Void> {
        private TestDAO mAsyncTaskDao;

        insertAsyncTask(TestDAO testDAO) {
            this.mAsyncTaskDao = testDAO;
        }

        @Override
        protected Void doInBackground(Lists... lists) {
            mAsyncTaskDao.insert(lists[0]);
            return null;
        }
    }

}
