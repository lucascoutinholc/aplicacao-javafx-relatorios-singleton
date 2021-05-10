package view;

import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import sample.Main;

public class MainScene extends AbstractScene {
    public MainScene(Main main) {
        super(main);

        var btnRelatorios = new Button("Relatórios");
        var btnConfiguracoes = new Button("Configuracões");
        setRoot(new TilePane(btnRelatorios, btnConfiguracoes));

        btnRelatorios.setOnAction(actionEvent -> main.setScene(new RelatorioScene(main)));
        btnConfiguracoes.setOnAction(actionEvent -> main.setScene(new ConfigScene(main)));
    }
}
