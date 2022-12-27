package ua.edu.ucu.apps.demo.flower;

public class BasketDecorator extends Item{
    private final Item item;

    public BasketDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}