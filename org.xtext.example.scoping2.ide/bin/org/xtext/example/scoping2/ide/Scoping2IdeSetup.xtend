/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.scoping2.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.scoping2.Scoping2RuntimeModule
import org.xtext.example.scoping2.Scoping2StandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class Scoping2IdeSetup extends Scoping2StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new Scoping2RuntimeModule, new Scoping2IdeModule))
	}
	
}