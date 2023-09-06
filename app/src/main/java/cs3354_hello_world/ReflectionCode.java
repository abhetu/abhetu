package cs3354_hello_world;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public abstract class ReflectionCode {

    public void printClassAndPackageName() {
        // The explicit declaration of ThisClass is unnecessary but hopefull useful 
        // for illustrating what is going on to students.
        Class<?> ThisClass = this.getClass();

        System.out.println("Class name: " + ThisClass.getName());
        System.out.println("Instance name: " + this);
        System.out.println("Package name: " + ThisClass.getPackageName());
    }

    public void printFields() {
        Field[] fields = this.getClass().getDeclaredFields();
        // Loop through the fields and print out their names and types
        for (Field field : fields) {
            String fieldName = field.getName();
            Class<?> fieldType = field.getType(); 

            System.out.println("Field Name: " + fieldName);
            System.out.println("Field Type: " + fieldType.getName());
            System.out.println();
        }
    }

    public void printMethods() {
        Method[] methods = this.getClass().getDeclaredMethods();

        // Loop through the methods and print their names and types
        for (Method method : methods) {
            Class<?> returnType = method.getReturnType();

            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + returnType.getName());
             // Get parameters
             Parameter[] parameters = method.getParameters();
             System.out.println("Parameters:");
             for (Parameter parameter : parameters) {
                 System.out.println("  " + parameter.getType().getName() + " " + parameter.getName());
             }
            System.out.println();
        } 
    }

}
