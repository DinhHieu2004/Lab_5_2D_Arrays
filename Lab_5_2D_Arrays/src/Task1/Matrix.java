package Task1;

public class Matrix {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		if(a.length!=b.length) {
			return null;
		}
	int[][] result = new int[a.length][a[0].length];
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			result[i][j]=a[i][j]+b[i][j];
		}
	}
	
	display(result);
	return result;
	}
	// subtract 2 matrices
	public static int[][]subtract(int[][] a, int[][] b) {
		if(a.length!=b.length) {
			return null;
		}
	int[][] result = new int[a.length][a[0].length];
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			result[i][j]=a[i][j]-b[i][j];
		}
	}
	display(result);
	return result;
	}
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		if(a[0].length != b.length) {
		   return null;
	   }else {
		   for(int i=0;i<result.length;i++) {
				for(int j=0;j<result[i].length;j++) {
					for(int k = 0;k<a[0].length;k++) {
						result[i][j]+= a[i][k]* b[k][j];
					}
				}
			}
	   }
		display(result);
	return result;
	}
	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
	
		int[][]result = new int[a[0].length][a.length];
		for(int i = 0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				result[i][j]=a[j][i];
			}
		}
		display(result);
	return result;
	}
	public static void display(int[][] matrix) {
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		int[][]a = {{1,2,3}
		           ,{4,5,6}
		           ,{7,5,6}};
		
		int[][]b = {{4,5,6}
                   ,{7,8,9}
                   };
		int[][] c = 
		{{2,1}
		,{8,5}
		,{4,1}};
		
		
		transpose(c);
	}
}
