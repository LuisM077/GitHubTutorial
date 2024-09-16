
import java.util.Random;


public class GitHubTutorial
{


    public static void main(String[] args)
    {
        Random random = new Random();
        String str = "Hello World!";
        int age = random.nextInt(100);
        
        System.out.println(str + " Today I turned " +  age + " :p");
    }
    
}
