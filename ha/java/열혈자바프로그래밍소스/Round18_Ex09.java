import java.awt.*;

public class Round18_Ex09 {
	public static void main(String[] ar) {
		Round18_Ex09_Sub round = new Round18_Ex09_Sub();
	}
}

class Round18_Ex09_Sub extends Frame {
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lb = new Label("积斥岿老 : ", Label.RIGHT);

	private Label lb1 = new Label("斥 ", Label.LEFT);

	private Label lb2 = new Label("岿 ", Label.LEFT);

	private Label lb3 = new Label("老 ", Label.LEFT);

	private Choice choice = new Choice();

	private Choice choice1 = new Choice();

	private Choice choice2 = new Choice();

	public Round18_Ex09_Sub() {
		super("免积老");
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
		choice.select("1980");
		choice1.select("12");
		choice2.select("25");
		choice2.requestFocus();
	}

	public void init() {
		// 拳搁 备己 持阑 何盒
		for (int i = 2004; i >= 1970; i--) {
			choice.add(String.valueOf(i));
		}
		for (int i = 1; i <= 12; i++) {
			choice1.add(String.valueOf(i));
		}
		for (int i = 1; i <= 31; i++) {
			choice2.add(String.valueOf(i));
		}

		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);

		gridbag.setConstraints(lb, gc);
		this.add(lb);
		gridbag.setConstraints(choice, gc);
		this.add(choice);
		gridbag.setConstraints(lb1, gc);
		this.add(lb1);
		gridbag.setConstraints(choice1, gc);
		this.add(choice1);
		gridbag.setConstraints(lb2, gc);
		this.add(lb2);
		gridbag.setConstraints(choice2, gc);
		this.add(choice2);
		gridbag.setConstraints(lb3, gc);
		this.add(lb3);
	}

	public void start() {
		// 捞亥飘唱 静饭靛 贸府且 何盒
	}
}
