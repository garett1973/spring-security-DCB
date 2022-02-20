package net.virgis.tutorials.springsecurityclient.event.listener;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.virgis.tutorials.springsecurityclient.entity.User;
import net.virgis.tutorials.springsecurityclient.event.RegistrationCompleteEvent;
import net.virgis.tutorials.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

@Slf4j
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // todo: create verification token for the user with clickable link

        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);

        // todo: send email to the user
        String url = event.getApplicationUrl() + "verifyRegistration?token=" + token;

        // todo: implement sendVerificationEmail(String email);
        log.info("Click this link to verify your email: {}", url);
    }
}
