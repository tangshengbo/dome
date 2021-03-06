package com.example.dome.dao;

import com.example.dome.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author Tangshengbo
 * @date 2019/8/20
 */
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    /**
     * 查询雇员信息
     *
     * @param id
     * @return
     */
    Employee queryEmployeeById(String id);

}
