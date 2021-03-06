/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezvous2k13;

import javax.swing.JOptionPane;
import rendezvous2k13.questions_panel.Timer;

/**
 *
 * @author Gowtham
 */
public class memberdetails_panel extends javax.swing.JPanel {

    /**
     * Creates new form memberdetails_panel
     */
    static int qnno;
   static String mem1_name;
   static  String mem2_name;
   static String members_name;
    static boolean start_test;
    static String mem1_rendno;
    static String mem2_rendno;
    static String mem1_dept;
    static String mem2_dept;
    static String mem1_coll;
    static String mem2_coll;
     
    public memberdetails_panel() {
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

        enter_label = new javax.swing.JLabel();
        mem1_panel = new javax.swing.JPanel();
        name_mem1_label = new javax.swing.JLabel();
        rendno_mem1_label = new javax.swing.JLabel();
        dept_mem1_label = new javax.swing.JLabel();
        coll_mem1_label = new javax.swing.JLabel();
        name_mem1_textbox = new javax.swing.JTextField();
        rendno_mem1_textbox = new javax.swing.JTextField();
        dept_mem1_textbox = new javax.swing.JTextField();
        coll_mem1_textbox = new javax.swing.JTextField();
        mem2_panel = new javax.swing.JPanel();
        name_mem2_label = new javax.swing.JLabel();
        rendno_mem2_label = new javax.swing.JLabel();
        dept_mem2_label = new javax.swing.JLabel();
        coll_mem2_label = new javax.swing.JLabel();
        name_mem2_textbox = new javax.swing.JTextField();
        rendno_mem2_textbox = new javax.swing.JTextField();
        dept_mem2_textbox = new javax.swing.JTextField();
        coll_mem2_textbox = new javax.swing.JTextField();
        proceed_button = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Participant Details"));

        enter_label.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        enter_label.setText("Enter your details");

        mem1_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Member 1"));

        name_mem1_label.setText("Name");

        rendno_mem1_label.setText("Rend. No");

        dept_mem1_label.setText("Dept.");

        coll_mem1_label.setText("College");

        javax.swing.GroupLayout mem1_panelLayout = new javax.swing.GroupLayout(mem1_panel);
        mem1_panel.setLayout(mem1_panelLayout);
        mem1_panelLayout.setHorizontalGroup(
            mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mem1_panelLayout.createSequentialGroup()
                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mem1_panelLayout.createSequentialGroup()
                        .addComponent(name_mem1_label)
                        .addGap(38, 38, 38)
                        .addComponent(name_mem1_textbox, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(mem1_panelLayout.createSequentialGroup()
                        .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mem1_panelLayout.createSequentialGroup()
                                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dept_mem1_label)
                                    .addComponent(coll_mem1_label))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mem1_panelLayout.createSequentialGroup()
                                .addComponent(rendno_mem1_label)
                                .addGap(18, 18, 18)))
                        .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rendno_mem1_textbox)
                            .addComponent(coll_mem1_textbox)
                            .addComponent(dept_mem1_textbox, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 10, 10))
        );
        mem1_panelLayout.setVerticalGroup(
            mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mem1_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_mem1_label)
                    .addComponent(name_mem1_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rendno_mem1_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rendno_mem1_label))
                .addGap(19, 19, 19)
                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept_mem1_label)
                    .addComponent(dept_mem1_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mem1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coll_mem1_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coll_mem1_label))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        mem2_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Member 2 (If Applicable)"));

        name_mem2_label.setText("Name");

        rendno_mem2_label.setText("Rend. No");

        dept_mem2_label.setText("Dept.");

        coll_mem2_label.setText("College");

        javax.swing.GroupLayout mem2_panelLayout = new javax.swing.GroupLayout(mem2_panel);
        mem2_panel.setLayout(mem2_panelLayout);
        mem2_panelLayout.setHorizontalGroup(
            mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mem2_panelLayout.createSequentialGroup()
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_mem2_label)
                    .addComponent(rendno_mem2_label)
                    .addComponent(dept_mem2_label)
                    .addComponent(coll_mem2_label))
                .addGap(29, 29, 29)
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_mem2_textbox)
                    .addComponent(rendno_mem2_textbox)
                    .addComponent(dept_mem2_textbox)
                    .addComponent(coll_mem2_textbox, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(0, 10, 10))
        );
        mem2_panelLayout.setVerticalGroup(
            mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mem2_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_mem2_label)
                    .addComponent(name_mem2_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendno_mem2_label)
                    .addComponent(rendno_mem2_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept_mem2_label)
                    .addComponent(dept_mem2_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mem2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coll_mem2_label)
                    .addComponent(coll_mem2_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proceed_button.setText("Proceed");
        proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enter_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mem2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(proceed_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(enter_label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mem2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mem1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(proceed_button))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateDetails(){
        boolean flag1=false;
        while(flag1==false){
            flag1=true;
                    if(mem1_name==null||mem1_name.equals("")){
                        JOptionPane.showMessageDialog(null,"Enter Participant's Name");
                        flag1=false;
                        break;
                    }
                    if(mem1_rendno==null||mem1_rendno.equals("")){
                        JOptionPane.showMessageDialog(null,"Enter Participant's Rend. No given in the ID Card");
                        flag1=false;
                        break;
                    }
                    if(mem1_dept==null||mem1_dept.equals("")){
                        JOptionPane.showMessageDialog(null,"Enter Participant's Department/Stream");
                        flag1=false;
                        break;
                    }
                    if(mem1_coll==null||mem1_coll.equals("")){
                        JOptionPane.showMessageDialog(null,"Enter Participant's College Name");
                        flag1=false;
                        break;
                    }
                    if(!mem2_name.equals("")){
                        if(mem2_rendno==null||mem2_rendno.equals("")){
                            JOptionPane.showMessageDialog(null,"Enter Participant's Rend. No given in the ID Card");
                        flag1=false;
                            break;
                        }
                        if(mem2_dept==null||mem2_dept.equals("")){
                            JOptionPane.showMessageDialog(null,"Enter Participant's Department/Stream");
                            flag1=false;
                            break;
                        }
                    if(mem2_coll==null||mem2_coll.equals("")){
                        JOptionPane.showMessageDialog(null,"Enter Participant's College Name");
                        flag1=false;
                        break;
                    }
                        
                    }
                    

        }
        return flag1;
    }
    private void proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_buttonActionPerformed
        // TODO add your handling code here:
        mem1_name=name_mem1_textbox.getText();
        mem2_name=name_mem2_textbox.getText();
        mem1_rendno=rendno_mem1_textbox.getText();
        mem2_rendno=rendno_mem2_textbox.getText();
        mem1_dept=dept_mem1_textbox.getText();
        mem2_dept=dept_mem2_textbox.getText();
        mem1_coll=coll_mem1_textbox.getText();
        mem2_coll=coll_mem2_textbox.getText();
        if(validateDetails()){
        if(mem2_name==null||mem2_name.equals("")){
            members_name=mem1_name;
        }
        else{
            members_name=mem1_name+", "+mem2_name;
        }
        
        int start=JOptionPane.showConfirmDialog(null, "Are you ready ?? Shall we start the test.??");
        questions_panel qp=new questions_panel();
        if(start==0){
            qnno=0;
            start_test=true;
            Timer time=qp.new Timer();
        }
        
        Rendezvous2k13.mainframe.getContentPane().removeAll();
        Rendezvous2k13.mainframe.add(qp);
        Rendezvous2k13.mainframe.validate();
        Rendezvous2k13.mainframe.repaint();
        Rendezvous2k13.mainframe.pack();
        }
    }//GEN-LAST:event_proceed_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coll_mem1_label;
    private javax.swing.JTextField coll_mem1_textbox;
    private javax.swing.JLabel coll_mem2_label;
    private javax.swing.JTextField coll_mem2_textbox;
    private javax.swing.JLabel dept_mem1_label;
    private javax.swing.JTextField dept_mem1_textbox;
    private javax.swing.JLabel dept_mem2_label;
    private javax.swing.JTextField dept_mem2_textbox;
    private javax.swing.JLabel enter_label;
    private javax.swing.JPanel mem1_panel;
    private javax.swing.JPanel mem2_panel;
    private javax.swing.JLabel name_mem1_label;
    private javax.swing.JTextField name_mem1_textbox;
    private javax.swing.JLabel name_mem2_label;
    private javax.swing.JTextField name_mem2_textbox;
    private javax.swing.JButton proceed_button;
    private javax.swing.JLabel rendno_mem1_label;
    private javax.swing.JTextField rendno_mem1_textbox;
    private javax.swing.JLabel rendno_mem2_label;
    private javax.swing.JTextField rendno_mem2_textbox;
    // End of variables declaration//GEN-END:variables
}

