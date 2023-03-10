import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Window
{
  JFrame frame;
  JPanel pane;
  Dimension dim;

  JLabel txtOutput;
  JLabel cup;

  CButton onButton;

  CButton button1;
  CButton button2;
  CButton button3;

  CButton milkButton;
  CButton waterButton;
  CButton coffeeButton;

  Image background;
  Image cup_img;
  Image milk_img;
  Image coffee_img;
  Image water_img;
  Image on_img;
  Image off_img;

  Automat automat;
  char on = 'y';

  public void start() throws IOException{
    //init Automat

    //init rest TODO rest
    init();

    //syncing screen with Automat
    while(true){
      refreshScreen();
    }

  }
  public void setAutomat(Automat a){
    this.automat = a;
  }

  private void refreshScreen() {

  }

  private void init() throws IOException {
    frame = new JFrame();
    //init img
    background = ImageIO.read(new File("rsc\\background.png"));
    cup_img = ImageIO.read(new File("rsc\\Cup.png"));
    milk_img = ImageIO.read(new File("rsc\\Milk.jfif"));
    coffee_img = ImageIO.read(new File("rsc\\coffee.png"));
    water_img = ImageIO.read(new File("rsc\\Water.png"));
    on_img = ImageIO.read(new File("rsc\\On.png"));
    off_img = ImageIO.read(new File("rsc\\Off.png"));
    
    //init frame
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setBounds(0, 0, 900, 600);
    frame.setVisible(true);

    //init Background
    pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.drawImage(background, 0, 0,600 ,600 , null);
      }
    };
    pane.setLayout(null);
    //add background to Frame
    frame.getContentPane().add(pane, BorderLayout.CENTER);

    
    txtOutput = new JLabel();
    txtOutput.setBounds(205,165,150,25);
    txtOutput.setText("null");
    txtOutput.setVisible(true);
    txtOutput.setOpaque(true);
    pane.add(txtOutput);

    cup = new JLabel();
    cup.setBounds(200,300,200,200);
    cup.setVisible(false);
    cup.setBackground(Color.BLACK);
    cup.setOpaque(false);
    cup.setIcon(new ImageIcon(this.cup_img));
    pane.add(cup);

    onButton = new CButton(250,500,50,50,this.off_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
        automat.zustandWechseln(on);
      }  
      });
    pane.add(onButton);

    button1 = new CButton(205,185,50,50,this.milk_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  

      }  
      });
    pane.add(button1);

    button2 = new CButton(255,185,50,50,this.cup_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  

      }  
      });
    pane.add(button2);

    button3 = new CButton(305,185,50,50,this.cup_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  

      }  
      });
    pane.add(button3);

    milkButton = new CButton(550,185,70,300,milk_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      }); 
    pane.add(milkButton);

    coffeeButton = new CButton(650,185,70,300,coffee_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      });
    pane.add(coffeeButton);

    waterButton = new CButton(750,185,70,300,water_img,new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      });
    pane.add(waterButton);
  }
}