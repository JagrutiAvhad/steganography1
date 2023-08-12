/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Steno;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;


/**
 *
 * @author jagru
 */
public class Decode extends javax.swing.JFrame {

    /**
     * Creates new form Decode
     */
    public Decode() {
        initComponents();
    }

    BufferedImage Image=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jButtonOpen = new javax.swing.JButton();
        jButtonDecode = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 623, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Decode Message"));

        jTextMessage.setColumns(20);
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 306, 623, -1));

        jButtonOpen.setText("Open");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 7, -1, -1));

        jButtonDecode.setText("Decode");
        jButtonDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecodeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 7, -1, -1));

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 7, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private File showFileDialog(final boolean open)
 {
     JFileChooser fc=new JFileChooser("open an image");
     FileFilter filefilter=new FileFilter()
     {
         @Override
         public boolean accept(File file) {
             String name=file.getName().toLowerCase();
             if(open)
                 return file.isDirectory()||name.endsWith(".jpg")||name.endsWith(".jpeg")||name.endsWith(".png")||name.endsWith(".bmg");
             return file.isDirectory()|| name.endsWith(".png")||name.endsWith(".bmp");
         }
         public String getDescription()
         {
             if(open)
                 return "Image(*.jpg,*.jpeg,*.png,*.bmp)";
             return "Image(*.png,*.bmp)";
         }
     };
     fc.setAcceptAllFileFilterUsed(false);
     fc.addChoosableFileFilter( filefilter);
     File file=null;
     if(open&&fc.showOpenDialog(this)==fc.APPROVE_OPTION)
         file=fc.getSelectedFile();
     else if(!open&&fc.showOpenDialog(this)==fc.APPROVE_OPTION)
         file=fc.getSelectedFile();
     return file;
         
 }
    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
        // TODO add your handling code here:
        File file=showFileDialog(true);
        try {
            Image=ImageIO.read(file);
            if(file==null)
            {
                return;
            }
            jLabelimage.setIcon(new ImageIcon(Image));
            this.validate();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecodeActionPerformed
        // TODO add your handling code here:
        if (Image == null) {
        JOptionPane.showMessageDialog(this, "First Open Image");     
        return;
    }
    
    int len = extractInteger(Image, 0, 0);
    byte b[] = new byte[len];
    
    for (int i = 0; i < len; i++) {
        b[i] = extractByte(Image, i * 8 + 32, 0);
    }
    
    String decodedMessage = new String(b, StandardCharsets.UTF_8);
    System.out.println(decodedMessage); // Debug print
    String dm=decodedMessage.toString();
    jTextMessage.setText(dm);
    }//GEN-LAST:event_jButtonDecodeActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        
        jTextMessage.setText("");
        Image = null;
        jLabelimage.setIcon(null);
    }//GEN-LAST:event_jButtonResetActionPerformed
   private int extractInteger(BufferedImage img,int start,int storageBit)
   {
       int maxX=img.getWidth(),maxY=img.getHeight(),
           startX=start/maxY ,startY=start-startX*maxY,count=0;
       int length=0;
           for(int i=startX;i<maxX&&count<32;i++)
           {
               for(int j=startY;j<maxY&&count<32;j++)
               {
                   int rgb=img.getRGB(i, j),bit=getBitValue(rgb,storageBit);
                length=setBitValue(length,count,bit);
                   count++;
               }
           }
           return length;
   }
   
   private int getBitValue(int n, int location)
       {
           int y=(int) (n&Math.round(Math.pow(2, location)));
           return y==0?0:1;
       }
    private int setBitValue(int n, int location, int bit)
       {
           int toggle=(int)Math.pow(2, location),bv=getBitValue(n,location);
           if(bv==bit)
               return n;
           if(bv==0&&bit==1)
               n |=toggle;
           else if(bv==1 && bit==0)
               n^=toggle;
           return n;
       }
    private byte extractByte(BufferedImage img ,int start,int storageBit)
    {
      int maxX=img.getWidth(),maxY=img.getHeight(),
           startX=start/maxY ,startY=start-startX*maxY,count=0;
    byte b=0;
           for(int i=startX;i<maxX&&count<8;i++)
           {
               for(int j=startY;j<maxY&&count<8;j++)
               {
                   int rgb=img.getRGB(i, j),bit=getBitValue(rgb,storageBit);
                b= (byte) setBitValue(b,count,bit);
                   count++;
               }
           } 
           return b;
    }
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
            java.util.logging.Logger.getLogger(Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDecode;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelimage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables
}
