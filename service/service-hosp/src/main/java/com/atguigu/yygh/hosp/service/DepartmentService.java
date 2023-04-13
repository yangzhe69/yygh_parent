package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Department;
import com.atguigu.yygh.vo.hosp.DepartmentQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface DepartmentService {

    void save(Map<String, Object> paramMap);

    //查询科室接口
    Page<Department> findPageDepartment(int page, int limit, DepartmentQueryVo departmentQueryVo);

    //删除科室接口
    void remove(String hoscode, String depcode);

    //根据科室编号，和医院编号，查询科室名称
    String getDepName(String hoscode, String depcode);

    //根据科室编号，和医院编号，查询科室
    Department getDepartment(String hoscode, String depcode);

}
