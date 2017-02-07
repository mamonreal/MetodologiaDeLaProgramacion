package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

public interface IFigure {
	public void draw(Graphics g);
	public boolean containsPoint(double x, double y);
	public void moveBy(double dx, double dy);
	public Rectangle displayBox();
	
}
