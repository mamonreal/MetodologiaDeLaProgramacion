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

	public EllipseFigure(EllipseFigure e) {
		this.caja = e.getCaja();
	}
	
	public EllipseFigure() {
		// TODO Auto-generated constructor stub
	}

	public EllipseFigure(int i, int j, int k, int l) {
		this.caja = new Rectangle(i, j, k, l);
	}

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
	
	@Override
	public AbstractFigure clone() {
		return new EllipseFigure(this);
	}
}
