package Assignment5.data;

public class DataClass {
    int number;
    char ch;
    public void printGlobalVariables(){
        System.out.println("Global Variables : " + number + " " + ch);
    }
    public void printLocalVariables(){
        int a;
        char b;
        // Local variables need to be initialized before using.Whereas, global variables are initialized by default.
        // System.out.println("Local Variables : " + a + b);
    }
}
