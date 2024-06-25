package main.java.com.project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Endereco {

    @Id
    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String local;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(String bairro, String cep, String complemento, String ddd, String gia, String ibge, String local, String rua, String siafi, String uf) {
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.ddd = ddd;
        this.gia = gia;
        this.ibge = ibge;
        this.local = local;
        this.rua = rua;
        this.siafi = siafi;
        this.uf = uf;
    }



    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }



}
