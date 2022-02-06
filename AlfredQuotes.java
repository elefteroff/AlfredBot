import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello " + name;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        return "for snarky response return string";
    }
    
    public String ageDeclaration(String conversation) {
        return "I, ALFRED, AM OLD!";
    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

