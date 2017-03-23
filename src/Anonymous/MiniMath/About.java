package Anonymous.MiniMath;
public class About extends javax.swing.JPanel {
    public About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        credit = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        major = new javax.swing.JLabel();
        pic = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        credit.setBackground(new java.awt.Color(255, 51, 51));
        credit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        credit.setText("Credit");

        name.setBackground(new java.awt.Color(0, 102, 204));
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setText("Mr. Jakkrit Seehasut");

        id.setBackground(new java.awt.Color(255, 51, 51));
        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setText("Student ID : 5730211031");

        major.setBackground(new java.awt.Color(255, 51, 51));
        major.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        major.setText("Mojor : IT");

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/Pictures/พี่สัน58_-9.jpg"))); // NOI18N
        pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(credit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addComponent(name)
                            .addComponent(major))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(credit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(major)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picActionPerformed
    }//GEN-LAST:event_picActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel credit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel major;
    private javax.swing.JLabel name;
    private javax.swing.JButton pic;
    // End of variables declaration//GEN-END:variables
}
