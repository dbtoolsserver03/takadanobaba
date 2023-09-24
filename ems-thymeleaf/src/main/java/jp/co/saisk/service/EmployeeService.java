package jp.co.saisk.service;

import java.util.List;

import jp.co.saisk.entity.Employee;

public interface EmployeeService {

    //员工列表方法
    List<Employee> lists();

    //保存员工信息
    void save(Employee employee);

    //根据id查询一个
    Employee findById(Integer id);

    //更新员工信息
    void update(Employee employee);

    //删除员工信息
    void delete(Integer id);
}
