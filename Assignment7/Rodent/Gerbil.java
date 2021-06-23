package Assignment7.Rodent;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("Gerbil Constructor called.");
    }

    @Override
    public void gnaw(){
        System.out.println("Gerbil's gnaw called.");
    }

    @Override
    public void defend(){
        System.out.println("Gerbil's defend called.");
    }
}
