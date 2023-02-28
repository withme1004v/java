package study;

import java.awt.*;

public class Study_0228_03_메인화면 {

	public static void main(String[] args) {
		Member g = new Member();

	}

}
class Member extends Frame{
	Label lbTitle = new Label("메인화면");
	Button btnList = new Button("회원리스트");
	Button btnEdit = new Button("회원정보수정");
	Button btnDel = new Button("회원정보삭제");
	Button btnJoin = new Button("회원가입");
	Button btnClose = new Button("닫기");
	
	Font font25 = new Font("SansSerif", Font.BOLD, 25);
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Member()
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
		this.add(lbTitle);this.add(btnList);this.add(btnEdit);
		this.add(btnDel);this.add(btnJoin);
		this.add(btnClose);
		
		//폰트사이즈적용
		lbTitle.setFont(font20);
		
		//실제 윈도우에 배치하기.
		lbTitle.setBounds(150, 80, 120, 30);//x,y,넓이, 높이
		btnList.setBounds(150, 120, 100, 30);
		btnEdit.setBounds(120, 160, 150, 30);
		btnDel.setBounds(120, 200, 150, 30);
		btnJoin.setBounds(120, 240, 150, 30);
		btnClose.setBounds(150, 280, 100, 30);
	}
}