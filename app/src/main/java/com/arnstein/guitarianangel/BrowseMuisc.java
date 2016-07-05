package com.arnstein.guitarianangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BrowseMuisc extends AppCompatActivity {
    @Bind(R.id.resultTextView) TextView mResultTextView;
    @Bind(R.id.resultListView) ListView mResultListView;
    private String[] hardCodedResult = {"Led Zepplin", "Bob Dylan", "Joni Mitchell", "Metallica", "Soundgarden", "Tame Impala", "Kraftwerk", "Green Day", "Passion Pit", "Wood Brothers", "Doesn't Matter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_muisc);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, hardCodedResult);
        mResultListView.setAdapter(adapter);

        mResultListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String bandOrSong = ((TextView)view).getText().toString();
                Toast.makeText(BrowseMuisc.this, bandOrSong, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String tabSearchName = intent.getStringExtra("tablatureSearch");
        mResultTextView.setText("Tablature for " + tabSearchName);

    }
}
