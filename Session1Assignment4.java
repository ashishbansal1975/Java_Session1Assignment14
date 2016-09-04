/* Write a program to print the characters corresponding to ASCII codes from 65 to 90.*/


public class Session1Assignment4
{
    public static void main(String [] args) 
    {
       
        System.out.println("The characters corresponding to ASCII codes from 65 to 90 are: ");

        for (int i = 65; i <= 90; i++)
        {             
            int unicode = 65;
            char character = (char) i;             
            System.out.println("The ASCII code "+ i + " has the following character : "+character);            
        }
     
    }
}
        