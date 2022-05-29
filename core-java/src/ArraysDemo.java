
public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		
		//Print elements
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+" ");
		
		System.out.println("\n");
		
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		
		int[][] jag = {{1,2}, {3,4,5}, {6,7,8,9}};
		
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.print(jag[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int[] row : jag) {
			for(int i: row) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] sort= {4,2,5,3,1};
		
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < (sort.length-i-1); j++) {
				if(sort[j]>sort[j+1]) {
					int x=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=x;
				}
			}
			
		}
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i]+" ");
		}
		System.out.println();
	}

}
