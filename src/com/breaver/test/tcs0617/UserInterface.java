/**
 * 
 */
package com.breaver.test.tcs0617;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.breaver.formal.config.ConstantsTCS;

/**
 * @author zzf
 *@date 2017��6��17�� ����1:54:02
 */
public class UserInterface extends JFrame {
	
	private ConstantsTCS constantsTCS = new ConstantsTCS();
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface interface1 = new UserInterface();
	}

	public UserInterface() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		this.setTitle(constantsTCS.getStr_windowTitle());
		this.setSize(new Dimension(constantsTCS.getInt_windowWidth(), 
				constantsTCS.getInt_windowHeight()));
		this.setMaximumSize(new Dimension(constantsTCS.getInt_windowWidth(),
				constantsTCS.getInt_windowHeight()));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����ʼ������------------------
		
		//������ʾ����-------------------------
		this.setVisible(true);
	}

}
