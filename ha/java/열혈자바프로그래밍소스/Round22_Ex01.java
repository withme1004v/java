import java.awt.*;
import javax.swing.*;

class Round22_Ex01_Sub extends JFrame {
	private Container con; // �۾� ������ ���� �⺻ Panel�� ���� ��ü

	private ImageIcon im; // Ÿ��Ʋ ���� �̹����� ������ ��ü

	public Round22_Ex01_Sub() {
		super("����");
		this.init();
		this.start();
		im = new ImageIcon("title.gif"); // Ư�� �̹��� ��ü ����
		this.setIconImage(im.getImage()); // Ÿ��Ʋ �ٿ� �̹��� �ֱ�
		this.setSize(300, 200);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int) (di.getWidth() / 2 - di1.getWidth() / 2),
				(int) (di.getHeight() / 2 - di1.getHeight() / 2));
		this.setVisible(true);
	}

	public void init() {
		con = this.getContentPane(); // ���� Panel������ �⺻ �۾� ���� ȹ��
		// �� ���� ����
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame�� X��ư�� ������ ���� Event (WindowEvent Closing)
	}
}

public class Round22_Ex01 {
	public static void main(String[] ar) {
		Round22_Ex01_Sub es = new Round22_Ex01_Sub();
	}
}
