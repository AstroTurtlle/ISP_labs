package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FileReadUtil;
import examples.serializableJson.Vehicle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Route route1 = new Route("LRCL-LROP");
        Waypoint way = new Waypoint("LRCL", "(Cluj-Napoca International Airport)", 46.7852, 23.6862, 415);
        route1.addWaypoint(way);
        Waypoint way2 = new Waypoint("TASOD", "(Tasnad VOR/DME)", 47.0548, 23.9212, 10460);
        route1.addWaypoint(way2);
        for(Waypoint w : route1.getWaypoints()) {
            String jsonContent = FileReadUtil.readAllFileLines(route1.getPath()+"\\"+w.getIndex()+".json").stream().collect( Collectors.joining( "\n" ));
            Waypoint write = objectMapper.readValue(jsonContent, Waypoint.class);
            System.out.println(write);
        }
    }
}
