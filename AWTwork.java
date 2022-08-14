import java.awt.*;
import java.awt.event.*;

public class AWTwork extends Frame  {

    int x = 2;
    int[] xArr = {225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285};
    int[] yArr = {400, 420, 400, 420, 400, 420, 400, 420, 400, 420, 400, 420, 400};
    public AWTwork(){

        setSize(500,700);
        setVisible(true);
        setBackground(Color.CYAN);

        Button button = new Button();
        button.setBounds(40,80,80,50);
        button.setLabel("Smile");

        Button button1 = new Button();
        button1.setBounds(140,80,80,50);
        button1.setLabel("Sad");

        Button button2 = new Button();
        button2.setBounds(240,80,80,50);
        button2.setLabel("Normal");

        Button button3 = new Button();
        button3.setBounds(340,80,80,50);
        button3.setLabel("Irritated");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 0; //smile
                repaint();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 1; //sad
                repaint();
            }
        });button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 2; //normal
                repaint();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 3; //irritate
                repaint();
            }
        });


        add(button);
        add(button1);
        add(button2);
        add(button3);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        repaint();


    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(100,200,300,300);
        g.setColor(Color.BLACK);
        g.fillOval(170,300,60,60);
        g.fillOval(290,300,60,60);

        switch (x){
            case 0:
                g.drawArc(210,380,100,45,180,180);
                break;
            case 1:
                g.drawArc(210,380,100,45,0,180);
                break;
            case 2:
                g.drawLine(200,400,310,400);
                break;
            case 3:
                g.drawPolyline(xArr,yArr,xArr.length);
                break;
            default:
                break;
        }

    }

    public static void main(String[] args){
        new AWTwork();
    }

}