import java.awt.*;

public class Round18_Ex08 {
	public static void main(String[] ar) {
		Round18_Ex08_Sub round = new Round18_Ex08_Sub();
	}
}

class Round18_Ex08_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("�����ϴ� ������ ��� üũ�ϼ���!");

	private Checkbox cb = new Checkbox("  ��   ��");

	private Checkbox cb1 = new Checkbox("  ��   ��", false);

	private Checkbox cb2 = new Checkbox("  Ű   ��", true);

	private Checkbox cb3 = new Checkbox("  ��   ��");

	private Button bt = new Button("Ȯ��");

	private Button bt1 = new Button("���");

	public Round18_Ex08_Sub() {
		super("����");
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
	}

	public void init() {
		// ȭ�� ���� ���� �κ�
		BorderLayout border = new BorderLayout();
		this.setLayout(border);

		this.add("North", lb);

		GridLayout grid = new GridLayout(2, 2);
		Panel p = new Panel(grid);
		p.add(cb);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		this.add("Center", p);

		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		Panel p1 = new Panel(flow);
		p1.add(bt);
		p1.add(bt1);
		this.add("South", p1);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
	}
}
