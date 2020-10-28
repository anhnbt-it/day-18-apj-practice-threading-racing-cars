/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 10:10 AM
 */
public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car mazda    = new Car("Mazda 3    ");
        Car mercedes = new Car("Mercedes   ");
        Car morning  = new Car("Kia Morning");

        Thread thread1 = new Thread(mazda);
        Thread thread2 = new Thread(mercedes);
        Thread thread3 = new Thread(morning);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
