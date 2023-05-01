import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToDoList toDoList = new ToDoList();

		System.out.println("-----------------------TO DO LIST--------------------------");
		while (true) {

			System.out.println("1. Add a task");
			System.out.println("2. Delete a task");
			System.out.println("3. Mark a task as complete");
			System.out.println("4. Exit");
			System.out.println("Choose an option:");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.println("Enter task name:");
				String name = scanner.nextLine();
				System.out.println("Enter task description:");
				String description = scanner.nextLine();
				Task task = new Task(name, description, false);
				toDoList.addTask(task);
			} else if (choice == 2) {
				toDoList.printTasks();
				System.out.println("Enter task index to delete:");
				int index = scanner.nextInt();
				toDoList.removeTask(index);
			} else if (choice == 3) {
				toDoList.printTasks();
				System.out.println("Enter task index to mark as complete:");
				int index = scanner.nextInt();
				toDoList.markTaskCompleted(index);
			} else if (choice == 4) {
				break;
			} else {
				System.out.println("Invalid choice.");
			}
		}

		System.out.println("Goodbye!");
	}
}
