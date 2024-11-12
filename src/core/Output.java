package core;

import tools.Testable;
import javax.swing.*;

public class Output implements Testable {
    //Properties
    private JPanel mainPanel;
    private JFrame mainFrame;
    private JButton button;

    //Constructor Method
    Output() {
        TestMe();
        CreateWindow();
    }

    //MainMethod for whole UI creation, may end up as delegator method
    private void CreateWindow()
    {
        // Create window 600x600
        // Create background panel
        // Create create Square squares[3][3], Square extends JButton
        // Show UI
    }

}
