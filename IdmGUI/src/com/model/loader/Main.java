package com.model.loader;

import org.eclipse.emf.ecore.resource.Resource;

import com.model.manipulator.ModelManipulator;

import DB.Column;
import DB.DBFactory;
import DB.DBPackage;
import DB.Database;
import DB.Table;

public class Main {

	public static void main(String[] args) {
		try {
			ModelManipulator loader = new ModelManipulator();
			Resource model = loader.loadModel("untitled.model");
			Database db = (Database) model.getContents().get(0);
//			System.out.println(db.getName());
			
			Table table = DBFactory.eINSTANCE.createTable();
			table.setName("Administartion");
			Column c = DBFactory.eINSTANCE.createColumn();
			c.setName("janati");
			table.getColumn().add(c); // add column to table's columns
			
			db.getTable().add(table); // adding table to db' tables
			model.save(null); // saving file
			System.out.println("done");

//			for (Table table : db.getTable()) {
//				System.out.println(table.getName());
//				for (Column column : table.getColumn()) {
//					System.out.println(column.getName());
//				}
//			}
		} catch (Exception e) {
			System.out.println("EXCEPTION IS : "+e.getMessage());
		}
	}

}
