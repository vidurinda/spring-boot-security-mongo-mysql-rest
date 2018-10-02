package com.icloud.micro.util;

import com.icloud.micro.mongo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Transactional
public class CustomLogoutHandler extends SecurityContextLogoutHandler {

    @Autowired
    private UserService userService;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        super.setClearAuthentication(authentication != null);
        super.setInvalidateHttpSession(request.getSession() != null);
        super.logout(request,response,authentication);
    }
}
