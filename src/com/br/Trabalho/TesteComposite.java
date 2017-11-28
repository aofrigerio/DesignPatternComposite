package com.br.Trabalho;
import com.br.Trabalho.Gerente;
import com.br.Trabalho.Presidente;
import com.br.Trabalho.Interfaces.IHierarquia;

public class TesteComposite {

	public static void main(String[] args) {

		Presidente pres = new Presidente("Alan", "PRESIDENTE", 15000);
		Gerente diretorComercial = new Gerente("Janaina", "Diretora Comercial", 5500, 20, 12300);
		Gerente diretorProducao = new Gerente("Maria", "Diretor Produção", 4000);
		Funcionario func1 = new Funcionario("Isabella", "Vendedora", 3000, 8,16400);
		Funcionario func2 = new Funcionario("Jacqueline","Vendedora", 2500, 10, 8900);
		
		Funcionario func3 = new Funcionario("Vinicius", "Desenvolvedor", 2500);
		Funcionario func4 = new Funcionario("Antonio","Desenvolvedor", 1500);
		Funcionario func5 = new Funcionario("Mariana","Desenvolvedor", 2000);
		


		// subordinado do presidente
		pres.incluirSubordinado(diretorComercial);
		pres.incluirSubordinado(diretorProducao);

		// subordinado do diretor comercial
		diretorComercial.incluirSubordinado(func1);
		diretorComercial.incluirSubordinado(func2);

		// subodrinado do diretor produção
		diretorProducao.incluirSubordinado(func3);
		diretorProducao.incluirSubordinado(func4);
		diretorProducao.incluirSubordinado(func5);

		// Testes
		System.out.println(pres.exibirFuncionario());
		
		for (IHierarquia diretor : pres.getSubordinados()) {

			System.out.println("\t" + diretor.exibirFuncionario());

			if (diretor instanceof Gerente) {
				for (IHierarquia func : ((Gerente) diretor).getSubordinados())
					System.out.println("\t\t" + func.exibirFuncionario());
			}

		}
		
		
	}
}