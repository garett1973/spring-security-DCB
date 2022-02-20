package net.virgis.tutorials.springsecurityclient.service;

import net.virgis.tutorials.springsecurityclient.entity.User;
import net.virgis.tutorials.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);
}
