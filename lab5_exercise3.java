
class BlackForest{
   String name;
   String[] topping;
   String[] Order;
   double Small;
   double Medium;
   double Big;
   double total;
   int size;
   int qty;
   double type =0.0;
   
   BlackForest(String name){
   this.name=name;
   }
     
   public class BlackForest extends cake{
     BlackForest(String name){
    super(name);}
  }
   
   void setCake(String[] t, double s, double m, double b){
      topping = t;
      Small = s;
      Medium = m;
      Big = b;
   }
   
   void cakeOrder(String[] o, int q, int s){
      Order = o;
      qty = q;
      size = s;
   }
   
   double getSizeP(){
      if(size==1) 
      type = Small;
      else if(size==2) 
      type = Medium;
      else if(size==3) 
      type = Big;
      
      return type;
   }
   
   double getTotalPrice(){
      total = getSizeP()*= qty;
      total += (Order.length*10);
      return total;  
   }
   
   public String getSize(){
      String Cakesize="";
      if(size==1) Cakesize="Small";
      else if (size==2) Cakesize="Medium";
      else if (size==3) Cakesize="Large";
      return Cakesize;
   }
   
   public void printCake(){
      for(int i=0;i<20;i++)System.out.println("-");
      System.out.println("           Cake Menu");
      for(int i=20;i>0;i--)System.out.println("-");
      System.out.println(name + " Cake with available toppings:");
      for(int i=0; i<topping.length; i++){
         System.out.println(i+1 + ") " + topping[i]);
      } 
      System.out.println("\nPrice:");
      System.out.println("[1] Small : RM" + Small);
      System.out.println("[2] Medium: RM" + Medium);
      System.out.println("[3] Big   : RM" + Big);
   }
   
   public void printOrder(){
      System.out.println("\n\nCake Order detail:");
      for(int i=0;i<30;i++)
      System.out.println("-");
      System.out.print("Topping : ");
      for(int i=0; i<Order.length; i++){
         System.out.print(i+1 + ") " + Order[i] + " ");
      } 
      System.out.println("\nSize    : " + getSize());
      for(int i=0;i<30;i++)
      System.out.print("-");
      System.out.println("Total Price: RM" + getTotalPrice()); 
      for(int i=0;i<30;i++)
      System.out.println("-"); 
   }
  

}      

  public class lab5_exercise3{
   public static void main(String args[]){
   BlackForest c = new BlackForest("BlackForest");
   String[] topping = {"Chocolate", "Cherries", "Whipped Cream"};
   c.setCake(topping, 45.00, 65.00, 80.00);
   
   c.printCake();
 
   String[] order = {"Chocolate", "Cherries"};
   c.cakeOrder(order, 1, 2);
   c.printOrder(); 
}}
