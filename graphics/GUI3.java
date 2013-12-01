/*
 * Created by JFormDesigner on Thu Nov 28 21:55:33 CET 2013
 */

package GlobalFighter.graphics;

import GlobalFighter.Storage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Calle Kalle
 */
public class GUI3 extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Calle Kalle
    private JLabel label1;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JEditorPane editorPane1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField entityField;
    private JLabel label3;
    private JTextField foodfield;
    private JLabel label4;
    private JTextField lootField;
    private JCheckBox lootCheck;
    private JCheckBox herbsCheck;
    private JCheckBox foodCheck;
    private JPanel panel3;
    private JLabel label5;
    private JTextField startLoc;
    private JLabel label6;
    private JButton setStart;
    private JTextField bankLoc;
    private JButton setBank;
    private JCheckBox bankCheck;
    private JPanel panel4;
    private JLabel label7;
    private JTextField profileField;
    private JButton loadButton;
    private JButton saveButton;
    private JButton button1;

    public GUI3() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        Storage.TARGET = entityField.getText();
        Storage.WHICHFOOD = Integer.parseInt(foodfield.getText());
        Storage.TOLOOT = Integer.parseInt(lootField.getText());
        if (herbsCheck.isSelected()) {
            Storage.HERBS = true;
        }
        if (lootCheck.isSelected()) {
            Storage.LOOT = true;
        }
        if (foodCheck.isSelected()) {
            Storage.FOOD = true;
        }
        Storage.START = true;
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Calle Kalle
        label1 = new JLabel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        editorPane1 = new JEditorPane();
        panel2 = new JPanel();
        label2 = new JLabel();
        entityField = new JTextField();
        label3 = new JLabel();
        foodfield = new JTextField();
        label4 = new JLabel();
        lootField = new JTextField();
        lootCheck = new JCheckBox();
        herbsCheck = new JCheckBox();
        foodCheck = new JCheckBox();
        panel3 = new JPanel();
        label5 = new JLabel();
        startLoc = new JTextField();
        label6 = new JLabel();
        setStart = new JButton();
        bankLoc = new JTextField();
        setBank = new JButton();
        bankCheck = new JCheckBox();
        panel4 = new JPanel();
        label7 = new JLabel();
        profileField = new JTextField();
        loadButton = new JButton();
        saveButton = new JButton();
        button1 = new JButton();

        //======== this ========
        setTitle("GlobalFighter Settings");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("GlobalFighter");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 19f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(80, 10), label1.getPreferredSize()));

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                        new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                                java.awt.Color.red), panel1.getBorder()));
                panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                    public void propertyChange(java.beans.PropertyChangeEvent e) {
                        if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                    }
                });

                panel1.setLayout(null);

                //======== scrollPane2 ========
                {

                    //---- editorPane1 ----
                    editorPane1.setText("Thanks for using GlobalFighter 1.0\nThe Current Version Contains Attacking any Entity, Looting anything & Eat anything\n\nInstructions how to get Food & Loot ID:\n\nDebug -> Inventory -> Enter Food ID there.\nDebug -> GroundItems -> Loot ID there.\nEnJoy It, Any bugs Report to Thread at www.Shadowbot.org/forum/");
                    editorPane1.setEditable(false);
                    scrollPane2.setViewportView(editorPane1);
                }
                panel1.add(scrollPane2);
                scrollPane2.setBounds(0, 5, 390, 155);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for (int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Main", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label2 ----
                label2.setText("Select Entity");
                panel2.add(label2);
                label2.setBounds(5, 15, label2.getPreferredSize().width, 20);

                //---- entityField ----
                entityField.setText("Chicken");
                panel2.add(entityField);
                entityField.setBounds(70, 15, 315, entityField.getPreferredSize().height);

                //---- label3 ----
                label3.setText("Select Food");
                panel2.add(label3);
                label3.setBounds(5, 40, label3.getPreferredSize().width, 20);

                //---- foodfield ----
                foodfield.setText("0");
                panel2.add(foodfield);
                foodfield.setBounds(70, 40, 315, 22);

                //---- label4 ----
                label4.setText("Select Loot");
                panel2.add(label4);
                label4.setBounds(5, 65, label4.getPreferredSize().width, 20);

                //---- lootField ----
                lootField.setText("0");
                panel2.add(lootField);
                lootField.setBounds(70, 65, 315, 22);

                //---- lootCheck ----
                lootCheck.setText("Loot");
                panel2.add(lootCheck);
                lootCheck.setBounds(new Rectangle(new Point(5, 95), lootCheck.getPreferredSize()));

                //---- herbsCheck ----
                herbsCheck.setText("Herbs");
                panel2.add(herbsCheck);
                herbsCheck.setBounds(new Rectangle(new Point(5, 120), herbsCheck.getPreferredSize()));

                //---- foodCheck ----
                foodCheck.setText("Food");
                panel2.add(foodCheck);
                foodCheck.setBounds(new Rectangle(new Point(70, 95), foodCheck.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for (int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Functions", panel2);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- label5 ----
                label5.setText("Choose Entity Location Below");
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));
                panel3.add(label5);
                label5.setBounds(new Rectangle(new Point(5, 15), label5.getPreferredSize()));
                panel3.add(startLoc);
                startLoc.setBounds(0, 35, 295, startLoc.getPreferredSize().height);

                //---- label6 ----
                label6.setText("Choose Bank Location Below");
                label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
                panel3.add(label6);
                label6.setBounds(5, 70, 164, 14);

                //---- setStart ----
                setStart.setText("Set");
                panel3.add(setStart);
                setStart.setBounds(305, 30, 80, 30);
                panel3.add(bankLoc);
                bankLoc.setBounds(0, 89, 295, 22);

                //---- setBank ----
                setBank.setText("Set");
                panel3.add(setBank);
                setBank.setBounds(305, 85, 80, 30);

                //---- bankCheck ----
                bankCheck.setText("Bank");
                panel3.add(bankCheck);
                bankCheck.setBounds(new Rectangle(new Point(5, 120), bankCheck.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for (int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Banking", panel3);
            tabbedPane1.setEnabledAt(2, false);

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //---- label7 ----
                label7.setText("Profile");
                panel4.add(label7);
                label7.setBounds(5, 10, label7.getPreferredSize().width, 24);
                panel4.add(profileField);
                profileField.setBounds(40, 10, 340, profileField.getPreferredSize().height);

                //---- loadButton ----
                loadButton.setText("Load");
                panel4.add(loadButton);
                loadButton.setBounds(40, 40, 115, loadButton.getPreferredSize().height);

                //---- saveButton ----
                saveButton.setText("Save");
                panel4.add(saveButton);
                saveButton.setBounds(155, 40, 115, 26);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for (int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Profiles", panel4);
            tabbedPane1.setEnabledAt(3, false);
        }
        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(0, 60, 395, 185);

        //---- button1 ----
        button1.setText("Start Fighting");
        button1.setFont(new Font("Tahoma", Font.BOLD, 26));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(0, 245, 390, 65);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
