package cs3354_hello_world;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
        }
    }

    public void printMethods() {
        Method[] methods = this.getClass().getDeclaredMethods();

        // Loop through the methods and print their names
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        } 
    }

}
