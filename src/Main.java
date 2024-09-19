public class Main
{
    public static void main(String[] args)
    {
        int numToExamine = 245;
        int moduloResult = 0;

        moduloResult = numToExamine % 2;

        System.out.println("If the result of the modulo is 0, the value is even, and, if the result of the modulo is not 0, the value is odd. Because the remainder of 245 / 2 is " + moduloResult + ", " + numToExamine + " is an odd number.");
    }
}