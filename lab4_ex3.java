import java.util.Scanner;

class Menu{
  private String item;
  private double price;
  int qty; 
  
  Menu(String i, double p){
    item = i;
    price = p;
  }
  
  String getitem(){
  return item;
  }
  
  double getprice(){
  return price;
  }
  
  void settingmenu(String item, double price){
  this.item = item;
  this.price = price;
  }
  
  double calcprice(int qty){
  return price*qty;
  }
  
  }
  
  public class lab4_ex3{
    public static void main(String[] args){
    Scanner scanqty = new Scanner(System.in);
    int quantity;
    double price = 0.0;
    String item;
    double total_price = 0.0;
    
    //initialize menu
  Menu[] menu = new Menu[4];
  menu[0] = new Menu(" Nasi Lemak ", 2.00);
  menu[1] = new Menu(" Roti ", 1.00);
  menu[2] = new Menu(" Teh Tarik ", 1.50);
  menu[3] = new Menu(" Kopi O ", 1.00);
  
  System.out.println("Menu: ");
  System.out.println("-------------------------");
  System.out.println("[1] Nasi Lemak   [RM2.00]");
  System.out.println("[2] Roti         [RM1.00]");
  System.out.println("[3] Teh Tarik    [RM1.50]");
  System.out.println("[4] Kopi O       [RM1.00]");
  System.out.println("-------------------------");
  System.out.println("Place order [1-4] or type q to quit");
  
  char type;
  String order;
  Scanner scanorder = new Scanner(System.in);
  do{
    System.out.print("\nAdd order:  ");
    order = scanorder.nextLine();
    type = order.charAt(0);
    if(type == 'q')
    break;
    switch(type){
    case'1':
    System.out.print("\t"+menu[0].getitem()+ "- Quantity: ");
    quantity = scanqty.nextInt();
    System.out.printf("\n Price: RM %.1f \n", menu[0].calcprice(quantity));
    price += menu[0].calcprice(quantity);
    break;
    
    case'2':
    System.out.print("\t"+menu[1].getitem()+ " - Quantity: ");
    quantity = scanqty.nextInt();
    System.out.printf("\n Price: RM %.1f \n", menu[1].calcprice(quantity));
    price += menu[1].calcprice(quantity);
    break;
    
    case'3':
    System.out.print("\t"+menu[2].getitem()+ " - Quantity: ");
    quantity = scanqty.nextInt();
    System.out.printf("\n Price: RM %.1f \n", menu[2].calcprice(quantity));
    price += menu[2].calcprice(quantity);
    break;
    
    case'4':
    System.out.print("\t"+menu[3].getitem()+ " - Quantity: ");
    quantity = scanqty.nextInt();
    System.out.printf("\n Price: RM%.1f \n", menu[3].calcprice(quantity));
    price += menu[3].calcprice(quantity);
    break;

    }
    
    total_price += price;
  }while(type!='q');
  
    System.out.println("\nThank you for your order.");
    System.out.printf("Total due: RM %.2f", total_price);
 }
 }
  
  