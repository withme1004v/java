import java.awt.*;

public class Round18_Ex06 {
	public static void main(String[] ar) {
		Round18_Ex06_Sub round = new Round18_Ex06_Sub();
	}
}

class Round18_Ex06_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("���ʹ���(��������) -> ", Label.LEFT); // �⺻����

	public Round18_Ex06_Sub() {
		super();
		this.init();
		this.start();
		this.setSize(500, 200);
		// this.pack();
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		String str = lb.getText().trim();
		lb.setAlignment(Label.CENTER);
		lb.setText(str + "��������(�߾�����) -> ");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		str = lb.getText().trim();
		lb.setAlignment(Label.RIGHT);
		lb.setText(str + "����������(��������)");
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);
		lb.setBackground(Color.yellow);
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weightx = 1;
		gridbag.setConstraints(lb, gc);
		this.add(lb);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
