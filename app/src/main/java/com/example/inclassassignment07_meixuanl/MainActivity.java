package com.example.inclassassignment07_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);
    }

    public void addSongInfo(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i, RequestCodes.ADD_SONGINFO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_SONGINFO && resultCode == RESULT_OK) {
            SongInfo s = (SongInfo) data.getSerializableExtra(Keys.SONGINFO);
            mText.setText(s.toString());
        }
    }


}
