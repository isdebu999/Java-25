package OppsV2.ExceptionalHandling;

public class FinallyBlockInExceptional {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Hello World!");

        try{
            System.out.println(a[7]);
        }catch (Exception e){
            System.out.println("Exception Caught: " + e.getMessage());
        }finally {
            System.out.println("This block is always executed.");
        }

    }
}
