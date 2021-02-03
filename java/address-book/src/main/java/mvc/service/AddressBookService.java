package mvc.service;

import mvc.model.entry.Entry;

import java.util.List;

public interface AddressBookService {

    List<Entry> getAllEntries();
    Entry getEntryByEmail(String email);
    void deleteEntryByEmail(String email);
    void addEntry(Entry entry);
    void addAllEntries(Entry... args);

}
