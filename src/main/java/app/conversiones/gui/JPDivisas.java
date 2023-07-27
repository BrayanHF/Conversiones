package app.conversiones.gui;

import app.conversiones.convertir.ConvertirDivisas;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class JPDivisas extends javax.swing.JPanel {

    public JPDivisas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        from = new javax.swing.JComboBox<>();
        a = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        jbtn = new javax.swing.JPanel();
        lbtn = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        lberror = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        from.setBackground(new java.awt.Color(255, 255, 255));
        from.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        from.setForeground(new java.awt.Color(0, 0, 0));
        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos Mexicanos", "Dolares", "Euros", "Libras Esterlinas", "Wones", "Yenes" }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("a");

        to.setBackground(new java.awt.Color(255, 255, 255));
        to.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        to.setForeground(new java.awt.Color(0, 0, 0));
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolares", "Euros", "Libras Esterlinas", "Wones", "Yenes" }));

        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        amount.setForeground(new java.awt.Color(102, 102, 102));
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.setText("Cantidad a convertir");
        amount.setBorder(null);
        amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountMouseClicked(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Convertir");

        jbtn.setBackground(new java.awt.Color(37, 202, 139));

        lbtn.setBackground(new java.awt.Color(255, 255, 255));
        lbtn.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lbtn.setForeground(new java.awt.Color(0, 0, 0));
        lbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtn.setText("Hacer conversion");
        lbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jbtnLayout = new javax.swing.GroupLayout(jbtn);
        jbtn.setLayout(jbtnLayout);
        jbtnLayout.setHorizontalGroup(
            jbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jbtnLayout.setVerticalGroup(
            jbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jscroll.setBorder(null);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setBorder(null);
        text.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        text.setForeground(new java.awt.Color(0, 0, 0));
        text.setFocusable(false);
        jscroll.setViewportView(text);

        lberror.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lberror.setForeground(new java.awt.Color(255, 0, 51));
        lberror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lberror.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lberror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(separator)
                    .addComponent(amount)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lberror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtnMouseEntered
        jbtn.setBackground(new Color(0, 184, 113));
    }//GEN-LAST:event_lbtnMouseEntered

    private void lbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtnMouseExited
        jbtn.setBackground(new Color(37, 202, 139));
    }//GEN-LAST:event_lbtnMouseExited

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        to.setModel(new DefaultComboBoxModel<>(
                selectDivisa(from.getSelectedItem().toString()).toArray(new String[0])
        ));
    }//GEN-LAST:event_fromActionPerformed

    private void amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyPressed
        if (amount.getText().equals("Cantidad a convertir")) {
            amount.setText("");
            amount.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_amountKeyPressed

    private void amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountMouseClicked
        if (amount.getText().equals("Cantidad a convertir")) {
            amount.setText("");
            amount.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_amountMouseClicked

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        lberror.setText(valNum(amount.getText()));
    }//GEN-LAST:event_amountKeyReleased

    private void lbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtnMouseClicked
        text.setText("");
        lberror.setText(valNum(amount.getText()));
        if (lberror.getText().equals(" ") && !amount.getText().isEmpty()) {
            double cantidad = Double.parseDouble(amount.getText().replace(",", "."));
            String fromDivisa = (String) from.getSelectedItem();
            String toDivisa = (String) to.getSelectedItem();
            double conversion = ConvertirDivisas.convertir(cantidad, divisaAbrev(fromDivisa), divisaAbrev(toDivisa));
            text.setText(cantidad + " " + fromDivisa + " son iguales a " + conversion + " " + toDivisa);
        }
    }//GEN-LAST:event_lbtnMouseClicked

    private String divisaAbrev(String divisa) {
        String abreviada = "";
        switch (divisa) {
            case "Pesos Mexicanos" -> abreviada = "MXN";
            case "Dolares" -> abreviada = "USD";
            case "Euros" -> abreviada = "EUR";
            case "Libras Esterlinas" -> abreviada = "GBP";
            case "Wones" -> abreviada = "KRW";
            case "Yenes" -> abreviada = "JPY";
        }
        return abreviada;
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

    private ArrayList<String> selectDivisa(String selected) {
        ArrayList<String> divisas = new ArrayList<>();
        if (!selected.equals("Pesos Mexicanos")) {
            divisas.add("Pesos Mexicanos");
        }
        if (!selected.equals("Dolares")) {
            divisas.add("Dolares");
        }
        if (!selected.equals("Euros")) {
            divisas.add("Euros");
        }
        if (!selected.equals("Libras Esterlinas")) {
            divisas.add("Libras Esterlinas");
        }
        if (!selected.equals("Wones")) {
            divisas.add("Wones");
        }
        if (!selected.equals("Yenes")) {
            divisas.add("Yenes");
        }
        return divisas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jbtn;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JLabel lberror;
    private javax.swing.JLabel lbtn;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextPane text;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}