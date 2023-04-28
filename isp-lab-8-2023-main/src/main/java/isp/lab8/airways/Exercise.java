package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Exercise {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Route route1 = new Route("LRCL-LROP");
        Waypoint way = new Waypoint("LRCL", "Cluj-Napoca International Airport", 46.7712, 23.6236, 415);
        route1.addWaypoint(way);
        Waypoint way2 = new Waypoint("TASOD", "Tasnad VOR/DME", 44.4268, 26.1025, 10460);
        route1.addWaypoint(way2);
        System.out.println(route1.getTotalDistance() + " kilometers");
        Route.displayAllRoutes();
        Route.displayRoute(route1);
        Route route2 = new Route("LRCL-LROO");
        Route.removeRoute(route2);
    }
}