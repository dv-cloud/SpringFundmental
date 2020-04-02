package springfunc;

public class Judge implements Worker {

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

    @Override
    public String getPosition() {
        return "Judge";
    }
}