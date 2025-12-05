class Solution {
    int rows;
    int columns;
    char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.columns = grid[0].length;

        int islandsCount = 0;

        for(int row = 0; row < rows; row++) {
            for(int column = 0; column < columns; column++) {
                if(grid[row][column] == '1') {
                    dfs(row, column);
                    islandsCount++;
                }
            }
        }

        return islandsCount;
    }

    public void dfs(int row, int column) {
        grid[row][column] = '0';

        int[] directions = new int[]{-1, 0, 1, 0, -1};

        for(int i = 0; i < 4; i++) {
            int newRow = row + directions[i];
            int newColumn = column + directions[i+1];

            if(
                newRow >=0 && newRow < rows &&
                newColumn >=0 && newColumn < columns &&
                grid[newRow][newColumn] == '1'
            ) {
                dfs(newRow, newColumn);
            }
        }
    }
}
