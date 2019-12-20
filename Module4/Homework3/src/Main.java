import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int truckCapacity = 12;      // Вместимость грузовика
        int containerCapacity = 27;  // Вместимость контейнера

        System.out.println("Введите количество ящиков:");
        Scanner scanner = new Scanner(System.in);
        int boxCount = scanner.nextInt();

        int truckNumber = 0;
        int containerNumber = 0;
        int boxNumber = 0;

        for (int i = 1; i <= boxCount; i++) {

            if (containerNumber % truckCapacity == 0 && boxNumber % containerCapacity == 0) {
                truckNumber++;
                System.out.println("Грузовик " + truckNumber + ":");
            }

            if (boxNumber % containerCapacity == 0) {
                containerNumber++;
                System.out.println("\tКонтейнер " + containerNumber + ":");
            }

            boxNumber++;
            System.out.println("\t\tЯщик " + boxNumber);

        }

    }
}
