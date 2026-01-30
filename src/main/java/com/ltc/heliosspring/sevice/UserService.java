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

    public AppUser create(AppUser UserEntity){
        return appUserRepository.save(UserEntity);
    }

    public List<AppUser> getAll(){
        return appUserRepository.findAll();
    }

    public AppUser getById(Long id){
        return appUserRepository.getById(id);
    }

    public AppUser update(Long id, AppUser UserEntity){
        AppUser oldUser = appUserRepository.findById(id).orElseThrow(() ->
        new RuntimeException("User Not Found!"));

        oldUser.setUsername(UserEntity.getUsername());
        oldUser.setSurname(UserEntity.getSurname());

        return appUserRepository.save(oldUser);
    }

    public void deleteById(Long id){
        appUserRepository.deleteById(id);
    }

}
