package com.tienda.service;

/*la interfaces son, estructura para pasar info*/

import org.springframework.security.core.userdetails.UserDetails; /*plugin de seguridad*/
import org.springframework.security.core.userdetails.UsernameNotFoundException; 

public interface UsuarioDetailsService {
    public UserDetails 
        loadUserByUsername(String username)
                throws UsernameNotFoundException;
}
