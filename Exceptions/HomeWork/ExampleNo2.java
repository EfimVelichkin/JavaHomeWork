package HomeWorkNo2;

public class ExampleNo2 {
    public static void main(String[] args) {
        double d = 0;
        double[] doubleArray = {1,2,3,4,5,6,7,8,9,10};
        try {
            double catchedRes1 = doubleArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e + " ");
        }

    }
}
