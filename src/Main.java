import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
        System.out.println("-----------");
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
        System.out.println("-----------");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static boolean isPalindrome(int num1){
        int numAbsolute = Math.abs(num1);
        String numString = String.valueOf(numAbsolute);
        String numStringRev = numString;
        for(int i=0; i<numString.length();i++){
            for(int x=numString.length()-1; x<numString.length();i--){
                if(numStringRev.charAt(x) == numString.charAt(i)){
                    System.out.println("Palindrome");
                    return true;
                }
                else{
                    System.out.println("Not Palindrome");
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isPerfectNumber(int num1){
        int result = 0;

        for(int i=1;i<num1;i++){
            if(num1%i == 0){
                result += i;
            }

        }
        if(result == num1){
            System.out.println("Perfect Number");
            return true;
        }else{
            System.out.println("Not Perfect Number");
            return false;
        }


    }

    public static String numberToWords(int num1) {
        if (num1 < 0) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }


        String decider = "";
        String result = "";

        String read = String.valueOf(num1);
        for (int i = 0; i < read.length(); i++) {



            if (read.charAt(i) == '0') {
                decider = "Zero ";
                result = result + decider;
            }


            if (read.charAt(i) == '1') {
                decider = "One ";
                result = result + decider;
            }


            if (read.charAt(i) == '2') {
                decider = "Two ";
                result = result + decider;
            }

            if (read.charAt(i) == '3') {
                decider = "Three ";
                result = result + decider;
            }

            if (read.charAt(i) == '4') {
                decider = "Four ";
                result = result + decider;
            }

            if (read.charAt(i) == '5') {
                decider = "Five ";
                result = result + decider;
            }

            if (read.charAt(i) == '6') {
                decider = "Six ";
                result = result + decider;
            }

            if (read.charAt(i) == '7') {
                decider = "Seven ";
                result = result + decider;
            }

            if (read.charAt(i) == '8') {
                decider = "Eight ";
                result = result + decider;
            }

            if (read.charAt(i) == '9') {
                decider = "Nine ";
                result = result + decider;
            }

}




        System.out.println(result);
        return result;
    }
}
