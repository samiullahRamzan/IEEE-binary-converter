
package app;

import javax.swing.JOptionPane;
public class DtoB extends javax.swing.JFrame {

    public DtoB() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IEEE-754 Converter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Decimal Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 114, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Decimal to IEEE-754 Binary");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 115, 176, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Result :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 152, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Binary");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 183, 109, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hexadecimal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 288, 98, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 251, 253, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 289, 212, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 338, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 338, -1, -1));

        jButton3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 340, -1, -1));

        jTextField4.setText(" ");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 251, 97, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 251, 31, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 184, 223, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SignBit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 224, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Exponent");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 224, 88, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mantessa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 224, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\zubair farooq\\Pictures\\Camera Roll\\png.PNG")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -2, 640, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jTextField1.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(DtoB.this, "Please enter the number");
        }
        String a = jTextField1.getText();
        
        //here decimal to IEEE-binary conversiuon starts
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int[] arr3 = new int[100];
        int[] arr4 = new int[100];
        int signbit;
        if(a.charAt(0)!='-') {signbit=0;} //checking for the sign bit
        else { signbit =1; }
         String a2 = jTextField1.getText();
        if(a2.charAt(0)=='-');{ //excluding the '-' sign to convert easily
            a2 = a2.replace("-", "");
        }
        Double value = Double.parseDouble(a2); //converting string into double
        double d = value; //here seperating the decimal and floating part
    if(d>1.0)
     {
         double f;
        int i = (int) d;
        f = (d-i);
        int count =0;
        while(i>0){ //loop to convert decimal part into binary
            arr1[count] = i % 2;
            i=i/2;
            count++;
        }
        int exp = 127+(count-1);
        int count1=0;
        while(exp>0){ //loop to convert  exponent into binary
            arr3[count1] = exp%2;
            exp = exp/2;
            count1++;
        }
        int count2=0;
        double b = f;
        int val;
        while(b!=0.0&&b!=1.0){ //loop to convert floating part into binary
            b = b*2;
            val = (int)b;
            if(val == 1){
                arr2[count2] = 1;
            }else if(val == 0){
                arr2[count2] = 0;
            }
            b= b-val;
            if(count2==7) break;
            count2++;
        }
        String str="",str1 = "" , str2 = "",str6="";
        String str4=""+signbit;
        //loops to store all arrays into string type variables
        for(int k =count-2;k>=0;k--) { //for Decimal part
             str = str + arr1[k];
        }
        for(int k =0;k<count2;k++){ //for floating part
             str1 = str1 + arr2[k];
        }
         for(int k =count1-1;k>=0;k--){ //for exponent
             str2 = str2+ arr3[k];
        }
         if(str2.length()<8)
         {
             for(int k=0;k<(8-str2.length());k++){ //for appending '0' at start of exponent if exponent <127
             str6= "0"+str2;
         } 
       }else{ str6=""+str2; }
         
         String str3 = str + str1;
         String str5= str4+str6+str3;
         jTextField5.setText(str4);
         jTextField4.setText(str6);
         jTextField2.setText(str3);
         jTextField6.setText(str5);
     }
     else if(d<1.0)
     {
         if(d<0.07)
         {
             JOptionPane.showMessageDialog(DtoB.this, "Too Short number!! Enter Larger number");
               jTextField5.setText("");
               jTextField4.setText("");
               jTextField2.setText("");
               jTextField6.setText("");
         }
      else
    {
        double f1;
        int i = (int) d;
        f1 = (d-i);
        int val,c=0;
         while(f1!=0.0&&f1!=1.0){ //loop to convert floating part into binary
            f1 = f1*2;
            val = (int)f1;
            if(val == 1){
                arr4[c] = 1;
            }else if(val == 0){
                arr4[c] = 0;
            }
            f1= f1-val;
            if(c==15) break;
            c++;
        }
         String s="0.";
         for(int k=0;k<c;k++){
             s= s+arr4[k];
         }
         Double n = Double.parseDouble(s);
         int c1=0;
         while(n<1.0) {
             n = n*10;
             c1++;
         }
         String s1 = ""+ String.format("%.7f", n);
         s1 = s1.replace("1.", "");
         
         int exp =127-c1;
         int c2=0;
         while(exp>0){
             arr3[c2] = exp%2;
             exp=exp/2;
             c2++;
         }
         String s3="",str6="";
         for( int k=c2;k>=0;k--){
            s3= s3+arr3[k];
         }
         System.out.println(s3);
        if(s3.length()<8){
             for(int k=0;k<(8-s3.length());k++){ //for appending '0' at start of exponent if exponent <127
             str6= "0"+s3;
         } 
       }else{ str6=""+s3; }
         String str= ""+signbit;
         String str5= str+str6+s1;
         if(d<0.07)
         {
         jTextField5.setText("");
         jTextField4.setText("");
         jTextField2.setText("");
         jTextField6.setText("");
         } else{
         jTextField5.setText(str);
         jTextField4.setText(str6);
         jTextField2.setText(s1);
         jTextField6.setText(str5);
         }
    }
 }
         
         // here the hexadecimal conversion starts
        String a1 = jTextField1.getText();
        if(a1.charAt(0)=='-');{ //removing '-' to convert easily
            a1 = a1.replace("-", "");
        }
        Double val1 = Double.parseDouble(a1);
        double d1 = val1,f1;
         char hexchars[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if(d1<0.07)
        {
            JOptionPane.showMessageDialog(DtoB.this, "Short number cant convert to IEEE binary & hexadecimal");
            jTextField3.setText("");
        }
        int c = (int) d1;
        f1 = (d1-c);
        String hex = "";
       
        
        while(c>0) { //loop to convert decimal part into hexadecimal
            int rem=(c%16);
            if(rem==0)
                 hex = hex + hexchars[rem];
            else
                 hex = hex + hexchars[rem-1];
            c=c/16;
        }
        String hex1 = "";
        for(int j=0;j<hex.length();j++) { //loop to invert the answer
            char ch = hex.charAt(j);
            hex1 = ch+ hex1;
        }
        double ans = f1;
        int va12, n=0;
        String hex2 = "";
        while(ans>=0&&ans<1){ //loop to convert floating part into hexadecimal
            if(ans==0) break;
            ans = ans*16;
            if(ans>16) break;
            va12 = (int)ans;
            if(va12 ==0) {hex2 = hex2 +hexchars[va12];}
            else {hex2 = hex2 +hexchars[va12-1];}
            ans = ans-va12;
            if(n==5) break;
            n++;
        }
        String hex4 = "."+hex2;
        String hex3;
        
            if(hex2.isEmpty()) {
              hex3 = hex1;
            } else{
              hex3 = hex1+hex4;
            }
            if(d1<0.07) jTextField3.setText("");
            else   jTextField3.setText(hex3);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(DtoB.this, "Invalid input!! Please enter only number");
            jTextField1.setEditable(true);
        } else {
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
            java.util.logging.Logger.getLogger(DtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DtoB().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
