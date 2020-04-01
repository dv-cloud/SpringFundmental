
public class Employee implements Worker {
    private String name;
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
