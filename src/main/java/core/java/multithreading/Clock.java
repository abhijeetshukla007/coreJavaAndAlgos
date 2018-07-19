/**
 * 
 */
package core.java.multithreading;

/**
 * @author abhijeet
 *
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Clock extends java.applet.Applet implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private volatile Thread clockThread = null;
	DateFormat formatter; // Formats the date displayed
	String lastdate; // String to hold date displayed
	Date currentDate; // Used to get date to display
	Color numberColor; // Color of numbers
	Font clockFaceFont;
	Locale locale;

	@Override
	public void init() {
		setBackground(Color.white);
		numberColor = Color.red;
		locale = Locale.getDefault();
		formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
		currentDate = new Date();
		lastdate = formatter.format(currentDate);
		clockFaceFont = new Font("Sans-Serif", Font.PLAIN, 14);
		resize(275, 25);
	}

	@Override
	public void start() {
		if (clockThread == null) {
			clockThread = new Thread(this, "Clock");
			clockThread.start();
		}
	}

	@Override
	public void run() {
		Thread myThread = Thread.currentThread();
		while (clockThread == myThread) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		String today;
		currentDate = new Date();
		formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
		today = formatter.format(currentDate);
		g.setFont(clockFaceFont);

		// Erase and redraw
		g.setColor(getBackground());
		g.drawString(lastdate, 0, 12);

		g.setColor(numberColor);
		g.drawString(today, 0, 12);
		lastdate = today;
		currentDate = null;

	}

	@Override
	public void stop() {
		clockThread = null;
	}
}