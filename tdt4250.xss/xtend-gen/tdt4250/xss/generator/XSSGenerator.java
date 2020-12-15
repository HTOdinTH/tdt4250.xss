/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tdt4250.xss.xSS.CustomProperty;
import tdt4250.xss.xSS.GroupProperty;
import tdt4250.xss.xSS.GroupSelector;
import tdt4250.xss.xSS.MultiRefStatement;
import tdt4250.xss.xSS.MultiStatement;
import tdt4250.xss.xSS.Rule;
import tdt4250.xss.xSS.Selector;
import tdt4250.xss.xSS.SingleRefStatement;
import tdt4250.xss.xSS.SingleStatement;
import tdt4250.xss.xSS.State;
import tdt4250.xss.xSS.Stylesheet;
import tdt4250.xss.xSS.SubRule;
import tdt4250.xss.xSS.XMultiStatement;
import tdt4250.xss.xSS.XStatement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class XSSGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    fsa.generateFile("generated.css", this.generateCSS(((Stylesheet) _get)));
  }
  
  public String generateCSS(final Stylesheet stylesheet) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generateCSS(stylesheet, _stringBuilder).toString();
  }
  
  public CharSequence generateCSS(final Stylesheet stylesheet, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final Consumer<Rule> _function = (Rule it) -> {
        this.generate(it, stringBuilder);
      };
      stylesheet.getRules().forEach(_function);
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final Rule rule, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      EList<XStatement> _xStatements = rule.getXStatements();
      final Function1<GroupProperty, EList<XStatement>> _function = (GroupProperty it) -> {
        return it.getStatements();
      };
      Iterable<XStatement> _flatMap = IterableExtensions.<GroupProperty, XStatement>flatMap(rule.getGroupStatements(), _function);
      final Function1<XMultiStatement, EList<State>> _function_1 = (XMultiStatement it) -> {
        return it.getStates();
      };
      final Function1<State, String> _function_2 = (State it) -> {
        return it.getModifier().getName();
      };
      final Set<String> multiStatementModifiers = IterableExtensions.<String>toSet(IterableExtensions.<State, String>map(IterableExtensions.<XMultiStatement, State>flatMap(Iterables.<XMultiStatement>filter(IterableExtensions.<XStatement>toSet(Iterables.<XStatement>concat(_xStatements, _flatMap)), XMultiStatement.class), _function_1), _function_2));
      InputOutput.<Set<String>>println(multiStatementModifiers);
      boolean _isEmpty = multiStatementModifiers.isEmpty();
      if (_isEmpty) {
        this.modGenerate(rule, ":default", stringBuilder);
      } else {
        multiStatementModifiers.add(":default");
        final Consumer<String> _function_3 = (String it) -> {
          this.modGenerate(rule, it, stringBuilder);
        };
        multiStatementModifiers.forEach(_function_3);
      }
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence modGenerate(final Rule rule, final String mod, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      this.generateSelectors(IterableExtensions.<Selector>toSet(rule.getSelectors()), rule.getGroupSelectors(), mod, stringBuilder);
      stringBuilder.append(" {\n");
      EList<XStatement> _xStatements = rule.getXStatements();
      final Function1<GroupProperty, EList<XStatement>> _function = (GroupProperty it) -> {
        return it.getStatements();
      };
      Iterable<XStatement> _flatMap = IterableExtensions.<GroupProperty, XStatement>flatMap(rule.getGroupStatements(), _function);
      final Iterable<XStatement> statements = Iterables.<XStatement>concat(_xStatements, _flatMap);
      final Consumer<XStatement> _function_1 = (XStatement it) -> {
        if ((it instanceof MultiStatement)) {
          this.modGenerate(((MultiStatement) it), mod, stringBuilder);
        } else {
          if ((it instanceof MultiRefStatement)) {
            this.modRefGenerate(((MultiRefStatement) it), mod, stringBuilder);
          } else {
            boolean _equals = mod.equals(":default");
            if (_equals) {
              if ((it instanceof SingleStatement)) {
                this.generate(((SingleStatement) it), stringBuilder);
              } else {
                if ((it instanceof SingleRefStatement)) {
                  this.generate(((SingleRefStatement) it), stringBuilder);
                }
              }
            }
          }
        }
      };
      statements.forEach(_function_1);
      _xblockexpression = stringBuilder.append("}\n\n");
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final GroupProperty group, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final Consumer<XStatement> _function = (XStatement it) -> {
        this.generate(it, stringBuilder);
      };
      group.getStatements().forEach(_function);
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final XStatement statement, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      if ((statement instanceof SingleStatement)) {
        this.generate(((SingleStatement) statement), stringBuilder);
      } else {
        if ((statement instanceof SingleRefStatement)) {
          this.generate(((SingleRefStatement) statement), stringBuilder);
        }
      }
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final SingleStatement statement, final StringBuilder stringBuilder) {
    String _property = statement.getProperty();
    String _plus = ("    " + _property);
    String _plus_1 = (_plus + ": ");
    String _value = statement.getValue();
    String _plus_2 = (_plus_1 + _value);
    String _plus_3 = (_plus_2 + ";\n");
    return stringBuilder.append(_plus_3);
  }
  
  public CharSequence generate(final SingleRefStatement statement, final StringBuilder stringBuilder) {
    return this.refGenerate(statement.getProperty(), statement.getValue(), stringBuilder);
  }
  
  public CharSequence modGenerate(final MultiStatement statement, final String mod, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final Consumer<State> _function = (State it) -> {
        boolean _equals = it.getModifier().getName().equals(mod);
        if (_equals) {
          String _property = statement.getProperty();
          String _plus = ("    " + _property);
          String _plus_1 = (_plus + ": ");
          String _value = it.getValue();
          String _plus_2 = (_plus_1 + _value);
          String _plus_3 = (_plus_2 + ";\n");
          stringBuilder.append(_plus_3);
        }
      };
      statement.getStates().forEach(_function);
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence modRefGenerate(final MultiRefStatement statement, final String mod, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final Consumer<State> _function = (State it) -> {
        boolean _equals = it.getModifier().getName().equals(mod);
        if (_equals) {
          this.refGenerate(statement.getProperty(), it.getValue(), stringBuilder);
        }
      };
      statement.getStates().forEach(_function);
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence refGenerate(final CustomProperty property, final String value, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final Consumer<SubRule> _function = (SubRule it) -> {
        String _property = it.getProperty();
        String _plus = ("    " + _property);
        String _plus_1 = (_plus + ": ");
        String _string = this.evaluateExpression(it.getExpression().getName().replace("\"", ""), value).toString();
        String _plus_2 = (_plus_1 + _string);
        String _plus_3 = (_plus_2 + ";\n");
        stringBuilder.append(_plus_3);
      };
      property.getSubRules().forEach(_function);
      _xblockexpression = stringBuilder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateSelectors(final Set<Selector> selectors, final List<GroupSelector> groups, final String mod, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final StringJoiner stringJoiner = new StringJoiner(", ");
      final Consumer<Selector> _function = (Selector it) -> {
        String _name = it.getName();
        String _plus = (_name + mod);
        stringJoiner.add(_plus);
      };
      selectors.forEach(_function);
      stringBuilder.append(stringJoiner.toString());
      boolean _not = (!(selectors.isEmpty() || groups.isEmpty()));
      if (_not) {
        stringBuilder.append(", ");
      }
      final StringJoiner stringJoiner2 = new StringJoiner(", ");
      final Consumer<GroupSelector> _function_1 = (GroupSelector it) -> {
        stringJoiner2.add(this.modGenerate(it, mod));
      };
      groups.forEach(_function_1);
      _xblockexpression = stringBuilder.append(stringJoiner2.toString());
    }
    return _xblockexpression;
  }
  
  public CharSequence generateSelectors(final Set<Selector> selectors, final List<GroupSelector> groups, final StringBuilder stringBuilder) {
    StringBuilder _xblockexpression = null;
    {
      final StringJoiner stringJoiner = new StringJoiner(", ");
      final Consumer<Selector> _function = (Selector it) -> {
        stringJoiner.add(it.getName());
      };
      selectors.forEach(_function);
      stringBuilder.append(stringJoiner.toString());
      boolean _not = (!(selectors.isEmpty() || groups.isEmpty()));
      if (_not) {
        stringBuilder.append(", ");
      }
      final StringJoiner stringJoiner2 = new StringJoiner(", ");
      final Consumer<GroupSelector> _function_1 = (GroupSelector it) -> {
        stringJoiner2.add(this.generate(it));
      };
      groups.forEach(_function_1);
      _xblockexpression = stringBuilder.append(stringJoiner2.toString());
    }
    return _xblockexpression;
  }
  
  public String modGenerate(final GroupSelector group, final String mod) {
    String _xblockexpression = null;
    {
      final StringJoiner stringJoiner = new StringJoiner(", ");
      final Consumer<Selector> _function = (Selector it) -> {
        String _replace = it.getName().replace("\"", "");
        String _replace_1 = mod.replace(":default", "");
        String _plus = (_replace + _replace_1);
        stringJoiner.add(_plus);
      };
      group.getSubSelectors().forEach(_function);
      _xblockexpression = stringJoiner.toString();
    }
    return _xblockexpression;
  }
  
  public String generate(final GroupSelector group) {
    String _xblockexpression = null;
    {
      final StringJoiner stringJoiner = new StringJoiner(", ");
      final Consumer<Selector> _function = (Selector it) -> {
        stringJoiner.add(it.getName().replace("\"", ""));
      };
      group.getSubSelectors().forEach(_function);
      _xblockexpression = stringJoiner.toString();
    }
    return _xblockexpression;
  }
  
  public String evaluateExpression(final String expression, final String value) {
    String _xblockexpression = null;
    {
      double _xtrycatchfinallyexpression = (double) 0;
      try {
        _xtrycatchfinallyexpression = Double.parseDouble(value);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          _xtrycatchfinallyexpression = 1.0;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      double x = _xtrycatchfinallyexpression;
      String result = expression;
      final Pattern pattern = Pattern.compile("(\\{.*?\\})");
      final Matcher matcher = pattern.matcher(result);
      while (matcher.find()) {
        {
          final String group = matcher.group();
          final String expr = group.replace("{", "").replace("}", "");
          final double res = new ExpressionBuilder(expr).variable("x").build().setVariable("x", x).evaluate();
          result = result.replace(group, Double.valueOf(res).toString());
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
