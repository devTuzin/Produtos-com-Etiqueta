package ExercicioDeFixacaoPolimorfismo.entities;

import ExercicioDeFixacaoPolimorfismo.Enum.NomesProduto;

public class ProdutosImportado extends Produtos {
    private Double custumesFee;

    public ProdutosImportado(NomesProduto nomesProduto, double Price, double custumesFee) {
        super(nomesProduto, Price);
        this.custumesFee = custumesFee;
    }

    public double precoFinal() {
        return precoFinal() + custumesFee;
    }

    @Override
    public String PriceTag() {
        return super.PriceTag();
    }
}


