package com.meteorsoftech.shopping;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText tieusername,tiepassword;
    Button btn_login;
    TextView textView_skip,textView_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        IntializeWidgets();
        textView_skip.setOnClickListener(this);
        textView_register.setOnClickListener(this);
    }

    public void IntializeWidgets()
    {
        textView_skip = (TextView)findViewById(R.id.tv_skip);
        textView_register = (TextView)findViewById(R.id.tv_register);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.tv_register:
                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.tv_skip:
                Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
                break;
        }

    }
}
