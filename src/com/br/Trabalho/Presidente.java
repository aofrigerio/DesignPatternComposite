package com.br.Trabalho;

import java.util.ArrayList;
import java.util.List;

import com.br.Trabalho.Interfaces.IHierarquia;

public class Presidente implements IHierarquia{
	
	private String nome;
    private String setor;
    private int salario_bruto;
    private List<IHierarquia> subordinados;
    
    public Presidente(String nome, String setor, int salario) {
    	this.nome = nome;
    	this.setor = setor;
    	this.salario_bruto = salario;
    	this.subordinados = new ArrayList<>();
	}
    
    public void incluirSubordinado(IHierarquia func) {
    	this.subordinados.add(func);
    }
    
    public List<IHierarquia> getSubordinados()
    {
        return subordinados;
    }
    
    //Método de cada funcionário para calculo de folha
    private double calculoFolha(int salario) {
    	return this.salario_bruto * (1 - 0.02);
    }

	@Override
	public String exibirFuncionario() {
		return "Nome: " + nome + " / Setor: " + setor + " / Salario: " + calculoFolha(salario_bruto);
	}
}
