package uHotDrawFigures;

import java.awt.Graphics;

public class BorderDecoratorFigure extends DecoratorFigure {

	public BorderDecoratorFigure(DecoratorFigure d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public BorderDecoratorFigure() {
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		super.draw(g);
		g.drawRect(innerFigure.displayBox().x, innerFigure.displayBox().x,
				innerFigure.displayBox().width, innerFigure.displayBox().height);
	}
}
