package springfunc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Employee implements Worker {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
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
