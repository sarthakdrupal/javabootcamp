package com.company.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int Age;
    Double Salary;
    String Name;

    public Employee(int age, Double salary, String name) {
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(24, 50000.90d, "Sarthak");
        Employee employee1 = new Employee(25, 36000.90d, "Ajay");
        Employee employee2 = new Employee(23, 55000.90d, "Ram");
        Employee employee3 = new Employee(26, 60000.90d, "Shyam");
        Employee employee4 = new Employee(27, 70000.90d, "Gita");
        List<Employee> obj = new ArrayList<>();
        obj.add(employee);
        obj.add(employee1);
        obj.add(employee2);
        obj.add(employee3);
        obj.add(employee4);
        Collections.sort(obj, new MyComaparator());
        obj.forEach(e-> System.out.println(e.Salary));
    }
}
class MyComaparator implements Comparator<Employee> {
    @Override
    public int compare(Employee aDouble, Employee t1) {
        return (int) (aDouble.Salary - t1.Salary);
    }
}
