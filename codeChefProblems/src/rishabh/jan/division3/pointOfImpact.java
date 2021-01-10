package rishabh.jan.division3;

import java.util.*;

public class pointOfImpact {
	public static void main(String[] args)
	{
		//System.out.println("Testing");
		Scanner scn = new Scanner(System.in);
		int testCases = scn.nextInt();
		for(int iterator = 0; iterator<testCases; iterator++)
		{
			int size = scn.nextInt();
			int colisions = scn.nextInt();
			int xCoordinate = scn.nextInt();
			int yCoordinate = scn.nextInt();
			if(colisions == 0)
			{
				System.out.println(xCoordinate+" "+yCoordinate);
				continue;
			}
			else if((xCoordinate == 0 && yCoordinate == 0 )|| (xCoordinate == size && yCoordinate == size) || (xCoordinate == 0 && yCoordinate == size )
					|| (xCoordinate == size && yCoordinate == 0 ))
			{
				System.out.println(xCoordinate+" "+yCoordinate);
				continue;
			}
			else
			{
				int x = 1;
				int y = 1;
				if(xCoordinate > yCoordinate)
				{
					yCoordinate += size-xCoordinate;
					xCoordinate = size;
					x = 0;
				}
				else
				{
					xCoordinate += size-yCoordinate;
					yCoordinate = size;
					y=0;
				}
				if(xCoordinate == size && yCoordinate == size)
				{
					System.out.println(xCoordinate+" "+yCoordinate);
					continue;
				}
				else
				{
					colisions = colisions % 4;
					if(colisions == 0)
					{
						colisions = 4;
					}
					for(int innerIterator = 1; innerIterator < colisions; innerIterator++)
					{
						if(xCoordinate == size)
						{
							if(y == 1)
							{
								xCoordinate -= size - yCoordinate;
								yCoordinate = size;
								y=0;
							}
							else
							{
								xCoordinate -= yCoordinate;
								yCoordinate = 0;
								y=1;
							}
						}
						else if(xCoordinate == 0)
						{
							if(y == 1)
							{
								xCoordinate += size - yCoordinate;
								yCoordinate = size;
								y=0;
							}
							else
							{
								xCoordinate += yCoordinate;
								yCoordinate = 0;
								y=1;
							}
						}
						else if(yCoordinate == size)
						{
							if(x == 1)
							{
								yCoordinate -= size - xCoordinate;
								xCoordinate = size;
								x=0;
							}
							else
							{
								yCoordinate -= xCoordinate;
								xCoordinate = 0;
								x=1;
							}
						}
						else if(yCoordinate == 0)
						{
							if(x == 1)
							{
								yCoordinate += size - xCoordinate;
								xCoordinate = size;
								x=0;
							}
							else
							{
								yCoordinate += xCoordinate;
								xCoordinate = 0;
								x=1;
							}
						}
					}
				}
				System.out.println(xCoordinate+" "+yCoordinate);
			}
		}
	}
}
