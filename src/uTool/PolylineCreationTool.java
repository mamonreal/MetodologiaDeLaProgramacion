package uTool;

import java.awt.event.MouseEvent;

import uHotDrawFigures.AbstractFigure;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.PolylineFigure;
import uHotDrawFramework.DrawingView;

public class PolylineCreationTool extends CreationTool {

	public PolylineCreationTool(DrawingView view, AbstractFigure prototype) {
		super(view, prototype);
	}

	public IFigure creationFigure() {
		return new PolylineFigure();
	}
	
	@Override
	public void mouseUp(MouseEvent e) {
		
	}
	
	@Override
	public void mouseDown(MouseEvent e) {
		
	}
}
