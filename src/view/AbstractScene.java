package view;

import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import sample.Main;

public abstract class AbstractScene extends Scene {
    public AbstractScene(Main main) {
        super(new TilePane(), 640, 480);
    }
}
