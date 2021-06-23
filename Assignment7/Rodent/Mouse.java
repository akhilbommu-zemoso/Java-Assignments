package Assignment7.Rodent;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("Mouse Constructor called.");
    }

    @Override
    public void gnaw(){
        System.out.println("Mouse's gnaw called.");
    }

    @Override
    public void defend(){
        System.out.println("Mouse's defend called.");
    }
}
