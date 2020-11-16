import javax.swing.*;
import java.awt.*;

/**
 * This represents the window itself, but not the graphics area.
 */
public class GraphicDemoWindow extends JFrame
{

    private GraphicsPane myPane; // this is the code that will define what content we put into the window.

    public GraphicDemoWindow()
    {
        super("Graphic Demo!"); // creates the window and sets its title.

        setSize(600,600);

        getContentPane().setLayout(new GridLayout(1,1)); // this makes the panel "stretch" to fit the window.
        myPane = new GraphicsPane();
        getContentPane().add(myPane); // put the graphics panel into the content area of this window.

        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quit when we close the window.


    }


}
