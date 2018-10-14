package com.example.blackshadow.peasantsmile;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    public static int S_TIME_OUT =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Pass on the activity and color resourse
        Utils.darkenStatusBar(this, R.color.stbcolor);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Welcome.this,Home.class);
                startActivity(intent);
                finish();
            }
        },S_TIME_OUT);
    }
}
