

import javax.swing.*;
import java.awt.*;

public class home {

    //constructor for the baseframe to be used on all pages
   home(){
       //Setting up basic program parameters
       JFrame gui = new JFrame("Project Management System");
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setVisible(true);
       gui.setResizable(true);
       gui.setSize(1200,1000);
       gui.setLocationRelativeTo(null);


       /*setting up base left handed toolbar and layout manager
       maybe have this in each individual page? to avoid layout manager conflict */
       Container contentPane = gui.getContentPane();
       SpringLayout layout = new SpringLayout();
       contentPane.setLayout(layout);

       JButton redirectHome = new JButton("      Home      ");
       contentPane.add(redirectHome);

       JButton redirectDeliverables = new JButton("Deliverables");
       contentPane.add(redirectDeliverables);

       JButton redirectActItems = new JButton("Action Items");
       contentPane.add(redirectActItems);

       JButton redirect2 = new JButton("    Button4     ");
       contentPane.add(redirect2);

       JButton redirect3 = new JButton("    Button5     ");
       contentPane.add(redirect3);

       //Layout Manager for alignment
       layout.putConstraint(SpringLayout.NORTH,redirectHome,
                        25,
                            SpringLayout.WEST,contentPane);

       layout.putConstraint(SpringLayout.NORTH,redirectDeliverables,
                        35,
                            SpringLayout.SOUTH,redirectHome);

       layout.putConstraint(SpringLayout.NORTH,redirectActItems,
                        35,
                            SpringLayout.SOUTH,redirectDeliverables);

       layout.putConstraint(SpringLayout.NORTH,redirect2,
                        35,
                            SpringLayout.SOUTH,redirectActItems);

       layout.putConstraint(SpringLayout.NORTH,redirect3,
                        35,
                            SpringLayout.SOUTH,redirect2);


   }

   public static void frontpage(){
       home homepage = new home();


   }
}

