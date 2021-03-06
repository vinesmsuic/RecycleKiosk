
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author max
 */
public class ReceiptLayOut extends javax.swing.JFrame {

    /**
     * Creates new form ReceiptLayOut
     */
    public ReceiptLayOut() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        receiptTable = new javax.swing.JTable();
        amtTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        printReceipt = new javax.swing.JButton();
        printWarning = new javax.swing.JLabel();
        transferMoneyToOctopus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Currency", "Price", "Unit", "Quantity", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(receiptTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 58, -1, 145));

        amtTotal.setText("amt");
        getContentPane().add(amtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 225, 160, 32));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Receipt Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        printReceipt.setText("Print Receipt");
        printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptActionPerformed(evt);
            }
        });
        getContentPane().add(printReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 263, 107, -1));

        printWarning.setText("           ");
        getContentPane().add(printWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 268, -1, -1));

        transferMoneyToOctopus.setText("Transfer to Octopus");
        transferMoneyToOctopus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMoneyToOctopusActionPerformed(evt);
            }
        });
        getContentPane().add(transferMoneyToOctopus, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 263, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bg1.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 720, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptActionPerformed
        try {
            // save receipt into a txt file
            saveTable();
        } catch (Exception ex) {
            Logger.getLogger(ReceiptLayOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        printWarning.setText("Printed");
    }//GEN-LAST:event_printReceiptActionPerformed

    private void transferMoneyToOctopusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMoneyToOctopusActionPerformed
        // open transfermoney layout
        OctopusCard oc = new OctopusCard();
        oc.setVisible(true);
    }//GEN-LAST:event_transferMoneyToOctopusActionPerformed
 
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceiptLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiptLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiptLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiptLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiptLayOut().setVisible(true);
            }
        });
    }
       public void setInvoiceItems(List<InvoiceProductInfo> invoiceItems,String total){
        Float subtotal;
        this.invoiceItems = invoiceItems;
            DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
                for(InvoiceProductInfo pinfo:invoiceItems){
                    subtotal = pinfo.getSubtotal();

                model.addRow(new Object[]{ //add rows
                    pinfo.getProduct(),pinfo.getCurrency(),pinfo.getPrice(),pinfo.getUnit(),pinfo.getQuantity(),subtotal
                });
                }
        
        amtTotal.setText( "Total: " + total);   
    }
       public void saveTable()throws Exception
{
       String dataName = "src/receipt.";
       SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
       dataName += simpleDate.format(new Date());
       dataName += ".txt";
       BufferedWriter bfw = new BufferedWriter(new FileWriter(dataName,true));
       for (InvoiceProductInfo ipi:this.invoiceItems){
           String dataSaved = ipi.toTabString();
           bfw.write(dataSaved);
           bfw.newLine();
       }
  bfw.close();
}
       private List<InvoiceProductInfo> invoiceItems = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printReceipt;
    private javax.swing.JLabel printWarning;
    private javax.swing.JTable receiptTable;
    private javax.swing.JButton transferMoneyToOctopus;
    // End of variables declaration//GEN-END:variables
}
