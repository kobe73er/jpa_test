package com.dengpf.database.main;

import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.dengpf.database.entities.Emp;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class TestEntity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entitymanager = Persistence.createEntityManagerFactory(
				"jpaTest").createEntityManager();
		Vector<Emp> list = (Vector<Emp>) entitymanager.createNativeQuery(
				"select * from emp", Emp.class).getResultList();
		for (Emp emp : list) {
			System.out.println(emp.getEname());
		}
	}

}
