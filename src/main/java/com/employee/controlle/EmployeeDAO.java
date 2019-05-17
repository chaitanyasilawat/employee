package com.employee.controlle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeDAO {

   private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

   static {
       initEmps();
   }

   private static void initEmps() {
       Employee emp1 = new Employee("1", "chait", "Dev");
       Employee emp2 = new Employee("2", "swapnit", "Dev");
       Employee emp3 = new Employee("3", "Ram", "Manager");

       empMap.put(emp1.getEmpNo(), emp1);
       empMap.put(emp2.getEmpNo(), emp2);
       empMap.put(emp3.getEmpNo(), emp3);
   }

   public Employee getEmployee(String empNo) {
       return empMap.get(empNo);
   }

   public Employee addEmployee(Employee emp) {
       empMap.put(emp.getEmpNo(), emp);
       return emp;
   }

   public Employee updateEmployee(Employee emp) {
       empMap.put(emp.getEmpNo(), emp);
       return emp;
   }

   public void deleteEmployee(String empNo) {
       empMap.remove(empNo);
   }

   public List<Employee> getAllEmployees() {
       Collection<Employee> c = empMap.values();
       List<Employee> list = new ArrayList<Employee>();
       list.addAll(c);
       return list;
   }

}