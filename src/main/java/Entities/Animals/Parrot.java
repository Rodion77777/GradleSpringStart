package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    public String name = "Guse";

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
