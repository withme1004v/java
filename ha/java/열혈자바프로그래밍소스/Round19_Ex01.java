import java.awt.*;
import java.awt.event.*;

public class Round19_Ex01 {
	public static void main(String[] ar) {
		Round19_Ex01_Sub round = new Round19_Ex01_Sub();
	}
}

class Round19_Ex01_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Button bt = new Button("�ݱ�");

	public Round19_Ex01_Sub() {
		super("�̺�Ʈ!");
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
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();

		this.setLayout(gridbag);

		gridbag.setConstraints(bt, gc);
		this.add(bt);
	}

	public void start() {
		// �̺�Ʈ�� ������ ó���� �κ�
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
