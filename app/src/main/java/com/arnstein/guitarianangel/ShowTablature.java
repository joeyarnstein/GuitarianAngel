package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShowTablature extends AppCompatActivity {
    @Bind(R.id.songTitle) TextView mSongTitle;
//    @Bind(R.id.tablatureViewImage) ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tablature);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String tabSearchName = intent.getStringExtra("getThisTab");
        mSongTitle.setText("Tablature for " + tabSearchName);
    }
}
