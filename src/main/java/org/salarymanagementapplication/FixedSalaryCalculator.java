package org.salarymanagementapplication;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FixedSalaryCalculator implements SalaryCalculator{
    @Override
    public String getSalary() {
        return String.valueOf(3000);
    }
}
