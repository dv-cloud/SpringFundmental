package springfunc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Judge implements Worker {
    @Autowired
    @Qualifier("lawyer")
    private Employee typeOfEmployee;
    private String name;

    public Judge() {
    }

    public Judge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getTypeOfEmployee() {
        return typeOfEmployee;
    }

    @Override
    public String getPosition() {
        return "Judge";
    }
}