/**
 * 
 */
package com.breaver.formal.bean;

import java.awt.Point;
import java.util.ArrayList;

import com.breaver.formal.jpanel.JPanelGame;

/**
 * @author zzf
 *@date 2017年6月17日 下午9:08:11
 */
public class Snake {
	private ArrayList<Point> listBody=null;
	private final Integer int_center = JPanelGame.int_validSideLength/2;
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
		listBody = new ArrayList<>();
		test_Init();
	}
	public void moveForward(){
		//index1和0判断移动方式
	}
	public void test_dynamicImage(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					Thread.sleep(1000);
					for(Point point:listBody)
						point.y=point.y+1;
				}catch(InterruptedException exception){
					exception.printStackTrace();
				}
			}
		}).start();
	}
	private void test_Init(){
		listBody.add(new Point(int_center, int_center));
		listBody.add(new Point(int_center+1, int_center));
		listBody.add(new Point(int_center+2, int_center));
		listBody.add(new Point(int_center+3, int_center));
	}
	/**
	 * @return the listBody
	 */
	public ArrayList<Point> getListBody() {
		return listBody;
	}
	/**
	 * @param listBody the listBody to set
	 */
	/*public void setListBody(ArrayList<Point> listBody) {
		this.listBody = listBody;
	}*/
	
}
