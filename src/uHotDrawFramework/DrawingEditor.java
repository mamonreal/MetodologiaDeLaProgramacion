package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uTool.AbstractTool;

public class DrawingEditor extends JFrame implements ActionListener {
	
	private DrawingView view;
	
	private List <AbstractTool> tools;
	private AbstractTool currentTool;
	
	private JButton b4, b5;
	
	public DrawingEditor() {
		super();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);

        view = new DrawingView();
        view.setEditor(this);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((DrawingView)view, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
	}

	public DrawingView getView() {
		return view;
	}

	public void setView(DrawingView view) {
		this.view = view;
		this.setContentPane(view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("e".equals(e.getActionCommand())) {
            //setCurrentTool(eT);
        }
        if ("r".equals(e.getActionCommand())) {
            //setCurrentTool(rT);
        }
	}	
}
