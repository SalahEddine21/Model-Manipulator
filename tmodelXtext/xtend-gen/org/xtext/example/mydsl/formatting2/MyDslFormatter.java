/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.formatting2;

import Trmodel.Add;
import Trmodel.Column;
import Trmodel.LoadModel;
import Trmodel.Operation;
import Trmodel.Table;
import Trmodel.loader;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final loader loader, @Extension final IFormattableDocument document) {
    document.<LoadModel>format(loader.getLoadmodel());
    EList<Operation> _operation = loader.getOperation();
    for (final Operation operation : _operation) {
      document.<Operation>format(operation);
    }
  }
  
  protected void _format(final Add add, @Extension final IFormattableDocument document) {
    document.<Table>format(add.getTable());
    document.<Column>format(add.getColumn());
  }
  
  public void format(final Object add, final IFormattableDocument document) {
    if (add instanceof XtextResource) {
      _format((XtextResource)add, document);
      return;
    } else if (add instanceof Add) {
      _format((Add)add, document);
      return;
    } else if (add instanceof loader) {
      _format((loader)add, document);
      return;
    } else if (add instanceof EObject) {
      _format((EObject)add, document);
      return;
    } else if (add == null) {
      _format((Void)null, document);
      return;
    } else if (add != null) {
      _format(add, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(add, document).toString());
    }
  }
}