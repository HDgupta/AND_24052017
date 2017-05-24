package com.example.album;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void android (View view) {
        populateImage(R.drawable.ic_android_black_24dp);
    }

    public void house(View view)
    {
        populateImage(R.drawable.ic_accessibility_black_24dp);
    }

    public void man (View view)
    {
        populateImage(R.drawable.ic_account_balance_black_24dp);
    }

    private void populateImage(int image) {
        ImageView img = (ImageView) findViewById(R.id.image1);
        img.setImageResource(image);
    }
}