package com.geektech.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MentorsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMentors;
    public MentorsViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMentors = itemView.findViewById(R.id.tv_mentors);
    }

    public void bind(String name){
        tvMentors.setText(name);
    }
}
