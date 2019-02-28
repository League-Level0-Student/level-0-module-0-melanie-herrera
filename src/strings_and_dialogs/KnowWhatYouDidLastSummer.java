package strings_and_dialogs;

import javax.swing.JOptionPane;

public class KnowWhatYouDidLastSummer {
	public static void main(String[] args) {
String name=JOptionPane.showInputDialog(null,"what is your name");
JOptionPane.showMessageDialog(null, "I know what you did last summer");
JOptionPane.showMessageDialog(null, name+" you whent to the zoo");
	}

}
