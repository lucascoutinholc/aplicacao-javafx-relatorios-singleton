package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Config;
import sample.Main;

public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(Main main) {
        super(main);
        var label1 = new Label("Formato de Relatórios");
        var campoFormatoRelatorios = new TextField(config.getFormatoRelatorios());
        var label2 = new Label("Tipo de Gráficos");
        var campoTipoGraficos = new TextField(config.getTipoGraficos());
        var btnOk = new Button("OK");

        setRoot(new VBox(label1, campoFormatoRelatorios, label2, campoTipoGraficos, btnOk));

        btnOk.setOnAction(actionEvent -> {
            config.setFormatoRelatorios(campoFormatoRelatorios.getText());
            config.setTipoGraficos(campoTipoGraficos.getText());
            main.setScene(new MainScene(main));
        });
    }
}
