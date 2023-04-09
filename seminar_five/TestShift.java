package seminar_five;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class TestShift
{
    
    public TestShift()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 600));
        panel.setOpaque(false);
        JFrame win = new JFrame("Клавиши");
        win.add(panel);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);
        win.pack();
        win.setLayout(null);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
        
        win.addKeyListener(new imputListener());
    }
    
    public class imputListener implements KeyListener
    { 
        public void keyPressed(KeyEvent e)
        {
            switch (e.getKeyCode()) 
            {
                case KeyEvent.VK_UP:
                    System.out.println("Up key pressed");
                break;
                case KeyEvent.VK_DOWN:
                    System.out.println("Down key pressed");
                break;
                case KeyEvent.VK_LEFT:
                    System.out.println("Left key pressed");
                break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("Right key pressed");
                break;
            }
    
            if(e.getKeyCode() == KeyEvent.VK_A)
            {
                if(e.isShiftDown())
                {
                    System.out.println("Shift key + A pressed");
                } 
                else
                {
                    System.out.println("A key pressed");
                }
            }
        }
 
        
        public void keyReleased(KeyEvent e)
        {
            //...
        }
 
 
        public void keyTyped(KeyEvent e)
        {
            //...
        }
    }
    
    
    public static void main(String[] args)
    {
        new TestShift();
    }
}