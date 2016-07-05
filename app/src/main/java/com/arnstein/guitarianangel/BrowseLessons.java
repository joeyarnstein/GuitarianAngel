package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BrowseLessons extends AppCompatActivity {
    @Bind(R.id.lessonsTextView) TextView mLessonsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_lessons);
        ButterKnife.bind(this);

        Intent intent2 = getIntent();
        String lessonSearchName = intent2.getStringExtra("lessonSearch");
        mLessonsTextView.setText("Lessons related to " + lessonSearchName);

    }
}