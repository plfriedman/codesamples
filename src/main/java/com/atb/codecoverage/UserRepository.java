package com.atb.codecoverage;

public interface UserRepository {


    /**
     * Add a user.
     * @param firstName users first name.
     * @param lastName users last name.
     * @return ID for the user that was added.
     */
    String addUser(String firstName, String lastName);
}
