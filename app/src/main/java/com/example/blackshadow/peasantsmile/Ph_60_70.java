package com.example.blackshadow.peasantsmile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ph_60_70 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph_60_70);

        // Pass on the activity and color resourse
        Utils.darkenStatusBar(this, R.color.stbcolor);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,Home.class));
        finish();
    }
}
