/*
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XSSAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("tdt4250/xss/parser/antlr/internal/InternalXSS.tokens");
	}
}
