package diegoqueirozado1;

import javax.swing.ButtonGroup;

public class Computador {

    private static String fabricante = "seu nome";
    private String tipoComputador;
    private String sistemaOperacional;
    private String HD;
    private String[] acessorios;
    private String[] serviços;

    public Computador() {

    }

    public String getfabricante() {
        return this.fabricante;
    }

    public String setfabricante() {
        return this.fabricante = fabricante;
    }

    public String gettipoComputador() {
        return this.tipoComputador;
    }

    public String settipoComputador() {
        return this.tipoComputador = tipoComputador;
    }

    public String getsistemaOperacional() {
        return this.sistemaOperacional;
    }

    public String setsistemaOperacional() {
        return this.sistemaOperacional = sistemaOperacional;
    }

    public String getHD() {
        return this.HD;
    }

    public String setHD() {
        return this.HD = HD;
    }

    public String[] getacessorios() {
        return this.acessorios;
    }

    public String[] setacessorios() {
        return this.acessorios = acessorios;
    }

    public String[] getserviços() {
        return this.serviços;
    }

    public String[] setserviços() {
        return this.serviços = serviços;
    }

}
