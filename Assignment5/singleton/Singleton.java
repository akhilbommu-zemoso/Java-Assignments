package Assignment5.singleton;

public class Singleton {
    String string;
    /*
    // non-static varibale cannot be referenced from a static content.
    public static Singleton parameterizedStaticMethod(String fullname){
        this.name = fullname;
        return this;
    }
    */
    public void printString(){
        System.out.println(string);
    }
}
