package com.model.manipulator;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import DB.DBPackage;

public class ModelManipulator {

	private Resource MMresource;
	private EObject MMracine;
	private EPackage MMpackage;
	
	public void loadMetaModel(String uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		MMresource = resourceSet.getResource(URI.createURI(uri), true);
		MMracine = MMresource.getContents().get(0);
		MMpackage = (EPackage) MMracine;
	}
	
	public Resource loadModel(String uri) {
		DBPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource r = resourceSet.getResource(URI.createURI(uri), true);
		Resource Mresource = r;
		return Mresource;
	}
	
	public void saveResource(Resource resource) {
		try {
			resource.save(null);
		} catch(Exception e) {
			System.out.println("The following error occured during saving the resource: "
			+ e.getMessage());
		}
	}
}
