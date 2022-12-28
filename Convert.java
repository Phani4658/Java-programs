import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Convert" width="500" height="500">
</applet>
*/
public class Convert extends Applet implements ActionListener
{
Label l1= new Label("ENTER A DECIMAL NUMBER");
Label l2= new Label("THE EQUIVALENT BINARY NUMBER IS");
TextField tf1=new TextField(10);
TextField tf2=new TextField(10);
Button b=new Button("CONVERT");
public void init( )
{
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b);
b.addActionListener(this);}
public void actionPerformed(ActionEvent ae)
{
String s,t;
int i,j,p,r;
int a[ ]=new int[20];
t=" ";
s=tf1.getText( );
p=Integer.parseInt(s);
i=0;
while(p>0)
{
r=p%2;
a[i]=r;
i=i+1;
p=p/2;
}
for(j=i;j>=0;j--)
{
t=t+Integer.toString(a[j]);
}
tf2.setText(t);
}
}
