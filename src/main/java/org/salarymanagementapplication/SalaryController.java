package org.salarymanagementapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
    private SalaryCalculator sal1;
    private SalaryCalculator sal2;
    private SalaryService salServ1;
    private SalaryService salServ2;

    @Autowired
    private Employee emp;

    @Autowired
    public SalaryController(@Qualifier("hourlySalaryCalculator")SalaryCalculator sal1,@Qualifier("fixedSalaryCalculator")SalaryCalculator sal2
        , SalaryService salServ1, SalaryService salServ2
    ){
        this.sal1=sal1;
        this.sal2=sal2;
        this.salServ1=salServ1;
        this.salServ2= salServ2;
    }

    @GetMapping("/")
    public String getHourlySalary(){
        return sal1.getSalary();
    }

    @GetMapping("/fixed")
    public String getFixedSalary(){
        return sal2.getSalary();
    }

    @GetMapping("/empSal")
    public String getEmpSal(){
        return emp.getSalary();
    }

    @GetMapping("/service")
    public boolean getSalServ(){
        return salServ1==salServ2;
    }
}
