/*
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import tdt4250.xss.ui.internal.XssActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XSSExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XssActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XssActivator activator = XssActivator.getInstance();
		return activator != null ? activator.getInjector(XssActivator.TDT4250_XSS_XSS) : null;
	}

}
