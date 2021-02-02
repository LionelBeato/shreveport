public class Main {

    public static void main(String[] args) {

        // we can refer to AddressBook directly because its implementations are static
        AddressBook.addEntry(
                new Entry("Lionel",
                "Beato",
                "5555555",
                "beato@lionel.works"));
    }

}
