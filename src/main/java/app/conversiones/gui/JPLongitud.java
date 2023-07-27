package app.conversiones.gui;

import app.conversiones.convertir.ConvertirLongitud;
import java.awt.Color;

public class JPLongitud extends javax.swing.JPanel {

    public JPLongitud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcm = new javax.swing.JLabel();
        lbmm = new javax.swing.JLabel();
        lbm = new javax.swing.JLabel();
        lbkm = new javax.swing.JLabel();
        cantmm = new javax.swing.JTextField();
        cantcm = new javax.swing.JTextField();
        cantm = new javax.swing.JTextField();
        cantkm = new javax.swing.JTextField();
        separatormm = new javax.swing.JSeparator();
        separatorcm = new javax.swing.JSeparator();
        separatorm = new javax.swing.JSeparator();
        separatorkm = new javax.swing.JSeparator();
        lberrormm = new javax.swing.JLabel();
        lberrorcm = new javax.swing.JLabel();
        lberrorm = new javax.swing.JLabel();
        lberrorkm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbcm.setBackground(new java.awt.Color(255, 255, 255));
        lbcm.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbcm.setForeground(new java.awt.Color(0, 0, 0));
        lbcm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcm.setText("Centimetros:");

        lbmm.setBackground(new java.awt.Color(255, 255, 255));
        lbmm.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbmm.setForeground(new java.awt.Color(0, 0, 0));
        lbmm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmm.setText("Milimetros:");

        lbm.setBackground(new java.awt.Color(255, 255, 255));
        lbm.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbm.setForeground(new java.awt.Color(0, 0, 0));
        lbm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm.setText("Metros:");

        lbkm.setBackground(new java.awt.Color(255, 255, 255));
        lbkm.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbkm.setForeground(new java.awt.Color(0, 0, 0));
        lbkm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbkm.setText("Kilometros:");

