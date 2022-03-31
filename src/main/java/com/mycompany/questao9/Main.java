
/*Uma empresa decide dar um aumento de 30% aos funcionários cujo
salário é inferior a 5000. Escreva um programa que possa ser utilizado
para efetuar o cálculo do salário reajustado de um funcionário, a partir
do valor do salário informado pelo usuário.*/



package com.mycompany.questao9;


public class Main {

   
    public static void main(String[] args) {
        Funcionario salario = new Funcionario();
        
        salario.setSalario(4000);
        salario.getSalarioAjustado();
    }
    
}
