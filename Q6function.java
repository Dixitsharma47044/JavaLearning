import java.util.Scanner;

public class Q6function {

    static String[] items = { "laptop", "mice", "keyboard", "monitor" };
    static int[] qty = { 100, 90, 95, 75 };
    static double[] price = { 999.9, 856.55, 555.5, 7586.56 };
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int choice;
        boolean  running = true;
        while (running) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Sell Item");
            System.out.println("4. Low Stock Alert");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    restockItem();
                    break;
                case 3:
                    sellItem();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        System.out.println("Completed");
    }

    public static void viewInventory() {

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " | qty " + qty[i] + " | price " + price[i]);
        }

    }

    public static void restockItem() {
        System.out.print("Enter the item number to restock: ");
        int ritem = sc.nextInt();
        if (ritem >= 0) {
            System.out.print("Enter quantity to add: ");
            int addQty = sc.nextInt();
            qty[ritem] += addQty;
            System.out.println("Restocked = " + qty[ritem]);
        }
    }

    public static void sellItem() {
        System.out.println("choose the itme to sell");
        int sitem = sc.nextInt();
        for (int i = 0; i < qty.length; i++) {
            if (i == sitem) {
                System.out.println("sale items");
                int restock = sc.nextInt();
                qty[i] -= restock;
                System.out.println("restocked = " + qty[i]);
                if (qty[i] < 50) {
                    System.out.println("low stock alrt");
                }

            }

        }
    }
}