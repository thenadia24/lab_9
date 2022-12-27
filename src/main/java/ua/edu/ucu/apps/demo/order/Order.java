package ua.edu.ucu.apps.demo.order;

import lombok.Setter;

import java.util.*;

public class Order {
    private final List<User> users;
    @Setter
    private Status status;

    public Order() {
        this.users = new ArrayList<User>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void notifyUsers(){
        for (User user: users) {
            user.update(status);
        }
    }
    public void order(){}
}