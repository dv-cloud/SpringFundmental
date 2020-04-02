package springfunc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springfunc")
public class ConfigClass {
    @Bean
    public Judge getJudge(){
        String name = "Judge";
        return new Judge(name);
    }
}
