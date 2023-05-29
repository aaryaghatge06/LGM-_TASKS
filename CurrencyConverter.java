public class CurrencyConverter extends javax.swing.JFrame {
    public CurrencyConverter() {
        initComponents();
    }
   
    private void initComponents() {

        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        choiceFrom = new javax.swing.JComboBox();
        choiceTo = new javax.swing.JComboBox();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 0, 0));
        getContentPane().setBackground(new java.awt.Color(255, 255, 0));

        title.setFont(new java.awt.Font("Verdana", 12, 40));
        title.setText("CURRENCY CONVERTER ");
        title.setVerifyInputWhenFocusTarget(false);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 18));
        jButton1.setText("CONVERT CURRENCY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel1.setText("Enter Amount ");

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel2.setText("Convert From");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel3.setText("Convert To");

        input.setFont(new java.awt.Font("Garamond", 0, 18));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        choiceFrom.setFont(new java.awt.Font("Garamond", 1, 18));
        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indian Rupee", "United States Dollar", "Euro", "Canadian Dollar", "Japanese Yen", "Chinese Yuan", "Bitcoin" }));
        choiceFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceFromItemStateChanged(evt);
            }
        });

        choiceTo.setFont(new java.awt.Font("Garamond", 1, 18));
        choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indian Rupee", "United States Dollar", "Euro", "Canadian Dollar", "Japanese Yen", "Chinese Yuan", "Bitcoin" }));
        choiceTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceToItemStateChanged(evt);
            }
        });

        output.setFont(new java.awt.Font("Garamond", 1, 24));
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(choiceFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choiceTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        double num = Double.parseDouble(input.getText());
        String from = (String) choiceFrom.getSelectedItem();
        String to = (String) choiceTo.getSelectedItem();

        double result;
        switch (from) {
            case "Indian Rupee":
                switch (to) {
                    case "Indian Rupee":
                        result = num;
                        break;
                    case "United States Dollar":
                        result = num / 73.33;
                        break;
                    case "Euro":
                        result = num / 88.13;
                        break;
                    case "Canadian Dollar":
                        result = num / 60.19;
                        break;
                    case "Japanese Yen":
                        result = num / 0.67;
                        break;
                    case "Chinese Yuan":
                        result = num / 11.43;
                        break;
                    case "Bitcoin":
                        result = num / 3212104.20;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "United States Dollar":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 73.33;
                        break;
                    case "United States Dollar":
                        result = num;
                        break;
                    case "Euro":
                        result = num * 0.84;
                        break;
                    case "Canadian Dollar":
                        result = num * 1.21;
                        break;
                    case "Japanese Yen":
                        result = num * 109.90;
                        break;
                    case "Chinese Yuan":
                        result = num * 6.37;
                        break;
                    case "Bitcoin":
                        result = num * 0.00003;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "Euro":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 88.13;
                        break;
                    case "United States Dollar":
                        result = num * 1.19;
                        break;
                    case "Euro":
                        result = num;
                        break;
                    case "Canadian Dollar":
                        result = num * 1.45;
                        break;
                    case "Japanese Yen":
                        result = num * 132.23;
                        break;
                    case "Chinese Yuan":
                        result = num * 7.68;
                        break;
                    case "Bitcoin":
                        result = num * 0.000036;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "Canadian Dollar":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 60.19;
                        break;
                    case "United States Dollar":
                        result = num * 0.83;
                        break;
                    case "Euro":
                        result = num * 0.69;
                        break;
                    case "Canadian Dollar":
                        result = num;
                        break;
                    case "Japanese Yen":
                        result = num * 91.18;
                        break;
                    case "Chinese Yuan":
                        result = num * 5.31;
                        break;
                    case "Bitcoin":
                        result = num * 0.000026;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "Japanese Yen":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 0.67;
                        break;
                    case "United States Dollar":
                        result = num * 0.0091;
                        break;
                    case "Euro":
                        result = num * 0.0076;
                        break;
                    case "Canadian Dollar":
                        result = num * 0.011;
                        break;
                    case "Japanese Yen":
                        result = num;
                        break;
                    case "Chinese Yuan":
                        result = num * 0.058;
                        break;
                    case "Bitcoin":
                        result = num * 0.0000004;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "Chinese Yuan":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 11.43;
                        break;
                    case "United States Dollar":
                        result = num * 0.16;
                        break;
                    case "Euro":
                        result = num * 0.13;
                        break;
                    case "Canadian Dollar":
                        result = num * 0.19;
                        break;
                    case "Japanese Yen":
                        result = num * 17.23;
                        break;
                    case "Chinese Yuan":
                        result = num;
                        break;
                    case "Bitcoin":
                        result = num * 0.000001;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            case "Bitcoin":
                switch (to) {
                    case "Indian Rupee":
                        result = num * 3212104.20;
                        break;
                    case "United States Dollar":
                        result = num * 36674.15;
                        break;
                    case "Euro":
                        result = num * 27818.98;
                        break;
                    case "Canadian Dollar":
                        result = num * 39297.55;
                        break;
                    case "Japanese Yen":
                        result = num * 2895252.50;
                        break;
                    case "Chinese Yuan":
                        result = num * 654278.18;
                        break;
                    case "Bitcoin":
                        result = num;
                        break;
                    default:
                        result = 0.0;
                }
                break;

            default:
                result = 0.0;
        }

        output.setText(String.valueOf(result));
    }

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void choiceFromItemStateChanged(java.awt.event.ItemEvent evt) {
    }

    private void choiceToItemStateChanged(java.awt.event.ItemEvent evt) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox choiceFrom;
    private javax.swing.JComboBox choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;

}
