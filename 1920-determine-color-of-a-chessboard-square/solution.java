class Solution {
    public boolean squareIsWhite(String coordinates) {
        int row = Integer.parseInt(coordinates.substring(1,2));
        int column = ((int) coordinates.charAt(0)) - 96; // 'a' code point is 97
        
        return (row % 2 == 0) ^ (column % 2 == 0); //XOR
    }
}
