package com.nuhaali.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = "LoginActivity";
    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick login button");
                String username = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                loginUser(username, password);

            }
        });
    }

            private void loginUser(String username, String password) {
                Log.i(TAG, "Attempting to login user " + username);

//                ParseUser.logInInBackground(username, password, new LogInCallback() {
//                    @Override
//                    public void done(ParseUser user, ParseException e) {
//                        if(e != null ){
//                            Log.e(TAG, "Issue with login", e);
//                            return;
//                        }
//                        //ToDo: navigate to the main activity if the used has signed in properly
//                        goMainActivity();
//                        Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_SHORT).show();
//                    }
//
//            });
        }
        private void goMainActivity(){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
 }