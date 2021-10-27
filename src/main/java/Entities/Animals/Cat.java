package Entities.Animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animals
{
    public String name = "Barsik";

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
