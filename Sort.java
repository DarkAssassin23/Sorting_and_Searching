import java.util.ArrayList;

public class Sort 
{
	/**
	 * Takes in an array n and uses a bubble sort to sort it from least to greatest
	 * @param n the array that is being sorted
	 */
	public void bubbleSortArray(int[] n)
	{
		for(int x : n)
		{
			for(int i=1;i<n.length;i++)
			{
				if(n[i-1]>n[i])
				{
					int temp = n[i-1];
					n[i-1] = n[i];
					n[i] = temp;
				}
			}
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in an arraylist n and uses a bubble sort to sort it from least to greatest
	 * @param n the array list that is being sorted
	 */
	public void bubbleSortArrayList(ArrayList<Integer> n)
	{
		for(int x=0;x<n.size();x++)
		{
			for(int i=1;i<n.size();i++)
			{
				if(n.get(i-1)>n.get(i))
				{
					int temp = n.get(i-1);
					n.set(i-1, n.get(i));
					n.set(i, temp);
				}
			}
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in an array n and uses a selection sort to sort it from least to greatest
	 * @param n the array that is being sorted
	 */
	public void selectionSortArray(int[] n)
	{
		for(int x=n.length-1;x>0;x--)
		{
			int lowestNumber = 0;
			for(int i=1;i<=x;i++)
			{
				if(n[i]>n[lowestNumber])
					lowestNumber = i;
			}
			int temp = n[lowestNumber];
			n[lowestNumber] = n[x];
			n[x] = temp;
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in an arraylist n and uses a selection sort to sort it from least to greatest
	 * @param n the array list that is being sorted
	 */
	public void selectionSortArrayList(ArrayList<Integer> n)
	{
		for(int x=n.size()-1;x>0;x--)
		{
			int lowestNumber = 0;
			for(int i=1;i<=x;i++)
			{
				if(n.get(i)>n.get(lowestNumber))
					lowestNumber = i;
			}
			int temp = n.get(lowestNumber);
			n.set(lowestNumber, n.get(x));
			n.set(x, temp);
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in an array n and uses a insertion sort to sort it from least to greatest
	 * @param n the array that is being sorted
	 */
	public void insertionSortArray(int[] n)
	{
		for(int x=1;x<n.length;x++)
		{
			int lowestNumber = n[x];
			int y = x-1;
			while(y>=0&&n[y]>lowestNumber)
			{
				n[y+1] = n[y];
				y--;
			}
			n[y+1] = lowestNumber;
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in an arraylist n and uses a insertion sort to sort it from least to greatest
	 * @param n the arraylist that is being sorted
	 */
	public void insertionSortArrayList(ArrayList<Integer> n)
	{
		for(int x=1;x<n.size();x++)
		{
			int lowestNumber = n.get(x);
			int y = x-1;
			while(y>=0&&n.get(y)>lowestNumber)
			{
				n.set(y+1,n.get(y));
				y--;
			}
			n.set(y+1, lowestNumber);
		}
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Calls the private method sortArrayQuick to sort the array then prints it out
	 * @param n array to be sorted using sortArrayQuick
	 */
	public void quickSortArray(int[] n)
	{
		if(n.length>0)
			sortArrayQuick(0,n.length-1,n);
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in a low and high number to find the pivot point of the array n and then uses recession to use a quick sort
	 * and sort the array n
	 * @param low the low value for the pivot point
	 * @param high the high value for the pivot point
	 * @param n the array to be sorted using a quick sort
	 */
	private void sortArrayQuick(int low, int high, int[] n)
	{
		int l = low;
		int h = high;
		int pivot = n[low+(high-low)/2];
		
		while(l<=h)
		{
			while(n[l]<pivot)
				l++;
			while(n[h]>pivot)
				h--;
			if(l<=h)
			{
				int temp = n[l];
				n[l] = n[h];
				n[h] = temp;
				l++;
				h--;
			}
		}
		if(low<h)
			sortArrayQuick(low,h,n);
		if(l<high)
			sortArrayQuick(l,high,n);
	}

	/**
	 * Calls the private method sortArrayListQuick to sort the arraylist then prints it out
	 * @param n arraylist to be sorted using sortArrayListQuick
	 */
	public void quickSortArrayList(ArrayList<Integer> n)
	{
		if(n.size()>0)
			sortArrayListQuick(0,n.size()-1,n);
		for(int x : n)
			System.out.println(x);
	}
	
	/**
	 * Takes in a low and high number to find the pivot point of the arraylist n and then uses recession to use a quick sort
	 * and sort the arraylist n
	 * @param low the low value for the pivot point
	 * @param high the high value for the pivot point
	 * @param n the arraylist to be sorted using a quick sort
	 */
	private void sortArrayListQuick(int low, int high, ArrayList<Integer> n)
	{
		int l = low;
		int h = high;
		int pivot = n.get(low+(high-low)/2);
		
		while(l<=h)
		{
			while(n.get(l)<pivot)
				l++;
			while(n.get(h)>pivot)
				h--;
			if(l<=h)
			{
				int temp = n.get(l);
				n.set(l, n.get(h));
				n.set(h, temp);
				l++;
				h--;
			}
		}
		if(low<h)
			sortArrayListQuick(low,h,n);
		if(l<high)
			sortArrayListQuick(l,high,n);
	}
}
