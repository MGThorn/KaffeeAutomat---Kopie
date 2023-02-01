import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CButton extends JButton {
    CButton(int x,int y, int width,int hight, Image img,ActionListener l){

    this.setBounds(x,y,width,hight);
    this.setIcon(new ImageIcon(img));
    this.addActionListener(l);

    this.setVisible(true);
    this.setOpaque(true);
    this.setBorderPainted(false);
    this.setContentAreaFilled(false);
    this.setFocusable(false); 
    }
}
