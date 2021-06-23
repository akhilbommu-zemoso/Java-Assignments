package Assignment7.InnerClasses;

public class SecondOuterClass {
    public static class SecondInnerClass extends OuterClass.InnerClass{
        public SecondInnerClass() {
            super("From Second Inner Class");
        }
    }
}
