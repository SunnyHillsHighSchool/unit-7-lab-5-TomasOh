//Copy and paste the code from Number.java -Lab 4
import java.util.ArrayList;

//header for Number class
public class Number
{
  //private instance variable (must be an Integer)
  private Integer num;

  //constructors
  public Number()
  {
    num = 0;
  }

  public Number(int n)
  {
    num = n;
  }
  
  
  //getter method
  public Integer getNum()
  {
    return num;
  }

  //setter method
  public void setNum(int n)
  {
    num = n;
  }

 //isOdd method
  public boolean isOdd()
  {
    //Create a boolean variable called numIsOdd and set it to false
    boolean numIsOdd = false;

    //Create an if-statement to check if the remainder of num divided by 2 is equal to 1
    if(num % 2 == 1)
    {
      //If true, set numIsOdd equal to true
      numIsOdd = true;
    }
   //End if-statement and return numIsOdd
   return numIsOdd;
  }
 
 //isPerfect method
 public boolean isPerfect()
 {
   //Create an empty ArrayList of Integers called numbers
   ArrayList<Integer> numbers = new ArrayList<Integer>();
   //Create boolean variable called numIsPerfect and set it to false 
   boolean numIsPerfect = false;

   //Create for loop to iterate through all of the numbers from 1 to one before num passed (initialize with int x = 1)
   for(int x = 1; x < num - 1; x++)
   {
     //Create an if-statement to check if the remainder of the number passed divided by x is equal to 0
     if(num % x == 0)
     {
       //If true, then add the number at x to the list
       numbers.add(x);
     }
     //Exit if-statement and for loop
   }
   //Create an int variable called sum = 0
   int sum = 0;

   //Create for loop to iterate through all of the elements in numbers (initialize with i)
   for(int i = 0; i < numbers.size(); i++)
   {
     //Add i to sum and exit for loop
     sum += numbers.get(i);
   }
  //Create if-statement to check if sum is equal to num passed
  if(sum == num)
  {
    //If true, set numIsPerfect to true
    numIsPerfect = true;
  }

  //End if-statement and return numIsPerfect
  return numIsPerfect;
 }


 //toString
 public String toString()
 {
   return "" + num;
 }
 
}