
// a class is a grouping of data
// a class is considered a blueprint for your objects
public class Application {

    // main method is our entry point
    // public is an access modifier
    // it delegates access to any piece of information
    // static refers to the fact that
    // the associated piece of data
    // belongs to the class implementation
    // void is the return type of the method
    // void is similar to null, it represents nothing
    public static void main(String[] args) {
        String myString = "Hello";
        int x = 4;

        System.out.println("This goes first " + myString);
        System.out.println("Hello World!");

        // here we are creating a variable called myChapstick
        // its of type Chapstick
        // we give it the value of "new Chapstick()"
        Chapstick myChapstick = new Chapstick("cherry");

        // Q:
        // now i want to access the flavor property
        // of myChapstick and print it to the terminal

        System.out.println(myChapstick.getFlavor());
        myChapstick.soothe();

    }

}
