import javax.swing.*;
import java.awt.event.*;
public class MalefemaleFeeApp extends JFrame implements ActionListener {
    
    JLabel Jltution,Jlreg,Jllib,Jlmisc,Jltotalfee;
    JTextField tftution,tfreg,tflib,tfmisc,tfTotal;
    JRadioButton rbtnM,rbtnF;
    ButtonGroup bg;
    MalefemaleFeeApp(){
        Jltution=new JLabel("Tution Fee      :");
        Jlreg=new JLabel("Registration Fee   :");
        Jllib= new JLabel("Library Fee       :");
        Jlmisc=new JLabel("Miscelenous Fee   :");
        tftution=new JTextField();
        tfreg=new JTextField();
        tflib = new JTextField();
        tfmisc=new JTextField();
        rbtnM=new JRadioButton("Male");
        rbtnF=new JRadioButton("Female");
        Jltotalfee=new JLabel("Total Fee     :");
        tfTotal=new JTextField();
        bg=new ButtonGroup();
        bg.add(rbtnM);
        bg.add(rbtnF);
        Jltution.setBounds(30,20,150,30);
        tftution.setBounds(200,20,100,30);
        Jlreg.setBounds(30,70,150,30);
        tfreg.setBounds(200,70,100,30);
        Jllib.setBounds(30,120,150,30);
        tflib.setBounds(200,120,100,30);
        Jlmisc.setBounds(30,170,150,30);
        tfmisc.setBounds(200,170,100,30);
        rbtnM.setBounds(50,200,70,30);
        rbtnF.setBounds(150,200,100,30);
        Jltotalfee.setBounds(50,250,100,30);
        tfTotal.setBounds(150,250,130,30);
        add(Jltution);
        add(tftution);
        add(Jlreg);
        add(tfreg);
        add(Jllib);
        add(tflib);
        add(Jlmisc);
        add(tfmisc);
        add(rbtnM);
        add(rbtnF);
        add(Jltotalfee);
        add(tfTotal);
        setLayout(null); 
        setSize(500, 500); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rbtnM.addActionListener(this);
        rbtnF.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Double tfee=Double.parseDouble(tftution.getText());
        Double regfee=Double.parseDouble(tfreg.getText());
        Double libfee=Double.parseDouble(tflib.getText());
        Double miscfee=Double.parseDouble(tfmisc.getText());
        Double totalfee;
        if(rbtnM.isSelected()==true){
            totalfee=tfee+regfee+libfee+miscfee;
            tfTotal.setText("RS. "+totalfee);
        }
        else if(rbtnF.isSelected()==true){
            tfee=tfee-(tfee*0.2);
            regfee=regfee-(regfee*0.5);
            totalfee=tfee+regfee+libfee+miscfee;
            tfTotal.setText("RS. "+totalfee);
        }
    }
    public static void main(String[] args){
        new MalefemaleFeeApp();
    }
}
