import java.awt.*;
import javax.swing.*;

class Round22_Ex02_Sub extends JFrame {
	private Container con;

	private JButton jl = new JButton("Test");

	private ImageIcon im, im1;

	public Round22_Ex02_Sub() {
		super("Test");
		this.init();
		this.start();
		this.setIconImage(im.getImage());
		this.setSize(400, 300);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int) (di.getWidth() / 2 - di1.getWidth() / 2),
				(int) (di.getHeight() / 2 - di1.getHeight() / 2));
		this.setVisible(true);
	}

	public void init() {
		im = new ImageIcon("title.gif");
		im1 = new ImageIcon("title.gif");
		con = this.getContentPane(); // �۾� ���� ȹ��
		con.setLayout(new BorderLayout()); // �۾� ������ Layout ����
		con.add("North", jl); // �۾� ���� ��ܿ� �Ϲ� ��ư ����
		con.add("Center", new JButton("Test1", im1)); // �۾� ���� �߾ӿ� �̹����� �Բ� ������
														// ��ư�� ����
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư ������ ����ó��
	}

	public void paint(Graphics g) {

	}
}

public class Round22_Ex02 {
	public static void main(String[] ar) {
		Round22_Ex02_Sub es = new Round22_Ex02_Sub();
	}
}
