package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
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
	
	public void remove(Point p) {
		lp.remove(p);
	}

	@Override
	public Rectangle displayBox() {
		// TODO Auto-generated method stub
		return super.displayBox();
	}

	@Override
	public boolean containsPoint(double x, double y) {
		// TODO Auto-generated method stub
		return super.containsPoint(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		for(int i = 0; i<lp.size()-1; i++)
			g.drawLine(lp.get(i).x, lp.get(i).y, lp.get(i+1).x, lp.get(i+1).y);
	}

	@Override
	public void moveBy(Point p) {
		// TODO Auto-generated method stub
		super.moveBy(p);
	}
	
	
}
