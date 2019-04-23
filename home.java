import javax.swing.*;

public class home {

   public static void home(){
       JFrame gui = new JFrame();
       gui.setVisible(true);
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setResizable(true);
       gui.setSize(1000,700);
       gui.setLocationRelativeTo(null);
       gui.setTitle("Project Management System");
   }
}

