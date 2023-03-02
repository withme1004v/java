package study;

import java.awt.*;

public class Study_0302_02 {

	public static void main(String[] args) {
		MemberList m = new MemberList();

	}

}
class MemberList extends Frame{
	Label lbTitle = new Label("회원리스트");
	TextArea ta = new TextArea();
	
	Font font25 = new Font("SansSerif", Font.BOLD, 25);
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	MemberList()
	{
		super("회원리스트");
		this.setSize(400,400);
		this.init();
		this.setLocation(600,200);
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);//현재윈도우창에 레이아웃을 직접 배치를 위해 없앰
		//윈도우에 컴포넌트들 추가하기
		this.add(lbTitle);this.add(ta);
		
		//폰트사이즈적용
		lbTitle.setFont(font20);
		
		//실제 윈도우에 배치하기.
		lbTitle.setBounds(140, 50, 200, 30);//x,y,넓이, 높이
		ta.setBounds(40,100,300,250);
	}
	
	
}