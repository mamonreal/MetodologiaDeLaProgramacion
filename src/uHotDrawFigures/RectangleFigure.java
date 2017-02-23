package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class RectangleFigure extends AbstractFigure{

	public RectangleFigure(RectangleFigure r) {
		this.caja = r.getCaja();
	}
	
//	@Override
//	public void draw(Graphics g) {
//		// TODO Auto-generated method stub
//		g.setColor(Color.green);
//		g.drawRect(20, 20, 50, 50);
//	}

	public RectangleFigure() {
		// TODO Auto-generated constructor stub
	}

	public RectangleFigure(int i, int j, int k, int l) {
		this.caja = new Rectangle(i, j, k, l);
	}

	@Override
	public boolean containsPoint(double x, double y) {
		return super.containsPoint(x, y);
	}

	@Override
	public void moveBy(double dx, double dy) {
		super.moveBy(dx, dy);
	}

	@Override
	public Rectangle displayBox() {
		return super.displayBox();
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		Rectangle r = this.getCaja();
		g.drawRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
	}
	
	@Override
	public AbstractFigure clone() {
		return new RectangleFigure(this);		
	}
}
