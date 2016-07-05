package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.searchTabButton)
    Button mSearchTabButton;
    @Bind(R.id.searchTablatureTextEdit)
    EditText mSearchTablature;
    @Bind(R.id.searchLessonButton)
    Button mSearchLessonButton;
    @Bind(R.id.searchLessonsTextEdit)
    EditText mSearchLessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchTabButton.setOnClickListener(this);
        mSearchLessonButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mSearchTabButton) {
            String searchTablature = mSearchTablature.getText().toString();
            Intent intent = new Intent(MainActivity.this, BrowseMuisc.class);
            intent.putExtra("tablatureSearch", searchTablature);
            startActivity(intent);
        }
        if (v == mSearchLessonButton) {
            String searchLesson = mSearchLessons.getText().toString();
            Intent intent2 = new Intent(MainActivity.this, BrowseLessons.class);
            intent2.putExtra("lessonSearch", searchLesson);
            startActivity(intent2);
        }
    }
}
