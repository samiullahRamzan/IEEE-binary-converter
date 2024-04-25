
package app;

import javax.swing.JOptionPane;

public class BtoD extends javax.swing.JFrame {

    public BtoD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IEEE-754 Converter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IEEE-754 Binary to decimal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 60, 334, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Binary");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 125, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 125, 229, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hexadecimal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 162, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 163, 176, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Result :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 211, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 257, 227, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Decimal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 256, -1, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\zubair farooq\\Pictures\\Camera Roll\\png.PNG")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 640, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().trim().isEmpty()&&jTextField2.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(BtoD.this, "Please enter the number");
        }
        String s= jTextField1.getText();
        String a = jTextField2.getText();
        if(a.isEmpty()&&s.isEmpty()) {
            jTextField1.setText("");
            jTextField2.setText("");
        }
        if(s.isEmpty()){ //if-else condition to decide which conversion has to be occur
        
            //here the hexadecimal to decimal conversion starts
        if(a.charAt(0)=='-');{ //excluding'-' sign to convert easily
            a = a.replace("-", "");
        }
        String hex="";
        String hex1 ="";
        char n=' '; 
        for(int i = 0;i<a.length();i++){ //loop to seperate the integer & floating part of hexadecimal 
            if(a.charAt(i)!='.'&& n!='.'){
                hex = hex + a.charAt(i);
            } else if( a.charAt(i)=='.') {
                n='.';
            } else if(a.charAt(i)!='.'&& n=='.') {
                hex1 = hex1 + a.charAt(i);
            }
        }
          double  n1 = (hex.length()-1);
          double sum=0;
        for(int i = 0;i<hex.length();i++){ //loop to convert decimal part of hexadecimal into decimal 
            if(hex.isEmpty()) break;
            if(hex.charAt(i)>'0'&&hex.charAt(i)<='9') {
                String a2 = Character.toString((hex.charAt(i)));
                Double num = Double.parseDouble(a2);
                num = num*(Math.pow(16.0,n1));
                sum = sum + num;
                n1--;
            } else if(hex.charAt(i)>='A'&&hex.charAt(i)<='F') {
                double num=1;
                if(hex.charAt(i)=='A'){num=10;}
                else if(hex.charAt(i)=='B'){num=11;}
                else if(hex.charAt(i)=='C'){num=12;}
                else if(hex.charAt(i)=='D'){num=13;}
                else if(hex.charAt(i)=='E'){num=14;}
                else if(hex.charAt(i)=='F'){num=15;}
                    
                num = num*(Math.pow(16.0,n1));
                sum = sum + num;
                n1--;
            }  
        }
        
         double  n2 = -1;
         double sum1=0;
        for(int i = 0;i<hex1.length();i++){ //loop to convert floating part of hexadecimal into decimal 
            if(hex1.charAt(i)>'0'&&hex1.charAt(i)<='9'){
                String a1 = Character.toString((hex1.charAt(i)));
                Double num = Double.parseDouble(a1);
                num = num*(Math.pow(16.0,n2));
                sum1 = sum1 + num;
                n2--;
            } else if(hex1.charAt(i)>='A'&&hex1.charAt(i)<='F') {
                double num=1;
                if(hex1.charAt(i)=='A'){num=10;}
                else if(hex1.charAt(i)=='B'){num=11;}
                else if(hex1.charAt(i)=='C'){num=12;}
                else if(hex1.charAt(i)=='D'){num=13;}
                else if(hex1.charAt(i)=='E'){num=14;}
                else if(hex1.charAt(i)=='F'){num=15;}
                    
                num = num*(Math.pow(16.0,n2));
                sum1 = sum1 + num;
                n2--;
            }  
        }
            double s1= sum+sum1;
            String str = "" + String.format("%.7f", s1);
            jTextField3.setText(str);
            
        } else{
            
            //here the IEEE- binary to decimal conversion starts
            String sign="";
            if(s.charAt(0)=='0'){sign="";}
            else if(s.charAt(0)=='1'){sign="-";}
         
         String bin="",bin1= "";
         for(int i=1;i<=8;i++){ //loops to seperate IEEE number
             bin = bin + s.charAt(i);
         }
         for(int i=9;i<s.length();i++){
             bin1 = bin1 + s.charAt(i);
         }
         double sum=0;
         double n = (bin.length()-1);
         for( int i=0;i<bin.length();i++) { //loop to convert exponent into decimal equivalent
              String a1 = Character.toString((bin.charAt(i)));
              Double num = Double.parseDouble(a1);
              num = num*(Math.pow(2.0,n));
              sum = sum + num;
              n--;
         }
         double sum4 = sum-127;
         int sum1 =(int)sum4;
         System.out.println(sum1);
         String b = ""+sum1;
         if( b.charAt(0)== '-') //excluding '-' sign to convert easily
             b = b.replace("-", "");
         Integer num2 = Integer.parseInt(b);
         
         String bin2="";
         bin2 = bin2 +"1."+bin1; //adding the '1.' to number which was removed i decimal to IEEE conversion
         Double binary = Double.parseDouble(bin2);
         System.out.println(bin2);
         
         for(int j=0;j<num2;j++){ 
             if(sum>127){ //if-else condition to check that exponent is negative or positive
                 binary = binary *10;
             } else if(sum<127) {
                 binary = binary /10;
                 if(sum1<-21) {
                     jTextField3.setText("");
                   JOptionPane.showMessageDialog(BtoD.this, "Very short number, Please enter larger number");
                   
                   break;
                 }
                     
             }
         }
         
         
        String string =""+String.format("%.21f", binary);
        System.out.println(binary);
        String hex= "",hex1 = "";
        char n1=' '; 
        for(int i = 0;i<string.length();i++) //loop to seperate the floating & decimal part of binary number genearted
        {
            if(string.charAt(i)!='.'&& n1!='.') {
                hex = hex + string.charAt(i);
            } else if( string.charAt(i)=='.') {
                n1='.';
                System.out.println(n1);
            } else if(string.charAt(i)!='.'&& n1=='.') {
                hex1 = hex1 + string.charAt(i);
            }
        }
         
         double n2 = (hex.length()-1);
         double sum2=0;
         for( int i=0;i<hex.length();i++){ //loop to convert decimal part
             if(hex.isEmpty()) break;
             else{
              String a1 = Character.toString((hex.charAt(i)));
              Double num = Double.parseDouble(a1);
              num = num*(Math.pow(2.0,n2));
              sum2 = sum2 + num;
              n2--;}
         }
         double n3 = -1;
         double sum3=0;
         for( int i=0;i<hex1.length();i++) { //loop to convert floating part
              String a1 = Character.toString((hex1.charAt(i)));
              Double num1 = Double.parseDouble(a1);
              num1 = num1*(Math.pow(2.0,n3));
              sum3 = sum3 + num1;
              n3--;
         }
         double sum5 =sum2+sum3;
         String b4=""+sign+ String.format("%.7f", sum5);
         if(sum1<-21) jTextField3.setText("");
         else jTextField3.setText(b4);
             
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c)|| (c<'0'&&c>'1'))
        {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(BtoD.this, "Invalid input!! Please enter only number");
            jTextField1.setEditable(true);
        }
        else 
        {
            jTextField1.setEditable(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BtoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BtoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BtoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BtoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BtoD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
