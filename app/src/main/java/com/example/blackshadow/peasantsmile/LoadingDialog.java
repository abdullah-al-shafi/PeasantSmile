package com.example.blackshadow.peasantsmile;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class LoadingDialog extends Dialog {
    private String mHeaderText = null;
    private TextView mDialogTitle = null;


    public LoadingDialog(Context context, String headerText) {
        super(context);
        mHeaderText = headerText;
        this.setCancelable(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_loading);
        mDialogTitle = ((TextView)findViewById( R.id.txt_loading_dialog_title));
        mDialogTitle.setText(this.mHeaderText);

    }

    public void showDialogWithText(String text){
        if( mDialogTitle !=null){
            mDialogTitle.setText(text);
        }

        this.show();
    }

}