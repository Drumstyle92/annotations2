/**
 * @author Drumstyle92
 * class that contains the main method.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method which contains an object, two methods and their outputs.
     *
     */
    public static void main(String[] args) {
    // object creation
    Greetings greetings;
    greetings = new Greetings();
    System.out.println("-----------------------------------");
    greetings.sayWelcome();
    System.out.println("-----------------------------------");
    greetings.sayGoodbye();
    System.out.println("-----------------------------------");
    }
}
