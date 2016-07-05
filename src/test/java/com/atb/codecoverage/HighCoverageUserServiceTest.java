package com.atb.codecoverage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertNotNull;

@RunWith(JUnit4.class)
public class HighCoverageUserServiceTest {

    @Test
    public void testAddUser() {

        String firstName = "John";
        String lastName = "Smith";

        UserService serviceUnderTest = new UserService(new SimpleUserRepository());

        String userID = serviceUnderTest.addUser(firstName, lastName);

        assertNotNull("Expected a user ID to be created", userID);
    }
}
