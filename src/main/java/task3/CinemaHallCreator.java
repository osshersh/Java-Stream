package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CinemaHallCreator {
    private List<CinemaHall> cinemaHalls;

    public CinemaHallCreator() {
        CinemaHall blue = new CinemaHall("Blue Hall", "2D");
        CinemaHall red = new CinemaHall("Red Hall", "3D");
        CinemaHall yellow = new CinemaHall("Yellow Hall", "4D");
        CinemaHall white = new CinemaHall("White Hall", "2D");
        CinemaHall green = new CinemaHall("Green Hall", "3D");
        CinemaHall purple = new CinemaHall("Purple Hall", "4D");
        CinemaHall turkish = new CinemaHall("Turkish Hall", "2D");
        CinemaHall orange = new CinemaHall("Orange Hall", "3D");
        CinemaHall silver = new CinemaHall("Silver Hall", "4D");
        CinemaHall diamond = new CinemaHall("Diamond Hall", "3D");
        cinemaHalls = Arrays.asList(blue, red, yellow, white, green, purple, turkish, orange, silver, diamond);
    }

    public void printCinemaHallsByType() {
        cinemaHalls.stream().collect(Collectors.groupingBy(element -> element.type))
                .entrySet()
                .forEach(element -> System.out.println(element.getKey() + ": " + element.getValue()));
    }

    private class CinemaHall {
        private String name;
        private String type;

        public CinemaHall(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}