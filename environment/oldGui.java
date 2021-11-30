package environment;

import javax.swing.*;
import info.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oldGui implements ActionListener{
    
    private JFrame frame;
    private JButton fButton;

    public oldGui() {

        // version of program
        version v = new version();

        frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setVisible(true);

        JLabel label = new JLabel(); 
        //label.setText("line\nother line");
        label.setText("<HTML>conifer jar<BR>Select a file and input a file name to create an executable .jar file</HTML>");
        label.setIcon(new ImageIcon("info/osman-rana-conifer.jpg"));

        //label.setIconTextGap(500);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        label.setHorizontalAlignment(JLabel.CENTER);

        //text color
        //label.setForeground(new Color(0,0,0));
        //background color
        label.setBackground(Color.BLACK);

        //frame.add(label);

        fButton = new JButton("Select a file...");
        fButton.addActionListener(this);
        fButton.setSize(5,10);
        fButton.setVisible(true);
        fButton.setLocation(25,50);
        frame.add(fButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("conifer ver " + v.getVersion());
    } // end no arg constructor

    //@Override
    public void actionPerformed(ActionEvent event) {
        
        if (event.getSource() == fButton ) {

        }
        
    }
} // end gui

