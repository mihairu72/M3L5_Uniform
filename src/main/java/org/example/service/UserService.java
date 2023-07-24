package org.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.User;
import org.example.repository.Repository;
import org.example.repository.UserRepository;

public class UserService {

    private static final Logger logger = LogManager.getLogger();

    public UserService() {
       logger.error("- - -> HERE BEGINS CLASS UserService");
    }

    Repository<User> repository = new UserRepository();

    public User giveMeUser(Long id, String login, String password) {
        logger.debug(">>> METHOD 'GIVE ME USER' BEGINS");
        logger.info(">>> METHOD 'GIVE ME USER' BEGINS");
        logger.warn(">>> METHOD 'GIVE ME USER' BEGINS");
        logger.error(">>> METHOD 'GIVE ME USER' BEGINS");
        logger.fatal(">>> METHOD 'GIVE ME USER' BEGINS");

        User user = null;

        try {
            logger.fatal(">>> TRYING TO GET USER");
           user = repository.getByData(id, login, password);
        }
        catch (Exception e
        ) {
            logger.fatal(">>> WE CAN'T GET ENTITY");
        }
        return user;
    }

}
