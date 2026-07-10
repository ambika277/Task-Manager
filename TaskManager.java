import java.util.*;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void createTask() {

        System.out.print("Enter task name:");
        String task = sc.nextLine();

        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No Tasks Available!");
            return;

        }
        System.out.println("Tasks list:");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));

        }
    }

    public static void updateTask() {

        viewTasks();

        System.out.print("Enter task number to update:");
        int index = sc.nextInt();
        sc.nextLine();

        if (index > 0 && index <= tasks.size()) {

            System.out.print("Enter new task:");
            String task = sc.nextLine();

            tasks.set(index - 1, task);

            System.out.println("Task updated successfully!");
        }
    }

    public static void deleteTask() {

        viewTasks();

        System.out.print("Enter task number to delete:");
        int index = sc.nextInt();
        sc.nextLine();

        if (index > 0 && index <= tasks.size()) {

            tasks.remove(index - 1);

            System.out.println("Task deleted successfully!");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("=== Task Manager ===");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }
    }

}