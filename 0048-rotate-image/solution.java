class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0, j=rows-1; i < rows/2; i++, j--) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }

        for(int i=0; i < rows; i++) {
            for(int j=0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
