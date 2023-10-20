// ========== // ========== // ========== // ========== // ========== //
//                                                                    //
//                      Java Swing GUI Program                        //
//                  EventDriven_Doctor - UI_Output.java               //
//                    Human Computer Interaction                      //
//                                                                    //
// ========== // ========== // ========== // ========== // ========== //




// ========== // ========== // ==== Package ==== // ========== // ========== //
// package eventdriven_doctor;




// ========== // ========== // ==== Library Imports ==== // ========== // ========== //
import javax.swing.*;




// ========== // ========== // ==== Main Class ==== // ========== // ========== //
public class UI_Output extends javax.swing.JFrame {

    // ---------- // ---- Variables Initialization ---- // ---------- //
    public static JLabel FName, LName, MName, MNum, EmailAdd;
    



    // ---------- // ---- Initialization ---- // ---------- //
    public  UI_Output() {
        initComponents();
        FName = FirstName;
        LName = LastName;
        MName = MiddleName;
        MNum = MobileNum;
        EmailAdd = EMailAddress;
    }
   



    // ---------- // ---- Components ---- // ---------- //
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Main = new javax.swing.JPanel();
        Label_FName = new javax.swing.JLabel();
        Label_LName = new javax.swing.JLabel();
        Label_MName = new javax.swing.JLabel();
        Label_MobileNum = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Btn_Ok = new javax.swing.JButton();
        MiddleName = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        MobileNum = new javax.swing.JLabel();
        EMailAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Output");
        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(482, 310));
        setName("OutputFrame"); // NOI18N
        setSize(new java.awt.Dimension(482, 310));

        Panel_Main.setBackground(java.awt.Color.black);
        Panel_Main.setForeground(java.awt.Color.white);

        Label_FName.setBackground(java.awt.Color.black);
        Label_FName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Label_FName.setForeground(java.awt.Color.white);
        Label_FName.setText("First Name:");

        Label_LName.setBackground(java.awt.Color.black);
        Label_LName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Label_LName.setForeground(java.awt.Color.white);
        Label_LName.setText("Last Name:");

        Label_MName.setBackground(java.awt.Color.black);
        Label_MName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Label_MName.setForeground(java.awt.Color.white);
        Label_MName.setText("Middle Name:");

        Label_MobileNum.setBackground(java.awt.Color.black);
        Label_MobileNum.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Label_MobileNum.setForeground(java.awt.Color.white);
        Label_MobileNum.setText("Mobile No.:");

        Label_Email.setBackground(java.awt.Color.black);
        Label_Email.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Label_Email.setForeground(java.awt.Color.white);
        Label_Email.setText("Email Addr.:");

        Btn_Ok.setText("OK");
        Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OkActionPerformed(evt);
            }
        });

        MiddleName.setBackground(java.awt.Color.black);
        MiddleName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        MiddleName.setForeground(java.awt.Color.white);

        FirstName.setBackground(java.awt.Color.black);
        FirstName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        FirstName.setForeground(java.awt.Color.white);

        LastName.setBackground(java.awt.Color.black);
        LastName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        LastName.setForeground(java.awt.Color.white);

        MobileNum.setBackground(java.awt.Color.black);
        MobileNum.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        MobileNum.setForeground(java.awt.Color.white);

        EMailAddress.setBackground(java.awt.Color.black);
        EMailAddress.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        EMailAddress.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout Panel_MainLayout = new javax.swing.GroupLayout(Panel_Main);
        Panel_Main.setLayout(Panel_MainLayout);
        Panel_MainLayout.setHorizontalGroup(
            Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MainLayout.createSequentialGroup()
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_FName)
                            .addGroup(Panel_MainLayout.createSequentialGroup()
                                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_MName)
                                    .addComponent(Label_LName)
                                    .addComponent(Label_MobileNum)
                                    .addComponent(Label_Email))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EMailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Panel_MainLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(Btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Panel_MainLayout.setVerticalGroup(
            Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_FName)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_LName)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_MName)
                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_MobileNum)
                    .addComponent(MobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Email)
                    .addComponent(EMailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    // ---------- // ---- Button Functions ---- // ---------- //
    private void Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OkActionPerformed
        EventDriven.SubmitBtn.setEnabled(true);
        EventDriven.Fname.setText("");
        EventDriven.Mname.setText("");
        EventDriven.Lname.setText("");
        EventDriven.Email.setText("");
        EventDriven.MNum.setText("");
        dispose();
    }//GEN-LAST:event_Btn_OkActionPerformed
    


    
    // ---------- // ---- Main Functions ---- // ---------- //
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new UI_Output().setVisible(true);
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ok;
    private javax.swing.JLabel EMailAddress;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_FName;
    private javax.swing.JLabel Label_LName;
    private javax.swing.JLabel Label_MName;
    private javax.swing.JLabel Label_MobileNum;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel MiddleName;
    private javax.swing.JLabel MobileNum;
    private javax.swing.JPanel Panel_Main;
    // End of variables declaration//GEN-END:variables
}
