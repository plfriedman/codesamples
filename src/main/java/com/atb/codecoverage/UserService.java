package com.atb.codecoverage;

public class UserService {

    // the user repository
    private UserRepository userRepository;

    /**
     * Construct the user service
     * @param userRepository the user repository used by this service.
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(String firstName, String lastName) {

        return userRepository.addUser(lastName, firstName);
    }

    public static void main(String[] args) {

        UserService userService = new UserService(new SimpleUserRepository());

        userService.addUser("John",  "Smith");
    }
}
