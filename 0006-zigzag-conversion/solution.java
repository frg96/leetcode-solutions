class Solution {
    public String convert(String s, int numRows) {
        /*

        numRows = 4

        (0,0)             (0,3)             (0,6)
        (1,0)       (1,2) (1,3)       (1,5) (1,6)
        (2,0) (2,1)       (2,3) (2,4)       (2,6)
        (3,0)             (3,3)             (3,6)

        for (i, j) we just need to update i and fill correct position in matrix

        */

        if(numRows == 1)
            return s;

        int n = s.length();

        ArrayList<ArrayList<Character>> matrix = new ArrayList<>(numRows);

        for(int i = 0; i < numRows; i++)
            matrix.add(new ArrayList<Character>());

        int i = 0;
        boolean direction = true; // true = downward; false = upward

        int strIndex = 0;

        while(strIndex < n) {
            // downward
            if(direction) {
                if(i < numRows) {
                    char ch = s.charAt(strIndex);
                    matrix.get(i).add(ch);
                    strIndex++;
                    i++;
                }
                else {
                    direction = !direction;
                    i-=2;
                }
            }
            //upward
            else {
                if(i > 0) {
                    char ch = s.charAt(strIndex);

                    for(int k = 0; k < numRows; k++) {
                        if(k == i)
                            matrix.get(k).add(ch);
                        else
                            matrix.get(k).add('0');
                    }

                    strIndex++;
                    i--;
                }
                else {
                    direction = !direction;
                }                
            }
        }

        StringBuilder builder = new StringBuilder();

        for(var list: matrix)
            for(Character ch: list) {
                if(ch != '0')
                    builder.append(ch);
            }

        return builder.toString();

    }
}
