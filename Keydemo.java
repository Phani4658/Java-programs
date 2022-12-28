import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Keydemo" width="500" height="500">
</applet>
*/
public class Keydemo extends Applet implements KeyListener
{
int x=100,y=100;
String s=" ";
public void init( )
{
setBackground(Color.ORANGE);
setForeground(Color.BLACK);
addKeyListener(this);
requestFocus( );
}
public void keyPressed(KeyEvent ke)
{
s="KEY DOWN";
showStatus(s);
}
public void keyReleased(KeyEvent ke)
{
s="KEY UP";
showStatus(s);
}
public void keyTyped(KeyEvent ke)
{
s=s+ke.getKeyChar( );
showStatus(s);
}
public void paint(Graphics g)
{
g.drawString("KEY EVENTS",x,y);
}
}
