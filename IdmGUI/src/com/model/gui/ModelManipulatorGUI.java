package com.model.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.emf.ecore.resource.Resource;

import DB.Column;
import DB.DBFactory;
import DB.Database;
import DB.Table;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class ModelManipulatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField addtable;
	private JTextField updatetable;
	private JTextField addcolumn;
	private JTextField updateclm;
	private JComboBox selecttables1;
	private JComboBox selecttables;
	private JComboBox selecttables2;
	private JComboBox selecttables3;
	private JComboBox selecttables4;
	private JComboBox selectclmns;
	private JComboBox selectclmns1;
	private List<String> tables;
	private List<String> columns;
	private Resource resource;
	private Database db;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModelManipulatorGUI frame = new ModelManipulatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModelManipulatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTable = new JLabel("Table");
		lblTable.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		addtable = new JTextField();
		addtable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addtable.setColumns(10);
		
		updatetable = new JTextField();
		updatetable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		updatetable.setColumns(10);
		
		selecttables1 = new JComboBox();
		selecttables1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator = new JSeparator();
		
		selecttables = new JComboBox();
		selecttables.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton addtablebtn = new JButton("ADD");
		addtablebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		addtablebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO ADD NEW TABLE HERE
				String tablename = addtable.getText();
				Table table = DBFactory.eINSTANCE.createTable();
				table.setName(tablename);
				db.getTable().add(table);
				refreshTables(tablename);
				saveResource();
				addtable.setText("");
			}
		});
		
		JButton updatebtn = new JButton("Update");
		updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		updatebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO UPDATE TABLE NAME HERE
				String tablename = updatetable.getText();
				String previousname = selecttables1.getSelectedItem().toString();
				Table table = getTable(previousname);
				table.setName(tablename);
				removeTable(previousname);
				refreshTables(tablename);
				saveResource();
				updatetable.setText("");
			}
		});
		
		JButton deletebtn = new JButton("Delete");
		deletebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO DELETE TABLE HERE
				String tablename = selecttables.getSelectedItem().toString();
				Table table = getTable(tablename);
				db.getTable().remove(table);
				removeTable(tablename);
				saveResource();
			}
		});
		
		JLabel lblColumn = new JLabel("Column");
		lblColumn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		addcolumn = new JTextField();
		addcolumn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addcolumn.setColumns(10);
		
		selecttables2 = new JComboBox();
		selecttables2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton addclmbtn = new JButton("ADD");
		addclmbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		addclmbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO ADD COLUMN TO TABLE HERE
				String columnName = addcolumn.getText();
				String tablename = selecttables2.getSelectedItem().toString();
				Table table = getTable(tablename);
				Column c = DBFactory.eINSTANCE.createColumn();
				c.setName(columnName);
				table.getColumn().add(c);
				saveResource();
				addcolumn.setText("");
			}
		});
		
		selecttables3 = new JComboBox();
		selecttables3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO DELETE COLUMN HERE
				String column = selectclmns.getSelectedItem().toString();
				String tablename = selecttables3.getSelectedItem().toString();
				Table table = getTable(tablename);
				Column c = getColumn(table, column);
				table.getColumn().remove(c);
				saveResource();
				//removeColumn(column);
				selectclmns.removeItem(column);
			}
		});
		
		selectclmns = new JComboBox();
		selectclmns.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO UPDATE COLUMN HERE
				String previousName = selectclmns1.getSelectedItem().toString();
				String tablename = selecttables4.getSelectedItem().toString();
				Table table = getTable(tablename);
				Column column = getColumn(table, previousName);
				String newName = updateclm.getText();
				column.setName(newName);
				saveResource();
				updateclm.setText("");
				// update column name in the list of items
				selectclmns1.removeItem(previousName);
				selectclmns1.addItem(newName);
			}
		});
		
		selecttables4 = new JComboBox();
		selecttables4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		updateclm = new JTextField();
		updateclm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		updateclm.setColumns(10);
		
		selectclmns1 = new JComboBox();
		selectclmns1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(updatetable, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(selecttables1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(addtable, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(addtablebtn)
									.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
									.addComponent(deletebtn)
									.addGap(31)
									.addComponent(selecttables, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
									.addGap(37))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(28)
									.addComponent(updatebtn)
									.addContainerGap())))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTable, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(729, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)
							.addGap(23))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblColumn)
							.addContainerGap(723, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(selectclmns, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
									.addComponent(selecttables3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(62))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(addcolumn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(33)
									.addComponent(selecttables2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(updateclm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(24)
									.addComponent(selectclmns1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(selecttables4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnUpdate))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(15)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDelete)
										.addComponent(addclmbtn))))
							.addContainerGap(292, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnClose)
							.addGap(40))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTable)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(addtable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(addtablebtn)
						.addComponent(selecttables, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(deletebtn))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(updatetable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(selecttables1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(updatebtn))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblColumn)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(addcolumn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(selecttables2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(addclmbtn))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(selectclmns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(selecttables3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(updateclm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(selectclmns1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate)
						.addComponent(selecttables4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void setDataBase(Database d) {
		this.db = d;
		tables = new ArrayList<String>();
		columns = new ArrayList<String>();
		String name;
		for (Table table : db.getTable()) {
			name = table.getName();
			this.selecttables.addItem(name);
			this.selecttables1.addItem(name);
			this.selecttables2.addItem(name);
			this.selecttables3.addItem(name);
			this.selecttables4.addItem(name);
		}
		
		// add columns for selected table one
		Table table = getTable(selecttables3.getSelectedItem().toString());
		selectclmns.removeAllItems();
		for (Column c : table.getColumn()) {
			selectclmns.addItem(c.getName());
		}
		
		// add columns for selected table one
		table = getTable(selecttables4.getSelectedItem().toString());
		selectclmns1.removeAllItems();
		for (Column c : table.getColumn()) {
			selectclmns1.addItem(c.getName());
		}
		
		this.selecttables3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(selecttables3.getSelectedItem());
				Table table = getTable(selecttables3.getSelectedItem().toString());
				selectclmns.removeAllItems();
				for (Column c : table.getColumn()) {
					selectclmns.addItem(c.getName());
				}
			}
		});
		
		this.selecttables4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(selecttables4.getSelectedItem());
				Table table = getTable(selecttables4.getSelectedItem().toString());
				selectclmns1.removeAllItems();
				for (Column c : table.getColumn()) {
					selectclmns1.addItem(c.getName());
				}
			}
		});
		System.out.println(db.getName());
	}
	
	public Table getTable(String name) {
		for (Table table : db.getTable()) {
			if(table.getName().equals(name)) return table;
		}
		return null;
	}
	
	public void setResource(Resource r) {
		this.resource = r;
	}
	
	public void saveResource() {
		try {
			this.resource.save(null);
			System.out.println("DONE SAVED");
		} catch (IOException e) {
			System.out.println("EXCEPTION IS : "+e.getMessage());
		}
	}
	
	public void refreshTables(String tablename) {
		this.selecttables.addItem(tablename);
		this.selecttables1.addItem(tablename);
		this.selecttables2.addItem(tablename);
		this.selecttables3.addItem(tablename);
		this.selecttables4.addItem(tablename);
	}
	
	public void removeTable(String tablename) {
		this.selecttables.removeItem(tablename);
		this.selecttables1.removeItem(tablename);
		this.selecttables2.removeItem(tablename);
		this.selecttables3.removeItem(tablename);
		this.selecttables4.removeItem(tablename);
	}
	
	public Column getColumn(Table table, String colname) {
		for (Column c : table.getColumn()) {
			if(c.getName().equals(colname)) return c;
		}
		return null;
	}
	
	public void removeColumn(String col) {
		selectclmns.removeItem(col);
		selectclmns1.removeItem(col);
	}
	
}
