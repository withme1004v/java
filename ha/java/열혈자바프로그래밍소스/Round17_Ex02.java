import java.awt.*;

public class Round17_Ex02 {
	public static void main(String[] ar) {
		Round17_Ex02_Sub round = new Round17_Ex02_Sub();
	}
}

class Round17_Ex02_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("Test");

	public Round17_Ex02_Sub() {
		super("���� �ֱ�");
		this.init(); // 24������ init() Method ȣ��
		this.start(); // 27������ start() Method ȣ��
		this.setSize(300, 200); // ���� ������ ȭ���� ũ�� ����
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos); // ���� �������� �߾� ��ġ
		this.setVisible(true); // ���� �������� ȭ��� ��Ÿ���� ��.
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		this.setLayout(null);
		lb.setBackground(Color.yellow);
		this.add(lb);
		lb.setBounds(100, 100, 80, 30);
	}

	public void start() {
		// �̺�Ʈ�� Thread ó���� �κ�
	}
}
