import Config.AnimalsConfiguration;
import Config.DaysOfWeekConfiguration;
import Entities.Animals.Cat;
import Entities.Animals.Dog;
import Entities.Animals.Parrot;
import Entities.SevenDays.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;

public class Main {
    public static void main (String[] args)
    {
        weekDaysContext();
    }

    public static void weekDaysContext ()
    {
        ApplicationContext daysOfWeekContext = new AnnotationConfigApplicationContext(DaysOfWeekConfiguration.class);
        out.println(daysOfWeekContext.getBean(WeekDay.class).getWeekDayName());
    }

    public static void entitiesContext ()
    {
        ApplicationContext contextEntities = new AnnotationConfigApplicationContext("Entities.Animals");

        Cat cat = contextEntities.getBean(Cat.class);
        Dog dog = (Dog) contextEntities.getBean("dog");
        Parrot parrot = contextEntities.getBean("parrot", Parrot.class);

        out.printf("\nCat: %s\nDog: %s\nParrot: %s\n", cat.getName(), dog.getName(), parrot.getName());
    }

    public static void configContext ()
    {
        ApplicationContext contextConfiguration = new AnnotationConfigApplicationContext(AnimalsConfiguration.class);

        out.printf("\nCat: %s\nDog: %s\nParrot: %s\n",
                contextConfiguration.getBean(Cat.class).getName(),
                contextConfiguration.getBean(Dog.class).getName(),
                contextConfiguration.getBean(Parrot.class).getName()
        );
    }
}
