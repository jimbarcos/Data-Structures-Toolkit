package machine_problem1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Array extends javax.swing.JFrame {
    int counter = 0, num_counter = 1, delete_counter = 0;
    boolean exist = false;
    int[] array = null;
    
    public Array() {
        initComponents();
        setDefaultCloseOperation(Array.EXIT_ON_CLOSE);
        setSize (930, 530);
        setLocationRelativeTo(null);
        setLayout (null);
        setResizable(false);
        setTitle("Machine Problem #1 - Barcos, Jim Aerol S.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Display = new javax.swing.JButton();
        Btn_Create = new javax.swing.JButton();
        Btn_Insert = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        Btn_Search = new javax.swing.JButton();
        Btn_Back = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Txt_Area = new javax.swing.JTextArea();
        Image_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Display.setBackground(new java.awt.Color(255, 102, 51));
        Btn_Display.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Btn_Display.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Display.setText("(5) Display the Array");
        Btn_Display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        Btn_Display.setFocusable(false);
        Btn_Display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_DisplayMouseClicked(evt);
            }
        });
        Btn_Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DisplayActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 210, 70));

        Btn_Create.setBackground(new java.awt.Color(255, 102, 51));
        Btn_Create.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        Btn_Create.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Create.setText("(1) Create an Empty Array");
        Btn_Create.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        Btn_Create.setFocusable(false);
        Btn_Create.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CreateMouseClicked(evt);
            }
        });
        Btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CreateActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 70));

        Btn_Insert.setBackground(new java.awt.Color(255, 102, 51));
        Btn_Insert.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Insert.setText("(2) Insert elements");
        Btn_Insert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        Btn_Insert.setFocusable(false);
        Btn_Insert.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InsertMouseClicked(evt);
            }
        });
        Btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 70));

        Btn_Delete.setBackground(new java.awt.Color(255, 102, 51));
        Btn_Delete.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete.setText("(3) Delete an element");
        Btn_Delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        Btn_Delete.setFocusable(false);
        Btn_Delete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_DeleteMouseClicked(evt);
            }
        });
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 70));

        Btn_Search.setBackground(new java.awt.Color(255, 102, 51));
        Btn_Search.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        Btn_Search.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Search.setText("(4) Search for an element");
        Btn_Search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        Btn_Search.setFocusable(false);
        Btn_Search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SearchMouseClicked(evt);
            }
        });
        Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 70));

        Btn_Back.setBackground(new java.awt.Color(255, 204, 102));
        Btn_Back.setFont(new java.awt.Font("Segoe UI Symbol", 1, 60)); // NOI18N
        Btn_Back.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Back.setText("←");
        Btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_BackMouseExited(evt);
            }
        });
        getContentPane().add(Btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 50));

        jLabel5.setBackground(new java.awt.Color(255, 204, 102));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Array");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        Txt_Area.setEditable(false);
        Txt_Area.setBackground(new java.awt.Color(255, 239, 135));
        Txt_Area.setColumns(20);
        Txt_Area.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Txt_Area.setLineWrap(true);
        Txt_Area.setRows(1);
        Txt_Area.setToolTipText("");
        Txt_Area.setWrapStyleWord(true);
        Txt_Area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 0, 0), 5, true));
        Txt_Area.setDragEnabled(true);
        Txt_Area.setFocusable(false);
        jScrollPane7.setViewportView(Txt_Area);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 640, 390));

        Image_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image-930x500.jpg"))); // NOI18N
        Image_BG.setPreferredSize(new java.awt.Dimension(930, 530));
        getContentPane().add(Image_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 500));
        Image_BG.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DisplayActionPerformed

    private void Btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_InsertActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SearchActionPerformed

    private void Btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BackMouseClicked
        Menu logFrame = new Menu();
        logFrame.pack();
        logFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_BackMouseClicked

    private void Btn_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BackMouseEntered
        Btn_Back.setFont(new Font("Segoe UI Symbol", Font.BOLD, 60));
        Btn_Back.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_Btn_BackMouseEntered

    private void Btn_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BackMouseExited
        Btn_Back.setFont(new Font("Segoe UI Symbol", Font.BOLD, 60));
        Btn_Back.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_Btn_BackMouseExited

    private void Btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CreateActionPerformed

    private void Btn_CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CreateMouseClicked
        if (exist){
            if (JOptionPane.showConfirmDialog(null, "Create A new empty Array? (This will overwrite the previous array)", "Create Array", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
               exist = false;
            }
        }
        
        if (exist == false) {
            array = new int[2056];
            Txt_Area.setText(Txt_Area.getText() + "• Successfully Completed Creating An empty array\n\n");
            JOptionPane.showMessageDialog(null, "Successfully Completed Creating An empty array", "Create Array", JOptionPane.INFORMATION_MESSAGE);
            exist = true;
            num_counter = 1;
        }
        
        
        
    }//GEN-LAST:event_Btn_CreateMouseClicked

    private void Btn_InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InsertMouseClicked
        try{
            if (exist){
            String userInput = JOptionPane.showInputDialog(null, "Please enter the element #" + (num_counter), "Insert element - Array", JOptionPane.INFORMATION_MESSAGE);
            try {
                int int_Input = Integer.parseInt(userInput);
                array[num_counter - 1] = int_Input;  
                num_counter++;
                Txt_Area.setText(Txt_Area.getText() + "• Value " + int_Input + " inserted in the array \n\n");
                
              } catch (Exception e) {
                // Handle the exception if the user input cannot be converted to an integer
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Insert element - Array", JOptionPane.INFORMATION_MESSAGE);
              }
            
            } else {
                JOptionPane.showMessageDialog(null, "Please Create first an empty array", "Insert element - Array", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Insert element - Array", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_Btn_InsertMouseClicked

    private void Btn_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_DeleteMouseClicked
        if (exist && (num_counter > 1)){
           String userInput = JOptionPane.showInputDialog(null, "Enter the element to delete: " , "Delete element - Array", JOptionPane.INFORMATION_MESSAGE);
            int remove = -1;
            try {
                int int_Input = Integer.parseInt(userInput);
                boolean found = false;

                // Check if the input element is present in the array
                for (int i = 0; i < num_counter - 1; i++) {
                    if (array[i] == int_Input) {
                        found = true;
                        // Remove the current occurrence of the element
                        for (int j = i; j < num_counter - 1; j++) {
                            array[j] = array[j + 1];
                        }
                        num_counter--; // Decrement the counter
                        i--; // Adjust the loop index since an element has been removed
                    }
                }

                // Display appropriate message based on whether the element was found or not
                if (found) {
                    Txt_Area.setText(Txt_Area.getText() + "• Element deleted successfully.\n\n");
                } else {
                    Txt_Area.setText(Txt_Area.getText() + "• Element not found in the array.\n\n");
                }

              } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Delete element - Array", JOptionPane.INFORMATION_MESSAGE);
              }

            
        } else {
            JOptionPane.showMessageDialog(null, "Please Create & insert values first on the array", "Delete Array", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Btn_DeleteMouseClicked

    private void Btn_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SearchMouseClicked
        try{
            if (exist){
            String userInput = JOptionPane.showInputDialog(null,"Enter the element to search: ", "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
            boolean found = false;
            try {
                int int_Input = Integer.parseInt(userInput);
                for (int i = 0; i < num_counter - 1; i++) {
                    if (array[i] == int_Input) {
                      Txt_Area.setText(Txt_Area.getText() + "• Value " + int_Input + " found at element " + i + " or index " + (i+1) + "\n\n");
                      JOptionPane.showMessageDialog(null, "Value " + int_Input + " found at element " + i + " or index " + (i+1), "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
                      found = true;
                    }
                }
                if (!found) {
                  Txt_Area.setText(Txt_Area.getText() + "• Value not found in the array.\n\n");
                  JOptionPane.showMessageDialog(null, "Value not found in the array.", "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
                }

              } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
              }
            
            } else {
                JOptionPane.showMessageDialog(null, "Please Create first an empty array", "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Search element - Array", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_Btn_SearchMouseClicked

    private void Btn_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_DisplayMouseClicked
        if (exist){
            try {
                Txt_Area.setText(Txt_Area.getText() + "• Values of the Array: [  ");
                for (int i = 0; i < num_counter - 1; i++) {
                    Txt_Area.setText(Txt_Area.getText()  + String.valueOf(array[i]) + " ");
                }        
                Txt_Area.setText(Txt_Area.getText() + "]\n\n");
              } catch (Exception e) {
                // Handle the exception if the user input cannot be converted to an integer
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Display element - Array", JOptionPane.INFORMATION_MESSAGE);
              }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Please Create first an empty array", "Display element - Array", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Btn_DisplayMouseClicked


    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Back;
    private javax.swing.JButton Btn_Create;
    private javax.swing.JButton Btn_Delete;
    private javax.swing.JButton Btn_Display;
    private javax.swing.JButton Btn_Insert;
    private javax.swing.JButton Btn_Search;
    private javax.swing.JLabel Image_BG;
    private javax.swing.JTextArea Txt_Area;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
