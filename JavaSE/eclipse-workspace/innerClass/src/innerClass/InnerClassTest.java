package innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes.
 * @version 1.1 2017-11-26 Sun.
 * @author soundwave
 *
 */
public class InnerClassTest {

	public static void main(String[] args) {
		
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		// keep program running until user selects "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		
	}

}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock{
	private int interval;
	private boolean beep;
	
	/**
	 * Construct a talking clock
	 * @param interval the interval between message (in milliseconds)
	 *	@param beep true if the clock should beep
	 */
	public TalkingClock (int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Start the clock.
	 */
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tone, the time is " + new Date());
			Toolkit.getDefaultToolkit().beep();
		}
	}
}