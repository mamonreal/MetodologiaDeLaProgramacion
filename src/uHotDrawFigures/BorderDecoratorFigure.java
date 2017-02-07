package uHotDrawFigures;

import java.awt.Graphics;

public class BorderDecoratorFigure extends DecoratorFigure {

	public void draw(Graphics g) {
		super.draw(g);
		g.drawRect(innerFigure.displayBox().x, innerFigure.displayBox().x,
				innerFigure.displayBox().width, innerFigure.displayBox().height);
	}
}
