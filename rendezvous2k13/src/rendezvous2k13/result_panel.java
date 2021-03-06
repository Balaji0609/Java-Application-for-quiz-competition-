/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezvous2k13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Gowtham
 */
public class result_panel extends javax.swing.JPanel {

    /**
     * Creates new form result_panel
     */
    public result_panel() {
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

        thanks_label = new javax.swing.JLabel();
        your_label = new javax.swing.JLabel();
        score_label = new javax.swing.JLabel();
        note_label = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));

        thanks_label.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        thanks_label.setForeground(new java.awt.Color(204, 0, 0));
        thanks_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thanks_label.setText("Thanks,"+memberdetails_panel.members_name+" for your participation !!");

        your_label.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        your_label.setText("Your Score is");

        score_label.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        score_label.setForeground(new java.awt.Color(0, 153, 0));
        score_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_label.setText(String.valueOf(questions_panel.score));

        note_label.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        note_label.setText("Note: Kindly call your event organiser before you click exit button or close this window !!");

        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thanks_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(your_label))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(note_label)))
                        .addGap(0, 218, Short.MAX_VALUE))
                    .addComponent(score_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(thanks_label)
                .addGap(60, 60, 60)
                .addComponent(your_label)
                .addGap(18, 18, 18)
                .addComponent(score_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(note_label)
                .addGap(19, 19, 19)
                .addComponent(exit_button)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        try {
            // TODO add your handling code here:
            senddata();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int val=JOptionPane.showConfirmDialog(null,"Are You Sure to Exit ?? Did you call your event organiser ? If not, Please call");

        if(val==0)
            System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed
    private void senddata()throws IOException{
         String serverAddress = "0.0.0.0";
        Socket s = new Socket(serverAddress, 9092);

       BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

	out.println(memberdetails_panel.mem1_name+","+memberdetails_panel.mem1_rendno+","+memberdetails_panel.mem1_dept+","+memberdetails_panel.mem1_coll+","+memberdetails_panel.mem2_name+","+memberdetails_panel.mem2_rendno+","+memberdetails_panel.mem2_dept+","+memberdetails_panel.mem2_coll+","+questions_panel.score);
        String answer = in.readLine();
        JOptionPane.showMessageDialog(null, answer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel note_label;
    private javax.swing.JLabel score_label;
    private javax.swing.JLabel thanks_label;
    private javax.swing.JLabel your_label;
    // End of variables declaration//GEN-END:variables
}
