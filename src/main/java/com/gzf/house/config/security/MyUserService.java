package com.gzf.house.config.security;

import com.gzf.house.entity.User;
import com.gzf.house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author GZF
 * @Date: 2018/9/20 14:09
 */
@Component
public class MyUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
         User user = userRepository.findUserByName(s);
         if(user==null){
             throw new UsernameNotFoundException("User Not Found");
         }
        return user;
    }
}
