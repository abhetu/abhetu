package cs3354_hello_world;

public class DoMath extends ReflectionCode{
    protected int x;
    
    public int increment(int number) 
    {
        x = number++; 
        return x;
    }
      
    public int decrement(int number) 
    {
        x = number--;
        return x;
    }

    /* 
    public void printClassAndPackageName() {
        // The explicit declaration of ThisClass is unnecessary but hopefull useful 
        // for illustrating what is going on to students.
        Class<?> ThisClass = this.getClass();

        System.out.println("Class name: " + ThisClass.getName());
        System.out.println("Instance name: " + this);
        System.out.println("Package name: " + ThisClass.getPackageName());
    }
    */

}
