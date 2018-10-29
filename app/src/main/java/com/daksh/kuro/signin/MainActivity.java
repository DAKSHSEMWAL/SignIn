package com.daksh.kuro.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.squareup.otto.Bus;

public class MainActivity extends AppCompatActivity {

    private Communicator communicator;
    private String email, password,name,phone,location,city,business_name;
    private EditText emailET, passwordET,nameET,phoneET,locationET,cityET,business_nameET;
    private Button loginButtonPost;
    private final static String TAG = "MainActivity";
    public static Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        communicator = new Communicator();

        emailET = (EditText)findViewById(R.id.emailInput);
        passwordET = (EditText)findViewById(R.id.passwordInput);
        nameET = (EditText)findViewById(R.id.nameInput);
        phoneET = (EditText)findViewById(R.id.phoneInput);
        locationET = (EditText)findViewById(R.id.locationInput);
        cityET = (EditText)findViewById(R.id.cityInput);
        business_nameET = (EditText)findViewById(R.id.business_nameInput);

        //This is used to hide the password's EditText characters. So we can avoid the different hint font.
        passwordET.setTransformationMethod(new PasswordTransformationMethod());

        loginButtonPost = (Button)findViewById(R.id.loginButtonPost);
        loginButtonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = emailET.getText().toString();
                password = passwordET.getText().toString();
                name = nameET.getText().toString();
                phone = phoneET.getText().toString();
                location = locationET.getText().toString();
                city = cityET.getText().toString();
                business_name = business_nameET.getText().toString();


                usePost(email, password,name,phone,location,city,business_name);
            }
        });
    }

    private void usePost(String email, String password, String name, String phone, String location, String city, String business_name) {
        communicator.loginPost(email,password,name,phone,location,city,business_name);
    }
}
