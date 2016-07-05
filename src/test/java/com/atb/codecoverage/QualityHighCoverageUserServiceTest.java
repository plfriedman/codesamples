package com.atb.codecoverage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QualityHighCoverageUserServiceTest {

    @Mock
    private UserRepository mockUserRepository;

    @Test
    public void testAddUser() {

        String firstName = "John";
        String lastName = "Smith";
        String expectedUserID = "test-id-12345";

        when(mockUserRepository.addUser(isA(String.class), isA(String.class))).thenReturn(expectedUserID);

        UserService serviceUnderTest = new UserService(mockUserRepository);

        String userID = serviceUnderTest.addUser(firstName, lastName);

        assertNotNull("Expected a user ID to be created", userID);
        assertEquals("Wrong user ID", expectedUserID, userID);

        // verify that the mock user repository was passed the correct values
        verify(mockUserRepository).addUser(firstName, lastName);
    }
}
