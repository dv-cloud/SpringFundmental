package springfunc;

import org.springframework.stereotype.Component;


@Component
public class Employee implements Worker {
    private String name;

    public Employee() {
    }


    @Override
    public String getPosition() {
        return "Employee";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
