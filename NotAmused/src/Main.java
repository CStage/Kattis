import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        for (int day = 1; day <= 20; day++) {
            boolean open = false;
            Guest relevantGuest = null;
            Set<String> visitors = new TreeSet<>();
            Set<Guest> guests = new HashSet<>();
            Set<Guest> currentGuests = new HashSet<>();
            while (!open) {
                String input = scanner1.nextLine();
                if (!input.equalsIgnoreCase("open")) {
                    System.out.println("Invalid input. Please open the park");
                }
                else {
                    open = true;
                }
            }
            boolean closed = false;
            while (!closed) {
                boolean success = false;
                String input = scanner1.nextLine();
                String[] splitInput = input.split(" ");
                int timeStamp = 0;
                if (splitInput.length != 3 ) {
                    if (input.equalsIgnoreCase("close") && currentGuests.size() == 0) {
                        closed = true;

                    }
                    else {
                        System.out.println("Input invalid");
                    }
                }
                else if (splitInput[0].equalsIgnoreCase("enter") || splitInput[0].equalsIgnoreCase("exit")) {
                    boolean number = true;
                    if (!(splitInput[1].length() > 20)) {
                        try {
                            Integer.parseInt(splitInput[1]);
                            Float.parseFloat(splitInput[1]);
                            Double.parseDouble(splitInput[1]);
                            Long.parseLong(splitInput[1]);
                            System.out.println(splitInput[1] + " contains numeric characters and is thus invalid.");
                        } catch (NumberFormatException e) {
                            number = false;
                        }
                        if (!number) {
                            if (visitors.contains(splitInput[1])) {
                                for (Guest i : guests) {
                                    if (i.getName().equals(splitInput[1])) {
                                        relevantGuest = i;
                                    }
                                }
                            } else {
                                relevantGuest = new Guest(splitInput[1], 0);
                            }

                            try {
                                timeStamp = Integer.parseInt(splitInput[2]);
                                success = true;
                            } catch (NumberFormatException e) {
                                System.out.println(splitInput[2] + " is not an integer timestamp.");
                            }
                            if (success || guests.size() <= 20) {
                                if (timeStamp >= relevantGuest.getEarliestLegalEntry() && timeStamp <= 800) {
                                    if (splitInput[0].equalsIgnoreCase("enter") && !relevantGuest.getInside()) {
                                        currentGuests.add(relevantGuest);
                                        if (!visitors.contains(relevantGuest.getName())) {
                                            visitors.add(relevantGuest.getName());
                                        }
                                        if (!guests.contains(relevantGuest.getName())) {
                                            guests.add(relevantGuest);
                                        }
                                        relevantGuest.setEntry(timeStamp);
                                        relevantGuest.setInside(true);
                                    } else if (splitInput[0].equalsIgnoreCase("exit") && relevantGuest.getInside()) {
                                        if (relevantGuest.getEntry() < timeStamp) {
                                            //Block of code for exiting the park
                                            relevantGuest.setExit(timeStamp);
                                            relevantGuest.setInside(false);
                                            relevantGuest.calculateFee();
                                            relevantGuest.setEntry(0);
                                            relevantGuest.setExit(0);
                                            relevantGuest.setEarliestLegalEntry(timeStamp);
                                            currentGuests.remove(relevantGuest);
                                        }
                                    }
                                } else System.out.println("Invalid timestamp");
                            }
                        }
                    } else {
                        System.out.println("Input is invalid");
                    }
                }
            }
            System.out.println("Day " + day);
            for (String name : visitors) {
                for (Guest g : guests) {
                    if (name == g.getName()) {
                        System.out.print(name + " $");
                        System.out.printf( "%.2f" , g.getFee());
                        System.out.println();
                    }
                }
            }

        }
        scanner1.close();
    }
}