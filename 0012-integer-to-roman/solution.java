class Solution {
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();

        while(num > 0) {
            if(num >= 1000){
                int numM = num / 1000;
                builder.append("M".repeat(numM));
                num = num % 1000;
            }
            else if(num <= 999 && num >= 900) {
                builder.append("CM");
                num = num % 100;
            }
            else if(num <= 899 && num >= 500) {
                int numC = (num - 500) / 100;
                builder.append("D");
                builder.append("C".repeat(numC));
                num = num % 100;
            }
            else if(num <= 499 && num >= 400) {
                builder.append("CD");
                num = num % 100;
            }
            else if(num <= 399 && num >= 100) {
                int numC = num / 100;
                builder.append("C".repeat(numC));
                num = num % 100;
            }
            else if(num <= 99 && num >= 90) {
                builder.append("XC");
                num = num % 10;
            }
            else if(num <= 89 && num >= 50) {
                int numX = (num - 50) / 10;
                builder.append("L");
                builder.append("X".repeat(numX));
                num = num % 10;
            }
            else if(num <= 49 && num >= 40) {
                builder.append("XL");
                num = num % 10;
            }
            else if(num <= 39 && num >= 10) {
                int numX = num / 10;
                builder.append("X".repeat(numX));
                num = num % 10;
            }
            else if(num == 9) {
                builder.append("IX");
                break;
            }
            else if(num <= 8 && num >= 5) {
                int numI = num - 5;
                builder.append("V");
                builder.append("I".repeat(numI));
                break;
            }
            else if(num == 4) {
                builder.append("IV");
                break;
            }
            else if(num <= 3 && num >= 1){
                builder.append("I".repeat(num));
                break;
            }
            else{
                break;
            }
        }

        return builder.toString();
    }
}
