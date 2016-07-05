package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BrowseMuisc extends AppCompatActivity {
    @Bind(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_muisc);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String tabSearchName = intent.getStringExtra("tablatureSearch");
        mResultTextView.setText("Tablature for " + tabSearchName);

    }
}
