package Assignment6;

public class Driver {
    public static void main(String[] args){
        VampireNumbers vampireNumbers = new VampireNumbers();
        vampireNumbers.printVampireNumber();
        new OverloadedClass();
        ConstructorClass[] arr = new ConstructorClass[3];
        for(int i=0;i<3;i++){
            arr[i] = new ConstructorClass("Creating Object " + (i+1));
        }
    }
}
