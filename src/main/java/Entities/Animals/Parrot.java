package Entities.Animals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Parrot {
    public String name = "Guse";

    @Bean
    public Parrot getNewParrot ()
    {
        return new Parrot();
    }
}
