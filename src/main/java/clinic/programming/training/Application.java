package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public void greet()
	{
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello!");
		
		for (String greeting : greetings)
		{
			System.out.println("Greeting: " + greeting);
		}
	}


	public int countWords(String _stringToCount)
	{
		String[] separatedWords = StringUtils.split(_stringToCount, ' ');
		return (separatedWords == null) ? 0 : separatedWords.length;
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args)
	{
    	System.out.println ("Starting Application");
		Application app = new Application();
	
		app.greet();
	
		
    }
}
