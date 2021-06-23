package Assignment7.CombinedInterface;

public class NewClass extends ConcreteClass implements CombinedInterface{

    @Override
    public void combinedInterfaceMethod() {
        System.out.println("Combined Interface Method");
    }

    @Override
    public void interface1_method1() {
        System.out.println("Interface1 Method1");
    }

    @Override
    public void interface1_method2() {
        System.out.println("Interface1 Method2");
    }

    @Override
    public void interface2_method1() {
        System.out.println("Interface2 Method1");
    }

    @Override
    public void interface2_method2() {
        System.out.println("Interface2 Method2");
    }

    @Override
    public void interface3_method1() {
        System.out.println("Interface3 Method1");
    }

    @Override
    public void interface3_method2() {
        System.out.println("Interface3 Method2");
    }

    @Override
    public void concreteClassMethod(){
        System.out.println("Concrete Class Method in New Class");
    }

    public void method1WithParameter(Interface1 i1){
        i1.interface1_method1();
    }

    public void method2WithParameter(Interface2 i2){
        i2.interface2_method1();
    }

    public void method3WithParameter(Interface3 i3){
        i3.interface3_method1();
    }

    public void method4WithParameter(CombinedInterface combinedInterface){
        combinedInterface.combinedInterfaceMethod();
    }
}
