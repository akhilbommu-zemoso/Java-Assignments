import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {
    public static boolean checkString(String inputString) {
        inputString = inputString.toLowerCase();
        HashSet<Character> hashSet = new HashSet<Character>();
        for(Character ch : inputString.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                hashSet.add(ch);
            }
        }
        return hashSet.size() == 26;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether it contains all the letters of alphabet or not : ");
        String inputString = sc.next();
        if(checkString(inputString)){
            System.out.println("Input String contains all the letters of alphabet.");
        }else{
            System.out.println("Input String does not contain all the letters of alphabet.");
        }
    }
}
