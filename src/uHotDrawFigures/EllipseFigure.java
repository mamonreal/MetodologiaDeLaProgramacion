package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class EllipseFigure extends AbstractFigure {
//	@Override
//	public void draw (Graphics g) {
//		g.setColor(Color.blue);
//		g.drawOval(30, 40, 50, 50);
//	}

	@Override
	public boolean containsPoint(double x, double y) {
		// TODO Auto-generated method stub
		return super.containsPoint(x, y);
	}

	@Override
	public void moveBy(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle displayBox() {
		// TODO Auto-generated method stub
		return super.displayBox();
	}
	
	@Override
	public void draw (Graphics g) {
		g.setColor(Color.blue);
		Rectangle r = this.getCaja();
		g.drawOval((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
	}
}
