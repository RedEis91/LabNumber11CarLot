import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarLot {
    ArrayList<Car> Lot = new ArrayList<Car>();
    public void addCar(String mk, String ml, int y, double pc) {
        Car c = new Car(mk, ml, y, pc);
        Lot.add(c);
    }

    public void addCar(String mk, String ml, int y, double pc, String u, double m) {
        UsedCar uc = new UsedCar(mk, ml, y, pc, u, m);
        Lot.add(uc);
    }
    public void getCar(int id) {
        Lot.get(id);

    }
}