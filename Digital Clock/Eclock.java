import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;

class EClock extends Frame
{
	
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JLabel l1 = new JLabel(".");
JLabel l2 = new JLabel(".");
JLabel l3 = new JLabel(".");
JLabel l4 = new JLabel(".");
JTextField t1 = new JTextField();
Panel p = new Panel();


Font f = new Font("TORCH",Font.BOLD,40);
Font f1 = new Font("TORCH",Font.BOLD,30);

EClock()
{
ImageIcon logo=new ImageIcon("icon.png");
setIconImage ( logo.getImage());
setVisible(true);
setSize(500,500);
setBackground(Color.WHITE);
b1.setBackground(Color.BLACK);
b2.setBackground(Color.BLACK);
b3.setBackground(Color.BLACK);
b1.setForeground(Color.GREEN);
b2.setForeground(Color.GREEN);
b3.setForeground(Color.GREEN);
l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);

b1.setFont(f1);
b2.setFont(f1);
b3.setFont(f1);

p.add(b1);
p.add(b2);
p.add(b3);
p.add(l1);
p.add(l2);
p.add(l3);
p.add(l4);

p.setLayout(null);

b1.setBounds(100,150,70,70);
l1.setBounds(180,135,10,50);
b2.setBounds(200,150,70,70);
l2.setBounds(180,165,10,50);
b3.setBounds(300,150,70,70);
l3.setBounds(280,135,10,50);
l4.setBounds(280,165,10,50);
add(p,BorderLayout.CENTER);
add(t1,BorderLayout.NORTH);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}

});

fun();
}
void fun()
{
DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss");
while(true)
{
        String []a = d.format(LocalDateTime.now()).split(":");
        b1.setLabel(a[0]);
        b2.setLabel(a[1]);
        b3.setLabel(a[2]);
        t1.setText("Date : " +LocalDate.now().toString());
        try{
        Thread.sleep(1000);
        }catch(Exception e){}
        }
}
public static void main(String[] args) {
new EClock();
}
}

