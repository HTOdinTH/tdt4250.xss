/*
 * generated by Xtext 2.22.0
 */
package tdt4250.xss;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class XSSStandaloneSetup extends XSSStandaloneSetupGenerated {

	public static void doSetup() {
		new XSSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
