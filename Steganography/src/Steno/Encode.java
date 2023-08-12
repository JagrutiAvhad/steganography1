package Steno;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author jagru
 */
public class Encode extends javax.swing.JFrame {

    /**
     * Creates new form Encode
     */
    BufferedImage sourceImage = null, EmbeddedImage = null;

    public Encode() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1Source = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1Embed = new javax.swing.JLabel();
        jButton1Open = new javax.swing.JButton();
        jButton2Embed = new javax.swing.JButton();
        jButton3Save = new javax.swing.JButton();
        jButton4Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Message"));

        jTextMessage.setColumns(20);
        jTextMessage.setRows(5);
        jScrollPane1.setViewportView(jTextMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Source Image"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Source, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Source, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Embedded Image"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1Embed, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1Embed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1Open.setText("Open");
        jButton1Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1OpenActionPerformed(evt);
            }
        });

        jButton2Embed.setText("Embed");
        jButton2Embed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2EmbedActionPerformed(evt);
            }
        });

        jButton3Save.setText("Save");
        jButton3Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3SaveActionPerformed(evt);
            }
        });

        jButton4Reset.setText("Reset");
        jButton4Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1Open)
                .addGap(40, 40, 40)
                .addComponent(jButton2Embed)
                .addGap(164, 164, 164)
                .addComponent(jButton3Save)
                .addGap(54, 54, 54)
                .addComponent(jButton4Reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Open)
                    .addComponent(jButton2Embed)
                    .addComponent(jButton3Save)
                    .addComponent(jButton4Reset))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private File showFileDialog(final boolean open) {
        JFileChooser fc = new JFileChooser("open an image");
        FileFilter filefilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name = file.getName().toLowerCase();
                if (open) {
                    return file.isDirectory() || name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".bmg");
                }
                return file.isDirectory() || name.endsWith(".png") || name.endsWith(".bmp");
            }

            @Override
            public String getDescription() {
                if (open) {
                    return "Image(*.jpg,*.jpeg,*.png,*.bmp)";
                }
                return "Image(*.png,*.bmp)";
            }
        };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filefilter);
        File file = null;
        if (open && fc.showOpenDialog(this) == fc.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        } else if (!open && fc.showOpenDialog(this) == fc.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
        return file;

    }
    private void jButton1OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1OpenActionPerformed
        // TODO add your handling code here:
        File file = showFileDialog(true);
        try {
            sourceImage = ImageIO.read(file);
            if (file == null) {
                return;
            }
            jLabel1Source.setIcon(new ImageIcon(sourceImage));
            this.validate();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton1OpenActionPerformed

    private void jButton2EmbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2EmbedActionPerformed
        // TODO add your handling code here:
        if (jTextMessage.equals("") || sourceImage == null) {
            JOptionPane.showMessageDialog(null, "no message has been embedded", "no picture or message found", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Message = jTextMessage.getText();
        EmbeddedImage = sourceImage.getSubimage(0, 0, sourceImage.getWidth(), sourceImage.getHeight());
        embeddedMessage(EmbeddedImage, Message);

        jLabel1Embed.setIcon(new ImageIcon(EmbeddedImage));
        this.validate();
    }//GEN-LAST:event_jButton2EmbedActionPerformed

    private void jButton4ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ResetActionPerformed
        // TODO add your handling code here:
        jTextMessage.setText("");
        sourceImage = null;
        EmbeddedImage = null;
        jLabel1Source.setIcon(null);
        jLabel1Embed.setIcon(null);
    }//GEN-LAST:event_jButton4ResetActionPerformed

    private void jButton3SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3SaveActionPerformed
        // TODO add your handling code here:
        if (EmbeddedImage == null)
            JOptionPane.showConfirmDialog(this, "no msg has been embeeded", "nothing to save", JOptionPane.ERROR_MESSAGE);
        else {
            File file = showFileDialog(false);
            if (file == null) {
                return;
            }
            String name = file.getName();
            String Extention = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
            if (!Extention.equals("png") && !Extention.equals("bmp")) {
                Extention = "png";
                file = new File(file.getAbsolutePath() + ".png");
            }
            if (file.exists()) {
                file.delete();
            }
            try {
                ImageIO.write(EmbeddedImage, Extention.toUpperCase(), file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3SaveActionPerformed
    private void embeddedMessage(BufferedImage img, String mess) {
        int messageLength = mess.length();
        int imageWidth = img.getWidth(), imageHeight = img.getHeight(), imageSize = imageWidth * imageHeight;
        if (messageLength * 8 + 32 > imageSize) {
            JOptionPane.showMessageDialog(this, "Message is too long for this image", "Messgae too long", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            embedInteger(img, messageLength, 0, 0);
            byte b[] = mess.getBytes();
            for (int i = 0; i < b.length; i++) {
                embedByte(img, b[i], i * 8 + 32, 0);
            }
        }
    }

    private void embedInteger(BufferedImage img, int n, int start, int storageBit) {
        int maxX = img.getWidth(), maxY = img.getHeight(),
                startX = start / maxY, startY = start - startX * maxY, count = 0;

        for (int i = startX; i < maxX && count < 32; i++) {
            for (int j = startY; j < maxY && count < 32; j++) {
                int rgb = img.getRGB(i, j);
                int bit = getBitValue(n, count);
                rgb = setBitValue(rgb, storageBit, bit);
                img.setRGB(i, j, rgb);
                count++;
            }
        }
    }

    private void embedByte(BufferedImage img, byte b, int start, int storageBit) {
        int maxX = img.getWidth(), maxY = img.getHeight(), startX = start / maxY, startY = start - startX * maxY, count = 0;
        for (int i = startX; i < maxX && count < 8; i++) {
            for (int j = startY; j < maxY && count < 8; j++) {
                int rgb = img.getRGB(i, j), bit = getBitValue(b, count);
                img.setRGB(i, j, rgb);
                count++;
            }
        }
    }

    private int getBitValue(int n, int location) {
        int v = (int) (n & Math.round(Math.pow(2, location)));
        return v == 0 ? 0 : 1;
    }

    private int setBitValue(int n, int location, int bit) {
        int toggle = (int) Math.pow(2, location), bv = getBitValue(n, location);
        if (bv == bit) {
            return n;
        }
        if (bv == 0 && bit == 1) {
            n |= toggle;
        } else if (bv == 1 && bit == 0) {
            n ^= toggle;
        }
        return n;
    }

    /* * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Open;
    private javax.swing.JButton jButton2Embed;
    private javax.swing.JButton jButton3Save;
    private javax.swing.JButton jButton4Reset;
    private javax.swing.JLabel jLabel1Embed;
    private javax.swing.JLabel jLabel1Source;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMessage;
    // End of variables declaration//GEN-END:variables
}