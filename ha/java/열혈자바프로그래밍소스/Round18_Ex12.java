import java.awt.*;

public class Round18_Ex12 {
	public static void main(String[] ar) {
		Round18_Ex12_Sub round = new Round18_Ex12_Sub();
	}
}

class Round18_Ex12_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("5�� �̳��� Ư�� ������ ������ �����Ͻÿ�!");

	private Label lb1 = new Label("���õ� ���� : ", Label.RIGHT);

	private TextArea ta = new TextArea("abcdefghijk\nlmnopqrs\ntuvwxyz\n");

	private TextField tf = new TextField();

	public Round18_Ex12_Sub() {
		super();
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
		String str = ta.getSelectedText().trim();
		int start = ta.getSelectionStart();
		int end = ta.getSelectionEnd();
		tf.setText(str);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		ta.replaceRange("", start, end);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		str = tf.getText().trim();
		int length = ta.getText().trim().length();
		ta.setCaretPosition(length);
		ta.append(str);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		BorderLayout border = new BorderLayout(5, 5);
		this.setLayout(border);

		this.add("North", lb);
		this.add("Center", ta);

		BorderLayout border1 = new BorderLayout(3, 3);
		Panel p = new Panel(border1);
		p.add("West", lb1);
		p.add("Center", tf);
		this.add("South", p);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
