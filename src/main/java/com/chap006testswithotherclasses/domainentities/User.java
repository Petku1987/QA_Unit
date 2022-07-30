package com.chap006testswithotherclasses.domainentities;

public class User {

    String username;
    String password;

    User(){
        username = "username";
        password = "password";
       }

       public String getUsername(){
        return username;
       }
       public String getPassword() {
        return password;
       }
}
