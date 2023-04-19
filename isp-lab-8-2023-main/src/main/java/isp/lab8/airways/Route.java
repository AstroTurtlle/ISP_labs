package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Route {
    private String name;
    private List<Waypoint> waypoints= new ArrayList();
    private String path;

    public void createRoute() {
        File theDir = new File(".\\src\\main\\java\\isp\\lab8\\airways\\Routes\\" + name);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }

    public void addWaypoint(Waypoint w1) throws IOException {
        this.waypoints.add(w1);
        String workingFolder = ".\\src\\main\\java\\isp\\lab8\\airways\\Routes\\" + name;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(workingFolder+"\\"+w1.getIndex()+".json"), w1);
    }

    public String getPath() {
        return path;
    }

    public Route(String name) {
        this.name = name;
        this.createRoute();
        this.path = ".\\src\\main\\java\\isp\\lab8\\airways\\Routes\\" + this.name;
    }

    public String getName() {
        return name;
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }
}
