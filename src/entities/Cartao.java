package entities;
import entities.enums.TipoCartao;

public class Cartao {
    
    private TipoCartao tipoDoCartao; 
    private int id;
    private double valorPassagemInteira = 5.20;
    private double saldoNoCartao;

    boolean statusValido;
    boolean statusBloqueado;

    public Cartao(int id, TipoCartao tipoDoCartao){
        this.id = id;
        this.tipoDoCartao = tipoDoCartao;
        this.statusBloqueado = true;
        this.statusValido = true; 
    }

    public int getId() {
        return id;
    }

    public double getSaldoNoCartao() {
        return saldoNoCartao;
    }
    public TipoCartao getTipoDoCartao() {
        return tipoDoCartao;
    }

    public double getValorPassagemInteira() {
        return valorPassagemInteira;
    }

    public void setSaldoNoCartao(double saldoNoCartao) {
        this.saldoNoCartao = saldoNoCartao;
    }

    public void setStatusBloqueio(boolean statusBloqueio) {
        this.statusBloqueado = statusBloqueio;
    }

    public void setStatusValido(boolean statusValido) {
        this.statusValido = statusValido;
    }

    public void setValorPassagemInteira(double valorPassagemInteira) {
        this.valorPassagemInteira = valorPassagemInteira;
    }

    public void recargaCartao(double valor){
        this.saldoNoCartao += valor;
        System.out.println("==============================");
        System.out.println("Seu cartão foi recarregado!");
        System.out.printf("Saldo atual: R$ %.2f%n",saldoNoCartao);
        System.out.println("==============================");
    }

    //Exibir o tipo do cartão de forma mais legível
    public String getTipoDoCartaoDescricao(){
        switch (tipoDoCartao) {
            case MEIA_PASSAGEM_ESTUDANTIL:
                return "Meia Passagem Estudantil";
            case BILHETE_IDENTIFICADO:
                return "Bilhete Único";
            default:
                return "Tipo do cartão não encontrado.";
        }
    }
}
