package se.reky.hakan;

import org.junit.jupiter.api.*;

import java.util.Scanner;

public class IOHandlerTest {

    Scanner scanner;
    private IOHandler createIOHandler (String dataForScanner) {
        IOHandler ioHandler = new IOHandler(scanner = new Scanner(dataForScanner));
        return ioHandler;
    }

    @Test
    @DisplayName("Testing the Iohandlers hasNextInt function")
    public void IOHandlerTest () {
        IOHandler ioHandler = createIOHandler("5");
        Assertions.assertTrue(ioHandler.hasNextInt());
    }
}
