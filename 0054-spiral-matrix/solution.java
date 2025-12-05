class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] directions = {0, 1, 0, -1, 0};

        int currentRow = 0;
        int currentCol = 0;

        int directionIndex = 0; // 0 - right; 1 - down; 2 - left; 3 - up

        List<Integer> result = new LinkedList<>();

        boolean[][] visited = new boolean[rows][cols];

        int totalCells = rows * cols;

        for(int i = 0; i < totalCells; i++) {
            result.add(matrix[currentRow][currentCol]);

            visited[currentRow][currentCol] = true;

            int nextRow = currentRow + directions[directionIndex];
            int nextCol = currentCol + directions[directionIndex + 1];

            if (nextRow < 0 || nextRow >= rows || 
                nextCol < 0 || nextCol >= cols || 
                visited[nextRow][nextCol]) {
                // Turn clockwise to next direction
                directionIndex = (directionIndex + 1) % 4;
            }

            currentRow += directions[directionIndex];
            currentCol += directions[directionIndex + 1];
        }

        return result;
    }
}
