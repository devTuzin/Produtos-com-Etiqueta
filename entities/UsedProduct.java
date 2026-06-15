package ExercicioDeFixacaoPolimorfismo.entities;

import ExercicioDeFixacaoPolimorfismo.Enum.NomesProduto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Produtos {
    private LocalDate manufactureDate;

    public UsedProduct(NomesProduto nomesProduto, double Price, LocalDate manufactureDate) {
        super(nomesProduto, Price);
        this.manufactureDate = manufactureDate;
    }
    public LocalDate getManufactureDate () {
        return manufactureDate;
    }
    public void setManufactureDate (){
        this.manufactureDate=manufactureDate;
    }

    @Override
    public String PriceTag() {
            DateTimeFormatter frm=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return getNomesProduto()+" $ "+String.format("%.2f",getPrice())
            +"(manufacture date"+manufactureDate.format(frm)+")";
    }
}
