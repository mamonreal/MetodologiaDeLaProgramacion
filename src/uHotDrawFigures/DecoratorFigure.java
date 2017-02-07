package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

public class DecoratorFigure extends AbstractFigure {
	
	protected IFigure innerFigure;
	
	public void setDecoratedFigure(IFigure f) {
		innerFigure = f;
	}
	
	public void containsPoints() {
		
	}
	
	@Override
	public Rectangle displayBox() {
		return innerFigure.displayBox();
	}
	
	public void moveBy() {
		
	}
	
	@Override
	public void draw(Graphics g) {
		innerFigure.draw(g);
	}
	
}
