package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class RectangleFigure extends AbstractFigure{

//	@Override
//	public void draw(Graphics g) {
//		// TODO Auto-generated method stub
//		g.setColor(Color.green);
//		g.drawRect(20, 20, 50, 50);
//	}

	@Override
	public boolean containsPoint(double x, double y) {
		// TODO Auto-generated method stub
		return super.containsPoint(x, y);
	}

	@Override
	public void moveBy(double dx, double dy) {
		// TODO Auto-generated method stub
		super.moveBy(dx, dy);
	}

	@Override
	public Rectangle displayBox() {
		// TODO Auto-generated method stub
		return super.displayBox();
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		Rectangle r = this.getCaja();
		g.drawRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
	}

}
