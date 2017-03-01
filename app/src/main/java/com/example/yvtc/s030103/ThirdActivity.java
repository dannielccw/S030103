package com.example.yvtc.s030103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv;
        tv= (TextView) findViewById(R.id.textView3);

        Intent it = getIntent();
        Bundle b = it.getExtras();
        String m = b.getString("msg");
        //String m = it.getStringExtra("msg");
        tv.setText(m);
    }
}
