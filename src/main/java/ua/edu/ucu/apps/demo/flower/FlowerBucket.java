package ua.edu.ucu.apps.demo.flower;
import java.util.ArrayList;


public class FlowerBucket {
    private final ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();
    public void add(FlowerPack pack) {
        packs.add(pack);
    }
    public double getPrice() {
        double res = 0;
        for (FlowerPack pack : packs) {
            res += pack.getPrice();
        }
        return res;
    }

}