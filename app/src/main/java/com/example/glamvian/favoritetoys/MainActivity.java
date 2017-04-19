package com.example.glamvian.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mListToysTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListToysTextview = (TextView) findViewById(R.id.toys_tv_name);
        //store data dari method static getNamaMainan di class KotakMainan
        String [] namaMainan = KotakMainan.getNamaMainan();
        //loop untuk mendapatkan listnama mainan dan memisahkan setiap nama mainan dengan tiga separator /n
        for ( String mainan : namaMainan){
            mListToysTextview.append(mainan + "\n\n\n");
        }
    }
}
