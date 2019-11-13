import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Hangman extends JApplet implements ActionListener {
	String[] word = new String[101];
	String Qword;
	String death;
	String death11;
	String[] stats = new String[3];
	String[] stats11 = new String[3];
	String current;
	String currentEnd;
	String guesses;
	String guessesT;
	char[] blank = new char[10];
	String[] blank2 = new String[10];
	int wleng;
	int win;
	int loose;
	int prosTemp;
	int dEath;
	int[] lastUsed = new int[5];
	int[] stats2 = new int[3];
	int[] place = new int[2];
	int level;
	int currentP;
	int guessesC;
	int wordHeight;
	JButton a = new JButton("A");
	JButton b = new JButton("B");
	JButton c = new JButton("C");
	JButton d = new JButton("D");
	JButton e = new JButton("E");
	JButton f = new JButton("F");
	JButton g = new JButton("G");
	JButton h = new JButton("H");
	JButton i = new JButton("I");
	JButton j = new JButton("J");
	JButton k = new JButton("K");
	JButton l = new JButton("L");
	JButton m = new JButton("M");
	JButton n = new JButton("N");
	JButton o = new JButton("O");
	JButton p = new JButton("P");
	JButton q = new JButton("Q");
	JButton r = new JButton("R");
	JButton s = new JButton("S");
	JButton t = new JButton("T");
	JButton u = new JButton("U");
	JButton v = new JButton("V");
	JButton w = new JButton("W");
	JButton y = new JButton("Y");
	JButton x = new JButton("X");
	JButton z = new JButton("Z");
	JButton begin = new JButton("시작");
	JButton easy = new JButton("EASY");
	JButton medium = new JButton("MEDIUM");
	JButton hard = new JButton("HARD");
	JLabel text = new JLabel("Skill level: ", 2);
	JPanel osaUltimate = new JPanel();
	JPanel part1 = new JPanel();
	JPanel part2 = new JPanel();
	Font normalFont = new Font("Arial", 1, 16);
	Font warningFont = new Font("Arial", 1, 20);
	Font versionFont = new Font("Arial", 0, 10);
	Font txtFont = new Font("Arial", 0, 14);
	FontMetrics fma = getFontMetrics(this.normalFont);

	public void init() {
		this.a.addActionListener(this);
		this.b.addActionListener(this);
		this.c.addActionListener(this);
		this.d.addActionListener(this);
		this.e.addActionListener(this);
		this.f.addActionListener(this);
		this.g.addActionListener(this);
		this.h.addActionListener(this);
		this.i.addActionListener(this);
		this.j.addActionListener(this);
		this.k.addActionListener(this);
		this.l.addActionListener(this);
		this.m.addActionListener(this);
		this.n.addActionListener(this);
		this.o.addActionListener(this);
		this.p.addActionListener(this);
		this.q.addActionListener(this);
		this.r.addActionListener(this);
		this.s.addActionListener(this);
		this.t.addActionListener(this);
		this.u.addActionListener(this);
		this.v.addActionListener(this);
		this.w.addActionListener(this);
		this.y.addActionListener(this);
		this.x.addActionListener(this);
		this.z.addActionListener(this);
		this.begin.addActionListener(this);
		this.easy.addActionListener(this);
		this.medium.addActionListener(this);
		this.hard.addActionListener(this);
		GridLayout localGridLayout1 = new GridLayout(3, 1, 0, 55);
		FlowLayout localFlowLayout1 = new FlowLayout(1, 20, 60);
		FlowLayout localFlowLayout2 = new FlowLayout(1, 10, 30);
		GridLayout localGridLayout2 = new GridLayout(3, 1, 3, 3);
		Container localContainer = getContentPane();
		localContainer.setLayout(localGridLayout1);
		localContainer.setBackground(Color.white);
		this.osaUltimate.setLayout(localFlowLayout1);
		this.osaUltimate.setBackground(Color.white);
		this.osaUltimate.add(this.begin);
		localContainer.add(this.osaUltimate);
		this.part1.setLayout(localGridLayout2);
		this.part1.setBackground(Color.white);
		this.part1.add(this.a);
		this.part1.add(this.b);
		this.part1.add(this.c);
		this.part1.add(this.d);
		this.part1.add(this.e);
		this.part1.add(this.f);
		this.part1.add(this.g);
		this.part1.add(this.h);
		this.part1.add(this.i);
		this.part1.add(this.j);
		this.part1.add(this.k);
		this.part1.add(this.l);
		this.part1.add(this.m);
		this.part1.add(this.n);
		this.part1.add(this.o);
		this.part1.add(this.p);
		this.part1.add(this.q);
		this.part1.add(this.r);
		this.part1.add(this.s);
		this.part1.add(this.t);
		this.part1.add(this.u);
		this.part1.add(this.v);
		this.part1.add(this.w);
		this.part1.add(this.y);
		this.part1.add(this.x);
		this.part1.add(this.z);
		localContainer.add(this.part1);
		this.part2.setLayout(localFlowLayout2);
		this.part2.setBackground(Color.white);
		this.part2.add(this.text);
		this.part2.add(this.easy);
		this.part2.add(this.medium);
		this.part2.add(this.hard);
		localContainer.add(this.part2);
		setContentPane(localContainer);
		this.a.setEnabled(false);
		this.b.setEnabled(false);
		this.c.setEnabled(false);
		this.d.setEnabled(false);
		this.e.setEnabled(false);
		this.f.setEnabled(false);
		this.g.setEnabled(false);
		this.h.setEnabled(false);
		this.i.setEnabled(false);
		this.j.setEnabled(false);
		this.k.setEnabled(false);
		this.l.setEnabled(false);
		this.m.setEnabled(false);
		this.n.setEnabled(false);
		this.o.setEnabled(false);
		this.p.setEnabled(false);
		this.q.setEnabled(false);
		this.r.setEnabled(false);
		this.s.setEnabled(false);
		this.t.setEnabled(false);
		this.u.setEnabled(false);
		this.v.setEnabled(false);
		this.w.setEnabled(false);
		this.y.setEnabled(false);
		this.x.setEnabled(false);
		this.z.setEnabled(false);
		this.easy.setEnabled(false);
		this.word[0] = getParameter("word1");
		this.word[1] = getParameter("word2");
		this.word[2] = getParameter("word3");
		this.word[3] = getParameter("word4");
		this.word[4] = getParameter("word5");
		this.word[5] = getParameter("word6");
		this.word[6] = getParameter("word7");
		this.word[7] = getParameter("word8");
		this.word[8] = getParameter("word9");
		this.word[9] = getParameter("word10");
		this.word[10] = getParameter("word11");
		this.word[11] = getParameter("word12");
		this.word[12] = getParameter("word13");
		this.word[13] = getParameter("word14");
		this.word[14] = getParameter("word15");
		this.word[15] = getParameter("word16");
		this.word[16] = getParameter("word17");
		this.word[17] = getParameter("word18");
		this.word[18] = getParameter("word19");
		this.word[19] = getParameter("word20");
		this.word[20] = getParameter("word21");
		this.word[21] = getParameter("word22");
		this.word[22] = getParameter("word23");
		this.word[23] = getParameter("word24");
		this.word[24] = getParameter("word25");
		this.word[25] = getParameter("word26");
		this.word[26] = getParameter("word27");
		this.word[27] = getParameter("word28");
		this.word[28] = getParameter("word29");
		this.word[29] = getParameter("word30");
		this.word[30] = getParameter("word31");
		this.word[31] = getParameter("word32");
		this.word[32] = getParameter("word33");
		this.word[33] = getParameter("word34");
		this.word[34] = getParameter("word35");
		this.word[35] = getParameter("word36");
		this.word[36] = getParameter("word37");
		this.word[37] = getParameter("word38");
		this.word[38] = getParameter("word39");
		this.word[39] = getParameter("word40");
		this.word[40] = getParameter("word41");
		this.word[41] = getParameter("word42");
		this.word[42] = getParameter("word43");
		this.word[43] = getParameter("word44");
		this.word[44] = getParameter("word45");
		this.word[45] = getParameter("word46");
		this.word[46] = getParameter("word47");
		this.word[47] = getParameter("word48");
		this.word[48] = getParameter("word49");
		this.word[49] = getParameter("word50");
		this.word[50] = getParameter("word51");
		this.word[51] = getParameter("word52");
		this.word[52] = getParameter("word53");
		this.word[53] = getParameter("word54");
		this.word[54] = getParameter("word55");
		this.word[55] = getParameter("word56");
		this.word[56] = getParameter("word57");
		this.word[57] = getParameter("word58");
		this.word[58] = getParameter("word59");
		this.word[59] = getParameter("word60");
		this.word[60] = getParameter("word61");
		this.word[61] = getParameter("word62");
		this.word[62] = getParameter("word63");
		this.word[63] = getParameter("word64");
		this.word[64] = getParameter("word65");
		this.word[65] = getParameter("word66");
		this.word[66] = getParameter("word67");
		this.word[67] = "engine";
		this.word[68] = "media";
		this.word[69] = "hansung";
		this.word[70] = "korea";
		this.word[71] = "cake";
		this.word[72] = "cupid";
		this.word[73] = "attire ";
		this.word[74] = "convey";
		this.word[75] = "discard";
		this.word[76] = "dispose";
		this.word[77] = "failure";
		this.word[78] = "improper";
		this.word[79] = "modest";
		this.word[80] = "catering";
		this.word[81] = "embrace";
		this.word[82] = "former";
		this.word[83] = "gauge";
		this.word[84] = "honor";
		this.word[85] = "adapt";
		this.word[86] = "overall";
		this.word[87] = "honor";
		this.word[88] = "extensive";
		this.word[89] = "ensure";
		this.word[90] = "recruit";
		this.word[91] = "relevant";
		this.word[92] = "seasonal";
		this.word[93] = "stock";
		this.word[94] = "surplus";
		this.word[95] = "proofread";
		this.word[96] = "inquiry";
		this.word[97] = "regard";
		this.word[98] = "suitable";
		this.word[99] = "abide";
		this.word[100] = "adhere";
		this.blank[0] = ' ';
		this.blank[1] = ' ';
		this.blank[2] = ' ';
		this.blank[3] = ' ';
		this.blank[4] = ' ';
		this.blank[5] = ' ';
		this.blank[6] = ' ';
		this.blank[7] = ' ';
		this.blank[8] = ' ';
		this.blank[9] = ' ';
		this.blank2[0] = "";
		this.blank2[1] = "";
		this.blank2[2] = "";
		this.blank2[3] = "";
		this.blank2[4] = "";
		this.blank2[5] = "";
		this.blank2[6] = "";
		this.blank2[7] = "";
		this.blank2[8] = "";
		this.blank2[9] = "";
		this.win = 0;
		this.loose = 0;
		this.prosTemp = 0;
		this.lastUsed[0] = 50;
		this.lastUsed[1] = 50;
		this.lastUsed[2] = 50;
		this.lastUsed[3] = 50;
		this.lastUsed[4] = 50;
		this.stats11[1] = "wins 00  ";
		this.stats2[1] = this.fma.stringWidth(this.stats11[1]);
		this.stats11[2] = "Looses 00  ";
		this.stats2[2] = this.fma.stringWidth(this.stats11[2]);
		this.level = 0;
		this.death11 = "You are DEAD!";
		this.current = "Current skill level: Easy";
		this.currentEnd = "Easy";
		this.guesses = "chance ";
		this.guessesC = 10;
		this.wordHeight = 125;
	}

	public void paint(Graphics w) {
		super.paint(w);
		Graphics2D localGraphics2D = (Graphics2D) w;
		localGraphics2D.setFont(this.normalFont);
		if (this.wleng == 4) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
		}
		if (this.wleng == 5) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
		}
		if (this.wleng == 6) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
			localGraphics2D.drawString(this.blank2[5], 295, this.wordHeight);
		}
		if (this.wleng == 7) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
			localGraphics2D.drawString(this.blank2[5], 295, this.wordHeight);
			localGraphics2D.drawString(this.blank2[6], 320, this.wordHeight);
		}
		if (this.wleng == 8) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
			localGraphics2D.drawString(this.blank2[5], 295, this.wordHeight);
			localGraphics2D.drawString(this.blank2[6], 320, this.wordHeight);
			localGraphics2D.drawString(this.blank2[7], 345, this.wordHeight);
		}
		if (this.wleng == 9) {
			localGraphics2D.drawString(this.blank2[0], 170, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 195, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
			localGraphics2D.drawString(this.blank2[5], 295, this.wordHeight);
			localGraphics2D.drawString(this.blank2[6], 320, this.wordHeight);
			localGraphics2D.drawString(this.blank2[7], 345, this.wordHeight);
			localGraphics2D.drawString(this.blank2[8], 370, this.wordHeight);
		}
		if (this.wleng == 10) {
			localGraphics2D.drawString(this.blank2[0], 180, this.wordHeight);
			localGraphics2D.drawString(this.blank2[1], 205, this.wordHeight);
			localGraphics2D.drawString(this.blank2[2], 220, this.wordHeight);
			localGraphics2D.drawString(this.blank2[3], 245, this.wordHeight);
			localGraphics2D.drawString(this.blank2[4], 270, this.wordHeight);
			localGraphics2D.drawString(this.blank2[5], 295, this.wordHeight);
			localGraphics2D.drawString(this.blank2[6], 320, this.wordHeight);
			localGraphics2D.drawString(this.blank2[7], 345, this.wordHeight);
			localGraphics2D.drawString(this.blank2[8], 370, this.wordHeight);
			localGraphics2D.drawString(this.blank2[9], 395, this.wordHeight);
		}
		this.stats[0] = ("wins " + this.win);
		this.stats[1] = ("Looses " + this.loose);
		localGraphics2D.drawString(this.stats[0], this.stats2[0], 165);
		this.place[0] = (this.stats2[0] + this.stats2[1]);
		localGraphics2D.drawString(this.stats[1], this.place[0], 165);
		this.place[1] = (this.stats2[0] + this.stats2[1] + this.stats2[2]);
		this.current = "now level: ";
		this.currentP = (getSize().width / 2 - this.fma.stringWidth(this.current) / 2);
		this.currentP -= 30;
		localGraphics2D.drawString(this.current + this.currentEnd, this.currentP, 185);
		localGraphics2D.setFont(this.warningFont);
		localGraphics2D.setColor(Color.red);
		FontMetrics localFontMetrics = getFontMetrics(this.warningFont);
		this.guessesT = (this.guesses + this.guessesC);
		this.dEath = (getSize().width / 2 - localFontMetrics.stringWidth(this.guessesT) / 2);
		localGraphics2D.drawString(this.guesses + this.guessesC, this.dEath, 205);
		localGraphics2D.setColor(Color.black);
		localGraphics2D.setFont(this.txtFont);
		localGraphics2D.setFont(this.versionFont);

	}

	public void chooseword() {
		double d1 = Math.random() * 101;
		int i1 = (int) Math.floor(d1);
		if (this.word[i1] != null) {
			this.Qword = this.word[i1].toLowerCase();
			this.wleng = this.Qword.length();
			if (((i1 != this.lastUsed[0] ? 1 : 0) & (i1 != this.lastUsed[1] ? 1 : 0) & (i1 != this.lastUsed[2] ? 1 : 0)
					& (i1 != this.lastUsed[3] ? 1 : 0) & (i1 != this.lastUsed[4] ? 1 : 0)) != 0) {
				if (((this.wleng < 4 ? 1 : 0) | (this.wleng > 12 ? 1 : 0)) != 0) {
					makeblack();
				} else {
					repaint();
					this.lastUsed[0] = this.lastUsed[1];
					this.lastUsed[1] = this.lastUsed[2];
					this.lastUsed[2] = this.lastUsed[3];
					this.lastUsed[3] = this.lastUsed[4];
					this.lastUsed[4] = i1;
					char[] arrayOfChar = this.Qword.toCharArray();
					for (int i2 = 0; i2 < this.wleng; i2++) {
						this.blank[i2] = arrayOfChar[i2];
					}
					for (int i2 = this.wleng; i2 < 12; i2++) {
						this.blank2[i2] = ".";
					}
				}
			} else {
				makeblack();
			}
		} else {
			makeblack();
		}
	}

	public void makeblack() {
		this.wleng = 0;
		this.blank2[0] = "";
		this.blank2[1] = "";
		this.blank2[2] = "";
		this.blank2[3] = "";
		this.blank2[4] = "";
		this.blank2[5] = "";
		this.blank2[6] = "";
		this.blank2[7] = "";
		this.blank2[8] = "";
		this.blank2[9] = "";
		chooseword();
	}

	public void blackchange(char w) {
		int i1 = 0;
		if ((this.blank[0] != ' ') && (this.blank[0] == w)) {
			this.blank2[0] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[1] != ' ') && (this.blank[1] == w)) {
			this.blank2[1] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[2] != ' ') && (this.blank[2] == w)) {
			this.blank2[2] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[3] != ' ') && (this.blank[3] == w)) {
			this.blank2[3] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[4] != ' ') && (this.blank[4] == w)) {
			this.blank2[4] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[5] != ' ') && (this.blank[5] == w)) {
			this.blank2[5] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[6] != ' ') && (this.blank[6] == w)) {
			this.blank2[6] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[7] != ' ') && (this.blank[7] == w)) {
			this.blank2[7] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[8] != ' ') && (this.blank[8] == w)) {
			this.blank2[8] = ("" + w);
			i1 = 1;
			repaint();
		}
		if ((this.blank[9] != ' ') && (this.blank[9] == w)) {
			this.blank2[9] = ("" + w);
			i1 = 1;
			repaint();
		}
		if (i1 == 0) {
			this.guessesC -= 1;
			repaint();
		}
		wordtest();
		repaint();
	}

	public void wordtest() {
		if (this.wleng == 4) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 5) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 6) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0)
					& (this.blank2[5] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 7) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0) & (this.blank2[5] != "" ? 1 : 0)
					& (this.blank2[6] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 8) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0) & (this.blank2[5] != "" ? 1 : 0)
					& (this.blank2[6] != "" ? 1 : 0) & (this.blank2[7] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 9) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0) & (this.blank2[5] != "" ? 1 : 0)
					& (this.blank2[6] != "" ? 1 : 0) & (this.blank2[7] != "" ? 1 : 0)
					& (this.blank2[8] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.wleng == 10) {
			if (((this.blank2[0] != "" ? 1 : 0) & (this.blank2[1] != "" ? 1 : 0) & (this.blank2[2] != "" ? 1 : 0)
					& (this.blank2[3] != "" ? 1 : 0) & (this.blank2[4] != "" ? 1 : 0) & (this.blank2[5] != "" ? 1 : 0)
					& (this.blank2[6] != "" ? 1 : 0) & (this.blank2[7] != "" ? 1 : 0) & (this.blank2[8] != "" ? 1 : 0)
					& (this.blank2[9] != "" ? 1 : 0)) != 0) {
				this.a.setEnabled(false);
				this.b.setEnabled(false);
				this.c.setEnabled(false);
				this.d.setEnabled(false);
				this.e.setEnabled(false);
				this.f.setEnabled(false);
				this.g.setEnabled(false);
				this.h.setEnabled(false);
				this.i.setEnabled(false);
				this.j.setEnabled(false);
				this.k.setEnabled(false);
				this.l.setEnabled(false);
				this.m.setEnabled(false);
				this.n.setEnabled(false);
				this.o.setEnabled(false);
				this.p.setEnabled(false);
				this.q.setEnabled(false);
				this.r.setEnabled(false);
				this.s.setEnabled(false);
				this.t.setEnabled(false);
				this.u.setEnabled(false);
				this.v.setEnabled(false);
				this.w.setEnabled(false);
				this.y.setEnabled(false);
				this.x.setEnabled(false);
				this.z.setEnabled(false);
				this.begin.setEnabled(true);
				this.win += 1;
				this.prosTemp = (this.win + this.loose);
				if (this.level == 0) {
					this.medium.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 1) {
					this.easy.setEnabled(true);
					this.hard.setEnabled(true);
				} else if (this.level == 2) {
					this.easy.setEnabled(true);
					this.medium.setEnabled(true);
				}
				repaint();
			}
		}
		if (this.guessesC <= 0) {
			this.a.setEnabled(false);
			this.b.setEnabled(false);
			this.c.setEnabled(false);
			this.d.setEnabled(false);
			this.e.setEnabled(false);
			this.f.setEnabled(false);
			this.g.setEnabled(false);
			this.h.setEnabled(false);
			this.i.setEnabled(false);
			this.j.setEnabled(false);
			this.k.setEnabled(false);
			this.l.setEnabled(false);
			this.m.setEnabled(false);
			this.n.setEnabled(false);
			this.o.setEnabled(false);
			this.p.setEnabled(false);
			this.q.setEnabled(false);
			this.r.setEnabled(false);
			this.s.setEnabled(false);
			this.t.setEnabled(false);
			this.u.setEnabled(false);
			this.v.setEnabled(false);
			this.w.setEnabled(false);
			this.y.setEnabled(false);
			this.x.setEnabled(false);
			this.z.setEnabled(false);
			this.blank2[0] = ("" + this.blank[0]);
			this.blank2[1] = ("" + this.blank[1]);
			this.blank2[2] = ("" + this.blank[2]);
			this.blank2[3] = ("" + this.blank[3]);
			this.blank2[4] = ("" + this.blank[4]);
			this.blank2[5] = ("" + this.blank[5]);
			this.blank2[6] = ("" + this.blank[6]);
			this.blank2[7] = ("" + this.blank[7]);
			this.blank2[8] = ("" + this.blank[8]);
			this.blank2[9] = ("" + this.blank[9]);
			this.begin.setEnabled(true);
			this.loose += 1;
			this.prosTemp = (this.win + this.loose);
			if (this.level == 0) {
				this.medium.setEnabled(true);
				this.hard.setEnabled(true);
			} else if (this.level == 1) {
				this.easy.setEnabled(true);
				this.hard.setEnabled(true);
			} else if (this.level == 2) {
				this.easy.setEnabled(true);
				this.medium.setEnabled(true);
			}
			repaint();
		}
		repaint();
	}

	public void actionPerformed(ActionEvent AE) {
		String str = AE.getActionCommand();
		if (str.equals("시작")) {
			this.blank[0] = ' ';
			this.blank[1] = ' ';
			this.blank[2] = ' ';
			this.blank[3] = ' ';
			this.blank[4] = ' ';
			this.blank[5] = ' ';
			this.blank[6] = ' ';
			this.blank[7] = ' ';
			this.blank[8] = ' ';
			this.blank[9] = ' ';
			this.blank2[0] = "";
			this.blank2[1] = "";
			this.blank2[2] = "";
			this.blank2[3] = "";
			this.blank2[4] = "";
			this.blank2[5] = "";
			this.blank2[6] = "";
			this.blank2[7] = "";
			this.blank2[8] = "";
			this.blank2[9] = "";
			this.prosTemp = 0;
			this.easy.setEnabled(false);
			this.medium.setEnabled(false);
			this.hard.setEnabled(false);
			if (this.level == 0) {
				this.guessesC = 10;
			} else if (this.level == 1) {
				this.guessesC = 8;
			} else if (this.level == 2) {
				this.guessesC = 6;
			}
			repaint();
			this.a.setEnabled(true);
			this.b.setEnabled(true);
			this.c.setEnabled(true);
			this.d.setEnabled(true);
			this.e.setEnabled(true);
			this.f.setEnabled(true);
			this.g.setEnabled(true);
			this.h.setEnabled(true);
			this.i.setEnabled(true);
			this.j.setEnabled(true);
			this.k.setEnabled(true);
			this.l.setEnabled(true);
			this.m.setEnabled(true);
			this.n.setEnabled(true);
			this.o.setEnabled(true);
			this.p.setEnabled(true);
			this.q.setEnabled(true);
			this.r.setEnabled(true);
			this.s.setEnabled(true);
			this.t.setEnabled(true);
			this.u.setEnabled(true);
			this.v.setEnabled(true);
			this.w.setEnabled(true);
			this.y.setEnabled(true);
			this.x.setEnabled(true);
			this.z.setEnabled(true);
			this.begin.setEnabled(false);
			makeblack();
		}
		if (str.equals("A")) {
			this.a.setEnabled(false);
			blackchange('a');
		}
		if (str.equals("B")) {
			this.b.setEnabled(false);
			blackchange('b');
		}
		if (str.equals("C")) {
			this.c.setEnabled(false);
			blackchange('c');
		}
		if (str.equals("D")) {
			this.d.setEnabled(false);
			blackchange('d');
		}
		if (str.equals("E")) {
			this.e.setEnabled(false);
			blackchange('e');
		}
		if (str.equals("F")) {
			this.f.setEnabled(false);
			blackchange('f');
		}
		if (str.equals("G")) {
			this.g.setEnabled(false);
			blackchange('g');
		}
		if (str.equals("H")) {
			this.h.setEnabled(false);
			blackchange('h');
		}
		if (str.equals("I")) {
			this.i.setEnabled(false);
			blackchange('i');
		}
		if (str.equals("J")) {
			this.j.setEnabled(false);
			blackchange('j');
		}
		if (str.equals("K")) {
			this.k.setEnabled(false);
			blackchange('k');
		}
		if (str.equals("L")) {
			this.l.setEnabled(false);
			blackchange('l');
		}
		if (str.equals("M")) {
			this.m.setEnabled(false);
			blackchange('m');
		}
		if (str.equals("N")) {
			this.n.setEnabled(false);
			blackchange('n');
		}
		if (str.equals("O")) {
			this.o.setEnabled(false);
			blackchange('o');
		}
		if (str.equals("P")) {
			this.p.setEnabled(false);
			blackchange('p');
		}
		if (str.equals("Q")) {
			this.q.setEnabled(false);
			blackchange('q');
		}
		if (str.equals("R")) {
			this.r.setEnabled(false);
			blackchange('r');
		}
		if (str.equals("S")) {
			this.s.setEnabled(false);
			blackchange('s');
		}
		if (str.equals("T")) {
			this.t.setEnabled(false);
			blackchange('t');
		}
		if (str.equals("U")) {
			this.u.setEnabled(false);
			blackchange('u');
		}
		if (str.equals("V")) {
			this.v.setEnabled(false);
			blackchange('v');
		}
		if (str.equals("W")) {
			this.w.setEnabled(false);
			blackchange('w');
		}
		if (str.equals("Y")) {
			this.y.setEnabled(false);
			blackchange('y');
		}
		if (str.equals("X")) {
			this.x.setEnabled(false);
			blackchange('x');
		}
		if (str.equals("Z")) {
			this.z.setEnabled(false);
			blackchange('z');
		}
		if (str.equals("EASY")) {
			this.easy.setEnabled(false);
			this.medium.setEnabled(true);
			this.hard.setEnabled(true);
			this.currentEnd = "Easy";
			this.level = 0;
			repaint();
		}
		if (str.equals("MEDIUM")) {
			this.medium.setEnabled(false);
			this.hard.setEnabled(true);
			this.easy.setEnabled(true);
			this.currentEnd = "Medium";
			this.level = 1;
			repaint();
		}
		if (str.equals("HARD")) {
			this.hard.setEnabled(false);
			this.medium.setEnabled(true);
			this.easy.setEnabled(true);
			this.currentEnd = "Hard";
			this.level = 2;
			repaint();
		}
	}
}