package mvc.model;

import java.util.stream.Stream;

public enum Selections {
    ONE (1, "Add an entry"),
    TWO(2,"Remove an entry"),
    THREE(3, "Search for a specified entry"),
    FOUR(4, "Print Address Book"),
    FIVE(5, "Delete Book"),
    SIX(6, "Quit");

    private final Integer i;
    private final String s;

    Selections(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    public Integer getI() {
        return i;
    }

    public String getS(){
        return s;
    }

    public static Selections enumBySelection(int i) {
        return Stream.of(Selections.values())
                .filter(selections -> selections.getI().equals(i))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public String toString() {
        return """
                 %d) %s...
                """.formatted(i, s);
    }
}
