package org.example;

import java.math.BigDecimal;

public class Employee {
    public static final String WHITE_SPACE = " ";
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getEmployeeDescription() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetailsWithAge() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getBaseSalaryWithBonus() {
        return baseSalary.add(bonus);
    }

}
