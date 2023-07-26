package app.conversiones.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        jdivisas.setBackground(Color.WHITE);
        lbdivisas.setForeground(Color.BLACK);
        jlongitud.setBackground(new Color(37, 202, 139));
        lblongitud.setForeground(Color.WHITE);
        CambiarPanel(new JPDivisas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jlongitud = new javax.swing.JPanel();
        lblongitud = new javax.swing.JLabel();
        jdivisas = new javax.swing.JPanel();
        lbdivisas = new javax.swing.JLabel();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(37, 202, 139));

        title.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Conversiones");

        exit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/img/cerrar.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jlongitud.setBackground(new java.awt.Color(37, 202, 139));

        lblongitud.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblongitud.setForeground(new java.awt.Color(255, 255, 255));
        lblongitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblongitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/img/longitud.png"))); // NOI18N
        lblongitud.setText("Longitud");
        lblongitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblongitudMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblongitudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblongitudMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jlongitudLayout = new javax.swing.GroupLayout(jlongitud);
        jlongitud.setLayout(jlongitudLayout);
        jlongitudLayout.setHorizontalGroup(
            jlongitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblongitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jlongitudLayout.setVerticalGroup(
            jlongitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlongitudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jdivisas.setBackground(new java.awt.Color(37, 202, 139));

        lbdivisas.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbdivisas.setForeground(new java.awt.Color(255, 255, 255));
        lbdivisas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbdivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/img/divisas.png"))); // NOI18N
        lbdivisas.setText("Divisa");
        lbdivisas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbdivisasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbdivisasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbdivisasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jdivisasLayout = new javax.swing.GroupLayout(jdivisas);
        jdivisas.setLayout(jdivisasLayout);
        jdivisasLayout.setHorizontalGroup(
            jdivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbdivisas, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jdivisasLayout.setVerticalGroup(
            jdivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivisasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbdivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jdivisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jlongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jdivisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/img/cerrarP2.png")));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/img/cerrar.png")));
    }//GEN-LAST:event_exitMouseExited

    private void lbdivisasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdivisasMouseEntered
        if (lbdivisas.getForeground() != Color.BLACK) {
            jdivisas.setBackground(new Color(0, 184, 113));
        }
    }//GEN-LAST:event_lbdivisasMouseEntered

    private void lblongitudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblongitudMouseEntered
        if (lblongitud.getForeground() != Color.BLACK) {
            jlongitud.setBackground(new Color(0, 184, 113));
        }
    }//GEN-LAST:event_lblongitudMouseEntered

    private void lbdivisasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdivisasMouseExited
        if (lbdivisas.getForeground() != Color.BLACK) {
            jdivisas.setBackground(new Color(37, 202, 139));
        }
    }//GEN-LAST:event_lbdivisasMouseExited

    private void lblongitudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblongitudMouseExited
        if (lblongitud.getForeground() != Color.BLACK) {
            jlongitud.setBackground(new Color(37, 202, 139));
        }
    }//GEN-LAST:event_lblongitudMouseExited

    private void lbdivisasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdivisasMouseClicked
        if (lbdivisas.getForeground() != Color.BLACK) {
            jdivisas.setBackground(Color.WHITE);
            lbdivisas.setForeground(Color.BLACK);
            jlongitud.setBackground(new Color(37, 202, 139));
            lblongitud.setForeground(Color.WHITE);
            CambiarPanel(new JPDivisas());
        }
    }//GEN-LAST:event_lbdivisasMouseClicked

    private void lblongitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblongitudMouseClicked
        if (lblongitud.getForeground() != Color.BLACK) {
            jlongitud.setBackground(Color.WHITE);
            lblongitud.setForeground(Color.BLACK);
            jdivisas.setBackground(new Color(37, 202, 139));
            lbdivisas.setForeground(Color.WHITE);
            CambiarPanel(new JPLongitud());
        }
    }//GEN-LAST:event_lblongitudMouseClicked

    public void CambiarPanel(JPanel p) {
        p.setSize(body.getWidth(), body.getHeight());
        p.setLocation(0, 0);
        body.removeAll();
        body.add(p, BorderLayout.CENTER);
        body.revalidate();
        body.repaint();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jdivisas;
    private javax.swing.JPanel jlongitud;
    private javax.swing.JLabel lbdivisas;
    private javax.swing.JLabel lblongitud;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
