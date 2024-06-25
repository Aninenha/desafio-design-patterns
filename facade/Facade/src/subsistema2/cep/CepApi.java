package src.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    private static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Brasilia";
    }
    public String recuperarEstado(String cep){
        return "DF";
    }


}
