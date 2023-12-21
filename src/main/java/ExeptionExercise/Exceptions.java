package ExeptionExercise;

public class Exceptions extends Exception {
    public Exceptions(String message, int countCookies){
        super(message + ". You cannot divide " + countCookies + " cookies evenly amount 0 friends!");
    }

}
//test.getCause()  Throwable cause