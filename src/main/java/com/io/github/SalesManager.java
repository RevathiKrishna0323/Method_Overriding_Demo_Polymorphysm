/*
 * Author Name: Revathi
 * Date: 13-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class SalesManager extends Employee {
    float commission;

    public SalesManager(String empName, float salary, float bonus, float commission) {
        super(empName, salary, bonus);
        this.commission = commission;
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + commission;

    }

}


