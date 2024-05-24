package main.java.Design_Pattern.Structural.Adapter.AuthenticationExample.AuthenticationTypes;

public class LoginAuthetication implements Authenticate{

    @Override
    public void authenticate(String username, String password) {
        System.out.println("username: "+username+" password: "+password);
    }
}
