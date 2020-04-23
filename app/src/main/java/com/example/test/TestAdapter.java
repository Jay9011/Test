package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.database.Lists;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder>{

    class TestViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvId;
        private final TextView tvText;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tvid);
            tvText = itemView.findViewById(R.id.tvText);
        }
    }

    private final LayoutInflater mInflater;
    private List<Lists> mLists;

    public TestAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item, parent, false);
        return new TestViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        if (mLists != null) {
            Lists current = mLists.get(position);
            holder.tvId.setText(current.getUid());
            holder.tvText.setText(current.getWord());
        } else {
            holder.tvId.setText("no");
            holder.tvText.setText("no data");
        }
    }

    void setItem(List<Lists> lists) {
        mLists = lists;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mLists != null) {
            return mLists.size();
        }
        return 0;
    }

}
