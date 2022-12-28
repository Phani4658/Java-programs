import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Mousedemo" width="500" height="500">
</applet>
*/
public class Mousedemo extends Applet implements MouseListener, MouseMotionListener
{
int x=250,y=250;
String s;
public void init( )
{
s=" ";
addMouseListener(this);
addMouseMotionListener(this);
setBackground(Color.cyan);
setForeground(Color.black);
}
public void mouseEntered(MouseEvent me)
{
s="MOUSE ENTERED";
repaint( );}
public void mouseExited(MouseEvent me)
{
s="MOUSE EXITED";
repaint( );
}
public void mousePressed(MouseEvent me)
{
s="MOUSE PRESSED";
repaint( );
}
public void mouseReleased(MouseEvent me)
{
s="MOUSE RELEASED";
repaint();
}
public void mouseMoved(MouseEvent me)
{
s="MOUSE MOVED";
repaint( );
}
public void mouseDragged(MouseEvent me)
{
s="MOUSE DRAGGED";
repaint( );
}
public void mouseClicked(MouseEvent me){
s="MOUSECLICKED";
repaint( );
}
public void paint(Graphics g)
{
g.drawString(s,x,y);
}
}
