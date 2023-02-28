package study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study_0228_01_간단한계산기 {

	public static void main(String[] args) {
		Calc c = new Calc();

	}

}
class Calc extends Frame implements ActionListener{
	Label lbTitle = new Label("간단한계산기");
	Label lbSu1 = new Label("수1 : ");
	Label lbSu2 = new Label("수2 : ");
	Label lbResult = new Label("결과 : ");
	TextField tfSu1 = new TextField();
	TextField tfSu2 = new TextField();
	TextField tfResult = new TextField();
	Button btnPlu = new Button("+");
	Button btnMin = new Button("-");
	Button btnMu1 = new Button("*");
	Button btnDiv = new Button("/");
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font15 = new Font("SansSerif", Font.BOLD, 15);
	Calc()
	{
		super("간단한 계산기");
		this.setSize(400,400);
		this.init();
		this.start();
		this.setLocation(600,200);
		this.setVisible(true);
	}
	void start()
	{
		btnPlu.addActionListener(this);
		btnMin.addActionListener(this);
		btnMu1.addActionListener(this);
		btnDiv.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void init()
	{
		this.setLayout(null);//현재윈도우창에 레이아웃을 직접 배치를 위해 없앰
		//윈도우에 컴포턴트들 추가하기
		this.add(lbTitle);this.add(lbSu1);this.add(lbSu2);
		this.add(lbResult);this.add(tfSu1);this.add(tfSu2);
		this.add(tfResult);this.add(btnPlu);this.add(btnMin);
		this.add(btnMu1);this.add(btnDiv);
		
		//폰트사이즈적용
		lbTitle.setFont(font15);
		
		//실제 윈도우에 배치하기.
		lbTitle.setBounds(50, 50, 120, 30);//x,y,넓이, 높이
		lbSu1.setBounds(50, 100, 50, 30);tfSu1.setBounds(100, 100, 220, 30);
		lbSu2.setBounds(50, 150, 50, 30);tfSu2.setBounds(100,150,220,30);
		btnPlu.setBounds(50,200,50,50);
		btnMin.setBounds(130,200,50,50);
		btnMu1.setBounds(210,200,50,50);
		btnDiv.setBounds(290,200,50,50);
		lbResult.setBounds(50,270,100,50);
		tfResult.setBounds(150,270,170,30);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tfSu1.getText().equals("")) {System.out.println("수1을 입력하시오"); return;}
		if(tfSu2.getText().equals("")) {return;}
		int su1 = Integer.parseInt(tfSu1.getText());
		int su2 = Integer.parseInt(tfSu2.getText());
		if(e.getSource()==btnPlu)
		{
			tfResult.setText(su1+su2+"");
		}
		else if(e.getSource()==btnMin)
		{
			tfResult.setText(su1-su2+"");
		}
		else if(e.getSource()==btnMu1)
		{
			tfResult.setText(su1*su2+"");
		}
		else if(e.getSource()==btnDiv)
		{
			tfResult.setText(su1/su2+"");
		}
	}
}