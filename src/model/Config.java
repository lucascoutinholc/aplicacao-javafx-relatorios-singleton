package model;

public class Config {
    private static final Config instance = new Config();

    private String formatoRelatorios = "html";
    private String tipoGraficos = "pizza";

    private Config() {}

    public static Config getInstance() {
        return instance;
    }

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
}
