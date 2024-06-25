public class Main {
    public static void main(String[] args) throws Exception {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

    }
}
