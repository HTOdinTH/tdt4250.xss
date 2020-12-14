package tdt4250.xss.ui.plantuml;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class XSSLogger {
	private static final Bundle BUNDLE = FrameworkUtil.getBundle(XSSLogger.class);
	private static final ILog LOGGER = Platform.getLog(BUNDLE);
	
	public static void test(){
	    try {
	       log("Eclipse Style Logging");
	    }
	    catch(Exception e){
	      log("Oops!", e);
	    }
	}
	
	public static void log(String msg) {
	   log(msg, null);
	}
	
	public static void log(String msg, Exception e) {
	   LOGGER.log(new Status((e==null?Status.INFO:Status.ERROR), BUNDLE.getSymbolicName(), msg, e));
	}
}
