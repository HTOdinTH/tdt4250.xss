package tdt4250.xss.ui.plantuml;

import java.util.Map;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import net.sourceforge.plantuml.ecore.EcoreObjectDiagramTextProvider;

public class XSSDiagramTextProvider extends EcoreObjectDiagramTextProvider {
	@Override
	protected String getDiagramText(final IEditorPart editorPart, final IEditorInput editorInput, final ISelection selection, final Map<String, Object> markerAttributes) {
		XSSLogger.log("Loaded");
		XtextDocument document = (XtextDocument) ((XtextEditor) editorPart).getDocumentProvider().getDocument(editorPart.getEditorInput());
		IUnitOfWork<XtextResource, XtextResource> work = (XtextResource resource) -> {
			return resource;
		};
		XtextResource resource = document.readOnly(work);
		
		XSSLogger.log("Are contents null? " + Boolean.toString(resource.getAllContents() == null));
		
		return getDiagramText(resource.getAllContents());
	}

	@Override
	public boolean supportsSelection(ISelection selection) {
		return false;
	}
}
