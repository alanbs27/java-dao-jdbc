package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller finbyid =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller finbyDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.finByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST : seller finbyAll =====");
	    list = sellerDao.finAll();
		for (Seller obj : list) {
			System.out.println(obj);

	}

 }
}
