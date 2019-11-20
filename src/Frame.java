import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private final String GAME_TITTLE = "tower defense";
    private Dimension size = new Dimension(700, 550);
    public Frame() {
        setTitle(GAME_TITTLE);
        setSize(size);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }
    public void init() {
        setLayout(new GridLayout(1, 1, 0, 0));
        Panel panel = new Panel(this);
        add(panel);
        setVisible(true);
    }

}
