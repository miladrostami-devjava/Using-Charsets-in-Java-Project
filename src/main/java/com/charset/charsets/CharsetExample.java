package com.charset.charsets;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CharsetExample {

    public static void main(String[] args) {
// Path of input and output files
        Path inputFile = Paths.get("src/main/resources/input_iso8859.txt");
        Path outputFile = Paths.get("src/main/resources/output_utf8.txt");

// Define character set
        Charset iso8859Charset = Charset.forName("ISO-8859-1");
        Charset utf8Charset = StandardCharsets.UTF_8;

        try {
// Read input file using ISO-8859-1 character set

            List<String> lines = Files.readAllLines(inputFile, iso8859Charset);
            System.out.println("Read file using ISO-8859-1 Charset:");
            lines.forEach(System.out::println);


// Write output file using UTF-8 character set
            Files.write(outputFile, lines, utf8Charset);
            System.out.println("File saved using UTF-8 Charset: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
