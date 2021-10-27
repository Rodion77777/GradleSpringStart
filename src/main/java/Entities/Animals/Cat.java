package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public String name = "Barsik";

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
