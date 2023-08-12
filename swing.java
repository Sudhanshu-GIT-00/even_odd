import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener {
	float a,b,rs;
    
    Container con;
    
    JLabel lblfirst,lblsecond,lblresult;
    JTextField txtfirst,txtsecond,txtresult;
    JButton btnadd,btnsub,btnmulti,btndiv,btnreset,btnexit;
    
    calculator()
    {
    con = getContentPane();
    //FlowLayout fl = new FlowLayout();
    //con.setLayout(fl);
	con.setLayout(null);
    lblfirst = new JLabel("First number");
    lblsecond = new JLabel("Second number");
    lblresult = new JLabel("Result");
    txtfirst = new JTextField(10);
    txtsecond = new JTextField(10);
    txtresult = new JTextField(10);
    btnadd = new JButton("+");
    btnsub = new JButton("-");
    btnmulti = new JButton("*");
    btndiv = new JButton("/");
    btnreset = new JButton("Reset");
    btnexit = new JButton("Exit");
    con.add(lblfirst);con.add(txtfirst);
    con.add(lblsecond);con.add(txtsecond);
    con.add(lblresult);con.add(txtresult);
    con.add(btnadd);con.add(btnsub);
    con.add(btnmulti);con.add(btndiv);
    con.add(btnreset);con.add(btnexit);
    setSize(400,400);
    setTitle("Calculator");
    show();
	
	btnadd.addActionListener(this);
	btnsub.addActionListener(this);
	btnmulti.addActionListener(this);
	btndiv.addActionListener(this);
	btnreset.addActionListener(this);
	btnexit.addActionListener(this);
	lblfirst.setBounds(40,40,100,20);lblfirst.setBounds(160,40,100,20);
	lblsecond.setBounds(40,80,100,20);lblsecond.setBounds(160,80,100,20);
    
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==btnadd)
	{
		a=Float.parseFloat(txtfirst.getText());
		b=Float.parseFloat(txtsecond.getText());
		rs=a+b;
		txtresult.setText(Float.toString(rs));
		//txtresult.setText(rs"+");
	}
	if(ae.getSource()==btnsub)
	{
		a=Float.parseFloat(txtfirst.getText());
		b=Float.parseFloat(txtsecond.getText());
		rs=a-b;
		txtresult.setText(Float.toString(rs));
		//txtresult.setText(rs"+");
	}
	if(ae.getSource()==btnmulti)
	{
		a=Float.parseFloat(txtfirst.getText());
		b=Float.parseFloat(txtsecond.getText());
		rs=a*b;
		txtresult.setText(Float.toString(rs));
		//txtresult.setText(rs"+");
	}
	if(ae.getSource()==btndiv)
	{
		a=Float.parseFloat(txtfirst.getText());
		b=Float.parseFloat(txtsecond.getText());
		rs=a/b;
		txtresult.setText(Float.toString(rs));
		//txtresult.setText(rs"+");
	}
	if(ae.getSource()==btnreset)
	{
		txtfirst.getText("");
		txtsecond.getText("");
		txtresult.getText("");
		txtfirst.requestFocus();
		
		//txtresult.setText(rs"+");
	}
	if(ae.getSource()==btnexit)
	{
		System.exit(0);
	}
}

public static void main(String args[]) {
        calculator obj = new calculator();   
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/


	
	

















}