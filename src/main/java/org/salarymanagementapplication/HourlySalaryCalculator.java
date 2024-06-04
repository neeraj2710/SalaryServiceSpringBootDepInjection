package org.salarymanagementapplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HourlySalaryCalculator implements SalaryCalculator{
    @Override
    public String getSalary() {
        return String.valueOf(20*40);
    }
}
