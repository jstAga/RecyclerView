package com.geektech.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MentorsAdapter extends RecyclerView.Adapter<MentorsViewHolder> {

    private ArrayList<String> mentorsList;

    public MentorsAdapter(ArrayList<String> mentorsList) {
        this.mentorsList = mentorsList;
    }

    @NonNull
    @Override
    public MentorsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MentorsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mentors, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MentorsViewHolder holder, int position) {
        holder.bind(mentorsList.get(position));
    }

    @Override
    public int getItemCount() {
        return mentorsList.size();
    }
}
