package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    Menu menu;
    PrintStream consoleStream;
    ByteArrayOutputStream outputStream;
    PrintStream stream;

    @BeforeEach
    void init() {
        menu = new Menu();
        consoleStream = System.out;
        outputStream = new ByteArrayOutputStream();
        stream = new PrintStream(outputStream);
        System.setOut(stream);
    }


    @Test
    void shouldPrintVeganPizza() {
        menu.printVeganPizza();
        System.setOut(consoleStream);

        assertEquals("Margherita\r\n" + "Marinara\r\n" + "Quattro\r\n" + "Capricciosa\r\n" + "Ortolana\r\n" + "Boscaiola\r\n", outputStream.toString());
    }

    @Test
    void shouldPrintAllergensPizza() {
        menu.printAllergensPizza();
        System.setOut(consoleStream);

        assertEquals("Prosciutto\r\n" +
                "Quattro\r\n" +
                "Boscaiola\r\n", outputStream.toString());


    }

    @Test
    void shouldReturnTrueWhenPresentPizzaVeganWithTomatoPepper() {
        assertTrue(menu.isPizzaVeganWithTomatoPepper());
    }

    @Test
    void shouldReturnFalseWhenMozzarellaIsNotPresentAllPizza() {
        assertFalse(menu.isMozzarellaPresentAllPizza());
    }

    @Test
    void shouldPrintMinCaloriesPizza() {
        menu.printMinCaloriesPizza();
        System.setOut(consoleStream);

        assertEquals("Margherita\r\n", outputStream.toString());
    }

    @Test
    void printMaxCaloriesPizza() {
        menu.printMaxCaloriesPizza();
        System.setOut(consoleStream);
        assertEquals("Prosciutto\r\n", outputStream.toString());
    }
}