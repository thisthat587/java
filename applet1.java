import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// <applet code="applet1.class" width="500" height="500"></applet>
public class applet1 extends Applet implements ActionListener {
    JButton b;
    JLabel jl;
    public void init(){
        b=new JButton("Ok");
        jl=new JLabel();
        b.setBounds(25,25,150,30);
        jl.setBounds(25,100,150,30);
        add(b);
        add(jl);
        setLayout(null);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        jl.setText("Welcome");
    }
}
