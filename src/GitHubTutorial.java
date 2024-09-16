
import java.util.Random;


public class GitHubTutorial
{


    public static void main(String[] args)
    {
        Random random = new Random();
        String str = "Hello World!";
        int age = random.nextInt(100);
        int a;
        int b;
        
        System.out.println(str + " Today I turned " +  age + " :p");
        
        a = random.nextInt(10 + 1);
        b = random.nextInt(10+1);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("a + b = " + a + b);
    }
    
}
