import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        for (int day = 1; day <= 20; day++) {
            boolean open = false;
            Guest relevantGuest = null;
            Scanner scanner1 = new Scanner(System.in);
            Set<String> visitors = new TreeSet<>();
            Set<Guest> guests = new HashSet<>();
            Set<Guest> currentGuests = new HashSet<>();
            while (!open) {
                String input = scanner1.nextLine();
                if (!input.equalsIgnoreCase("open")) {
                    System.out.println("Invalid input. Please open the park");
                }
                else {
                    System.out.println("Day " + day);
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
                        System.out.println("Closing...");
                        closed = true;


                    }
                }
                    else if (splitInput[0].equalsIgnoreCase("enter") || splitInput[0].equalsIgnoreCase("exit")) {
                        System.out.println("Contains either enter or exit");
                        if (!(splitInput[1].length() > 20)) {
                            System.out.println("Name is valid");
                            //valid name, continue process
                            if (visitors.contains(splitInput[1])) {
                                System.out.println("Visitor = true");
                                for (Guest i : guests) {
                                    System.out.println(i.getName().);
                                    System.out.println(splitInput[1].length());
                                    System.out.println(i.getName()==splitInput[1]);
                                    if (i.getName()==splitInput[1]) {
                                        System.out.println("Guest with name " + i.getName());
                                        //make sure to get the correct guest-object
                                        if (!(currentGuests.contains(i))) {
                                            System.out.println(i.getName() + " is already in the park.");
                                            //Code block for if the code is not already in the park currently
                                            relevantGuest = i;
                                        }
                                    }
                                }
                            }
                            else {
                                relevantGuest = new Guest(splitInput[1], 0);
                                System.out.println("NEW guest created");
                            }

                            try {
                                timeStamp = Integer.parseInt(splitInput[2]);
                                success = true;
                            } catch (NumberFormatException e) {
                                System.out.println(splitInput[2] + " is not a valid timestamp.");
                            }
                            if (success) {
                                System.out.println("Valid timestamp");
                                if (splitInput[0].equalsIgnoreCase("enter")) {
                                    relevantGuest.setEntry(timeStamp);
                                    relevantGuest.setInside(true);
                                    currentGuests.add(relevantGuest);
                                    visitors.add(relevantGuest.getName());
                                    guests.add(relevantGuest);
                                    //Block of code for entering the park
                                } else if (splitInput[0].equalsIgnoreCase("exit")) {
                                    //Block of code for exiting the park
                                    relevantGuest.setExit(timeStamp);
                                    relevantGuest.setInside(false);
                                    currentGuests.remove(relevantGuest);
                                }

                            }
                        }
                    }
                }
            System.out.println("Day " + day);
            for (String name : visitors) {
                for (Guest g : guests) {
                    if (name == g.getName()) {
                        System.out.println(name + " $" + g.calculateFee());
                    }
                }
            }
        }
    }
}