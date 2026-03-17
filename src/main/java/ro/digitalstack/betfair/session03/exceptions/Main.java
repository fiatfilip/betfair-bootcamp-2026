package ro.digitalstack.betfair.session03.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ok;
        do {
            ok = true;
            System.out.print("Type number: ");
            try {
                int number = getNumber(scanner);
                System.out.println(number * 2);
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid number!: x");
                ok = false;
            }
        } while(!ok);


    }

    private static int getNumber(Scanner scanner) throws NumberFormatException {
        String numberString = scanner.nextLine();
        int number = Integer.parseInt(numberString);
        return number;
    }
}
