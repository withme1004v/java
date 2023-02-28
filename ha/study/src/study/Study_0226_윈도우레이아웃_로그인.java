package study;
import java.awt.*;
public class Study_0226_윈도우레이아웃_로그인 {

	public static void main(String[] args) {
		Login  login = new Login();

		}
	}
	class Login extends Frame{
		Label lbTitle = new Label("로그인화면");
		Label lbId = new Label("아 이 디 : ");
		Label lbPw = new Label("비밀번호 : ");
		TextField tfId = new TextField();
		TextField tfPw = new TextField();
		Button btnLogin = new Button("로그인");
		Button btnJoin = new Button("회원가입");	
		
		Font font25 = new Font("SansSerif", Font.BOLD, 25);
		Font font15 = new Font("SansSerif", Font.PLAIN, 25);
		
		Login()
		{
			super("로그인화면");
			this.setSize(400,400);
			this.init();
			this.setLocation(600, 200);
			this.setVisible(true);
		}
		void init()
		{
			this.setLayout(null);
			this.add(lbTitle);	lbTitle.setFont(font25);
			this.add(lbId); 	lbId.setFont(font15);
			this.add(lbPw); 	lbPw.setFont(font15);
			this.add(tfId); 	tfId.setFont(font15);
			this.add(tfPw); 	tfPw.setFont(font15);
			this.add(btnLogin); btnLogin.setFont(font15);
			this.add(btnJoin); 	btnJoin.setFont(font15);
			
			
			lbTitle.setBounds(120, 50, 200, 30);
			lbId.setBounds(30, 120, 120, 30);tfId.setBounds(150, 120, 170, 30);
			lbPw.setBounds(30, 190, 120, 30);tfPw.setBounds(150, 190, 170, 30);
			
			btnLogin.setBounds(120, 260, 150, 40);
			btnJoin.setBounds(120, 320, 150, 40);
			
			
			
			
			
		}
	}