package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Homepage;

public class insereProdutoNoCarrinho {

    Homepage homepage = new Homepage();

    @Dado("que o cliente esta na página inicial do site")
    public void getPage() {
        homepage.getHomepage();
    }
    @Quando("eu vejo um produto do meu interesse")
    public void checkProductList() {
        homepage.productList();
    }
    @Entao("ele coloca um produto no carrinho")
    public void clickOnTheProduct() {
        homepage.clickAtTheFirstProduct();
    }
    @Quando("ele retorna a página inicial do site")
    public void returnToTheHomepage() {
        homepage.returnToHomepage();
    }
    @E("ele ve que o número de produtos no carrinho mudou")
    public void checkCartValue() {
        homepage.checkCartValue();
    }
}
