import java.awt.*;

public class Round18_Ex17 {
	public static void main(String[] ar) {
		Round18_Ex17_Sub round = new Round18_Ex17_Sub();
	}
}

class Round18_Ex17_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private TextArea ta = new TextArea("5���� ��Ÿ����.");

	private PopupMenu pm = new PopupMenu("My Popup");

	private MenuItem copy = new MenuItem("����");

	private MenuItem cut = new MenuItem("�߶󳻱�");

	private MenuItem paste = new MenuItem("�ٿ��ֱ�");

	private Menu align = new Menu("����");

	private CheckboxMenuItem asize = new CheckboxMenuItem("ũ���", false);

	private CheckboxMenuItem aname = new CheckboxMenuItem("�̸���", false);

	private CheckboxMenuItem aauto = new CheckboxMenuItem("�ڵ�����", true);

	public Round18_Ex17_Sub() {
		super("�˾� �޴�");
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
		pm.show(ta, 50, 0);
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		BorderLayout border = new BorderLayout();
		this.setLayout(border);

		this.add("Center", ta);

		pm.add(copy);
		pm.add(cut);
		pm.add(paste);
		pm.addSeparator();
		align.add(asize);
		align.add(aname);
		align.addSeparator();
		align.add(aauto);
		pm.add(align);

		ta.add(pm);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
