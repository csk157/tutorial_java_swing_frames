package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private JButton btnShow;
	private JLabel lblEnter, lblResult;
	private JTextField txtWord;
	private JPanel content;

	public MainFrame() {
		// The title that you see on the top of the window
		this.setTitle("TheySeeMeCodin.com tutorial - Simple GUI");

		// Terminates this program when you close the window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Sets size of the window in pixels. 400px width and 300px height
		this.setSize(400, 300);

		// Sets location where the window appears. Left top corner of the window
		// will be 100px (to the right and down) from top left corner of the
		// screen
		this.setLocation(100, 100);

		// Note that following method combines two of the previous and could be
		// used instead
		// this.setBounds(100, 100, 400, 300);

		// We will be using absolute layout, so we set it to null
		this.setLayout(null);

		// Content pane of this instance of JFrame
		// It is where all GUI elements are added
		content = (JPanel) this.getContentPane();

		// Label above text field, used just to make it clear to user what to do
		lblEnter = new JLabel("Enter word here:");
		lblEnter.setBounds(5, 5, 200, 10); // placing and defining it's size
		content.add(lblEnter); // adding it to content pane

		// Text field where user enters some text input
		txtWord = new JTextField();
		txtWord.setBounds(5, 20, 300, 25);
		content.add(txtWord);

		// Button when we click it something will happen
		btnShow = new JButton("Show");
		btnShow.setBounds(5, 60, 375, 30);
		content.add(btnShow);

		// Label for showing results. It will be empty until we put something
		// inside (after we click the button)
		lblResult = new JLabel();
		lblResult.setBounds(5, 200, 375, 20);
		content.add(lblResult);

		// Assigning anonymous instance of Action listener to button
		btnShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// We create a variable containing text from our text field
				String txt = txtWord.getText();

				// We set text for a result label (now it will show anything we
				// had in text field just in upper case)
				lblResult.setText(txt.toUpperCase());
			}
		});
	}
}
