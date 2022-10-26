/**
 * @author Drumstyle92
 * class that contains two methods that greet the user
 */
public class Greetings {
    /**
     * welcome method with the name and surname of the creator.
     */
    @DevAnnotation(davName = "John",davSurname = "Walker")
    public void sayWelcome(){
    System.out.println("Welcome! \n(was written by John Walker) ");
}

    /**
     * goodbye method with the name and surname of the creator.
     */
    @DevAnnotation(davName = "Mark", davSurname = "Brown")
    public void sayGoodbye(){
    System.out.println("Goodbye! \n(was written by Mark Brown) ");
}

}
