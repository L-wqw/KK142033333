import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cake extends JPanel {

    
abstract class Cake extends JFrame{
   String name;
   String[] topping;
   String[] toppingOrder;
   double priceSmall;
   double priceMedium;
   double priceBig;
   double totalPrice;
   int size;
   int quantity;
   
   public Cake() {
        //construct components
        print = new JButton ("print");

        //adjust size and set layout
        setPreferredSize (new Dimension (664, 360));
        setLayout (null);

        //add components
        add (print);

        //set component bounds (only needed by Absolute Positioning)
        print.setBounds (500, 285, 100, 25);
    }

   Cake(String name){
      this.name = name;                   
      setTitle("Cake App");
      getContentPane().setBackground(Color.white);
      setSize(600, 600);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      setVisible(true);
   }}
   
   public void setCake(String[] t, double ps, double pm, double pb){
      topping = t;
      priceSmall = ps;
      priceMedium = pm;
      priceBig = pb;      
   }
   
   public void cakeOrder(String[] to, int q, int s){
      toppingOrder = to;
      quantity = q;
      size = s;
   }
   
   public double getSizePrice(){
      double sprice=0.0;
      if(size==1) sprice = priceSmall;
      else if(size==2) sprice = priceMedium;
      else if(size==3) sprice = priceBig;
      
      return sprice;
   }
   
   public double getTotalPrice(){
      totalPrice = getSizePrice() *= quantity+(toppingOrder.length*10);
      return totalPrice;  
   }
   
   public int getQuantity(){
      return quantity;  
   }
   
   public String getSize(){
      String size_str="";
      if(size==1) size_str="Small";
      else if (size==2) size_str="Medium";
      else if (size==3) size_str="Large";
      return size_str;
   }
   
   public void printCake(){
      System.out.println("-----------------------------");
      System.out.println("           Cake Menu");
      System.out.println("-----------------------------");
      System.out.println(name + " Cake with available toppings:");
      for(int i=0; i<topping.length; i++){
         System.out.println(i+1 + ") " + topping[i]);
      } 
      System.out.println("\nPrice:");
      System.out.println("[1] Small : RM" + priceSmall);
      System.out.println("[2] Medium: RM" + priceMedium);
      System.out.println("[3] Big   : RM" + priceBig);
   }
   
  
   public void printOrder(){
      System.out.println("\n\nCake Order detail:");
      System.out.println("-------------------------------------------");
      System.out.print("Topping Order: ");
      for(int i=0; i<toppingOrder.length; i++){
         System.out.print(i+1 + ") " + toppingOrder[i] + " ");
      } 
      System.out.println("\nSize    : " + getSize());
      System.out.println("-------------------------------------------");
      System.out.println("Total Price: RM" + getTotalPrice()); 
      System.out.println("-------------------------------------------"); 
   } 
   
  
   public String printOrder_GUI(){
      String txt = "\n\nCake Order detail:\n";
      txt += "-------------------------------------------\n";
      txt += "Topping Order: \n";
      for(int i=0; i<toppingOrder.length; i++){
         txt += "(" + (i+1) + ") " + toppingOrder[i] + " \n";
      } 
      txt += "\nSize        : " + getSize() + "\n";
      txt += "Quantity : " + getQuantity() + "\n";
      txt += "-------------------------------------------\n";
      txt += "Total Price: RM" + getTotalPrice() + "\n"; 
      txt += "-------------------------------------------\n"; 
      return txt;
   }      
   print.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent pr){
              JFrame popup = new JFrame();
              filename=JOptionPane.showInputDialog(popup,"Enter the file name: ");
              if(filename==null)   
                 popup.dispose();
              else
                 writeData();
            }
       });
}
  public void writeData(){
      File file = new File(filename);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
      
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println(save);
         System.out.println("Order successfully print to " + filename);
		} catch (IOException pr) {			
         System.out.println(pr.toString());
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (IOException pr) {
				System.out.println("File not found!");
			}catch(NullPointerException f){
            System.out.println("Cannot be empty!");
         }
		}
   }
}
public class CakePrint{
      public static void main (String[] args) {
        JFrame frame = new JFrame ("lab_ex6");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CakePrint());
        frame.pack();
        frame.setVisible (true);
        
        Cake c = new Cake("Generic");

      String[] topping = {"Lava Chocolate", "Cream Cheese", "Butter Cream", "Fondant"};
      c.setCake(topping, 45.00, 65.00, 80.00);
      c.printCake();

      String[] order = {"Lava Chocolate", "Cream Cheese"};
      c.cakeOrder(order, 1, 2);
      c.printOrder();  
    }
   }
}