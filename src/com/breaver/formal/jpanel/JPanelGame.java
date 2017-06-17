/**
 * 
 */
package com.breaver.formal.jpanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import com.breaver.formal.bean.Snake;
import com.breaver.formal.config.ConstantsTCS;

/**
 * @author zzf
 *@date 2017年6月17日 下午3:45:04
 */
public class JPanelGame extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2440695318261072275L;
	private Graphics2D graphics2d = null;
	private ConstantsTCS constantsTCS = new ConstantsTCS();
	private Snake snake = null;
//	private final Double leftAndRight = 2/3.0;//应该让左边为一个正方形
	private final Integer int_leftWidth = constantsTCS.getInt_windowHeight()-30; 
//			(int)(leftAndRight*constantsTCS.getInt_windowWidth());
	private final Integer int_rightWidth = constantsTCS.getInt_windowWidth() - int_leftWidth;
	private final Integer int_cutLineX = int_leftWidth;
	private final Integer int_heightY=constantsTCS.getInt_windowHeight()-30;
	//测试参数-----
	public static final Integer int_validHeight = 28;
	public static final Integer int_validStartX = 1;
	public static final Integer int_validSideLength = int_validHeight-2;
	public static final Integer int_validSingleLength = 20;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public JPanelGame() {
		super();
		// TODO Auto-generated constructor stub
		snake = new Snake();
	}
	
	/**
	 * @return the snake
	 */
	public Snake getSnake() {
		return snake;
	}

	/**
	 * @param snake the snake to set
	 */
	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		graphics2d = (Graphics2D)arg0;
		paint_comment(graphics2d);
		/*this.repaint();*/
//		revalidate();
		validate();
//		super.repaint();
	}
	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		super.repaint();
		validate();
		super.paint(graphics2d);
	}
	private void paint_comment(Graphics2D g){
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		paint_backgroundLeft();
		paint_border();
		paint_testLine();
		showSnakeBody();
	}
	
	private void showSnakeBody(){
//		graphics2d.setColor(Color.GREEN);
		for(Point point:snake.getListBody()){
			paint_brick(point.x*int_validSingleLength, 
					point.y*int_validSingleLength,
					int_validSingleLength, 
					Color.WHITE,
					Color.ORANGE);
		}
		paint_brick(snake.getListBody().get(0).x*int_validSingleLength, 
				snake.getListBody().get(0).y*int_validSingleLength,
				int_validSingleLength, 
				Color.ORANGE,
				Color.GRAY);
		
	}
	
	
	private void paint_border(){
		graphics2d.setColor(Color.MAGENTA);
		int i;
		int v_x=0;
		int v_y=0;
		int v_temp = 0;
		int v_length_side = 20;
		v_temp = v_length_side*(int_validHeight-1);
		for(i=0;i<int_validHeight;i++){
			paint_brick(v_x, v_y, v_length_side,
					Color.BLUE, Color.MAGENTA);
			paint_brick(v_temp, v_y, v_length_side,
					Color.BLUE, Color.MAGENTA);
			v_y+=20;				
		}
		v_x=0;
		v_y=0;
		for(i=0;i<int_validHeight;i++){
			paint_brick(v_x, v_y, v_length_side,
					Color.BLUE, Color.MAGENTA);
			paint_brick(v_x, v_temp, v_length_side,
					Color.BLUE, Color.MAGENTA);
			v_x+=20;	
		}
		
	}
	private void paint_testLine(){
		graphics2d.setColor(Color.RED);
		graphics2d.drawLine(int_validSingleLength*int_validStartX,
				100, int_validSingleLength*int_validSideLength, 100);
		graphics2d.drawLine(100, int_validSingleLength*int_validStartX, 
				100,int_validSingleLength*int_validSideLength );
	}
	private void paint_brick(int x,int y,int length,
			Color colorOutside,Color colorInside){
		int padding_length=2;
		int v_x = x +padding_length;
		int v_y=y+padding_length;
		int v_length = length - padding_length*2;
		graphics2d.setColor(colorOutside);
		graphics2d.fillRect(x, y, length, length);
		graphics2d.setColor(colorInside);
		graphics2d.fillRect(v_x,v_y ,v_length, v_length);
	}
	private void paint_backgroundLeft(){
		graphics2d.setColor(Color.DARK_GRAY);
		graphics2d.fillRect(0, 0, int_cutLineX, int_heightY);
		
	}

	/**
	 * @return the int_rightWidth
	 */
	public  Integer getInt_rightWidth() {
		return int_rightWidth;
	}
	
}
