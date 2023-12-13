import javax.swing.*;
import java.awt.event.*;
class MyswingApp extends JFrame implements ActionListener  {
    JTextField tf1, tf2;
    JLabel lbl1, lbl2, lblR;
    JButton btnsum, btnsub;
    MyswingApp(){
        tf1=new JTextField();
        tf2=new JTextField();
        lbl1=new JLabel("No.1 : ");
        lbl2=new JLabel("No.2 : ");
        lblR=new JLabel();
        btnsub=new JButton("-");
        btnsum=new JButton("+");
        lbl1.setBounds(20,20,50,40);
        tf1.setBounds(100,20,50,40);
        lbl2.setBounds(20,80,50,40);
        tf2.setBounds(100,80,50,40);
        btnsum.setBounds(30,125,50,40);
        btnsub.setBounds(110,125,50,40);
        lblR.setBounds(30,200,150,40);
        add(lbl1);
        add(tf1);
        add(lbl2);
        add(tf2);
        add(btnsum);
        add(btnsub);
        add(lblR);
        setLayout(null);
        setSize(400,450);
        setDefaultCloseOperation(MyswingApp.EXIT_ON_CLOSE); // Set default close operation
        setVisible(true);
        btnsum.addActionListener(this);
        btnsub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(tf1.getText());
        int b =Integer.parseInt(tf2.getText());
        int result;
        if(e.getSource()==btnsum){
            result=a+b;
            lblR.setText("Value : "+result);
        }
        else if(e.getSource()==btnsub){
            result=a-b;
            lblR.setText("Value : "+result);
        }
    }

    public static void main(String[] args) {
        new MyswingApp();
    }

}