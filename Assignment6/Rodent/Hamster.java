package Assignment6.Rodent;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("Hamster constructor called.");
    }

    @Override
    public void gnaw(){
        System.out.println("Hamster's gnaw called.");
    }

    @Override
    public void defend(){
        System.out.println("Hamster's defend called.");
    }
}
