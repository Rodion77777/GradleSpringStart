package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animals
{
    public String name = "Sharik";

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
