package OppsV2.ExceptionalHandling;

public class Main {
    public static void main(String[] args) {

        int[]arr = new int[5];

        try{

            //System.out.println(arr[7]);
            int ans = 10/ 0;


        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println("Try to access invalid index of array!");
        }catch (Exception e){
            System.out.println("ERROR IS : " + e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getStackTrace());
        }
        System.out.println("Hello Guys!!");
    }
}
