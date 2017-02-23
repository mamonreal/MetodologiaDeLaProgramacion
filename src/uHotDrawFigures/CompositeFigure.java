package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class CompositeFigure extends AbstractFigure {
	protected List <IFigure> figures;
	
	public CompositeFigure() {
		figures = new ArrayList<IFigure>();
	}
	
	public CompositeFigure(CompositeFigure c) {
		this.caja = c.getCaja();
		this.figures = c.getFigures();
	}
	
	@Override
	public void draw(Graphics g) {
		for(IFigure i: figures)
			i.draw(g);
	}

	@Override
	public boolean containsPoint(double x,double y) {
		// TODO Auto-generated method stub
		for(IFigure i: figures) {
			if (! i.containsPoint(x, y))
				return false;
		}
		return true;
	}

	@Override
	public void moveBy(double dx, double dy) {
		// TODO Auto-generated method stub
		for(IFigure i: figures)
			i.moveBy(dx, dy);
	}
	
	@Override
	public Rectangle displayBox() {
		Rectangle r = null;
		boolean b = false;
		for (IFigure i: figures) {
			if (b)
				r.union(i.displayBox());
			else {
				r = new Rectangle(i.displayBox());
				b = true;
			}
		}
		return r;
	}
	
	public void add(IFigure i) {
		figures.add(i);
	}
	
	public void remove(IFigure i) {
		figures.remove(i);
	}
	
	public List <IFigure> getFigures() {
		return figures;
	}
}
