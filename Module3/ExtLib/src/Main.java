import com.skillbox.airport.Airport;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        List aircraftsList = airport.getAllAircrafts();

        System.out.println(aircraftsList);
        System.out.println("Количество: " + aircraftsList.size());

        List terminalsList = airport.getTerminals();
        System.out.println(terminalsList);
        System.out.println("Количество: " + terminalsList.size());

    }
}
