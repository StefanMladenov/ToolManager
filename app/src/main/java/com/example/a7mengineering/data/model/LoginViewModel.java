package com.example.a7mengineering.data.model;

public class LoginViewModel {

    private String Username;
    public final String getUsername()
    {
        return Username;
    }
    public final void setUsername(String value)
    {
        Username = value;
    }

    private String Password;
    public final String getPassword()
    {
        return Password;
    }
    public final void setPassword(String value)
    {
        Password = value;
    }

    private boolean RememberMe;
    public final boolean getRememberMe()
    {
        return RememberMe;
    }
    public final void setRememberMe(boolean value)
    {
        RememberMe = value;
    }

}
