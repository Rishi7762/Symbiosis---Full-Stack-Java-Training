package demo;

public class convertonfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
        int num[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("Print 2D array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
            	System.out.println("Value is:"+num[i][j]);
                sum += num[i][j];
            }
        }

        System.out.println("Sum of all values: " + sum);
    }
}

