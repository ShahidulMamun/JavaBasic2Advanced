package ifelse;

public class shorthandifelse {
    public static void main(String[] args) {
        int number = 33;
        String result;
        result = (number<33) ? "Failed" : "Passed";
        System.out.println(result);

        if (number%2==0) {
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
    }
}
