package mvc.service;

import mvc.model.entry.AddressBook;
import mvc.model.entry.Entry;

import java.util.Arrays;
import java.util.List;

public class AddressBookServiceImpl implements AddressBookService {

    private final AddressBook addressBook;

    public AddressBookServiceImpl (AddressBook addressBook){
        this.addressBook = addressBook;
    }

    @Override
    public List<Entry> getAllEntries() {
        return addressBook.getEntryList();
    }

    @Override
    public Entry getEntryByEmail(String email) {
        return addressBook.getEntryList().stream()
                .filter(entry -> entry.getEmailAddress().equals(email))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void deleteEntryByEmail(String email) {
       addressBook.getEntryList()
               .removeIf(entry -> entry
                       .getEmailAddress()
                       .equalsIgnoreCase(email));
    }

    @Override
    public void addEntry(Entry entry) {
        // for loop, essentially
        // this returns true if my email is not unique
        var isNotUnique = addressBook.getEntryList().stream()
                .anyMatch(e -> e.getEmailAddress().equals(entry.getEmailAddress()));

        if (isNotUnique) {
            System.out.print("Please add an entry with a unique email!\n");
        }  else {
            addressBook.getEntryList().add(entry);
            System.out.println(entry);
            System.out.print("Entry added! Sending you to main screen...\n");
        }
    }

    @Override
    public void addAllEntries(Entry... args) {
            addressBook.getEntryList()
                    .addAll(Arrays.asList(args));

    }
}
