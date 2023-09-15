package com.tayyabimtiaz.i202433;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView forgetPasswordTextView;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views here after calling setContentView
        forgetPasswordTextView = findViewById(R.id.forget_password_text);
        loginButton = findViewById(R.id.loginButton);

        forgetPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open MainActivity2 when "Forget your password?" is clicked
                openMainActivity2();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open MainActivity3 when "Login" button is clicked
                openMainActivity3();
            }
        });
    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
