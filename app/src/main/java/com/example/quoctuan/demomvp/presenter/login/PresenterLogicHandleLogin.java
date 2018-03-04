package com.example.quoctuan.demomvp.presenter.login;

import com.example.quoctuan.demomvp.view.Login.ViewHandleLogin;

/**
 * Created by quoctuan on 04/03/2018.
 */

public class PresenterLogicHandleLogin implements PrensenterImpHandleLogin {
    ViewHandleLogin viewHandleLogin;
    public PresenterLogicHandleLogin(ViewHandleLogin viewHandleLogin) {
        this.viewHandleLogin = viewHandleLogin;
    }
    @Override
    public void checkLogin(String name, String pass) {
        // call model to get data

        if (name.equals("tuan") && pass.equals("123")) {
            // return View LoginSuccess
            viewHandleLogin.LoginSuccess();
        }else {
            // return View LoginFailure
            viewHandleLogin.LoginFailure();
        }
    }
}
