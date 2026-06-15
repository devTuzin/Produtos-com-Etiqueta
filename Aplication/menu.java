package ExercicioDeFixacaoPolimorfismo.Aplication;

import ExercicioDeFixacaoPolimorfismo.Enum.NomesProduto;
import ExercicioDeFixacaoPolimorfismo.entities.Produtos;
import ExercicioDeFixacaoPolimorfismo.entities.ProdutosImportado;
import ExercicioDeFixacaoPolimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    static void menu() {
        Scanner sc = new Scanner(System.in);
        List<Produtos> list = new ArrayList<>();
        list.add(new ProdutosImportado(NomesProduto.ARROZ, 20.00, 10.00));
        list.add(new ProdutosImportado(NomesProduto.OVOS, 30.00, 10.00));
        list.add(new UsedProduct(NomesProduto.CADEIRA, 60.50, LocalDate.of(2020, 10, 16)));
        list.add(new UsedProduct(NomesProduto.MONITOR, 70.90, LocalDate.of(2021, 5, 20)));
        list.add(new Produtos(NomesProduto.FARINHA, 12.00));
        list.add(new Produtos(NomesProduto.MAIZENA, 10.00));


        //Buscar por nome
        System.out.println("digite o o tipo de produto que vc deseja:");
        System.out.println("produtos");
        System.out.println("Produtos importados");
        System.out.println("Produtos usados");
        String procura = sc.nextLine();
        for (Produtos p : list) {
            if (procura.equalsIgnoreCase("produtos")
                    && p.getClass() == Produtos.class) {
                System.out.println(p.PriceTag());
            } else if (procura.equalsIgnoreCase("produtos importados")
                    && p instanceof ProdutosImportado) {
                System.out.println(p.PriceTag());
            } else if (procura.equalsIgnoreCase("produtos usados")
                    && p instanceof UsedProduct) {
                System.out.println(p.PriceTag());
            }
        }
    }
}
