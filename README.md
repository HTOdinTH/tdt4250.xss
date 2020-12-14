# tdt4250.xss

By Odin Johan Vatne (HTOdinTH) and Joakim Danielsen Petersen (joakimdp)

## Description

XSS (Xtended Style Sheet) is a DSL built with Xtext that transpiles to CSS. XSS avoids much of the repetition of CSS by allowing grouping of styling for selectors, as well as supporting creating custom properties to group together semantically related styling.

## Structure

 * The Xtext specification for XSS is found in tdt4250.xss/src/tdt4250/xss/XSS.xtext.
 * example/src/example1.xss is an example of an XSS-file, showcasing most of the features of XSS.
 * tdt4250.xss.m2t/src/tdt4250/xss/m2t/main.mtl specifies a model-to-text transformation using Acceleo.
 * tdt4250.xss.m2t/src/twt4250/xss/m2t/util/Util.java contains the code used to evaluate the mathematical expressions XSS allows for as part of custom property definitions.
 * tdt4250.xss.m2t/libs/exp4j-0.4.8.jar is a library for evaluating mathematical expressions from strings, used by the Util class.
 * tdt4250.xss.ui/src/tdt4250/xss/ui/plantuml/XSSDiagramTextProvider is a (failed) attempt at creating a plugin to generate PlantUML diagrams from the underlying Ecore instance model created from XSS files.

## Running the project

In order to work with XSS files the projects in this repo have to be opened in Eclipse. The necessary Eclipse software to run this project is:
 * Acceleo
 * Acceleo Query SDK
 * Eclipse DSL tools
 * EMF - Eclipse Modeling Framework SDK
 * EMF - Eclipse Modeling Framework Xcore SDK
 * EMF Forms SDK
 * MWE2 Language SDK
 * PlantUML Ecore Feature
 * PlantUML Feature
 * PlantUML Library Feature
 * Xtext Complete SDK



## Aknowledgements

This project uses exp4j by fasseg, which is available under the terms of the Apache 2.0 license.