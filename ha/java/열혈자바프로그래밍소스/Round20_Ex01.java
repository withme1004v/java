import java.awt.*;
import java.awt.event.*;

class Round20_Ex01_Sub extends Frame {
	private Button bt = new Button("Ȯ��");

	private Button bt1 = new Button("���");

	public Round20_Ex01_Sub() {
		super("Test");
		this.init();
		this.start();
		this.setSize(500, 500);
		this.setVisible(true);
	}

	public void init() {
		this.setLayout(new BorderLayout());
		Panel p = new Panel(new FlowLayout());
		p.add(bt);
		p.add(bt1);
		this.add("North", p);
	}

	public void start() {
	}

	// public void update(Graphics g) {
	// paint(g);
	// }
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200); // ��(100, 100) ���� ��(200, 200) ���� ������
										// ����Ѵ�.
		g.drawRoundRect(100, 100, 100, 100, 30, 30); // ��(100, 100), �� 100,
														// ���� 100, round_x 30,
														// round_y 30 �ȼ��� �𼭸���
														// �ձ� �簢���� ����Ѵ�.
		int[] x = { 250, 300, 200 }; // x���� ��ǥ���� ������ ������� ������.
		int[] y = { 200, 300, 300 }; // y���� ��ǥ���� x��� ������ ������� ������ ��ǥ�� ������.
		g.drawPolygon(x, y, x.length); // �ﰢ���� ����Ѵ�.
		g.setColor(Color.red); // ������ ���������� �ٲ۴�.
		g.fillOval(200, 100, 100, 100); // ��(200, 100), �� 100, ���� 100 �ȼ��� ���� ä����
										// Ÿ���� ����Ѵ�.
	}
}

public class Round20_Ex01 {
	public static void main(String[] args) {
		Round20_Ex01_Sub gs = new Round20_Ex01_Sub();
	}
}
