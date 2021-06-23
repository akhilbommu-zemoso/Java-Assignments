package Assignment6;

public class OverloadedClass {
    OverloadedClass(){
        this("Calling one parameterized constructor from zero parameterized constructor");
    }

    OverloadedClass(String input){
        System.out.println("Parameterized Constructor : " + input);
    }
}
