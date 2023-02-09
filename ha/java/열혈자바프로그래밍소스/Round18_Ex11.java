import java.awt.*;

public class Round18_Ex11 {
	public static void main(String[] ar) {
		Round18_Ex11_Sub round = new Round18_Ex11_Sub();
	}
}

class Round18_Ex11_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("���ڿ� �Է� : ", Label.RIGHT);

	private TextField tf = new TextField(30);

	public Round18_Ex11_Sub() {
		super("���ڿ�");
		this.init();
		this.start();
		this.setSize(300, 200);
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
		String str = tf.getText().trim();
		tf.setEchoChar((char) 0);
		tf.setText(str);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);

		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weightx = 4;
		gridbag.setConstraints(lb, gc);
		this.add(lb);

		gc.weightx = 6;
		gridbag.setConstraints(tf, gc);
		this.add(tf);

		tf.setEchoChar('*');
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
