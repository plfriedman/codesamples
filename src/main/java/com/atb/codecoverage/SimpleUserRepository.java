package com.atb.codecoverage;


import java.util.UUID;

public class SimpleUserRepository implements UserRepository {

    public String addUser(String firstName, String lastName) {

        System.out.println(String.format("Storing user --> first name: %s, last name: %s", firstName, lastName));

        // do something with the user
        return UUID.randomUUID().toString();
    }
}
