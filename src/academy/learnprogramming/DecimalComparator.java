package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // String num1String = Double.toString(num1);
        // String num2String = Double.toString(num2);
        // int indexOfNum1StringDecimal = num1String.indexOf(".");
        // int indexOfNum2StringDecimal = num2String.indexOf(".");
        // String num1Int = num1String.substring(0, indexOfNum1StringDecimal);
        // String num2Int = num2String.substring(0, indexOfNum2StringDecimal);
        // String num1Decimal;
        // String num2Decimal;
        // if((num1String.length() - indexOfNum1StringDecimal) >=4 ) {
        //     num1Decimal = num1String.substring(indexOfNum1StringDecimal + 1 , indexOfNum1StringDecimal + 4);
        // } else {
        //     num1Decimal = num1String.substring(indexOfNum1StringDecimal + 1);
        // }
        // if((num2String.length() - indexOfNum2StringDecimal) >=4 ) {
        //     num2Decimal = num2String.substring(indexOfNum2StringDecimal + 1 , indexOfNum2StringDecimal + 4);
        // } else {
        //     num2Decimal = num2String.substring(indexOfNum2StringDecimal + 1);
        // }
        // if(num1Int.equals(num2Int) && num1Decimal.equals(num2Decimal)) {
        //     return true;
        // } else {
        //     return false;
        // }
        // Or just do this:
        return (int) (num1 * 1000d) == (int) (num2 * 1000d);
    }
}