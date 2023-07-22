import java.util.ArrayList;

public class SortAndSearchMain 
{

	public static void main(String[] args)
	{
		int size = 10;
		int searchValueArray;
		int searchValueArrayList;
		int[] arrayNums = new int[size];
		ArrayList<Integer> arrayListNums = new ArrayList<Integer>();
		Sort sort = new Sort();
		Search search = new Search();
		for(int x=0;x<size;x++)
		{
			arrayNums[x] = (int)(Math.random()*100);
			arrayListNums.add((int)(Math.random()*100));
		}
		
		System.out.println("Numbers in the array:");
		for(int x : arrayNums)
		{
			System.out.println(x);
		}
		
		System.out.println("\nNumbers in the arraylist:");
		
		for(int x : arrayListNums)
		{
			System.out.println(x);
		}
		
		searchValueArray = (int)(Math.random()*size);
		searchValueArray = arrayNums[searchValueArray];
		searchValueArrayList = ((int)(Math.random()*size));
		searchValueArrayList = arrayListNums.get(searchValueArrayList);
		
		System.out.println("\nThe number were searching for in the array is: "+searchValueArray);
		System.out.println("The number were searching for in the arraylist is: "+searchValueArrayList);
		System.out.println("Sorted:");
		//sort.bubbleSortArray(arrayNums);
		//sort.bubbleSortArrayList(arrayListNums);
		
		//sort.selectionSortArray(arrayNums);
		//sort.selectionSortArrayList(arrayListNums);
		
		//sort.insertionSortArray(arrayNums);
		//sort.insertionSortArrayList(arrayListNums);
		
		sort.quickSortArray(arrayNums);
		System.out.println();
		sort.quickSortArrayList(arrayListNums);

		//sort.bogoSortArray(arrayNums);
		//sort.bogoSortArrayList(arrayListNums);
		
		//search.linearSearchArray(arrayNums, searchValueArray);
		//search.linearSearchArrayList(arrayListNums, searchValueArrayList);
		
		search.binarySearchArray(arrayNums, searchValueArray);
		search.binarySearchArrayList(arrayListNums, searchValueArrayList);
	}

}
