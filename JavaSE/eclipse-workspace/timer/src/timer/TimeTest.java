package timer;
/**
 * @version 1.01 2017-11-15 Wed.
 * @author soundwave
 *
 */
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

// to resolve conflict with java.util.Timer

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = new TimePrinter();
		
		// construct a timer that calls the listener
		// once every 3 second
		Timer t = new Timer(3000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is " + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}
