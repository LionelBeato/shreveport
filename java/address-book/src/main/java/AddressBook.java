import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// this class is pretty much just a utility class
// as such all of the properties will indeed be static
public class AddressBook {

    // field: an ArrayList of generic type Entries
   private static List<Entry> entryList = new ArrayList<>();

    // methods: ways to manipulate the array list

    // add method
    public static void addEntry( Entry entry) {
        // for loop, essentially
        // this returns true if my email is not unique
        var isNotUnique = entryList.stream()
                .anyMatch(e -> e.getEmailAddress().equals(entry.getEmailAddress()));

        if (isNotUnique) {
            System.out.print("Please add an entry with a unique email!\n");
        }  else {
            entryList.add(entry);
            System.out.println(entry);
            System.out.print("Entry added! Sending you to main screen...\n");
        }

    }

    public static void addAll(Entry... args) {
        entryList.addAll(Arrays.asList(args));
    }

    // delete
    public static String removeEntry(Entry entry) {
        var wasDeleted = entryList.remove(entry);
        if (wasDeleted) {
            return "\nEntry was deleted!\n";
        }
        return "Something went wrong...";
    }

    public static void removeAll() {
        entryList.clear();
        System.out.print("Address Book was cleared!\n");
    }

    // finding
    public static Entry findEntry(String email) {
       return entryList.stream()
                .filter(entry -> entry.getEmailAddress().equals(email))
                .findFirst()
                .orElseThrow();
    }

    // printing
    public static void printAll() {
        // System.out::println is a method reference
        // its a shorter way of saying e -> System.out.println(e)
         entryList.forEach(System.out::println);
    }

     /* the instructions state that AddressBook should handle quitting the program
     * how can we do this without using "return" in main?
     * recall that we can terminate our program with System.exit(0)
     * System.exit is not generally recommended for use with your programs, but it does have its place
     * refer to the following article: https://www.baeldung.com/java-system-exit
      */

}
