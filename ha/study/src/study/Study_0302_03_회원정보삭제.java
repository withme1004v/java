package study;

import java.awt.*;
import java.awt.event.*;

public class Study_0302_03_회원정보삭제 {

	public static void main(String[] args) {
		MemberDel me = new MemberDel();

	}

}
class MemberDel extends Frame{
	Font font25 = new Font("SansSerif", Font.BOLD, 25);
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	
	Label lbTitle = new Label("회원정보삭제");
	Label lbId = new Label("아이디 : ");
	Label lbName2 = new Label("대기중... ");
	Label lbHp2 = new Label("대기중...");
	TextField tfId = new TextField();
	TextField tfName2 = new TextField();
	TextField tfHp2 = new TextField();
	Button btnIdFind = new Button("찾기");
	Button btnEdit = new Button("삭제완료");
	MemberDel()
	{
		super("회원정보삭제");
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
		this.add(lbTitle);this.add(lbId);
		this.add(lbName2);this.add(lbHp2);this.add(tfId);
		this.add(tfName2);this.add(tfHp2);
		this.add(btnIdFind);this.add(btnEdit);
		lbTitle.setFont(font25);
		//lbId.setFont(font20);lbPw.setFont(font20);lbName.setFont(font20);
		//lbHp.setFont(font20);tfId.setFont(font20);tfPw.setFont(font20);
		//tfName.setFont(font20);tfHp.setFont(font20);
		//배치하기
		lbTitle.setBounds(50, 50, 200, 30);
		lbId.setBounds  (30, 100, 100, 30);	tfId.setBounds  (130, 100, 150, 30);
			
		lbName2.setBounds(30, 200, 100, 30);	tfName2.setBounds(130, 200, 150, 30);
		lbHp2.setBounds  (30, 250, 100, 30);	tfHp2.setBounds  (130, 250, 150, 30);
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
