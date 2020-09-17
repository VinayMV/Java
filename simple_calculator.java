import java.io.BufferedReader;
class simple_calculator
{
    public static void main(String args[]) {
        int val_1, val_2, sum, prod, diff;
        val_1 = 3;
        val_2 = 6;
        sum = val_1 + val_2;
        prod = val_1 * val_2;
        diff = val_1 - val_2;
        System.out.println("Sum of "+val_1+" and "+val_2+" is "+sum);
        System.out.println("Difference of "+val_1+" and "+val_2+" is "+diff);
        System.out.println("Product of "+val_1+" and "+val_2+" is "+prod);
    }
}