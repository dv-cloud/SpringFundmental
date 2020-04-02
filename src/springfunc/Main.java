package springfunc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Judge judge = applicationContext.getBean(Judge.class);
        SelfEmployed selfEm = applicationContext.getBean(SelfEmployed.class);

        selfEm.setName("Driver");
        System.out.println("SelfEmployed's employee is a " + selfEm.getContractor().getName() +
                " and judge's employee is a " + judge.getTypeOfEmployee().getName());
    }
}
