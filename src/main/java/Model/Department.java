package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private long id;
    private String name;

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee addEmployee(Department department, long id, String name, double salary){
        Employee employee = new Employee(id, name, salary);
        return employee;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return id == that.id && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
