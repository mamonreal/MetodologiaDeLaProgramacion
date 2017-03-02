package uHotDrawFigures;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class PolylineFigure extends AbstractFigure{
	private List<Point> lp;
	
	public PolylineFigure() {
		super();
		lp = new ArrayList();
	}
	
	public PolylineFigure(Point p1, Point p2, Point p3) {
		super();
		lp = new ArrayList();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
	}
}
