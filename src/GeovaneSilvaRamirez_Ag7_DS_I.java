/*

Exercício:

A Padaria de Joaquim faz aniversário na semana que vem e ele e sua família
decidiram que,além de fazer a tradicional comemoração, irão selecionar 10 
produtos na padaria para fazer a promoção da semana de 50% desses produtos.

Escreva um fluxograma e o programa em Java, solicitando a entrada de 10
produtos da padaria (nome e valor do produto) e exiba na tela o nome do 
produto e seu respectivo valor com 50% de desconto.

*/

/*
 * @author Geovane Silva Ramirez
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeovaneSilvaRamirez_Ag7_DS_I {

    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
 List<Produto> produtos = new ArrayList<Produto>();

 for (int i = 1; i <= 10; i = i + 1) {

  System.out.println("Insira o nome do produto nº" + (i));

  System.out.print("Nome do produto: ");

  String nome = sc.nextLine();

  System.out.print("Preço do produto: ");

  Double preco = sc.nextDouble();

  produtos.add(new Produto(nome, preco));

  sc.nextLine();

 }  for (Produto produto : produtos) {

  System.out.println("Nome: " + produto.getNome() + ", R$" + produto.getValor() / 2);

 }


 sc.close();

}

static class Produto {

   

  private String nome;

  private Double valor;

   

  public Produto() {}

   

  public Produto(String nome, Double valor) {

   this.nome = nome;

   this.valor = valor;

  }

  public String getNome() {

   return nome;

  }

  public void setNome(String nome) {

   this.nome = nome;

  }

  public Double getValor() {

   return valor;

  }

  public void setValor(Double valor) {

   this.valor = valor;

  }

 }

}