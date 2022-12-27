package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    @Getter
    private double sepalLength;
    @Getter
    private String color;
    @Getter
    private double price;

    @Override
    public String getDescription() {
        return "Beautiful" + color + "Flower";
    }
}