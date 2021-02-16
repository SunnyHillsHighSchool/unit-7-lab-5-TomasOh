//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer(r);
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");
		//add more test cases
    int[] d = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11};
    NumberAnalyzer secTest = new NumberAnalyzer(d);
		out.println(secTest);
		out.println("odd count = "+secTest.countOdds());
		out.println("even count = "+secTest.countEvens());
		out.println("perfect count = "+secTest.countPerfects()+"\n\n\n");

    int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 151, 16, 17, 18, 19, 20};
    NumberAnalyzer thiTest = new NumberAnalyzer(s);
		out.println(thiTest);
		out.println("odd count = "+thiTest.countOdds());
		out.println("even count = "+thiTest.countEvens());
		out.println("perfect count = "+thiTest.countPerfects()+"\n\n\n");
	}
}