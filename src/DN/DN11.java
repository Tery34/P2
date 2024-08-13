package DN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DN11 {
    public static void main(String[] args) {

        JFrame okno = new JFrame("VELIKE ČRKE");
        okno.setSize(600, 400);
        okno.setLayout(new GridLayout());


        JTextArea levoOkno = new JTextArea();
        levoOkno.setLineWrap(true);
        levoOkno.setWrapStyleWord(true);

        JTextArea denoOkno = new JTextArea();
        denoOkno.setLineWrap(true);
        denoOkno.setWrapStyleWord(true);

        JButton gumb = new JButton("--> pretvori");

        gumb.addActionListener(e -> {
            String inputText = levoOkno.getText();
            denoOkno.setText(inputText.toUpperCase());
        });

        okno.add(levoOkno);
        okno.add(gumb);
        okno.add(denoOkno);


        okno.setVisible(true);
    }
}

