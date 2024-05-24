package main.java.Design_Pattern.Structural.Adapter.AuthenticationExample;

import main.java.Design_Pattern.Structural.Adapter.AuthenticationExample.AuthenticationTypes.LoginAuthetication;

public class LoginAuthorizationAdapter extends AuthetnicationGateway{

    LoginAuthetication loginAuthetication;

    public LoginAuthorizationAdapter(LoginAuthetication l){
        loginAuthetication=l;
    }

    @Override
    public void isAuthorized() {
        //new Authorization feature
        loginAuthetication.authenticate("amir","miro");
    }


    }
