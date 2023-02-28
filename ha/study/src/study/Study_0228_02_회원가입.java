package study;

import java.awt.*;

public class Study_0228_02_회원가입 {

	public static void main(String[] args) {
		Login1 g = new Login1();

	}

}
class Login1 extends Frame{
	Label lbTitle = new Label("회원가입");
	Label lbId = new Label("아이디 : ");
	Label lbPw = new Label("비밀번호 : ");
	Label lbName = new Label("이름 : ");
	Label lbTel = new Label("연락처 : ");
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	TextField tfName = new TextField();
	TextField tfTel = new TextField();
	Button btnEnd = new Button("가입완료");
	
	Font font25 = new Font("SansSerif", Font.BOLD, 25);
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Login1()
	{
		super("회원가입");
		this.setSize(400,400);
		this.init();
		this.setLocation(600,200);
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);//현재윈도우창에 레이아웃을 직접 배치를 위해 없앰
		//윈도우에 컴포넌트들 추가하기
		this.add(lbTitle);this.add(lbId);this.add(tfId);
		this.add(lbPw);this.add(tfPw);
		this.add(lbName);this.add(tfName);
		this.add(lbTel);this.add(tfTel);
		this.add(btnEnd);
		
		//폰트사이즈적용
		lbTitle.setFont(font20);
		
		//실제 윈도우에 배치하기.
		lbTitle.setBounds(130, 50, 120, 30);//x,y,넓이, 높이
		lbId.setBounds(50, 120, 50, 30);
		tfId.setBounds(150, 120, 150, 30);
		lbPw.setBounds(50, 170, 50, 30);
		tfPw.setBounds(150, 170, 150, 30);
		lbName.setBounds(50, 220, 50, 30);
		tfName.setBounds(150, 220, 150, 30);
		lbTel.setBounds(50,260,50,30);
		tfTel.setBounds(150, 260, 150, 30);
		btnEnd.setBounds(130,320,100,30);
	}
}