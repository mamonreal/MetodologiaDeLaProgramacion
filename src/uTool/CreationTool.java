package uTool;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import uHotDrawFigures.AbstractFigure;
import uHotDrawFramework.DrawingView;

public class CreationTool extends AbstractTool {

	private AbstractFigure prototype;
	
	public CreationTool(DrawingView view, AbstractFigure prototype) {
		this.view = view;
		this.prototype = prototype;
	}
	
	@Override
	public void mouseDown(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMove(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseUp(MouseEvent e) {
		AbstractFigure f = this.createFigure();
        Rectangle r = f.displayBox();
        Point p = new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p);
        view.getDrawing().add(f);
	}
	
	public AbstractFigure createFigure() {
		return prototype.clone();
	}

}
