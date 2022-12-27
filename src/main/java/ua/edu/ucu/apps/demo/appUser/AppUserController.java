package ua.edu.ucu.apps.demo.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.apps.demo.flower.Flower;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class AppUserController {
    private final AppUserService appUserService;
    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUser() {
        return appUserService.getUsers();
    }
    @PostMapping
    public void addAppUser(@RequestBody AppUser appUser){
        appUserService.addUser(appUser);
    }
}