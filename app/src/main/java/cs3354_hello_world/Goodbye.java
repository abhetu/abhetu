package cs3354_hello_world;

public class Goodbye {
    private String name = "";
    
    public String getName() 
    {
        return name;
    }
      
    public void setName(String name) 
    {
        this.name = name;
    }
      
    public String sayGoodbye() 
    {
        if (name == "") 
        {
            return "Goodbye!";
        }
        else 
        {
            return "Goodbye " + name + "!";
        }
    }    
}
