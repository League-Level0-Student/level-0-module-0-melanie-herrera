package strings_and_dialogs;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Badger {
	public static void main(String[] args) {
		for (int a = 0; a < 4; a++) {

			for (int i = 0; i < 12; i++) {
				System.out.print("Badger");
			}
			System.out.println();
			if (a < 3) {

				for (int i = 0; i < 2; i++) {

					System.out.print("mushroom");
				}
			}
			System.out.println();
		}

		for (int a = 0; a < 2; a++) {
			System.out.print("A Snake ");
			
			System.out.println();
			
		}
	}
}
