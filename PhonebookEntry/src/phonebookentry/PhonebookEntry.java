package phonebookentry;

import java.io.*;
import java.util.*;

class PhonebookEntry {

    private final Name name;
    private final PhoneNumber phoneNumber;
    // first had to create name object and phonenumber object , then use  Name and PhoneNumber throughout the program.

    public PhonebookEntry(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println("Dialing " + name.name + ": " + phoneNumber.phoneNumber);
    }

    @Override
    public String toString() {
        return name + ": " + phoneNumber;
    }

    public boolean equals(PhonebookEntry other) {

        return name.equals(other.name) && phoneNumber.equals(other.phoneNumber);
    }

    public static PhonebookEntry read(Scanner scanner) {
        if (!scanner.hasNext()) {
            return null;
        }
        Name name = new Name(scanner.next() + " " + scanner.next());
        PhoneNumber number = new PhoneNumber(scanner.next());
        return new PhonebookEntry(name, number);

    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("phonebook.txt"));
        int count = 0;

        PhonebookEntry nextent = null;
        PhonebookEntry pbentry = null;

        while (true) {

            System.out.println();
            // read next line from the file
            //nexttent was reading second line, 2nd entry pb entry reads third line nextent reads 4th line
            pbentry = read(scanner);

            if (pbentry == null) {
                break;
            }

            count++;

            // counts while loop, counts the iterations through the file
            if (null != nextent && nextent.equals(pbentry)) {
                // first iteration nextent is null.
                // if nextent null && if next ent equals pb entry
                System.out.println("Duplicate phone book entry " + '"' + (pbentry.name.name) + '"' + " discovered");

            } else if (null != nextent && nextent.name.equals(pbentry.name)) {
                // first iteration nextent is null.
                // if nextent null && if pb entry name equals to nextent name.
                System.out.println("Warning duplicate name encountered " + '"' + (nextent.name.name) + '"' + " discovered");

            } else {
                // assign pbentry to nextent for further iterations
                nextent = pbentry;
            }

            System.out.println("phone book entry: " + pbentry.name.name + " " + nextent.phoneNumber.phoneNumber);
            pbentry.call();

        }
        System.out.println("---");
        System.out.println(count + " phonebook entries processed.");
    }
}
