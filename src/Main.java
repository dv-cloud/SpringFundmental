import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println("Employee's profession is " + employee.getName());

        SelfEmployed selfEm = applicationContext.getBean(SelfEmployed.class);
        selfEm.setContractor(employee);
        System.out.println("SelfEmployed " + selfEm.getName() + " has as a contractor his own "
                + selfEm.getContractor().getName());
    }
}
