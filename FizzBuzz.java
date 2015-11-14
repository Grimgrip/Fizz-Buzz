package fizz.buzz;

public class FizzBuzz 
{
    static String fizz = "Fizz";
    static String buzz = "Buzz";
    
    public static void main(String[] args) 
    {
        //Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number 
        //and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
        
        /*for(int i = 1; i < 100; i++)
        {
            boolean modThree = (i%3 == 0);
            boolean modFive = (i%5 == 0);
            
            if(!modThree && !modFive)
                System.out.println("" + i);
            else
            {
                if(modThree)
                    System.out.println(fizz);
                if(modFive)
                    System.out.println(buzz);
            }
        }*/
        
        for(int i = 1; i < 100; i++)
        {
            String output = "";
            output += i % 3 == 0 ? fizz : "";
            output += i % 5 == 0 ? buzz : "";
            System.out.println(!output.isEmpty() ? output : i);
        }
     }
 }
    

