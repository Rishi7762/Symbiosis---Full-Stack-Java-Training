package demo;

public class jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define and initialize the jagger array
		int myarray[][] = new int[3][];
		myarray[0] = new int[]{1,2,3};
		myarray[1] = new int[]{4,5};
		myarray[2] = new int[]{6,7,8,9,10};
		//dispaly
		System.out.println("Two Dimensional jagger array :");
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=0;j<myarray[i].length;j++)
			{
				System.out.print(myarray[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
