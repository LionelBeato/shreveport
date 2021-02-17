
// classes are utilized as types when we construct objects
// in essence, we're creating a custom type
public class Chapstick {

    // these are known as fields
    // they are the variable "properties" of Chapstick
    public String shape;
    public String composition;
    private String flavor;

    // this is a method
    // think of methods as your "verbs" / "actions"
    public void soothe() {
        System.out.println("This chapstick is very soothing.");
    }

    public Chapstick(String flavor) {
        this.flavor = flavor;
    }

    // this has access to the field flavor
    // so this is completely legal for access
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
