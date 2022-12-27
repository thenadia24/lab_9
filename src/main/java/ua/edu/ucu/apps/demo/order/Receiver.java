package ua.edu.ucu.apps.demo.order;

public class Receiver implements User {
    @Override
    public void update(Status status){
        System.out.println("Receiver status of the order is"+status);
    }
}