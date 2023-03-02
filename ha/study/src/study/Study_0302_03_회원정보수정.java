package study;

import java.awt.*;
import java.awt.event.*;

public class Study_0302_03_회원정보수정 {

	public static void main(String[] args) {
		MemberEdit me = new MemberEdit();

	}

}
class MemberEdit extends Frame{
	Font font25 = new Font("SansSerif", Font.BOLD, 25);
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	
	Label lbTitle = new Label("회원정보수정");
	Label lbId = new Label("아이디 : ");
	Label lbPw = new Label("패스워드 : ");
	Label lbName = new Label("이 름 : ");
	Label lbHp = new Label("연락처 :");
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	TextField tfName = new TextField();
	TextField tfHp = new TextField();
	Button btnIdFind = new Button("찾기");
	Button btnEdit = new Button("수정완료");
	MemberEdit()
	{
		super("회원정보수정");
		this.setSize(400,400);
		this.init();
		this.start();
		this.setLocation(600,200);
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		//윈도우 프레임에 추가 
		this.add(lbTitle);this.add(lbId);this.add(lbPw);
		this.add(lbName);this.add(lbHp);this.add(tfId);
		this.add(tfPw);this.add(tfName);this.add(tfHp);
		this.add(btnIdFind);this.add(btnEdit);
		lbTitle.setFont(font25);
		//lbId.setFont(font20);lbPw.setFont(font20);lbName.setFont(font20);
		//lbHp.setFont(font20);tfId.setFont(font20);tfPw.setFont(font20);
		//tfName.setFont(font20);tfHp.setFont(font20);
		//배치하기
		lbTitle.setBounds(50, 50, 200, 30);
		lbId.setBounds  (30, 100, 100, 30);	tfId.setBounds  (130, 100, 150, 30);
		lbPw.setBounds  (30, 150, 100, 30);	tfPw.setBounds  (130, 150, 150, 30);
		lbName.setBounds(30, 200, 100, 30);	tfName.setBounds(130, 200, 150, 30);
		lbHp.setBounds  (30, 250, 100, 30);	tfHp.setBounds  (130, 250, 150, 30);
		btnIdFind.setBounds (300, 100, 50, 30);
		btnEdit.setBounds  (130, 300, 100, 30);
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
