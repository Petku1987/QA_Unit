package com.chap006domainentities.examples;

import org.junit.Test;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());


    }

    @Test
    public void canConstructANewUserWithParameters(){
        User user = new User("admin", "123adm");

        assertEquals("given username", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
}
