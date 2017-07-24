import java.util.Scanner;

/**
 * Created by Jared on 7/24/17.
 */
public class CarLotApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarLot lot = new CarLot( );
        System.out.println("Add a car: ");
        System.out.println("Make: ");
        String mk = scan.nextLine();
        System.out.println("Model: ");
        String ml = scan.nextLine();
        System.out.println("Year: ");
        int y = scan.nextInt();
        System.out.println("Price: ");
        double pc = scan.nextDouble();
        lot.addCar(mk, ml, y, pc);
        
    }
}
