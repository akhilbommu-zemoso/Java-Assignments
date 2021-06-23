package Assignment5.main;

import Assignment5.data.DataClass;
import Assignment5.singleton.Singleton;

public class MainClass {
    public static void main(String[] args) {
        DataClass dataClassObj = new DataClass();
        Singleton singletonObj = new Singleton();
        dataClassObj.printGlobalVariables();
        dataClassObj.printLocalVariables();
        singletonObj.printString();
    }
}
