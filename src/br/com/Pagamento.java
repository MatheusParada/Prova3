package br.com;

public class Pagamento {
    private String nome;
    private double salario;
    private int horasAula;

    Pagamento(String nome, double salario, int horasAula){
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;

    }
    double getGastos(){

        return this.salario;
    }
    String getInfo(){
        return "nome:" + this.nome + " com salário " + getGastos();
    }
}


