package medium;

import java.util.ArrayList;
import java.util.List;

public class M54_SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		if (matrix.length == 0) {
			return res;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int left = 0;
		int right = col - 1;
		int up = 0;
		int down = row - 1;
		while (left < right && up < down) { // <= ?
			for (int i = left; i <= right; i++) {
				res.add(matrix[up][i]);
			}
			for (int i = up + 1; i <= down - 1; i++) {
				res.add(matrix[i][right]);
			}
			for (int i = right; i >= left; i--) {
				res.add(matrix[down][i]);
			}
			for (int i = down - 1; i >= up + 1; i--) { //
				res.add(matrix[i][left]);
			}
			left++;
			right--;
			up++;
			down--;
		}
		if (left > right || up > down) { // only || work,otherwise 2*x(x>3)的matrix会出问题
			return res;
		} else {
			if (left == right) { // |
				for (int i = up; i <= down; i++) {
					res.add(matrix[i][left]); // right
				}
			} else { // ----
				for (int i = left; i <= right; i++) {
					res.add(matrix[up][i]); // down
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
