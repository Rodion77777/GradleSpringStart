package Entities.Animals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Cat {
    public String name = "Barsik";

    @Bean
    public Cat getNewCat()
    {
        return new Cat();
    }
}
