/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Toolkit;

/**
 *
 * @author leoar
 */
public class InterfaceCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceCalculadora
     */
    public InterfaceCalculadora() {
        initComponents();
        setIcon();
    }
    Double valor1, valor2;
    String sinal;
    Integer ClicouResultado = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmultiplicacao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnmais = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnvirg = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtCalculadora = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        btnSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setText("MR");
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 90, 50, 50);

        jButton2.setText("M-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 90, 50, 50);

        jButton3.setText("???");
        jPanel1.add(jButton3);
        jButton3.setBounds(210, 140, 50, 50);

        jButton4.setText("MS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(110, 90, 50, 50);

        jButton5.setText("M+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(160, 90, 50, 50);

        jButton6.setText("MC");
        jPanel1.add(jButton6);
        jButton6.setBounds(10, 90, 50, 50);

        jButton7.setText("%");
        jPanel1.add(jButton7);
        jButton7.setBounds(210, 190, 50, 50);

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel1.add(btnCE);
        btnCE.setBounds(60, 140, 50, 50);

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC);
        btnC.setBounds(110, 140, 50, 50);

        jButton10.setText("+??");
        jPanel1.add(jButton10);
        jButton10.setBounds(160, 140, 50, 50);

        btnBackspace.setText("???");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackspace);
        btnBackspace.setBounds(10, 140, 50, 50);

        jButton12.setText("1/x");
        jPanel1.add(jButton12);
        jButton12.setBounds(210, 240, 50, 50);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(60, 190, 50, 50);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(110, 190, 50, 50);

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivisao);
        btnDivisao.setBounds(160, 190, 50, 50);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);
        btn7.setBounds(10, 190, 50, 50);

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        jPanel1.add(btnigual);
        btnigual.setBounds(210, 290, 50, 100);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(60, 240, 50, 50);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(110, 240, 50, 50);

        btnmultiplicacao.setText("*");
        btnmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnmultiplicacao);
        btnmultiplicacao.setBounds(160, 240, 50, 50);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(10, 240, 50, 50);

        btnmais.setText("+");
        btnmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaisActionPerformed(evt);
            }
        });
        jPanel1.add(btnmais);
        btnmais.setBounds(160, 340, 50, 50);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(60, 290, 50, 50);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(110, 290, 50, 50);

        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenos);
        btnmenos.setBounds(160, 290, 50, 50);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(10, 290, 50, 50);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);
        btn0.setBounds(10, 340, 100, 50);

        btnvirg.setText(",");
        btnvirg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvirgActionPerformed(evt);
            }
        });
        jPanel1.add(btnvirg);
        btnvirg.setBounds(110, 340, 50, 50);
        jPanel1.add(lblValor);
        lblValor.setBounds(10, 10, 250, 20);

        txtCalculadora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCalculadora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCalculadoraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalculadoraKeyTyped(evt);
            }
        });
        jPanel1.add(txtCalculadora);
        txtCalculadora.setBounds(0, 0, 270, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 390);

        jMenu1.setText("Exibir");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Padr??o");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Cient??fica");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Programador");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Estat??stica");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Hist??rico");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Agrupamento de d??gitos");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("B??sico");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Convers??o de unidades");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("C??lculo de data");
        jMenu1.add(jMenuItem9);

        jMenu4.setText("Planilhas");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Copiar");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Colar");
        jMenu2.add(jMenuItem11);
        jMenu2.add(jSeparator3);

        jMenu5.setText("Hist??rico");
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem12.setText("Exibir Ajuda");
        jMenu3.add(jMenuItem12);
        jMenu3.add(jSeparator4);

        btnSobre.setText("Sobre a Calculadora");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jMenu3.add(btnSobre);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(288, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(ClicouResultado == 1)
        {
            txtCalculadora.setText("");
            ClicouResultado = 0;
        }
        txtCalculadora.setText(txtCalculadora.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaisActionPerformed
        if (!"".equals(txtCalculadora.getText()) && sinal == "")
            {
                valor1 = Double.parseDouble(txtCalculadora.getText());
                txtCalculadora.setText("");
                sinal = btnmais.getText();
            }else if ("".equals(txtCalculadora.getText()) && !"".equals(sinal))
            {
                    sinal = btnmais.getText();
            }else if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
            {
                valor1 = Double.parseDouble(txtCalculadora.getText());
                txtCalculadora.setText("");
                sinal = btnmais.getText();
            }
        lblValor.setText(String.valueOf(valor1)+" "+sinal);
    }//GEN-LAST:event_btnmaisActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
        if (!"".equals(txtCalculadora.getText()) && "".equals(sinal))
            {
        valor1 = Double.parseDouble(txtCalculadora.getText());
        txtCalculadora.setText("");
        sinal = btnmenos.getText();
            }else if ("".equals(txtCalculadora.getText()) && !"".equals(sinal))
                {
                    sinal = btnmenos.getText();
                }else if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
            {
                valor1 = Double.parseDouble(txtCalculadora.getText());
                txtCalculadora.setText("");
                sinal = btnmenos.getText();
            }
        lblValor.setText(String.valueOf(valor1)+" "+sinal);
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
        {
            ClicouResultado = 1;
            valor2 = Double.parseDouble(txtCalculadora.getText());
            if (null != sinal)
            switch (sinal) {
                case "+":
                    txtCalculadora.setText(String.valueOf(valor1+valor2));
                    break;
                case "-":
                    txtCalculadora.setText(String.valueOf(valor1-valor2));
                    break;
                case "/":
                    txtCalculadora.setText(String.valueOf(valor1/valor2));
                    break;
                case "*":
                    txtCalculadora.setText(String.valueOf(valor1*valor2));
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if (!"".equals(txtCalculadora.getText()) && "".equals(sinal))
            {
        valor1 = Double.parseDouble(txtCalculadora.getText());
        txtCalculadora.setText("");
        sinal = btnDivisao.getText();
            }else if ("".equals(txtCalculadora.getText()) && !"".equals(sinal))
                {
                    sinal = btnDivisao.getText();
                }else if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
            {
                valor1 = Double.parseDouble(txtCalculadora.getText());
                txtCalculadora.setText("");
                sinal = btnDivisao.getText();
            }
        lblValor.setText(String.valueOf(valor1)+" "+sinal);
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnvirgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvirgActionPerformed
        txtCalculadora.setText(txtCalculadora.getText()+".");
    }//GEN-LAST:event_btnvirgActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        sinal = "";
        txtCalculadora.setText("");
        lblValor.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnmultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacaoActionPerformed
        if (!"".equals(txtCalculadora.getText()) && "".equals(sinal))
            {
        valor1 = Double.parseDouble(txtCalculadora.getText());
        txtCalculadora.setText("");
        sinal = btnmultiplicacao.getText();
            }else if ("".equals(txtCalculadora.getText()) && !"".equals(sinal))
                {
                    sinal = btnmultiplicacao.getText();
                }else if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
            {
                valor1 = Double.parseDouble(txtCalculadora.getText());
                txtCalculadora.setText("");
                sinal = btnmultiplicacao.getText();
            }
        lblValor.setText(String.valueOf(valor1)+" "+sinal);
    }//GEN-LAST:event_btnmultiplicacaoActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        if (!"".equals(txtCalculadora.getText()) && !"".equals(sinal))
        {
            txtCalculadora.setText("");
        }
    }//GEN-LAST:event_btnCEActionPerformed

    private void txtCalculadoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalculadoraKeyTyped
        //FIZ ISSO PARA QUE N??O SEJA POSS??VEL DIGITAR LETRAS
        boolean tecla = false;
        Character ch = evt.getKeyChar();
   
        if (Character.isDigit(evt.getKeyChar()) || String.valueOf(ch).equals(".")) {
            tecla = true;
        }
        int comprimentoDeCampo = txtCalculadora.getText().length();
  
        if (!tecla || comprimentoDeCampo == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCalculadoraKeyTyped

    private void txtCalculadoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalculadoraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalculadoraKeyPressed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        if (!"".equals(txtCalculadora.getText()))
        {
        char letra = txtCalculadora.getText().charAt(txtCalculadora.getText().length()-1);
        txtCalculadora.setText(txtCalculadora.getText().replace(String.valueOf(letra), ""));
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmais;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnmultiplicacao;
    private javax.swing.JButton btnvirg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCalculadora;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculator.png")));
    }
}
