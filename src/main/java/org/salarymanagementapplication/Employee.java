package org.salarymanagementapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private SalaryCalculator salaryCalculator;

    @Autowired
    public Employee(@Qualifier("fixedSalaryCalculator")SalaryCalculator salaryCalculator){
        this.salaryCalculator=salaryCalculator;
    }

    public String getSalary(){
        return salaryCalculator.getSalary();
    }
}
