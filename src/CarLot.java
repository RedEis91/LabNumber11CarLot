import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarLot {
    ArrayList<Car> Lot = new ArrayList<Car>();
    //this method creates a new instance of Car based on user input (from main)
    public void addCar(String mk, String ml, int y, double pc) {
        //instantiates a new Car object c based on the arguments provided
        Car c = new Car(mk, ml, y, pc);
        //adds Car object c to Lot ArrayList
        Lot.add(c);
    }
    //this method creates a new instance of UsedCar based on user input (from main)
    public void addCar(String mk, String ml, int y, double pc, String u, double m) {
        //instantiates a new UsedCar object c based on the arguments provided
        UsedCar uc = new UsedCar(mk, ml, y, pc, u, m);
        //adds UsedCar object uc to Lot ArrayList
        Lot.add(uc);
    }
    public void getCar(int id) {
        Lot.get(id);

    }
}