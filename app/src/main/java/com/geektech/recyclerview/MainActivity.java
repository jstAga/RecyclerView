package com.geektech.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mentorsList = new ArrayList<>();
    private RecyclerView rvMentorsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvMentorsList = findViewById(R.id.rv_mentors);
        MentorsAdapter mentorsAdapter = new MentorsAdapter(mentorsList);
        rvMentorsList.setAdapter(mentorsAdapter);
    }

    private void addValue() {
        mentorsList.add("Нооруз");
        mentorsList.add("Нуртилек");
        mentorsList.add("Рая");
        mentorsList.add("Ислам Ливаза");
        mentorsList.add("Ислам");
        mentorsList.add("Адиль");
        mentorsList.add("Бектур");
        mentorsList.add("Актан");
        mentorsList.add("Эмиль");
        mentorsList.add("Бека");
        mentorsList.add("Нурбол");
        mentorsList.add("Мубарак");
        mentorsList.add("Шамиль");
        mentorsList.add("Тан");
        mentorsList.add("Элиза");
        mentorsList.add("Альберт");
    }
}