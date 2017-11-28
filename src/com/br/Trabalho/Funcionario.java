package com.br.Trabalho;

import com.br.Trabalho.Interfaces.IHierarquia;

public class Funcionario implements IHierarquia {

	private String nome;
    private String setor;
    private int comissao;
	private int totVendas;
    private int salario_bruto;
    
    //sem comissão
    public Funcionario(String nome, String setor, int salario) {
    	this.nome = nome;
    	this.setor = setor;
    	this.salario_bruto = salario;
	}
    
    
    //Com comissão
    public Funcionario(String nome, String setor, int salario, int comissao, int totVendas) {
		this.nome = nome;
    	this.setor = setor;
    	this.salario_bruto = salario;
    	this.comissao = comissao;
    	this.totVendas = totVendas;
	}
   
	
    //Método de cada funcionário para calculo de folha
    private double calculoFolha(int salario) {
    	
    	double salario_final;
    	
    	salario_final = this.salario_bruto * (1 - 0.06);
    	salario_final = salario_final * (1 - 0.11);
    	
    	//soma a comissão caso for de vendas
    	if(this.comissao > 0) {
    		salario_final = salario_final + ((totVendas * this.comissao ) / 100 );
    	}
    	
    	
    	//return salario_final;
    		return salario_final;
    }
    
   
    @Override
	public String exibirFuncionario() {
    	return "Nome: " + nome + " / Setor: " + setor + " / Salario: " + calculoFolha(salario_bruto);
	}
    
    
}
