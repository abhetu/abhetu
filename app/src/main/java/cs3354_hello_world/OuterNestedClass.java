package cs3354_hello_world;

public class OuterNestedClass {
    private int outerValue = 10;

    // Nested static class
    public static class StaticInnerClass {
        public void printStaticInstanceMessage() {
            System.out.println("Static Inner Class - Instance method");
 //           System.out.println("Static Inner Class - Instance Method printing private OuterClass outerValue: " + outerValue); 
        }

        public static void printStaticStaticMessage() {
            System.out.println("Static Inner Class - Static Method");
 //           System.out.println("Static Inner Class - Static Method printing private OuterClass outerValue: " + outerValue); 
        }
    }

    // Nested non-static (inner) class
    public class NonStaticInnerClass {
        public void printNonStaticInnerClassMessage() {
            System.out.println("NonStatic Inner Class - Instance Method");
            System.out.println("Nonstatic Inner Class - Instance Method printing private OuterClass outerValue: " + outerValue); 
        }
    }
}
