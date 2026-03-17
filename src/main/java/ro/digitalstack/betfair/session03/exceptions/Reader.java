package ro.digitalstack.betfair.session03.exceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/resources/file.txt"));
        for(String line : lines) {
            System.out.println(line);
        }
    }
}
