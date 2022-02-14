package virtualKey;

import java.util.Scanner;

public class WelcomeScreen {

	public void Intro() {
		String AppName = "Virtual Key For Repositories";
		String DeveloperName = "Rav kashyap";
		System.out.println("___________________________________________________________");
		System.out.println("  !Welcome to the " + AppName + " applicaiton! \n  ");
		System.out.println("  Developer: " + DeveloperName + "                                   ");
		System.out.println("___________________________________________________________");
	}

	public void MainMenu() {
		System.out.println("\nMain Menu");
		System.out.println("1.Show files\n2.File Options Menu\n3.Exit\n");
		boolean running = true;
		Scanner option = new Scanner(System.in);
		do {
			try {
				int input = option.nextInt();
				switch (input) {
				case 1:
					this.ShowFiles();
					this.MainMenu();
					break;
				case 2: // pending
					FileOptionsMenu FileMenu = new FileOptionsMenu();
					FileMenu.show();
					break;
				case 3:
					System.out.println("Quitting the application....");
					System.out.println("Are you sure? Y/N");
					Scanner sure = new Scanner(System.in);
					String s = sure.nextLine();
					if (s.equals("y") || s.equals("Y")) {
						System.out.println("Applicaiton terminated");
						running = false;
						System.exit(0);
					} else {
						MainMenu();
					}
				default:
					System.out.println("Invalid option,please enter invalid option");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName() + ": Please enter a valid option");
				MainMenu();

			}
		} while (running == true);
	}

	private void ShowFiles() {
		Directory obj = new Directory(); // Retrieve files from directory
		obj.getFiles();
	}
}
