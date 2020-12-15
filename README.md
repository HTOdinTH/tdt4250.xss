# tdt4250.xss

By Odin Johan Vatne (HTOdinTH) and Joakim Danielsen Petersen (joakimdp).

## Description

XSS (Xtended Style Sheet) is a DSL built with Xtext that transpiles to CSS. XSS avoids much of the repetition of CSS by allowing grouping of styling for selectors, as well as supporting creating custom properties to group together semantically related styling.

## Structure

 * The Xtext specification for XSS is found in tdt4250.xss/src/tdt4250/xss/XSS.xtext.
 * The Ecore specification for XSS is generated by Xtext in tdt4250.xss/model/generated/XSS.ecore.
 * example/src/example1.xss is an example of an XSS-file, showcasing most of the features of XSS.
 * tdt4250.xss/src/tdt4250/xss/generator/XSSGenerator.xtend contains code for auto-generating the css output whenever a file is saved.
 This contains the entire m2t transformation.
 * exp4j/exp4j-0.4.8.jar is a library for evaluating mathematical expressions from strings, used by the xtend transformation.
 * In the branch `acceleo`, tdt4250.xss.m2t/src/tdt4250/xss/m2t/main.mtl specifies a model-to-text transformation using Acceleo.
 This was scrapped as we could not get Xtext and Acceleo to cooperate, and had to switch to xtend towards the end of the project.
 * tdt4250.xss.ui/src/tdt4250/xss/ui/plantuml/XSSDiagramTextProvider on the branch `visual` is a (failed) attempt at creating a plugin to generate PlantUML diagrams from the underlying Ecore instance model created from XSS files.

## Running the project

The necessary Eclipse software to run this project is:
 * Eclipse DSL tools
 * EMF - Eclipse Modeling Framework SDK
 * EMF - Eclipse Modeling Framework Xcore SDK
 * EMF Forms SDK
 * MWE2 Language SDK
 * Xtext Complete SDK

Additionally, if using the `visual` branch, additional software is needed:
 * PlantUML Ecore Feature
 * PlantUML Feature
 * PlantUML Library Feature

If using the `acceleo` branch, this additional software is needed:
 * Acceleo
 * Acceleo Query SDK

In order to work with XSS files the projects in this repo have to be opened in Eclipse. After all the projects have been opened, the eclipse plugins can be regenerated by right-clicking the XSS.xtext file and selecting Run As > Generate Xtext Artifacts.  
Then, a new runtime Eclipse instance has to be started. This can be done by right-clicking on the tdt4250.xss project in the package explorer, selecting Run As > Eclipse Application. Now an XSS file can be created or opened and you can start working.  
To create a new one, you may first create a new Java Project in eclipse, and then create a new file, and manually write in the .xss file ending. The editor supports syntax highlighting, and the outline window will show a tree view of how xtext interprets the file.  
A CSS file corresponding to your XSS file will be generated in a folder called src-gen in the root of your project.

## XSS

The overall syntax of XSS consists of four main kinds of Objects:
 *  **GroupSelectors**  
Under the 'XSelectors:' keyword, a group (optionally denoted by '@') exists on the form `name (selector, selector, ...)`, where a name is any string consisting of alphanumeric characters and -dashes, and a selector is any css selector syntax (necessarily delimited by "quotes" whenever they contain spaces, commas, or parenthesis).
 * **GroupProperties**  
Under the 'XProperties:' keyword, this is one of two kinds. Group properties are optionally prefixed with a '@', and are of the form `name (statement; statement; ...)`.
Two main types of statements exist:  
   * SingleStatements, on the form `property=value`
   * MultiStatements, on the form `property (modifier=value; modifier=value; ...)`  
   
   Where a property is any name that could form a css-property, or a reference to a CustomProperty (denoted by '$'), and value is any css value syntax (necessarily delimited by "quotes" whenever they contain spaces or special characters).  
The MultiStatement specifies that the value of the property should be different for different selectors, for example, a property could specify one text-color for the css selector modifier `:hover`, and another for `:active`. Modifiers have the same syntax as selectors, and can therefore be used for containment modifiers too, like ` span` to specify values for span-elements contained by a selector.  
 * **CustomProperties**  
Custom properties are prefixed by a '$', and are given on the form `name (statement; statement; ...)`.  
Where a property is any name that could form a css-property, and expression is any css value syntax as stated above, but where any segments delimited by `{}` may use simple expressions with a single variable 'x' that corresponds to a floating point value specified whenever the CustomProperty is invoked.  
 * **Rules**  
Under the 'Rules:' keyword, rules express the actual relationships and statements to be compiled into css. They are of the form `selector, selector, ... : statement; statement; ...`  
Where a selector is as described above, or a reference to a GroupSelector, prefixed by '@'. This implies that all statements in the rule also apply to the selectors within the GroupSelector. A rule can have 1 to n selectors.  
After a ':' (which requires one space between the selectors and the keyword), any number of statements may be given, each ending in a ';'.  
Statements can be of the form described in GroupProperties, with the additional option of GroupStatements, prefixed by '@'.


## Aknowledgements

This project uses exp4j by fasseg, which is available under the terms of the Apache 2.0 license.  
https://www.objecthunter.net/exp4j/
