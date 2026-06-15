package ExercicioDeFixacaoPolimorfismo.entities;

import ExercicioDeFixacaoPolimorfismo.Enum.NomesProduto;

public class Produtos {
    private NomesProduto nomesProduto;
    private double Price;

    public Produtos(NomesProduto nomesProduto, double Price) {
        this.nomesProduto = nomesProduto;
        this.Price = Price;
    }

    public NomesProduto getNomesProduto() {
        return nomesProduto;
    }

    public NomesProduto getProduto() {
        return nomesProduto;
    }

    public double getPrice() {
        return Price;
    }

    public String PriceTag(){
      return nomesProduto+" -$ "+String.format("%.2f", Price);
    }
}

