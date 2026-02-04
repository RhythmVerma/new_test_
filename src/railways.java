import java.util.Scanner;

class Train {
    int trainNumber;
    String source, destination;
    int boggies;

    void input(Scanner sc) {
        System.out.print("Train Number: ");
        trainNumber = sc.nextInt();
        System.out.print("Source: ");
        source = sc.next();
        System.out.print("Destination: ");
        destination = sc.next();
        System.out.print("Total Boggies: ");
        boggies = sc.nextInt();
    }

    void display() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Boggies: " + boggies);
    }
}

class PassengerTrain extends Train {
    int passengerBoggies;

    void inputPassenger(Scanner sc) {
        input(sc);
        System.out.print("Passenger Boggies: ");
        passengerBoggies = sc.nextInt();
    }

    void displayPassenger() {
        display();
        System.out.println("Passenger Boggies: " + passengerBoggies);
    }
}

class GoodsTrain extends Train {
    int capacity;

    void inputGoods(Scanner sc) {
        input(sc);
        System.out.print("Loading Capacity: ");
        capacity = sc.nextInt();
    }

    void displayGoods() {
        display();
        System.out.println("Loading Capacity: " + capacity);
    }
}

public class railways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PassengerTrain p = new PassengerTrain();
        GoodsTrain g = new GoodsTrain();

        System.out.println("Passenger Train:");
        p.inputPassenger(sc);
        p.displayPassenger();

        System.out.println("\nGoods Train:");
        g.inputGoods(sc);
        g.displayGoods();
    }
}
