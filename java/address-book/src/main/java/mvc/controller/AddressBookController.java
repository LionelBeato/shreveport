package mvc.controller;

import mvc.model.entry.Entry;
import mvc.service.AddressBookService;

public class AddressBookController {

    private final AddressBookService addressBookService;

    public AddressBookController(AddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    public Entry getEntryByEmail(String email) {
        return addressBookService.getEntryByEmail(email);
    }

}
