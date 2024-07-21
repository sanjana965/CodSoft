import java.util.*;
class GradeCalculator
{
  public void calculateGrade(int sub[])
  {
   int n=sub.length;

   int total=0;
   for(int i=0;i<n;i++)
   {
    total=total+sub[i];
   }
    
   float average=total/n;
   char grade=assignGrade(average);
   
   System.out.println("Your total marks: "+total);
   System.out.println("Your average percentage: " +average);
   System.out.println("Your Grade: "+grade);
  }

   public char assignGrade(float average)
  {
   char grade='A'; 
   if(average>85 && average<=100)
       grade='A';
   if(average>65 && average<=85)
       grade='B';
   if(average>45 && average<=65)
       grade='C';
   if(average>35 && average<=45)
       grade='D';
   if(average<=35)
       grade='F';
   return grade;
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  
    System.out.println("enter how many subjects");
    int n=sc.nextInt();

    int sub[]=new int[n];

    for(int i=0;i<n;i++)
    {
       System.out.println("enter marks of subject "+(i+1)+" out of 100");
       sub[i]=sc.nextInt();

    }

    GradeCalculator gc=new GradeCalculator();
    gc.calculateGrade(sub);
  }
}