package com.tts.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IgnoreMe {

    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("src/main/resources/output.txt")) {
           int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) (c));
            }
        }
    }
}
