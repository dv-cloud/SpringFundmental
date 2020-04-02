package springfunc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Judge judge = applicationContext.getBean(Judge.class);
        SelfEmployed selfEm = applicationContext.getBean(SelfEmployed.class);

        selfEm.setName("Driver");
        selfEm.getContractor().setName("Mechanic");
        System.out.println("SelfEmployed " + selfEm.getName() + " has as a contractor his own "
                + selfEm.getContractor().getName() + ". The case is tried by the " + judge.getName());
    }
}
