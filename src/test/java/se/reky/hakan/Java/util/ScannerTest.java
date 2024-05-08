package se.reky.hakan.Java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTest {

    Scanner scanner;

    @Test
    @DisplayName("Testing Scanner creation")
    public void scannerTest() {
        String input = "Testing Scanner Instansiation";
        scanner = new Scanner(input);
        Assertions.assertEquals(input, scanner.nextLine());
    }


}
