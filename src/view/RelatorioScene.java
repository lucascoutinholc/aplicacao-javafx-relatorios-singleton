package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import model.Config;
import sample.Main;

public class RelatorioScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public RelatorioScene(Main main) {
        super(main);
        var label = new Label("Configuracões: Formato de Relatórios = " + config.getFormatoRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));

        btnVoltar.setOnAction(actionEvent -> main.setScene(new MainScene(main)));
    }
}
