package lesson_19;

public class Employee {



private static long idCounter;
private final long id;

private String name;

private int salary;

public String info(){
    return "id: " + id + " | " + name + " Salary: " + salary;
}


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
