package springfunc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        SelfEmployed selfEm = applicationContext.getBean(SelfEmployed.class);
        selfEm.setName("Driver");
        selfEm.getContractor().setName("Mechanic");
        System.out.println("SelfEmployed " + selfEm.getName() + " has as a contractor his own "
                + selfEm.getContractor().getName());
    }
}
