package com.app.mism.penandpaper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickButton(View v){
        Toast.makeText(this, "Clicked on button", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, GameBoardActivity.class);
        startActivity(intent);
    }
}
