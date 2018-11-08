package medium;

public class M48_RotateImage {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) { // line i 
                swap1(i, j, matrix);
            }
        }
        swap2(matrix);
    }
    private void swap1 (int i, int j, int[][] matrix) { //
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    private void swap2 (int[][] matrix) { //  matrix[i][matrix[0].length-1-j];  => -j 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length/2; j++) {;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = temp;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
