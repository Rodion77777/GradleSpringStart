package Config;

import Entities.Animals.Cat;
import Entities.Animals.Dog;
import Entities.Animals.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@org.springframework.context.annotation.Configuration
public class AnimalsConfiguration {

    @Bean @Lazy public Cat getNewCat()
    {
        return new Cat();
    }
    @Bean @Lazy public Dog getNewDog()
    {
        return new Dog();
    }
    @Bean @Lazy public Parrot getNewParrot()
    {
        return new Parrot();
    }
}
