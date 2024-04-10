import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek laptop
        Lenovo lenovo = new Lenovo("ThinkPad X1 Carbon", "Intel Core i7", "16GB RAM", "512GB SSD");
        Toshiba toshiba = new Toshiba("Portégé X30-F", "Intel Core i5", "8GB RAM", "256GB SSD");
        MacBook macbook = new MacBook("MacBook Pro 13-inch", "Apple M1 Chip", "8GB RAM", "256GB SSD");

        // Menampilkan informasi awal laptop
        System.out.println("Informasi Laptop:");
        System.out.println("1. Lenovo:");
        System.out.println(lenovo);
        System.out.println("2. Toshiba:");
        System.out.println(toshiba);
        System.out.println("3. MacBook:");
        System.out.println(macbook);

        // Menu untuk mengontrol laptop
        System.out.println("\nMenu:");
        System.out.println("a. input “ON” untuk menyalakan laptop");
        System.out.println("b. input “OFF” untuk mematikan laptop");
        System.out.println("c. input “UP” untuk menambah volume");
        System.out.println("d. input “DOWN” untuk mengurangi volume");

        while (true) {
            System.out.print("Masukkan perintah (ON/OFF/UP/DOWN): ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    lenovo.turnOn();
                    toshiba.turnOn();
                    macbook.turnOn();
                    break;
                case "OFF":
                    lenovo.turnOff();
                    toshiba.turnOff();
                    macbook.turnOff();
                    break;
                case "UP":
                    lenovo.volumeUp();
                    toshiba.volumeUp();
                    macbook.volumeUp();
                    break;
                case "DOWN":
                    lenovo.volumeDown();
                    toshiba.volumeDown();
                    macbook.volumeDown();
                    break;
                default:
                    System.out.println("Perintah tidak valid.");
            }

            System.out.println("\nStatus setelah perintah:");
            System.out.println("1. Lenovo:");
            System.out.println(lenovo.getStatus());
            System.out.println("2. Toshiba:");
            System.out.println(toshiba.getStatus());
            System.out.println("3. MacBook:");
            System.out.println(macbook.getStatus());

            System.out.print("\nLanjutkan? (y/n): ");
            String cont = scanner.nextLine().toLowerCase();
            if (cont.equals("n")) {
                break;
            }
        }

        scanner.close();
    }
}

class Lenovo {
    private boolean powerOn;
    private int volume;

    public Lenovo(String model, String processor, String ram, String storage) {
        // inisialisasi
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public String getStatus() {
        return "Power: " + (powerOn ? "ON" : "OFF") + ", Volume: " + volume;
    }
}

class Toshiba {
    // Implementasi kelas Toshiba
}

class MacBook {
    // Implementasi kelas MacBook
}