        cantmm.setBackground(new java.awt.Color(255, 255, 255));
        cantmm.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        cantmm.setForeground(new java.awt.Color(102, 102, 102));
        cantmm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantmm.setText("Cantidad milimetros");
        cantmm.setBorder(null);
        cantmm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantmmMouseClicked(evt);
            }
        });
        cantmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantmmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantmmKeyReleased(evt);
            }
        });

        cantcm.setBackground(new java.awt.Color(255, 255, 255));
        cantcm.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        cantcm.setForeground(new java.awt.Color(102, 102, 102));
        cantcm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantcm.setText("Cantidad centimetros");
        cantcm.setBorder(null);
        cantcm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantcmMouseClicked(evt);
            }
        });
        cantcm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantcmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantcmKeyReleased(evt);
            }
        });

        cantm.setBackground(new java.awt.Color(255, 255, 255));
        cantm.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        cantm.setForeground(new java.awt.Color(102, 102, 102));
        cantm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantm.setText("Cantidad metros");
        cantm.setBorder(null);
        cantm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantmMouseClicked(evt);
            }
        });
        cantm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantmKeyReleased(evt);
            }
        });

        cantkm.setBackground(new java.awt.Color(255, 255, 255));
        cantkm.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        cantkm.setForeground(new java.awt.Color(102, 102, 102));
        cantkm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantkm.setText("Cantidad kilometros");
        cantkm.setBorder(null);
        cantkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantkmMouseClicked(evt);
            }
        });
        cantkm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantkmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantkmKeyReleased(evt);
            }
        });

        lberrormm.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lberrormm.setForeground(new java.awt.Color(255, 0, 51));
        lberrormm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lberrormm.setText(" ");

        lberrorcm.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lberrorcm.setForeground(new java.awt.Color(255, 0, 51));
        lberrorcm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lberrorcm.setText(" ");

        lberrorm.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lberrorm.setForeground(new java.awt.Color(255, 0, 51));
        lberrorm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lberrorm.setText(" ");

        lberrorkm.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lberrorkm.setForeground(new java.awt.Color(255, 0, 51));
        lberrorkm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lberrorkm.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lberrorm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(lberrorkm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lberrormm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lberrorcm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separatorm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorkm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separatormm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separatorcm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantkm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantmm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantcm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbkm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbmm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbcm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcm)
                    .addComponent(lbmm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separatormm)
                    .addComponent(separatorcm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lberrormm)
                    .addComponent(lberrorcm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbkm)
                    .addComponent(lbm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separatorm)
                    .addComponent(separatorkm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lberrorm)
                    .addComponent(lberrorkm))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantmmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantmmMouseClicked
        if (cantmm.getText().equals("Cantidad milimetros")) {
            cantmm.setText("");
            cantmm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantmmMouseClicked

    private void cantmmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantmmKeyPressed
        if (cantmm.getText().equals("Cantidad milimetros")) {
            cantmm.setText("");
            cantmm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantmmKeyPressed

    private void cantcmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantcmKeyPressed
        if (cantcm.getText().equals("Cantidad centimetros")) {
            cantcm.setText("");
            cantcm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantcmKeyPressed

    private void cantcmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantcmMouseClicked
        if (cantcm.getText().equals("Cantidad centimetros")) {
            cantcm.setText("");
            cantcm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantcmMouseClicked

    private void cantmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantmMouseClicked
        if (cantm.getText().equals("Cantidad metros")) {
            cantm.setText("");
            cantm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantmMouseClicked

    private void cantmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantmKeyPressed
        if (cantm.getText().equals("Cantidad metros")) {
            cantm.setText("");
            cantm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantmKeyPressed

    private void cantkmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantkmKeyPressed
        if (cantkm.getText().equals("Cantidad kilometros")) {
            cantkm.setText("");
            cantkm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantkmKeyPressed

    private void cantkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantkmMouseClicked
        if (cantkm.getText().equals("Cantidad kilometros")) {
            cantkm.setText("");
            cantkm.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cantkmMouseClicked

    private void cantmmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantmmKeyReleased
        lberrormm.setText(valNum(cantmm.getText()));
        if (lberrormm.getText().equals(" ")) {
            String numero = cantmm.getText().isEmpty() ? "0" : cantmm.getText().replace(",", ".");
            hacerConversiones("mm", Double.parseDouble(numero));
        }
    }//GEN-LAST:event_cantmmKeyReleased

    private void cantcmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantcmKeyReleased
        lberrorcm.setText(valNum(cantcm.getText()));
        if (lberrorcm.getText().equals(" ")) {
            String numero = cantcm.getText().isEmpty() ? "0" : cantcm.getText().replace(",", ".");
            hacerConversiones("cm", Double.parseDouble(numero));
        }
    }//GEN-LAST:event_cantcmKeyReleased

    private void cantmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantmKeyReleased
        lberrorm.setText(valNum(cantm.getText()));
        if (lberrorm.getText().equals(" ")) {
            String numero = cantm.getText().isEmpty() ? "0" : cantm.getText().replace(",", ".");
            hacerConversiones("m", Double.parseDouble(numero));
        }
    }//GEN-LAST:event_cantmKeyReleased

    private void cantkmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantkmKeyReleased
        lberrorkm.setText(valNum(cantkm.getText()));
        if (lberrormm.getText().equals(" ")) {
            String numero = cantkm.getText().isEmpty() ? "0" : cantkm.getText().replace(",", ".");
            hacerConversiones("km", Double.parseDouble(numero));
        }
    }//GEN-LAST:event_cantkmKeyReleased

    private void hacerConversiones(String from, double amount) {
        double[] conversiones = ConvertirLongitud.convertir(from, amount);
        if (!from.equals("mm")) {
            cantmm.setText("" + conversiones[0]);
        }
        if (!from.equals("cm")) {
            cantcm.setText("" + conversiones[1]);
        }
        if (!from.equals("m")) {
            cantm.setText("" + conversiones[2]);
        }
        if (!from.equals("km")) {
            cantkm.setText("" + conversiones[3]);
        }
    }

    private String valNum(String text) {
        boolean valNum = text.matches("[0-9]*");
        boolean valPunt = text.matches("[0-9]*[,.]?");
        boolean valCant = text.matches("[0-9]*[,.]?[0-9]*");
        if (valNum || valPunt || valCant) {
            return " ";
        } else {
            return "Se ha ingresado un caracter no valido";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantcm;
    private javax.swing.JTextField cantkm;
    private javax.swing.JTextField cantm;
    private javax.swing.JTextField cantmm;
    private javax.swing.JLabel lbcm;
    private javax.swing.JLabel lberrorcm;
    private javax.swing.JLabel lberrorkm;
    private javax.swing.JLabel lberrorm;
    private javax.swing.JLabel lberrormm;
    private javax.swing.JLabel lbkm;
    private javax.swing.JLabel lbm;
    private javax.swing.JLabel lbmm;
    private javax.swing.JSeparator separatorcm;
    private javax.swing.JSeparator separatorkm;
    private javax.swing.JSeparator separatorm;
    private javax.swing.JSeparator separatormm;
    // End of variables declaration//GEN-END:variables
}
