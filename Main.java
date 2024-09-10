import com.alfazh.javaoop.kendaraan.Kendaraan;
import com.alfazh.javaoop.kendaraan.Mobil;
import com.alfazh.javaoop.kendaraan.Motor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int choise = 0;

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        menu();

        do {
            switch (choise) {
                case 1:
                    drive(mobil);
                    break;
                case 2:
                    drive(motor);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (choise != 3);

    }

    public static void drive(Kendaraan kendaraan){
        menuDrive();
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                kendaraan.turnOn();
                System.out.println("Kendaraan is on");
                kendaraan.printData();
                break;
            case 2:
                kendaraan.turnOff();
                System.out.println("Kendaraan is off");
                kendaraan.printData();
                break;
            case 3:
                System.out.print("Masukkan kecepatan: ");
                int speed = scanner.nextInt();
                kendaraan.speed(speed);
                kendaraan.printSpeed();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }

    public static void menuDrive(){
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Speed");
        System.out.println("4. Exit");
        System.out.print("Pilih: ");
    }

    public static void menu(){
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Exit");
        System.out.print("Pilih: ");
        choise = scanner.nextInt();
    }
}