package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public String name = "Sharik";

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
