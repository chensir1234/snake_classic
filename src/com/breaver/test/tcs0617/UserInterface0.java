/**
 * 
 */
package com.breaver.test.tcs0617;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.breaver.formal.button.ButtonBack;
import com.breaver.formal.config.ConstantsTCS;
import com.breaver.formal.jpanel.JPanelGame;
import com.breaver.formal.jpanel.JPanelMenu;

/**
 * @author zzf
 *@date 2017年6月17日 下午6:44:05
 */
public class UserInterface0 extends JFrame {
	private JPanel panelFirst = new JPanel();
	private JPanelGame game = new JPanelGame();
	private JPanelMenu menu = new JPanelMenu();
	private CardLayout cardLayout = new CardLayout();
	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserInterface0();
	}

	public UserInterface0() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		this.setSize(new Dimension(
				ConstantsTCS.getDemoUnique().getInt_windowWidth(),
				ConstantsTCS.getDemoUnique().getInt_windowHeight()));
		this.setTitle(ConstantsTCS.getDemoUnique().getStr_windowTitle());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		init();
		this.setVisible(true);
	}
	private void init(){
		this.add(panelFirst);
		panelFirst.setLayout(cardLayout);
		panelFirst.add(game, "id_game");
		panelFirst.add(menu, "id_menu");
		//----------------测试-----下面为-----------------------
		test_keyEvent();
		test_skip();
		test_customButton();
	}
	private void test_customButton(){
		ButtonBack back = new ButtonBack("返回");
		game.add(back);
		back.addActionListener(event->{
			JOptionPane.showMessageDialog(game, "hello custom button");
		});
	}
	private void test_skip(){
		JButton button1 = new JButton("显示-menu");
		game.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panelFirst, "id_menu");
			}
		});
		JButton button2  =new JButton("显示-game");
		menu.add(button2);
		button2.addActionListener(event->{
			cardLayout.show(panelFirst, "id_game");
		});
	}
	private void test_keyEvent(){
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("jframe");
			}
		});
		panelFirst.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("pane-first");
			}
		});
		game.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("child-layout");
			}
		});
	}
}
