package com.icloud.micro.mongo.service.user;

import com.icloud.micro.mongo.model.Role;
import com.icloud.micro.mongo.model.User;
import com.icloud.micro.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
@Transactional
public class MicroUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user != null){
            if(user.getEnabled()){
                org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(
                        user.getUsername(),
                        user.getPassword(),
                        buildAuthorities(user.getRoles())
                );
                return user1;
            }else {
                throw new InternalAuthenticationServiceException("Access to your account is temporarily disabled.\n Please contact your administrator");

            }
        }else {
            throw new BadCredentialsException("Invalid Username or Password");
        }
    }

    private List<GrantedAuthority> buildAuthorities(List<Role> roles){
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : roles){
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return authorities;
    }
}
