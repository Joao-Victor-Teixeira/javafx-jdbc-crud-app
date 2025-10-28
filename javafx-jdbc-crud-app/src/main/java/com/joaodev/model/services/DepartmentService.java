package com.joaodev.model.services;

import java.util.List;

import com.joaodev.model.dao.DaoFactory;
import com.joaodev.model.dao.DepartmentDao;
import com.joaodev.model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();
    
    public List<Department> findAll(){
        return dao.findAll();
    }

    public void saveOrUpdate(Department entity) {
    
        throw new UnsupportedOperationException();
    }

}
