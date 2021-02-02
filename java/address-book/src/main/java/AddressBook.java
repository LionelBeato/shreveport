import java.util.ArrayList;
import java.util.List;

// this class is pretty much just a utility class
// as such all of the properties will indeed be static
public class AddressBook {

    // field: an ArrayList of generic type Entries

   private static List<Entry> entryList = new ArrayList<>();

    // methods: ways to manipulate the array list

    // add method
    public static void addEntry( Entry entry) {
        entryList.add(entry);
        System.out.println(entry);
    }

    // delete
    // finding
    // printing

     /* the instructions state that AddressBook should handle quitting the program
     * how can we do this without using "return" in main?
     * recall that we can terminate our program with System.exit(0)
     * System.exit is not generally recommended for use with your programs, but it does have its place
     * refer to the following article: https://www.baeldung.com/java-system-exit
      */

}
