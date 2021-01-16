package rishabh.jan.division3;

import java.util.Scanner;

public class chefAndDivision3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer testCount = sc.nextInt();
		for(int test=0; test<testCount; test++)
		{
			
			Integer tests = sc.nextInt();
			Integer problems = sc.nextInt();
			Integer days = sc.nextInt();
			Integer totalTests = 0;
			for(int i = 0; i<tests; i++)
			{
				totalTests = totalTests + sc.nextInt();
			}
			Integer maxTestsDays = totalTests/problems;
			if(maxTestsDays>days)
			{
				System.out.println(days);
			}
			else
			{
				System.out.println(maxTestsDays);
			}
		}
		sc.close();
	}
}
