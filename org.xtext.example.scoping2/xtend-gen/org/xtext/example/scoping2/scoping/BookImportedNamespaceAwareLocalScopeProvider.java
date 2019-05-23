package org.xtext.example.scoping2.scoping;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.xtext.example.scoping2.scoping2.Book;

@SuppressWarnings("all")
public class BookImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    final List<ImportNormalizer> resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
    if ((context instanceof Book)) {
      final String qualifiedName = ((Book)context).getName();
      if ((qualifiedName != null)) {
        ImportNormalizer _createImportedNamespaceResolver = this.createImportedNamespaceResolver((qualifiedName + ".*"), ignoreCase);
        resolvers.add(_createImportedNamespaceResolver);
      }
    }
    return resolvers;
  }
}
