import java.util.Scanner;

public class Question6 {
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
       int choice;

        String[] items = { "laptop", "mice", "keyboard", "monitor" };
        int[] qty = { 100, 90, 95, 75 };
        double[] price = { 999.9, 856.55, 555.5, 7586.56 };

        
        while(true){
             System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Sell Item");
            System.out.println("4. Low Stock Alert");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = sc.nextInt();
        
        switch (choice)
        {
            case 1 :
             for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " | qty " + qty[i] + " | price " + price[i]);

        }
        break;

        case 2 :
        System.out.println("choose the itme to restock");
        int ritem= sc.nextInt();
        for (int i = 0; i < qty.length; i++) {
        if(i==ritem){
            System.out.println("add on");
        int restock= sc.nextInt();
        restock += qty[i];
        System.out.println( "restocked = "+ restock);

        }


    }
         break;

        case 3 :
        System.out.println("choose the itme to restock");
        int sitem= sc.nextInt();
        for (int i = 0; i < qty.length; i++) {
        if(i==sitem){
            System.out.println("sale items");
        int restock= sc.nextInt();
        qty[i] -= restock;
        System.out.println( "restocked = "+ qty[i]);
        if (qty[i] < 50){
            System.out.println("low stock alrt");
        }

        }


    }



    }
}
}
}