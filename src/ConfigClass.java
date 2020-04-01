import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Employee getEmployee(){
        String name = "Lawyer";
        return new Employee(name);
    }

    @Bean
    public SelfEmployed getSelfEmployed(){
        String name = "Freelancer";
        return new SelfEmployed(name);
    }

}
