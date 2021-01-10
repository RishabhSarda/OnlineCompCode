package rishabh.jan.division3;

import java.util.*;

public class fairElections
{
	public static void main(String[] args)
	{
		//System.out.print("testing ");
		Scanner scn = new Scanner(System.in);
		int testCases = scn.nextInt();
		for(int testCase =0; testCase < testCases; testCase++)
		{
			int jaksonVote = scn.nextInt();
			int jaksonVoteN = scn.nextInt();
			int[] jaksonVotes = new int[jaksonVote];
			int jaksonCount = 0;
			int[] jaksonVotesN= new int[jaksonVoteN];
			int jaksonCountN = 0;
			for(int i =0; i<jaksonVote; i++)
			{
				int number = scn.nextInt();
				jaksonCount += number;
				jaksonVotes[i]=number;
			}
			Arrays.sort(jaksonVotes);
			for(int i =0; i<jaksonVoteN; i++)
			{
				int number = scn.nextInt();
				jaksonCountN += number;
				jaksonVotesN[i]=number;
			}
			Arrays.sort(jaksonVotesN);
			//System.out.println("Jakson Vote array is: "+Arrays.toString(jaksonVotes));
			//System.out.println("Jakson VoteN array is: "+Arrays.toString(jaksonVotesN));
			if(jaksonCount > jaksonCountN)
			{
				System.out.println("0");
			}
			else
			{
				int check = 1;
				int swap = 0;
				int j = 0;
				int jN = jaksonVoteN;
				while(jaksonCount <= jaksonCountN)
				{
					swap++;
					if(jaksonVotes[j] > jaksonVotesN[jN-1])
					{
						check = 0;
						break;
					}
					//System.out.println("Value of jaksonCount for "+j+1+" iteration is L:" +jaksonCount);
					//System.out.println("Value of jaksonCountN for "+jN+1+" iteration is L:" +jaksonCountN);
					jaksonCount -= jaksonVotes[j];
					jaksonCount += jaksonVotesN[jN-1];
					jaksonCountN += jaksonVotes[j];
					jaksonCountN -= jaksonVotesN[jN-1];
					j++;
					jN--;
					if(j == jaksonVote || jN == 0)
					{
						break;
					}
					//jaksonVote
				}
				if(jaksonCount > jaksonCountN)
				{
					System.out.println(swap);
				}
				else
				{
					System.out.println("-1");
				}
			}
		}
		scn.close();
	}
}
