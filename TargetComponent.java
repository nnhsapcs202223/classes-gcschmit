import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{  
    public TargetComponent()
    {        
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

        // create targets
        Target target1 = new Target(0, 0);
        Target target2 = new Target(150, 200);
        
        // draw targets
        target1.draw(g2);
        target2.draw(g2);      
    }
}
