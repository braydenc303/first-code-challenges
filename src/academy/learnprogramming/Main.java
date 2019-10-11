package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.375, 2.375));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.375, -2.375));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.375, 2.275));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.375, 2.375));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.37, 2.37));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.3, 2.3));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.375934, 2.375234));


        
    }


}