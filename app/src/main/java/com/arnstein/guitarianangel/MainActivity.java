package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.searchMusicButton) Button mSearchButton;
    @Bind(R.id.editText) EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchButton.setOnClickListener(new View.OnClickListener() { //add click listener

            @Override
            public void onClick(View v) {
                String searchText = mEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, BrowseMuisc.class);
                intent.putExtra("textSearch", searchText);
                startActivity(intent);
            }
        });
    }
}
