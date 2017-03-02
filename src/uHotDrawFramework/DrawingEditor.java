package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uHotDrawFigures.EllipseFigure;
import uHotDrawFigures.RectangleFigure;
import uTool.AbstractTool;
import uTool.CreationTool;

public class DrawingEditor extends JFrame implements ActionListener {
	
	private DrawingView view;
	
	private List <AbstractTool> tools;
	private AbstractTool currentTool;
	
	private CreationTool rT, eT;
	
	private JButton b4, b5, b6;
	
	
	
	public DrawingEditor() {
		super();
		tools = new ArrayList();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        b6 = new JButton("Polyline");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);

        view = new DrawingView();
        view.setEditor(this);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((DrawingView)view, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        
        rT = new CreationTool(this.getView(),new RectangleFigure(0,0,10,10));
        eT = new CreationTool(this.getView(),new EllipseFigure(0,0,10,10));
        currentTool = rT;
	}

	public DrawingView getView() {
		return view;
	}

	public void setView(DrawingView view) {
		this.view = view;
		this.setContentPane(view);
	}	

	public AbstractTool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(AbstractTool currentTool) {
		this.currentTool = currentTool;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("e".equals(e.getActionCommand())) {
            setCurrentTool(rT);
        }
        if ("r".equals(e.getActionCommand())) {
            setCurrentTool(rT);
        }
	}	
}
