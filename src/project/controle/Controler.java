package project.controle;

public class Controler {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.maisVolume();
        c1.maisVolume();
        c1.menosVolume();
        c1.menosVolume();
        c1.ligarMudo();
        c1.desligarMudo();
        c1.abrirMenu();
    }
}
