import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// <applet code="applet1.class" width="500" height="500"></applet>
public class Applet1 extends Applet implements ActionListener {
    JButton btnsum;
    JButton btnsub;
    JButton btnmul;
    JButton btndiv;
    JLabel linput1;
    JLabel linput2;
    JLabel jl;
    JTextField txtfld1;
    JTextField txtfld2;

    public void init() {
        btnsum = new JButton("<html><b>+</b></html>");
        btnsub = new JButton("<html><b>-</b></html>");
        btnmul = new JButton("<html><b>*</b></html>");
        btndiv = new JButton("<html><b>/</b></html>");

        jl = new JLabel();
        jl.setBounds(150, 300, 350, 30);
        jl.setFont(new Font("Arial", Font.BOLD, 20));

        linput1 = new JLabel("Enter First number : ");
        linput1.setBounds(50, 100, 350, 30);
        linput2 = new JLabel("Enter Second number : ");
        linput2.setBounds(50, 150, 350, 30);

        txtfld1 = new JTextField(20);
        txtfld1.setBounds(200, 100, 175, 30);

        txtfld2 = new JTextField(20);
        txtfld2.setBounds(200, 150, 175, 30);

        btnsum.setBounds(120, 200, 50, 30);
        btnsub.setBounds(190, 200, 50, 30);
        btnmul.setBounds(260, 200, 50, 30);
        btndiv.setBounds(330, 200, 50, 30);

        // jl.setBackground(Color.CYAN);
        // jl.setForeground(Color.RED);
        add(jl);
        add(linput1);
        add(linput2);
        add(txtfld1);
        add(txtfld2);
        add(btnsum);
        add(btnsub);
        add(btnmul);
        add(btndiv);
        setLayout(null);
        btnsum.addActionListener(this);
        btnsub.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String input1 = txtfld1.getText();
        String input2 = txtfld2.getText();
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        Double result;

        if (e.getSource() == btnsum) {
            result = num1 + num2;
            jl.setText("RESULT : "+result);
        }

        else if (e.getSource() == btnsub) {
            result = num1 - num2;
            jl.setText("RESULT : "+result);

        }

        else if (e.getSource() == btnmul) {
            result = num1 * num2;
            jl.setText("RESULT : "+result);

        }

        else if (e.getSource() == btndiv) {
            result = num1 / num2;
            jl.setText("RESULT : "+result);

        }
    }

}
