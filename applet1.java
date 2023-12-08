import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// <applet code="applet1.class" width="500" height="500"></applet>
public class applet1 extends Applet implements ActionListener {
    JButton b;
    JLabel jl;
    public void init(){
        b=new JButton("Get SUM : ");
        jl=new JLabel();
        b.setBounds(25,25,150,30);
        jl.setBounds(25,100,150,30);
        jl.setFont(new Font("Arial", Font.BOLD, 15));
        jl.setBackground(Color.CYAN);
        jl.setForeground(Color.RED);
        add(b);
        add(jl);
        setLayout(null);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        int a=5,b=6;
        int sum=a+b;
        jl.setText("Sum of " + a + " and " + b + " is " + sum);
    }
}
