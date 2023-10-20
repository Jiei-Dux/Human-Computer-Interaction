// ========== // ========== // ========== // ========== // ========== //
//                                                                    //
//                      Java Swing GUI Program                        //
//                  EventDriven_Doctor - EventDriven.java                //
//                    Human Computer Interaction                      //
//                                                                    //
// ========== // ========== // ========== // ========== // ========== //




// ========== // ========== // ==== Package ==== // ========== // ========== //
// package eventdriven_doctor;




// ========== // ========== // ==== Main Class ==== // ========== // ========== //
public class EventDriven extends javax.swing.JFrame {
    
    // ---------- // ---- Variables Initialization ---- // ---------- //
    public static javax.swing.JButton SubmitBtn;
    public static javax.swing.JTextField 
            Fname, 
            Mname,
            Lname,
            MNum,
            Email;
    
    
    
    
    // ---------- // ---- Initialization ---- // ---------- //
    public EventDriven() {
        initComponents();
        SubmitBtn = btnSubmit;
        Fname = TextField_FName;
        Mname = TextField_MName;
        Lname = TextField_LName;
        MNum = TextField_MobileNum;
        Email = TextField_EMail;
    }
    
    UI_Output OUTPUT = new UI_Output();




    // ---------- // ---- Components ---- // ---------- //
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Main = new javax.swing.JPanel();
        Label_EMail = new javax.swing.JLabel();
        TextField_EMail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        Btn_Clear = new javax.swing.JButton();
        Label_FName = new javax.swing.JLabel();
        TextField_FName = new javax.swing.JTextField();
        Label_LName = new javax.swing.JLabel();
        TextField_LName = new javax.swing.JTextField();
        Label_MName = new javax.swing.JLabel();
        TextField_MName = new javax.swing.JTextField();
        Label_MobileNum = new javax.swing.JLabel();
        TextField_MobileNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input");
        setBackground(java.awt.Color.black);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(null);
        setName("InputFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(450, 320));

        Panel_Main.setBackground(java.awt.Color.black);

        Label_EMail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Label_EMail.setForeground(java.awt.Color.white);
        Label_EMail.setText("Email Address:");

        TextField_EMail.setBackground(java.awt.Color.black);
        TextField_EMail.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        TextField_EMail.setForeground(java.awt.Color.white);

        btnSubmit.setBackground(java.awt.Color.black);
        btnSubmit.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        btnSubmit.setForeground(java.awt.Color.white);
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSubmit.setBorderPainted(false);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setMaximumSize(new java.awt.Dimension(120, 40));
        btnSubmit.setMinimumSize(new java.awt.Dimension(120, 40));
        btnSubmit.setPreferredSize(new java.awt.Dimension(120, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        Btn_Clear.setBackground(java.awt.Color.black);
        Btn_Clear.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        Btn_Clear.setForeground(java.awt.Color.white);
        Btn_Clear.setText("CLEAR ALL");
        Btn_Clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Btn_Clear.setBorderPainted(false);
        Btn_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Clear.setPreferredSize(new java.awt.Dimension(120, 40));
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });

        Label_FName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Label_FName.setForeground(java.awt.Color.white);
        Label_FName.setText("First Name:");

        TextField_FName.setBackground(java.awt.Color.black);
        TextField_FName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        TextField_FName.setForeground(java.awt.Color.white);

        Label_LName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Label_LName.setForeground(java.awt.Color.white);
        Label_LName.setText("Last Name:");

        TextField_LName.setBackground(java.awt.Color.black);
        TextField_LName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        TextField_LName.setForeground(java.awt.Color.white);

        Label_MName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Label_MName.setForeground(java.awt.Color.white);
        Label_MName.setText("Middle Name:");

        TextField_MName.setBackground(java.awt.Color.black);
        TextField_MName.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        TextField_MName.setForeground(java.awt.Color.white);

        Label_MobileNum.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Label_MobileNum.setForeground(java.awt.Color.white);
        Label_MobileNum.setText("Mobile Number:");

        TextField_MobileNum.setBackground(java.awt.Color.black);
        TextField_MobileNum.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        TextField_MobileNum.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout Panel_MainLayout = new javax.swing.GroupLayout(Panel_Main);
        Panel_Main.setLayout(Panel_MainLayout);
        Panel_MainLayout.setHorizontalGroup(
            Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MainLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MainLayout.createSequentialGroup()
                        .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Panel_MainLayout.createSequentialGroup()
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_MainLayout.createSequentialGroup()
                                    .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_LName)
                                        .addComponent(Label_FName))
                                    .addGap(43, 43, 43)
                                    .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextField_MName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Panel_MainLayout.createSequentialGroup()
                                .addComponent(Label_MobileNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextField_MobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_MName))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(Panel_MainLayout.createSequentialGroup()
                        .addComponent(Label_EMail)
                        .addGap(19, 19, 19)
                        .addComponent(TextField_EMail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Panel_MainLayout.setVerticalGroup(
            Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_FName)
                    .addComponent(TextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_LName)
                    .addComponent(TextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_MName)
                    .addComponent(TextField_MName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_MobileNum)
                    .addComponent(TextField_MobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_EMail)
                    .addComponent(TextField_EMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


    // ---------- // ---- Button Functions ---- // ---------- //
    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        OUTPUT.dispose();
        ClearText();
        btnSubmitState(true);
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        btnSubmitState(false);
        OUTPUT.setVisible(true);
        UI_Output.FName.setText(TextField_FName.getText());
        UI_Output.MName.setText(TextField_MName.getText());
        UI_Output.LName.setText(TextField_LName.getText());
        UI_Output.MNum.setText(TextField_MobileNum.getText());
        UI_Output.EmailAdd.setText(TextField_EMail.getText());
    }//GEN-LAST:event_btnSubmitActionPerformed

    public void btnSubmitState(boolean state) {
        btnSubmit.setEnabled(state);
    }
    
    public void ClearText() {
        TextField_FName.setText("");
        TextField_MName.setText("");
        TextField_LName.setText("");
        TextField_EMail.setText("");
        TextField_MobileNum.setText("");
    }



    
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
        } catch (
                ClassNotFoundException |
                InstantiationException | 
                IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex
                ) {
            java.util.logging.Logger.getLogger(EventDriven.class.getName()
            ).log(
                    java.util.logging.Level.SEVERE, null, ex
            );
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new EventDriven().setVisible(true);
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Clear;
    private javax.swing.JLabel Label_EMail;
    private javax.swing.JLabel Label_FName;
    private javax.swing.JLabel Label_LName;
    private javax.swing.JLabel Label_MName;
    private javax.swing.JLabel Label_MobileNum;
    private javax.swing.JPanel Panel_Main;
    private javax.swing.JTextField TextField_EMail;
    private javax.swing.JTextField TextField_FName;
    private javax.swing.JTextField TextField_LName;
    private javax.swing.JTextField TextField_MName;
    private javax.swing.JTextField TextField_MobileNum;
    private javax.swing.JButton btnSubmit;
    // End of variables declaration//GEN-END:variables
}