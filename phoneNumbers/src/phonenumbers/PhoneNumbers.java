package phonenumbers;

import java.io.*;
import java.util.*;

class PhoneNumbers {

    private String number;

    public PhoneNumbers(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        number.substring(0, 2);
        return number + ".";

    }

    public String getExchange() {
        number.substring(3, 5);
        return number + ".";
    }

    public String getLineNumber() {
        number.substring(6, 9);
        return number + ".";
    }

    public Boolean isTollFree() {

        if (number.charAt(1) == '8') {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return number;
    }

    public boolean equals(PhoneNumbers other) {
        return number.equals(other.number);

    }

    public static PhoneNumbers read(Scanner scanner) {
        if (!scanner.hasNext()) {
            return null;
        }
        String number = scanner.next();
        return new PhoneNumbers(number);
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("numbers.txt"));

        int count = 0;

        PhoneNumbers number = read(scanner);
        PhoneNumbers number2 = null;

        while (number != null) {
            System.out.println("phone number: " + number);
            System.out.println("area code: " + number.getAreaCode());
            System.out.println("exchange: " + number.getExchange());
            System.out.println("line number: " + number.getLineNumber());
            System.out.print("is toll free: " + number.isTollFree() + "\n");

            System.out.println();
            count++;

            number2 = read(scanner);
            if (number2 == null) {
                break;
            }

            if (number2.equals(number)) {

                System.out.println("Duplicate phone number " + '"' + number + '"' + " discovered");

                number = read(scanner);

                count++;

            } else {
                number = number2;
            }

        }
        System.out.println("---");
        System.out.println(count + " names processed.");
    }

}
