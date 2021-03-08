package mvc.model.prompt;

import mvc.model.entry.AddressBook;
import mvc.model.entry.Entry;
import mvc.service.AddressBookServiceImpl;

import java.util.List;

public class PromptChoiceFour implements Prompt {

    private static PromptChoiceFour instance = null;

    static public PromptChoiceFour getInstance() {
        if (instance == null) {
            instance = new PromptChoiceFour();
        }
        return instance;
    }

    @Override
    public List<Entry> showPromptText() {
        return AddressBook.getInstance().getEntryList();
    }


}
