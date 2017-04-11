import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Diamond extends Application {
	public void start(Stage primaryStage) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setContentText("Enter number of rows");
		dialog.showAndWait();
		String userinput = dialog.getResult();
		int input = Integer.parseInt(userinput);

		int count = input;
		int space = 0;
		int star;
		int starcount = 1;
		for (count = input; count > 0;) {
			for (space = count; space > 0; space--) {
				System.out.print(" ");
			}

			for (star = 1; star <= starcount;) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			starcount += 2;
			count--;

		}
		int count2 = input;
		int space2;
		int star2;
		int starcount2 = 1;

		for (count2 = 2; count2 <= input;) {
			for (space2 = count2; space2 > 0; space2--) {
				System.out.print(" ");
			}

			for (star2 = starcount - 4; star2 >= starcount2;) {
				System.out.print("*");
				star2--;
			}
			System.out.println();
			starcount2 += 2;
			count2++;
		}

	}
}
