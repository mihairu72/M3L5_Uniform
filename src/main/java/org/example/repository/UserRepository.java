package org.example.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.User;
import org.example.service.UserService;

public class UserRepository implements Repository<User>{

    private static final Logger logger = LogManager.getLogger(UserRepository.class);

    @Override
    public User getByData(Long id, String login, String password) {
        logger.error(">>> METHOD 'GIVE BY DATA' BEGINS");
        return new User(id, login, password);
    }

}
