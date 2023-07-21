package org.example;

import org.example.entity.User;
import org.example.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        UserService userService = new UserService();

        User user = userService.giveMeUser(1L, "someLogin", "somePassword");

        System.out.println(user);

    }
}
