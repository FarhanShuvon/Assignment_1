package com.example.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private ImageView myImageView;
    private Button myButton;
    private boolean isImageVisible = true;
    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
        myImageView = findViewById(R.id.myImageView);
        myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(v -> {
            if (!isClicked) {
                myButton.setText("Go Back");
                myTextView.setText("Button was clicked!");
                Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
            } else {
                myButton.setText("Click Here");
                myTextView.setText("Greetings!");
            }
            if (isImageVisible) {
                myImageView.setVisibility(View.GONE);
            } else {
                myImageView.setVisibility(View.VISIBLE);
            }
            isImageVisible = !isImageVisible;
            isClicked = !isClicked;
        });
    }
}
