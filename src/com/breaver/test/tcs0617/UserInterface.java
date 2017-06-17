/**
 * 
 */
package com.breaver.test.tcs0617;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.breaver.formal.config.ConstantsTCS;

/**
 * @author zzf
 * @date 2017年6月17日 下午1:54:02
 */
public class UserInterface extends JFrame {

	private ConstantsTCS constantsTCS = new ConstantsTCS();
	private JPanel jPanelFirst = new JPanel();
	private JPanel jPanelGame = new JPanel();
	private JPanel jPanelMenu = new JPanel();
	private JPanel jPanelOthers = new JPanel();
	private JPanel jPanelHelp = new JPanel();
	private JPanel jPanelSetUp = new JPanel();
	private JTextField area; 
//	private JPan
	private CardLayout cardLayout1 = new CardLayout();
	private CardLayout cardLayout2 = new CardLayout();
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
		this.setSize(new Dimension(constantsTCS.getInt_windowWidth(), constantsTCS.getInt_windowHeight()));
		this.setMaximumSize(new Dimension(constantsTCS.getInt_windowWidth(), constantsTCS.getInt_windowHeight()));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 上面初始化环境------------------
		this.add(jPanelFirst);
		this.jPanelFirst.setLayout(cardLayout1);
		// cardLayout1.addLayoutComponent("", comp);
		jPanelFirst.add(jPanelGame, "game");
		jPanelFirst.add(jPanelMenu, "menu");
		jPanelFirst.add(jPanelOthers, "others");
		cardLayout1.show(jPanelFirst, "menu");
		jPanelMenu.add(new JLabel("menu"));
		JButton jbtn1 = new JButton("开始游戏");
		jPanelMenu.add(jbtn1);
		jbtn1.addActionListener(event -> {
			cardLayout1.show(jPanelFirst, "game");
		});
		JButton button2 = new JButton("其他菜单");
		jPanelMenu.add(button2);
		button2.addActionListener(event -> {
			cardLayout1.show(jPanelFirst, "others");
		});
		jPanelGame.add(new JLabel("game"));
		JButton button3 = new JButton("返回主菜单");
		jPanelGame.add(button3);
		button3.addActionListener(event->{
			cardLayout1.show(jPanelFirst, "menu");
		});
		/*jPanelOthers.add(new JLabel("其他功能"));
		JButton button4 = new JButton("返回");
		button4.addActionListener(event->{
			cardLayout1.show(jPanelFirst, "menu");
		});
		jPanelOthers.add(button4);
//		JTextArea area = new JTextArea();
		area = new JTextField(10);
		JButton button5 = new JButton("测试卡片是否保存状态");
		button5.addActionListener(event->{
//			jPanelOthers.invalidate();//使无效
			jPanelOthers.add(new JLabel(area.getText()));
//			jPanelOthers.repaint();
			jPanelOthers.revalidate();
		});
		jPanelOthers.add(button5);
		jPanelOthers.add(area);*/
		jPanelOthers.setLayout(cardLayout2);
		jPanelOthers.add(jPanelSetUp, "setup");
		jPanelOthers.add(jPanelHelp,"help");
		jPanelHelp.add(new JLabel("help"));
		jPanelSetUp.add(new JLabel("set-up"));
		JButton comp6 = new JButton("返回");
		jPanelSetUp.add(comp6);
		JButton button6 = new JButton("返回");
		jPanelHelp.add(button6);
		comp6.addActionListener(event->{
			cardLayout1.show(jPanelFirst, "menu");
		});
		button6.addActionListener(event->{
			cardLayout1.show(jPanelFirst, "menu");
		});
		JButton button7 = new JButton("到帮助");
		jPanelSetUp.add(button7);
		button7.addActionListener(event->{
			cardLayout2.show(jPanelOthers, "help");
		});
		JTextField field = new JTextField(20);
		jPanelHelp.add(field);
//		jPanelHelp  = new JPanel();
		
//		jPanelGame
		// 下面显示窗口-------------------------
		this.setVisible(true);
	}

}
