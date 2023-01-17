package com.cloud.f迪米特法则.a方案一;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/16
 * @Time 1:38
 */
public class Main {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

// 总部员工类
@Data
class Employee {
    private String id;

    public Employee(String id) {
        this.id = id;
    }
}

// 学院员工类
@Data
class CollegeEmployee {
    private String id;

    public CollegeEmployee(String id) {
        this.id = id;
    }
}

// 管理学院员工类
class CollegeManager {
    public List<CollegeEmployee> getAllCollegeEmployee() {
        ArrayList<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collegeEmployees.add(new CollegeEmployee(String.valueOf(i)));
        }
        return collegeEmployees;
    }
}

// 学院总部管理类
// Employee - 直接朋友
// CollegeManager - 直接朋友
// CollegeEmployee - 间接朋友
// 违反了迪米特法则
class SchoolManager {
    public List<Employee> getAllEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employees.add(new Employee(String.valueOf(i)));
        }
        return employees;
    }

    void printAllEmployee(CollegeManager sub) {
        // 输出学院员工
        System.out.println("学院员工");
        sub.getAllCollegeEmployee().forEach(System.out::println);
        System.out.println("总部员工");
        this.getAllEmployee().forEach(System.out::println);
    }

}
