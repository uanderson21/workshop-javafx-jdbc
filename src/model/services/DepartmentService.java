package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return dao.findAll();		
		//MOCK
//		List<Department> list = new ArrayList<>();
//		list.add(new Department(1, "Books"));
//		list.add(new Department(1, "Computers"));
//		list.add(new Department(1, "Electronics"));
//		
//		return list;
	}
	
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}

	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
}
