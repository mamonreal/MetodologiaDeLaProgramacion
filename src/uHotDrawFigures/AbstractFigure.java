package uHotDrawFigures;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class AbstractFigure implements IFigure {
	protected Rectangle caja;
	
	public AbstractFigure() {
		caja = new Rectangle(20, 20, 30, 30);
	}
	
	public AbstractFigure(AbstractFigure i) {
		this.caja = i.getCaja();
	}
	
	public void setCaja(Rectangle caja) {
		this.caja = caja;
	}

	public Rectangle getCaja() {
		return caja;
	}
	
//	public void draw (Graphics g) {
//		g.setColor(Color.red);
//		g.drawOval(10, 10, 50, 50);
//	}
	
	public Rectangle displayBox () {
		return caja;
	}
	
	public boolean containsPoint (double x,double y) {
		return caja.contains(x, y);
	}
	
	public void moveBy (double dx, double dy) {
		caja.translate((int) dx, (int) dy);
	}
	
	public void draw (Graphics g) {
		g.setColor(Color.red);
		g.drawOval((int) caja.getX(), (int) caja.getY(), (int) caja.getWidth(), (int) caja.getHeight());
	}
	
	public AbstractFigure clone() {
		AbstractFigure a = new AbstractFigure(this) {};
		return a;
	}

	public void moveBy(Point p) {
		// TODO Auto-generated method stub
		caja.translate(p.x, p.y);
	}
}
