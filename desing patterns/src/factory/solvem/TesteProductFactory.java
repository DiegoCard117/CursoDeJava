package factory.solvem;

import factory.Produto;
import factory.TipoEnum;

public class TesteProductFactory {
    public static void main(String[] args) {
        Produto produtoDigital = ProductFactory.getInstance(TipoEnum.DIGITAL);
        Produto produtoFisico = ProductFactory.getInstance(TipoEnum.FISICO);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);
    }
}
