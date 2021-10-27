package Entities.Animals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Dog {
    public String name = "Sharik";

    @Bean
    public Dog getNewDog()
    {
        return new Dog();
    }
}
