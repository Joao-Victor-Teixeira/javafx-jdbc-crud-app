package com.joaodev.model.dao;

import com.joaodev.db.DB;
import com.joaodev.model.dao.impl.DepartmentDaoJDBC;
import com.joaodev.model.dao.impl.SellerDaoJDBC;
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
