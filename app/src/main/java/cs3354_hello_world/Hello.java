package cs3354_hello_world;

public class Hello {
    private String name = "";
    
    public String getName() 
    {
        return name;
    }
      
    public void setName(String name) 
    {
        this.name = name;
    }
      
    public String sayHello() 
    {
        if (name == "") 
        {
            return "Hello!";
        }
        else 
        {
            return "Hello " + name + "!";
        }
    }    
}
