/**
 * 
 */
package com.breaver.formal.jpanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import com.breaver.formal.config.ConstantsTCS;

/**
 * @author zzf
 *@date 2017年6月17日 下午3:45:04
 */
public class JPanelGame extends JPanel {
	private Graphics2D graphics2d = null;
	private ConstantsTCS constantsTCS = new ConstantsTCS();
	private final Double leftAndRight = 2/3.0;
	private final Integer int_leftWidth = (int)(leftAndRight*constantsTCS.getInt_windowWidth());
	private final Integer int_rightWidth = constantsTCS.getInt_windowWidth() - int_leftWidth;
	private final Integer int_cutLineX = int_leftWidth;
	private final Integer int_heightY=constantsTCS.getInt_windowHeight()-30;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public JPanelGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		graphics2d = (Graphics2D)arg0;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2d.setColor(Color.BLACK);
		graphics2d.drawLine(0, 0, 
				int_cutLineX, 
				int_heightY);
		graphics2d.drawLine(int_cutLineX, 0, int_cutLineX,int_heightY );
	}

}
