package com.example.inclassassignment07_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText mName;
    EditText mId;
    EditText mArtist;
    CheckBox mReleasdThisYear;
    String name;
    int id;
    String artist;
    boolean releasedThisYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mName = (EditText) findViewById(R.id.name);
        mId = (EditText) findViewById(R.id.id);
        mArtist = (EditText) findViewById(R.id.artist);
        mReleasdThisYear = (CheckBox) findViewById(R.id.released_this_year);
    }

    public void submitSongInfo(View view) {
        Intent i = new Intent();
        SongInfo s = new SongInfo(name,id,artist,releasedThisYear);
        s.setName(mName.getText().toString());
        String value = mId.getText().toString();
        id = Integer.parseInt(value);
        s.setId(id);
        s.setArtist(mArtist.getText().toString());
        s.setReleasedThisYear(mReleasdThisYear.isChecked());

        i.putExtra(Keys.SONGINFO, s);
        setResult(RESULT_OK, i);
        finish();
    }

}
