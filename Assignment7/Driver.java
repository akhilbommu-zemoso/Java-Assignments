package Assignment7;

import Assignment7.CombinedInterface.NewClass;
import Assignment7.Cycle.Bicycle;
import Assignment7.Cycle.Cycle;
import Assignment7.Cycle.Tricycle;
import Assignment7.Cycle.Unicycle;
import Assignment7.CycleInterface.BiCycle;
import Assignment7.CycleInterface.TriCycle;
import Assignment7.CycleInterface.UniCycle;
import Assignment7.InnerClasses.SecondOuterClass;
import Assignment7.Rodent.Gerbil;
import Assignment7.Rodent.Hamster;
import Assignment7.Rodent.Mouse;
import Assignment7.Rodent.Rodent;

public class Driver {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.gnaw();
            rodent.defend();
        }

        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Upcasting gives us the flexibility to access the parent class members but it is not possible
        // to access all the child class members using this feature.
        /*
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
         */

        Unicycle cycle1 = (Unicycle) cycles[0];
        Bicycle cycle2 = (Bicycle) cycles[1];
        Tricycle cycle3 = (Tricycle) cycles[2];

        cycle1.balance();
        cycle2.balance();
        // cannot call balance in Tricycle class because, Both Cycle and Tricycle doesn't have balance method.
        //cycle3.balance();

        NewClass obj = new NewClass();
        obj.method1WithParameter(obj);
        obj.method2WithParameter(obj);
        obj.method3WithParameter(obj);
        obj.method4WithParameter(obj);

        UniCycle uniCycle = new UniCycle();
        uniCycle.factory();
        BiCycle biCycle = new BiCycle();
        biCycle.factory();
        TriCycle triCycle = new TriCycle();
        triCycle.factory();

        new SecondOuterClass.SecondInnerClass();
    }
}
