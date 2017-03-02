package uHotDrawFramework;

import java.awt.Dimension;
import java.awt.Rectangle;

import uHotDrawFigures.*;

public class Main {

	public static void main(String[] args) {
		Drawing d = new Drawing();
//		DrawingView v = new DrawingView();
		DrawingEditor de = new DrawingEditor();
				
		RectangleFigure f1 = new RectangleFigure();
		EllipseFigure f2 = new EllipseFigure();
		
		BorderDecoratorFigure dec1 = new BorderDecoratorFigure();
		
		f2.setCaja(new Rectangle(50, 50, 60, 60));
		f1.setCaja(new Rectangle(10, 10, 30, 30));
		
		d.add(f1);
		d.add(f2);		
		d.add(dec1);
		
		dec1.setDecoratedFigure(f2);
		
//		v.setDrawing(d);		
//		v.setPreferredSize(new Dimension(320,240));
		
		de.getView().setDrawing(d);
		de.getView().setPreferredSize(new Dimension(320,240));
		de.setVisible(true);
		de.pack();
	}

}
