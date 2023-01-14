package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CinemaHallCreatorTest {
   private CinemaHallCreator cinemaHall;
   private PrintStream consoleStream;
   private ByteArrayOutputStream outputStream;
   private PrintStream stream;

    @BeforeEach
    void init() {
        cinemaHall = new CinemaHallCreator();
        consoleStream = System.out;
        outputStream = new ByteArrayOutputStream();
        stream = new PrintStream(outputStream);
        System.setOut(stream);
    }

    @Test
    void shouldPrintCinemaHallsByType() {
        cinemaHall.printCinemaHallsByType();
        System.setOut(consoleStream);

        assertEquals("4D: [Yellow Hall, Purple Hall, Silver Hall]\r\n" +
                "3D: [Red Hall, Green Hall, Orange Hall, Diamond Hall]\r\n" +
                "2D: [Blue Hall, White Hall, Turkish Hall]\r\n", outputStream.toString());
    }
}