
import java.util.*;

public class NumberGame
{
  public static void startGame()
  {
   Scanner sc=new Scanner(System.in);
   int generatedNum=getrandom(1,100); 
   int limit=8;
   boolean user=false;
   System.out.println("Hello.. Enter your name");
   String name=sc.next();
   System.out.println(name + "you have "+ limit+ " chances to guess the correct number");

   for(int i=0;i<limit;i++)
   {
     System.out.println(" chance " + (i+1) + " Enter Your Guess : ");
     int guess=sc.nextInt();
   
     if(guess== generatedNum)
     {
      System.out.println("You Won");
      user=true;
      limit--;
      break;
     }
     else if(guess < generatedNum)
     {
       System.out.println("Your guess is too low..");
     }
     else if(guess > generatedNum)
     {
      System.out.println("Your guess is too high..");
     }
   
   }
  if(user==false)
     System.out.println(" Maximum Limit is over for this round.And the number is: "+generatedNum);
  }

public static int getrandom(int min,int max)
{
  return (int)(Math.random()*(max-min+1)+min);
}

public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 startGame();
 System.out.println("Do you want to play again? press 1 for yes , 0 for NO");
 int option=sc.nextInt();
 if(option==1)
    startGame();
 else
  System.out.println("THANK YOU");
 }
}