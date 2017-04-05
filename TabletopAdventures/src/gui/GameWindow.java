package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = -8419376300862266763L;
	private JPanel panel;
	private JLabel info_panel;
	private JScrollPane entity_panel;
	private JLabel map_panel;

	public GameWindow(Dimension screen_size) {
		super();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setPreferredSize(screen_size);
		
		this.panel = new JPanel(new GridBagLayout());
		this.add(this.panel);
		
		this.assembleLayout();
				
		this.setVisible(true);
		this.pack();
	}
	
	public void assembleLayout () {
		this.entity_panel = makeEntityPanel();
		
		this.map_panel = new JLabel();
		
		this.info_panel = new JLabel();
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 5;
		c.weightx = 0.1;
		c.weighty = 1.0;
		this.panel.add(this.entity_panel, c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 4;
		c.gridheight = 3;
		c.weightx = 0.9;
		c.weighty = 0.8;
		c.fill = GridBagConstraints.BOTH;
		this.panel.add(this.map_panel, c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 4;
		c.gridheight = 2;
		c.weightx = 0.9;
		c.weighty = 0.2;
		this.panel.add(this.info_panel, c);
		
		this.panel.setVisible(true);
	}

	private JScrollPane makeEntityPanel() {
		JScrollPane pane = new JScrollPane();
		
		JTable table = new JTable();
		//TODO
		return pane;
	}
	
}
