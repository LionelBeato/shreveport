public class Utility {

    /*
        This method has a hardcoded return value
        and such it is not dynamic, however it is still testable
     */
    public static Boolean returnBool() {
        return true;
    }

    /*
        This method is dynamic because the return value
        is dependent on the arguments passed in
     */
    public static Boolean isLarger(int x, int y){
        return x > y;
    }

    public static int addInts(int x, int y) {
        return x + y;
    }

//    public static void main(String[] args) {
//        System.out.println(isLarger(4,3));
//    }
}
