import javax.swing.*;
import java.awt.*;

public class GraphicsPane extends JPanel
{

    public GraphicsPane()
    {
        super(); // does the business of making this act like a panel.
        setBackground(Color.gray);
    }

    public void paintComponent(Graphics g) // "g" represents the palette and canvas. This gets called only when needed to update.
    {
        super.paintComponent(g); // clears the screen with the background color.

        g.setColor(new Color(200,64,255));
        g.fillOval(30,50,80,20);

        g.setColor(Color.YELLOW);
        g.drawRect(100,300,50,50);

    }


}
