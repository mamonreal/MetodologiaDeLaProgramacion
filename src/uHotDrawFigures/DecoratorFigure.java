package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

public class DecoratorFigure extends AbstractFigure {
	
	protected IFigure innerFigure;
	
	public DecoratorFigure() {
		
	}
	
	public DecoratorFigure(IFigure innerFigure) {
		super();
		this.innerFigure = innerFigure;
	}

	public DecoratorFigure(DecoratorFigure d) {
		this.caja = d.getCaja();
		this.innerFigure = d.getInnerFigure();
	}
	
	public IFigure getInnerFigure() {
		return innerFigure;
	}

	public void setInnerFigure(IFigure innerFigure) {
		this.innerFigure = innerFigure;
	}

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
