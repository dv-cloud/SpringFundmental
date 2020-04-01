import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SelfEmployed implements Worker {
    private Employee contractor;
    private String name;

    public SelfEmployed(String name) {
        this.name = name;
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
