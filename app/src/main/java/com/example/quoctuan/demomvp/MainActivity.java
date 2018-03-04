package com.example.quoctuan.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.quoctuan.demomvp.handlelogin.PresenterLogicHandleLogin;
import com.example.quoctuan.demomvp.handlelogin.ViewHandleLogin;

public class MainActivity extends AppCompatActivity implements ViewHandleLogin,View.OnClickListener {
    private EditText ed_name,ed_pass;
    private Button btn_login;
    private PresenterLogicHandleLogin handleLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_name = findViewById(R.id.ed_name);
        ed_pass = findViewById(R.id.ed_pass);
        btn_login = findViewById(R.id.btn_login);

        handleLogin = new PresenterLogicHandleLogin(this);

        btn_login.setOnClickListener(this);

    }

    @Override
    public void LoginSuccess() {
        Toast.makeText(this, "Đăng nhập thành công !!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFailure() {
        Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

        String name = ed_name.getText().toString();
        String pass = ed_pass.getText().toString();
        handleLogin.checkLogin(name,pass);
    }
}
