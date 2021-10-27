package Config;

import Entities.SevenDays.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.lang.System.out;

@Configuration
@ComponentScan("Entities.SevenDays")
public class DaysOfWeekConfiguration {
    @Bean
    public WeekDay getDay()
    {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (dayOfWeek)
        {
            case SUNDAY: return new Sunday();
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: out.println("Error: Unknown day of the week!"); return new Sunday();
        }
    }
}
