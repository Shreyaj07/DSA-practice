import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vonKoch extends JFrame implements ActionListener {
    public vonKoch(){
        super("von Koch Snowflake");
        JButton draw = new JButton("draw");
        lvl = new TextField("4",3);
        len = new TextField("200",3);
        lvl.addActionListener(this);
        len.addActionListener(this);
        draw.addActionListener(this);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Level"));
        cp.add(lvl);
        cp.add(len);
        cp.add(draw);
        panel.setBackground(Color.pink);
        panel.setForeground(Color.white);
        panel.setPreferredSize(new Dimension(600,400));
        cp.add(panel);
        setSize(700,500);
        cp.setBackground(Color.red);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static final long serialVersionUID=123;
    private TextField lvl,len;
    private MyPanel panel = new MyPanel();
    private double angle;
    private Point currentPt, pt = new Point();
    private void right(double x){
        angle+=x;
    }
    private void left(double x){
        angle-=x;
    }
    private void draw4Lines(double side, int level, Graphics g){
        if(level==0){
            //angle to be given in radians
            pt.x = ((int) (Math.cos(angle*Math.PI/180)*side))+currentPt.x;
            pt.y = ((int) (Math.sin(angle*Math.PI/180)*side))+currentPt.y;
            g.drawLine(currentPt.x,currentPt.y,pt.x,pt.y);
            currentPt.x = pt.x;
            currentPt.y = pt.y;
        }else{
            draw4Lines(side/3.0,level-1,g);
            left(60);
            draw4Lines(side/3.0,level-1,g);
            right(120);
            draw4Lines(side/3.0,level-1,g);
            left(60);
            draw4Lines(side/3.0,level-1,g);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        panel.repaint();
    }
    class MyPanel extends JPanel{
        static final long serialVersionUID = 124;
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int level = Integer.parseInt(lvl.getText().trim());
            double side = Double.parseDouble(len.getText().trim());
            currentPt = new Point(200,150);
            angle = 0;
            for(int i=1; i<=3; i++){
                draw4Lines(side,level,g);
            }
        }
    }

    public static void main(String[] args) {
        new vonKoch();
    }
}
