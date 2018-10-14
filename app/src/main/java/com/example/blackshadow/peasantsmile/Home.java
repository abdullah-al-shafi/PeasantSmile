package com.example.blackshadow.peasantsmile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.time.Instant;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Pass on the activity and color resourse
        Utils.darkenStatusBar(this, R.color.stbcolor);
    }

    public void ph_check(View view) {
        Intent intent= new Intent(Home.this,Ph.class);
        startActivity(intent);
        finish();
    }

    public void ph_knoladge(View view) {
        Intent intent= new Intent(Home.this,Ph_Knoladge.class);
        startActivity(intent);
        finish();

    }

    public void moisture(View view) {
        Intent intent= new Intent(Home.this,Mositure.class);
        startActivity(intent);
        finish();

    }
    private static long back_pressed;
    @Override
    public void onBackPressed() {
        if (back_pressed + 3000 > System.currentTimeMillis()) super.onBackPressed();
        else {
// The Custom Toast Layout Imported here
            LayoutInflater inflater = getLayoutInflater();

            View layout = inflater.inflate(R.layout.custom_toast_back,
                    (ViewGroup) findViewById(R.id.custom_toast_layout_id_success));
            // The actual toast generated here.
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
        back_pressed = System.currentTimeMillis();
    }
}
