package uTool;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import uHotDrawFigures.IFigure;
import uHotDrawFigures.RectangleFigure;

public class RectangleCreationTool extends AbstractTool{

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
		IFigure f = new RectangleFigure();
        Rectangle r = f.displayBox();
        Point p = new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p.getX(),p.getY());
        view.getDrawing().add(f);
	}

}
