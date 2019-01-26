package com.model.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import org.eclipse.emf.ecore.resource.Resource;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.model.manipulator.ModelManipulator;

import DB.Database;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ModelGUI extends JFrame {

	private JPanel contentPane;
	private JTextField filename;
	private File selectedFile;
	private static ModelGUI frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ModelGUI();
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
	public ModelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		filename = new JTextField();
		filename.setEnabled(false);
		filename.setColumns(10);
		
		JButton btnUploadModel = new JButton("Upload Model");
		btnUploadModel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnUploadModel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

				int returnValue = jfc.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					selectedFile = jfc.getSelectedFile();
					filename.setText(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
				}				
			}
		});
		
		JButton next = new JButton("Load");
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedFile != null) {
					ModelManipulator loader = new ModelManipulator();
					String path = "file:///";
					path = path + selectedFile.getAbsolutePath().replace("\\", "/");
					//System.out.println(path);
					Resource model = loader.loadModel(path);
					Database db = (Database) model.getContents().get(0);
					ModelManipulatorGUI window = new ModelManipulatorGUI();
					window.setDataBase(db);
					window.setResource(model);
					frame.setVisible(false);
					window.setVisible(true);
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(572)
					.addComponent(next))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(268)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(filename, Alignment.LEADING)
						.addComponent(btnUploadModel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
					.addGap(224))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(179)
					.addComponent(filename, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUploadModel)
					.addGap(67)
					.addComponent(next))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
