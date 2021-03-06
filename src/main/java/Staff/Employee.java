package Staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double raiseAmount){
        if (raiseAmount > 0) {
            this.salary = this.salary + raiseAmount;
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
