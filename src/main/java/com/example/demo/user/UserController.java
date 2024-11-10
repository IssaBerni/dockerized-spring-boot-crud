package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// This annotation makes this class a REST controller, allowing it to handle HTTP requests
@RestController
// Specifies the base URL path for all the endpoints in this controller
@RequestMapping("/api/users")
public class UserController {

    // Automatically injects an instance of UserRepository into the controller
    @Autowired
    private UserRepository userRepository;

    // Endpoint to fetch all users (HTTP GET request)
    @GetMapping
    public List<User> getAllUsers(){
        // Returns a list of all users from the repository
        return userRepository.findAll();
    }

    // Endpoint to fetch a specific user by their ID (HTTP GET request)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        // Retrieves the user by ID from the repository
        return userRepository.findById(id).get(); // 'get()' can be risky, consider handling the case where the user isn't found
    }

    // Endpoint to create a new user (HTTP POST request)
    @PostMapping
    public User createUser(@RequestBody User user){
        // Saves the provided user object into the database and returns the saved user
        return userRepository.save(user);
    }

    // Endpoint to update an existing user (HTTP PUT request)
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        // Fetches the existing user by ID
        User existingUser = userRepository.findById(id).get();
        
        // Updates the existing user's properties with the new values from the request body
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());

        // Saves the updated user and returns the updated user
        return userRepository.save(existingUser);
    }

    // Endpoint to delete a user by ID (HTTP DELETE request)
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        try {
            // Tries to delete the user by ID
            userRepository.deleteById(id);
            return "User deleted successfully";
        } catch (Exception e) {
            // Returns a failure message if the user was not found or another error occurred
            return "User not found";
        }
    }
}
