package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Parrot implements Animals
{
    public String name = "Guse";

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }
}
