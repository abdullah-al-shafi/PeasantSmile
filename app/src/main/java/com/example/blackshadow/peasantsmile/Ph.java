package com.example.blackshadow.peasantsmile;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class Ph extends AppCompatActivity {

    EditText ph_measurement;
    LoadingDialog loadingDialog;
    public static int S_TIME_OUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph);

        // Pass on the activity and color resourse
        Utils.darkenStatusBar(this, R.color.stbcolor);

        ph_measurement = findViewById(R.id.ph_measu);

        loadingDialog = new LoadingDialog(this, "Loading");

//        Typeface tf = Typeface.createFromAsset(getAssets(),
//                "fonts/rupali.ttf");
//        ph_measurement.setTypeface(tf);
    }

    public void ph_Test(View view) {


        String ph=ph_measurement.getText().toString();
        if(!TextUtils.isEmpty(ph)){
            loadingDialog.show();
            double ph_m= Double.parseDouble(ph);

            if(ph_m>=5.00 && ph_m<=5.55){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph50_55.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }
            else if(ph_m>=5.56 && ph_m<=6.00){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph56_60.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }
            else if(ph_m>=6.01 && ph_m<=7.00){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph_60_70.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }
            else if(ph_m>=7.01 && ph_m<=7.50){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph70_75.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }
            else if(ph_m>7.5){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph_big.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }
            else if(ph_m<5.0){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Ph.this,Ph_Small.class);
                        startActivity(intent);
                        loadingDialog.dismiss();
                        finish();
                    }
                },S_TIME_OUT);

            }


        }
        else {
            // The Custom Toast Layout Imported here
            LayoutInflater inflater = getLayoutInflater();

            View layout = inflater.inflate(R.layout.custom_toast_disease,
                    (ViewGroup) findViewById(R.id.custom_toast_layout_id_disease));
            // The actual toast generated here.
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();

        }
    }
    @Override
    protected void onDestroy() {
        if(loadingDialog != null && loadingDialog.isShowing()){
            loadingDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Ph.this,Home.class));
        finish();
    }

}
