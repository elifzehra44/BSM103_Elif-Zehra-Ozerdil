
public class uygulama26 {

	public static void main(String[] args) {
		double[] list = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.println(isSorted(list));
	}
	
	private static char[] isSorted(double[] list) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[][] matrixAdd(int[][] A, int[][] B){
		int rows = A.length;
		int cols= 0;
		if(rows > 0) {
			cols = A[0].length;
		}
		int[][] C = new int[rows][cols];
		
		for(int satir = 0; satir< rows; satir++) {
			for(int sutun =0; sutun < cols; sutun++) {
				C[satir][sutun] = A[satir][sutun] + B[satir][sutun];
			}
		}
		return C;
	}
	
	}


