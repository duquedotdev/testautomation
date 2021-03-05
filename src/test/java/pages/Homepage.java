package pages;


import com.aphelium.testautomation.DriveFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends DriveFactory {

    WebDriverWait wait;

    public Homepage(){
        wait = new WebDriverWait(driver(), 15);
    }

    public static void getHomepage() {
        driver().get("http://127.0.0.1:3000");
        String title = driver().getTitle();
        Assert.assertEquals(title, "Loja do Duque");
    }

    public void productList() {
        for (int positionOnList = 1; positionOnList <= 6; positionOnList++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li[" + positionOnList + "]")));
        }

    }

    public void clickAtTheFirstProduct() {
        WebElement btnFirstProduct = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li[1]/button")));
        btnFirstProduct.click();
    }

    public void productLis() {
        for (int positionOnList = 1; positionOnList <= 6; positionOnList++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'0')]")));
        }
    }

    public void returnToHomepage() {
        WebElement rocketshoesLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/a[1]/img")));
        rocketshoesLogo.click();
    }

    public void checkCartValue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,' 1')]"))); //verifica se o carrinho do botao almentou para 1
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button)[1]"))); //verifica se e o primeiro do arrey
        for (int positionOnList = 1; positionOnList <= 5; positionOnList++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(.,' 0')])["+ positionOnList +"]"))); //verifica se os  outros elementos do site permaneceram inalterados
        }
    }

}
