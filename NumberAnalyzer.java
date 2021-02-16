//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas Oh

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    list = new ArrayList<Number>();
    for(int a: n)
    {
      list.add(new Number(a));
    }
  }
	//write count odds
  public int countOdds()
  {
    //Create an int variable called oddCount and set it equal to 0
    int oddCount = 0;

    //Create a for loop to iterate through all of the elements of the ArrayList (initialize with int x)
    for(int x = 0; x < list.size(); x++)
    {
      //Create an if-statement to check if the value of the ArrayList in position x is odd, using isOdd method
      if(list.get(x).isOdd())
      {
        //set oddCount equal to oddCount + 1
        oddCount += 1;
      }
    }
    return oddCount;
  }
	//write count evens
  public int countEvens()
  {
    //Create an int variable called evenCount and set it equal to 0
    int evenCount = 0;

    //Create a for loop to iterate through all of the elements of the ArrayList (initialize with int x)
    for(int x = 0; x < list.size(); x++)
    {
      //Create an if-statement to check if the value of the ArrayList in position x is NOT odd, using isOdd method
      if(!list.get(x).isOdd())
      {
        //set evenCount equal to evenCount + 1
        evenCount += 1;
      }
    }
    return evenCount;
  }

	//write count perfects
  public int countPerfects()
  {
    //Create an int variable called perfectCount and set it equal to 0
    int perfectCount = 0;

    //Create a for loop to iterate through all of the elements of the ArrayList passed (initialize with int x)
    for(int x = 0; x < list.size(); x++)
    {
      //Create an if-statement to check if the value of the ArrayList in position x is perfect, using isPerfect method
      if(list.get(x).isPerfect())
      {
        //set perfectCount equal to perfectCount + 1
        perfectCount += 1;
      }
    }
    return perfectCount;
  }
	
	//write a toString
  public String toString()
  {
    return "" + list;
  }
}