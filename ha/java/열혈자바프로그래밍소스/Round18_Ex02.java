import java.awt.*;

public class Round18_Ex02 {
	public static void main(String[] ar) {
		Round18_Ex02_Sub round = new Round18_Ex02_Sub();
	}
}

class Round18_Ex02_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("Test");

	private Label lb1 = new Label("Test1");

	public Round18_Ex02_Sub() {
		super();
		this.init();
		this.start();
		this.setSize(250, 200);
		// this.pack();
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		lb.setBackground(Color.yellow);
		lb1.setBackground(Color.magenta);
		GridLayout grid = new GridLayout(1, 2, 5, 5);
		Panel p = new Panel();
		p.setLayout(grid);
		// 34���� 35�� ���� �����Ͽ� Panel p = new Panel(grid); ��� �Ͽ��� ��
		p.add(lb);
		p.add(lb1);
		this.add("South", p);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
