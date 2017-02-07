package uHotDrawFramework;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class DrawingView extends JPanel
	implements MouseListener, MouseMotionListener {
	
	private Drawing drawing;
	
	private DrawingEditor editor;

	public Drawing getDrawing() {
		return drawing;
	}

	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}
	
	public void setEditor(DrawingEditor d) {
		editor = d;
	}
	
	public void paint(Graphics g) {
		drawing.draw(g);
	}
	
//	public ITool tool() {
//		return editor.getCurrentTool();
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
