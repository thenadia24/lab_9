package ua.edu.ucu.apps.demo.order;

public class Sender implements User{
    @Override
    public void update(Status status) {
        System.out.println("Sender status of the order is: " + status);
    }
}