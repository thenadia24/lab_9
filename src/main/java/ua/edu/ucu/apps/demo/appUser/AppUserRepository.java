package ua.edu.ucu.apps.demo.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    public Optional<AppUser> findAppUserByEmail(String email);
}