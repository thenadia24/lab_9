package ua.edu.ucu.apps.demo.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.flower.Flower;

import java.util.List;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        appUserRepository.save(appUser);

    }
}