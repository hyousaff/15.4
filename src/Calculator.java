// Hamza Yousaf
// Chapter 15 ex 15.4


import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Panel p1,p2;
    String s1="",s2="";
    double result=0.0;
    public Calculator()
    {
        l1=new Label("Number 1");
        l2=new Label("Number 2");
        l3=new Label("Result");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Subtract");
        b3=new Button("Multiply");
        b4=new Button("Divide");
        p1=new Panel();
        p2=new Panel();
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1,"North");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p2,"South");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setTitle("Sample Caliculator Frame");
        setSize(600,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==b1)
        {
            s1=t1.getText();
            double n1=Double.parseDouble(s1);
            s2=t2.getText();
            double n2=Double.parseDouble(s2);
            result=(n1+n2);
            t3.setText(""+result);
            t1.setText("");
            t2.setText("");
        }
        if(e.getSource()==b2)
        {
            s1=t1.getText();
            double n1=Double.parseDouble(s1);
            s2=t2.getText();
            double n2=Double.parseDouble(s2);
            result=n1-n2;
            t3.setText(""+result);
            t1.setText("");
            t2.setText("");
        }
        if(e.getSource()==b3)
        {
            s1=t1.getText();
            double n1=Double.parseDouble(s1);
            s2=t2.getText();
            double n2=Double.parseDouble(s2);
            result=n1*n2;
            t3.setText(""+result);
            t1.setText("");
            t2.setText("");
        }
        if(e.getSource()==b4)
        {
            s1=t1.getText();
            double n1=Double.parseDouble(s1);
            s2=t2.getText();
            double n2=Double.parseDouble(s2);
            result=n1/n2;
            t3.setText(""+result);
            t1.setText("");
            t2.setText("");
        }
    }
    public static void main(String args[])
    {
        Calculator cc=new Calculator();
    }
}