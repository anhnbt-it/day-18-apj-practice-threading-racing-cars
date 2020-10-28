import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 9:57 AM
 */
public class Car implements Runnable {

    private String name;

    public Car() {}

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0; // Khởi tạo điểm start (hay km bắt đầu)
        long startTime = System.currentTimeMillis(); // Khởi tạo time bắt đầu cuộc đua
        while (runDistance < Main.DISTANCE) {
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log = "|";
                int percenTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percenTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percenTravel >= i && percenTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println(this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM/100KM");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("--------------------------------");
        System.out.println("Car " + this.name + ": Finish in " + (endTime - startTime) / 1000 + "s");
        System.out.println("--------------------------------");
    }
}
