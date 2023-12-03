import java.util.ArrayList;

public class Search
{

	/**
	 * Searches through the array using a linear search to try to find key
	 * @param n the array being searched
	 * @param key the value that is being searched for
	 */
	public void linearSearchArray(int[] n, int key)
	{
		int count = 0;
		for(int x=0;x<n.length;x++)
		{
			if(n[x]==key)
			{
				System.out.println("Number: "+key+ " found at position "+(x+1)+" out of "+n.length);
				count = 1;
				x = n.length;
			}
		}
		if(count==0)
			System.out.println("Number: "+key+" is not in the array");
	}

	/**
	 * Searches through the arraylist using a linear search to try to find key
	 * @param n the arraylsit being searched
	 * @param key the value that is being searched for
	 */
	public void linearSearchArrayList(ArrayList<Integer> n, int key)
	{
		int count = 0;
		for(int x=0;x<n.size();x++)
		{
			if(n.get(x)==key)
			{
				System.out.println("Number: "+key+ " found at position "+(x+1)+" out of "+n.size());
				count = 1;
				x = n.size();
			}
		}
		if(count==0)
			System.out.println("Number: "+key+" is not in the array");
	}


	/**
	 * Searches through the array using a binary search to try to find key
	 * @param n the array being searched
	 * @param key the value that is being searched for
	 */
	public void binarySearchArray(int[] n, int key)
	{
		int count = 0;
		int low = 0;
		int high = n.length-1;
		while(high>=low)
		{
			int middle = low + ((high-low)/2);
			if(n[middle]==key)
			{
				System.out.println("Number: "+key+ " found at position "+(middle+1)+" out of "+n.length);
				count++;
				break;
			}
			else if(n[middle]>key)
				high = middle-1;
			else 
				low = middle+1;
		}
		if(count==0)
			System.out.println("Number: "+key+" is not in the array");
	}

	/**
	 * Searches through the arraylist using a binary search to try to find key
	 * @param n the arraylsit being searched
	 * @param key the value that is being searched for
	 */
	public void binarySearchArrayList(ArrayList<Integer> n, int key)
	{
		int count = 0;
		int low = 0;
		int high = n.size()-1;
		while(high>=low)
		{
			int middle = low + ((high-low)/2);
			if(n.get(middle)==key)
			{
				System.out.println("Number: "+key+ " found at position "+(middle+1)+" out of "+n.size());
				count++;
				break;
			}
			else if(n.get(middle)>key)
				high = middle-1;
			else 
				low = middle+1;
		}
		if(count==0)
			System.out.println("Number: "+key+" is not in the array");
	}
}
