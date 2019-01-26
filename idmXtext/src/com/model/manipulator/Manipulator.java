package com.model.manipulator;

import javax.swing.text.TabExpander;

import org.eclipse.emf.ecore.resource.Resource;

import DB.Column;
import DB.DBFactory;
import DB.Database;
import DB.Table;
import Trmodel.Add;
import Trmodel.Delete;
import Trmodel.Operation;
import Trmodel.Update;
import Trmodel.loader;

public class Manipulator {

	public static Database db;
	public static loader l;
	
	public static void main(String[] args) {
		try {
			ModelOpsManipulator loader = new ModelOpsManipulator();
			Resource code = loader.loadModel("ex.mydsl"); // loading user code
			l = (loader) code.getContents().get(0);
			Resource model = new ModelManipulator().loadModel(l.getLoadmodel().getUrl());
			db = (Database) model.getContents().get(0);
			
			for (Operation op : l.getOperation()) {
				if(op instanceof Add) {
					System.out.println("ADD");
					Add addOp = (Add) op;
					if(addOp.getTable() != null) {
						Table table = DBFactory.eINSTANCE.createTable();
						table.setName(addOp.getTable().getName());
						db.getTable().add(table);
						model.save(null);
					}else if(addOp.getColumn() != null) {
						Column column = DBFactory.eINSTANCE.createColumn();
						Table table = getTable(addOp.getColumn().getTableName());
						column.setName(addOp.getColumn().getName());
						table.getColumn().add(column);
						model.save(null);
					}
					
				} else if(op instanceof Delete) {
					System.out.println("DELETE");
					Delete deleteOp = (Delete) op;
					if(deleteOp.getTable() != null) {
						Table table = getTable(deleteOp.getTable().getName());
						db.getTable().remove(table);
						model.save(null);
					}else if(deleteOp.getColumn() != null) {
						Table table = getTable(deleteOp.getColumn().getTableName());
						Column column = getColumn(table, deleteOp.getColumn().getName());
						table.getColumn().remove(column);
						model.save(null);
					}
				} else if(op instanceof Update) {
					System.out.println("UPDATE");
					Update updateOp = (Update) op;
					if(updateOp.getTable() != null) {
						Table table = getTable(updateOp.getTable().getName());
						table.setName(updateOp.getNewName());
						model.save(null);
					}else if(updateOp.getColumn() != null) {
						Table table = getTable(updateOp.getColumn().getTableName());
						Column column = getColumn(table, updateOp.getColumn().getName());
						column.setName(updateOp.getNewName());
						model.save(null);
					}
				}
			}
			System.out.println("DONE SAVED");
		} catch (Exception e) {
			System.out.println("EXCEPTION : "+e.getMessage());
		}
		//System.out.println(runner.getLoadmodel().getUrl());
	}
	
	public static Table getTable(String name) {
		for (Table table : db.getTable()) {
			if(table.getName().equals(name)) return table;
		}
		return null;
	}
	
	public static Column getColumn(Table table, String col) {
		for (Column c : table.getColumn()) {
			if(c.getName().equals(col)) return c;
		}
		return null;
	}

}
