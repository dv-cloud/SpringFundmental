package springfunc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SelfEmployed implements Worker {
    @Autowired
    @Qualifier("doctor")
    private Employee contractor;
    private String name;

    public SelfEmployed() {
    }

    public SelfEmployed(Employee employee) {
        this.contractor = employee;
    }


    @Override
    public String getPosition() {
        return "Self-Employed";
    }

    public Employee getContractor() {
        return contractor;
    }

    public void setContractor(Employee contractor) {
        this.contractor = contractor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
