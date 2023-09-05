package cs3354_hello_world;
import java.lang.reflect.Field;

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

}