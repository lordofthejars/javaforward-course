package org.acme.wrapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaIOMethods {

    public static void main(String[] args) throws IOException {

        Files
            .lines(Paths.get("src/main/resources", "hello.txt"))
            .forEach(content -> System.out.println("File Content: " + content));


        try (Stream<Path> stream = Files.list(Paths.get("src/main/resources"))) {
            stream.forEach(files -> System.out.println("Found Files: " + files.getFileName()));
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/hello.txt"))) {
            bufferedReader
                .lines()
                .filter(line -> "Aloha".equalsIgnoreCase(line))
                .forEach(line -> System.out.println("Show Filtered Content:" + line));
        }

    }

}