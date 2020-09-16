import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener 
{ 
    Button ad, su, mu; TextField num1, num2, res; Label heading; 
    calculator() {
        super("Application"); 
        // calling constructor of superclass - Frame class
        ad = new Button("Add"); 
        su = new Button("Sub"); 
        mu = new Button("Mul"); 
        heading=new Label("Calculator"); 
        num1=new TextField(10); 
        num2=new TextField(10); 
        res=new TextField(10); 
        add(heading); 
        add(ad);
        add(su); 
        add(mu); 
        add(num1); 
        add(num2); 
        add(res);
        setLayout(null); 
        ad.setBounds(125, 10, 75, 200);
        su.setBounds(200, 10, 75, 20); 
        mu.setBounds(200, 50, 75, 20); 
        num1.setBounds(10, 40, 100, 20); 
        num2.setBounds(10, 70, 100, 20); 
        res.setBounds(10, 150, 100, 20); 
        heading.setBounds(20, 10, 100, 20);
        setSize(500, 300); setVisible(true);
        
        ad.addActionListener(this); 
        su.addActionListener(this); 
        mu.addActionListener(this); } 
        public void actionPerformed(ActionEvent ae) 
        {
            Object source = ae.getSource(); 
            int n1, n2, result; 
            String strnum1=num1.getText();
            n1=Integer.parseInt(strnum1);
            n2 = Integer.parseInt(num2.getText()); 
            if(source==ad){
                result=n1+n2; 
                res.setText(Integer.toString(result)); 
        } 
        else if(source==su) {
            result=n1-n2; 
            res.setText(Integer.toString(result)); 
        } 
        else { 
            result=n1*n2; res.setText(Integer.toString(result));
        } 
    }
        public static void main(String args[])
        { 
            calculator obj = new calculator(); 
            // create object of class Calculator & call its constructor 
        } 
}