package factory.solvem;

import factory.Produto;
import factory.ProdutoDigital;
import factory.ProdutoFisico;
import factory.TipoEnum;

public class ProductFactory {
    public static Produto getInstance(TipoEnum tipoEnum) {
        switch (tipoEnum) {
            case FISICO -> {
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setIsTouchable(true);
                return produtoFisico;
            }
            case DIGITAL -> {
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setIsTouchable(false);
                return produtoDigital;
            }
            default -> throw new IllegalArgumentException("tipo de produto invalido");
        }
    }
}
