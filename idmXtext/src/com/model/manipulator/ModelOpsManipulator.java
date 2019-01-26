package com.model.manipulator;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
//import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import com.google.inject.Injector;

import Trmodel.TrmodelFactory;
import Trmodel.TrmodelPackage;

//import tmodel.TmodelFactory;


public class ModelOpsManipulator {

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
		TrmodelPackage.eINSTANCE.eClass();
		URI emfURI = URI.createURI(uri.toString());
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		Resource resource = null;
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		resource =  resourceSet.getResource(emfURI, true);
		EcoreUtil.resolveAll(resource);
		return resource;
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
