public class Manager extends Employee {

    private double bonus;

    public void setBonus(double b) {
        bonus = b;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;

    }


    public Manager(String name, double salary, int year, int mounth, int day) {
        super(name, salary, year, mounth, day);
        bonus = 0;
    }
}
