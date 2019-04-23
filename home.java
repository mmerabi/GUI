import javax.swing.*;

public class home {

   home(){ //constructor for the baseframe to be used on all pages
       JFrame gui = new JFrame("Project Management System");
       gui.setVisible(true);
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setResizable(true);
       gui.setSize(1200,1000);
       gui.setLocationRelativeTo(null);
   }

   public static void frontpage(){
       home homepage = new home();
       SpringLayout layout = new SpringLayout();

       JButton redirectHome = new JButton("Home");
       JButton redirectDeliverables = new JButton("Deliverables");
       JButton redirectActItems = new JButton("Action Items");
       JButton redirect2 = new JButton("Button4");
       JButton Redirect3 = new JButton("Button5");
   }
}

