/*
 * generated by Xtext 2.24.0
 */
package stateMachine.xtext.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import stateMachine.xtext.mydsl.MyDslRuntimeModule;
import stateMachine.xtext.mydsl.MyDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDslIdeSetup extends MyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule(), new MyDslIdeModule()));
	}
	
}