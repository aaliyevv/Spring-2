package com.ltc.heliosspring.sevice;

import com.ltc.heliosspring.model.AppUser;
import com.ltc.heliosspring.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final AppUserRepository appUserRepository;

    public UserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    

}
