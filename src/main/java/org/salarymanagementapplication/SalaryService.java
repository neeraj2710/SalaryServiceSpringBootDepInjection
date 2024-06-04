package org.salarymanagementapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SalaryService {
    public SalaryService(){
        System.out.println("salaray service initialized");
    }

    public String getSalaryService(){
        return "SalaryService";
    }
}
