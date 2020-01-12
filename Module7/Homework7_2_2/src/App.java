import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();

        // Так как у аэропорта несколько терминалов, а у каждого терминала
        // свой спиоок вылетов, то соберем все вылеты всех терминалов в один список.
        List<Flight> flights = new ArrayList<>();
        airport.getTerminals().forEach(t -> flights.addAll(t.getFlights()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 2);
        Date dateFlight = calendar.getTime();

        flights.stream()
                .filter(f -> f.getDate().after(new Date())
                        && f.getDate().before(dateFlight)
                        && f.getType() == Flight.Type.DEPARTURE)
                .sorted(Comparator.comparing(Flight::getDate))  // этого не требуется, но так красивее
                .forEach(f -> System.out.println(f.getDate() + " / " + f.getAircraft()));

    }
}
