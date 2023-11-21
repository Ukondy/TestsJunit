package app;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Worker {
    private int id;
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
