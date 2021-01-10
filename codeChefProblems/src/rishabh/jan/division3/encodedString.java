package rishabh.jan.division3;

import java.util.*;

public class encodedString {
	public static void main(String[] args)
	{
		//System.out.println("Testing");
		HashMap <String,String> hmap = new HashMap <String,String>();
		hmap.put("0000", "a");
		hmap.put("0001", "b");
		hmap.put("0010", "c");
		hmap.put("0011", "d");
		hmap.put("0100", "e");
		hmap.put("0101", "f");
		hmap.put("0110", "g");
		hmap.put("0111", "h");
		hmap.put("1000", "i");
		hmap.put("1001", "j");
		hmap.put("1010", "k");
		hmap.put("1011", "l");
		hmap.put("1100", "m");
		hmap.put("1101", "n");
		hmap.put("1110", "o");
		hmap.put("1111", "p");
		Scanner scn = new Scanner(System.in);
		try {
			
			int testCases = scn.nextInt();
			//System.out.print("Values for no of cases is: "+testCases);
			for(int iterator =0; iterator < testCases; iterator++)
			{
				int noOfChar = scn.nextInt();
				//System.out.print("Values for no of Characters is: "+noOfChar);
				String encodedStrings = scn.next().toString();
				//System.out.print(encodedStrings);
				//System.out.print("Testing 1");
				int count = noOfChar /4;
				for(int i = 0; i < count; i++)
				{
					//System.out.print("Testing 2 : " + encodedStrings);
					System.out.print(hmap.get(encodedStrings.substring(i*4, (i*4)+4)));
				}
				System.out.println("");
			}
			
		}
		catch(Exception e)
		{
			System.out.print(e.toString());
		}
		finally{
			scn.close();
		}
	}
}
