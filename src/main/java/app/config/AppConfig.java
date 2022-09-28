package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "cat")
    public Animal getCat() {
        Animal animalCat = new Cat();
        return animalCat;
    }

    @Bean(name = "dog")
    public Animal getDog() {
        Animal animalDog = new Dog();
        return animalDog;
    }

    @Bean(name = "timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }

}
