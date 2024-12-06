package Model;

import Control.ImovelDAO;

public class Imovel {
    private String Tipo;
    private String Cate;
    private double Met;
    private double Valor;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCate() {
        return Cate;
    }

    public void setCate(String cate) {
        Cate = cate;
    }

    public double getMet() {
        return Met;
    }

    public void setMet(double met) {
        Met = met;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public double ValorReal() {
        double truth;
if (Cate.equals("A")){
    truth = Met*2500;
} else if (Cate.equals("B")){
    truth = Met*2200;
} else if (Cate.equals("C")) {
     truth = Met*1800;
}else{
    truth = Met*1500;
}
return truth;
    }

    public static void EnviarDados(Imovel dados){
        ImovelDAO enviar = new ImovelDAO();
        enviar.CadastrarImovel(dados);

    }
}
