package com.example.springsecurity6customuser.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final CustomUserRepository customUserRepository;

    public CustomUserDetailsService(CustomUserRepository customUserRepository) {
        this.customUserRepository = customUserRepository;
    }
    @Override
    public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
        return customUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username " + username + " not found !"));
    }
}
