import java.time.LocalDate;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    private double salary;
    private LocalDate hireDay;

    public Employee (String name, double salary, int year, int mounth, int day) {
        this.name = name;
        this.salary=  salary;
        hireDay = LocalDate.of(year, mounth, day);
    }
    public  void raiseSalary (double byPersent) {
        double raise = salary * byPersent/100;
        salary += raise;

    }

}
