package org.xtext.example.scoping2.scoping

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.xtext.example.scoping2.scoping2.Book

class BookImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	override protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		val resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase)
		if (context instanceof Book) {
			val qualifiedName = context.name // book name (may contain dots but is still a plain string)
			if (qualifiedName !== null) {
				// all the chapters within the same book name space as this Book will be automatically visible without an import statement
//				resolvers += new ImportNormalizer(QualifiedName.create(qualifiedName), true /* wildcard*/ , ignoreCase )
				resolvers += createImportedNamespaceResolver(qualifiedName + ".*", ignoreCase )
			}
		}
		return resolvers
	}
	
}
