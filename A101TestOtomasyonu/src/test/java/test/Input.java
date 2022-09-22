package test;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Input {

    protected static WebDriver driver;
    static String baseUrl="https://www.a101.com.tr/";



    public static void main(String[] args) throws InterruptedException
    {
        String email="testasanakutlu@gmail.com";
        String Value_="";
        String Color="";
        String adresshedar="hedar";
        String name_="mustafa";
        String surname_="aşanakutlu";
        String phone_="555555555";
        String openaddress="atatürk mahallesi";

        System.setProperty("webdriver.chrome.driver","driver1/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        Assert.assertEquals("Anasayfa açılırken bir hata oluştu !!",baseUrl,driver.getCurrentUrl());

        //*[@title='Dizaltı Çorap']

        waitBySecond(5);
        ////button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']
        By selective=By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        WebElement secici=driver.findElement(selective);
        secici.click();
        waitBySecond(5);
            //menüye tıklandı
        By selective1=By.xpath("//ul[@class='desktop-menu']/li[4]/a[1]");
        WebElement secici1=driver.findElement(selective1);
        secici1.click();
        waitBySecond(5);

        //kadın iç giyim
        By selective2=By.xpath("//li[@class='derin '][2]/a");
        WebElement secici2=driver.findElement(selective2);
        secici2.click();
        waitBySecond(5);

        //diz altı çorap
        By selective3=By.xpath("//div[@class='categories']/ul/li[4]");
        WebElement secici3=driver.findElement(selective3);
        secici3.click();
        waitBySecond(5);

        //çorap seçiliyor
        By selective4=By.xpath("//ul[@class='product-list-general']/li[1]/article/div/a");
        WebElement secici4=driver.findElement(selective4);
        secici4.click();
        waitBySecond(5);

        //çorap rengi konrol ediliyor
        By selective5=By.xpath("//ul[@class='product-list-general']/li[1]/article/div/a");
        Color=driver.findElement(selective5).getText();
        waitBySecond(5);
        Assert.assertEquals("Fiyat eşleşmedi","Siyah",Color);
        waitBySecond(5);
        //sepete ekleme yapılır
        By selective6=By.xpath("//div[@class='product-buy-info js-product-buy-info']/button");
        WebElement secici6=driver.findElement(selective6);
        secici6.click();
        waitBySecond(5);
        //sepet görüntelinir
        By selective7=By.xpath("//div[@class='right-side']/a[@class='go-to-shop']");
        WebElement secici7=driver.findElement(selective7);
        secici7.click();
        waitBySecond(5);
        //sepet onaylanır
        By selective8=By.cssSelector(".button green checkout-button block js-checkout-button");
        WebElement secici8=driver.findElement(selective8);
        secici8.click();
        waitBySecond(5);
        //üyü olmadan devam et
        By selective9=By.cssSelector(".button green checkout-button block js-checkout-button");
        WebElement secici9=driver.findElement(selective9);
        secici9.click();
        waitBySecond(5);
        //maili gir
        By selective10=By.xpath("//input[@name='user_email']");
        WebElement secici10=driver.findElement(selective10);
        secici10.click();
        waitBySecond(5);
        secici10.sendKeys(email);
        // mail girildikten sonra devam et
        By selective11=By.xpath("//form[@class='js-proceed-to-checkout-form form--white guest-form']/button");
        WebElement secici11=driver.findElement(selective11);
        secici11.click();
        waitBySecond(5);
        //yeni adres oluştur
        By selective12=By.xpath("//div[@class='addresses']/div[@class='list']/ul/li/a");
        WebElement secici12=driver.findElement(selective12);
        secici12.click();
        waitBySecond(5);
        //yeni adres oluştur
        By selective13=By.xpath("//label[@class='error--title']/input");
        WebElement secici13=driver.findElement(selective13);
        secici13.click();
        secici13.sendKeys(adresshedar);
        waitBySecond(5);
        //ad gir
        By selective14=By.xpath("//label[@class='error--first_name']/input");
        WebElement secici14=driver.findElement(selective14);
        secici14.click();
        secici14.sendKeys(name_);
        waitBySecond(5);
        //soyad gir
        By selective15=By.xpath("//label[@class='error--last_name']/input");
        WebElement secici15=driver.findElement(selective15);
        secici15.click();
        secici15.sendKeys(surname_);
        waitBySecond(5);
        //telefon numara gir
        By selective16=By.xpath("//label[@class='error--phone_number']/input");
        WebElement secici16=driver.findElement(selective16);
        secici16.click();
        secici16.sendKeys(phone_);
        waitBySecond(5);
        //il  gir
        By selective17=By.xpath("//div[@class='select valid--city']/select/option[@value='40']");
        WebElement secici17=driver.findElement(selective17);
        secici17.click();
        waitBySecond(5);
        //ilçe  gir
        By selective18=By.xpath("//div[@class='select valid--township']/select/option[@value='448']");
        WebElement secici18=driver.findElement(selective18);
        secici18.click();
        waitBySecond(5);
        //mahalle  gir
        By selective19=By.xpath("//div[@class='select valid--district']/select/option[@value='35388']");
        WebElement secici19=driver.findElement(selective19);
        secici19.click();
        waitBySecond(5);
        // açık adress
        By selective20=By.cssSelector(".js-address-textarea");
        WebElement secici20=driver.findElement(selective20);
        secici20.click();
        secici20.sendKeys(openaddress);
        waitBySecond(5);
        // kaydet butonu
        By selective21=By.cssSelector(".button green js-set-country js-prevent-emoji");
        WebElement secici21=driver.findElement(selective21);
        secici21.click();
        waitBySecond(5);
        // kargo seçimi
        By selective22=By.xpath("//ul[@class='js-shipping-list']/li[1]/label");
        WebElement secici22=driver.findElement(selective22);
        secici22.click();
        waitBySecond(5);
        // kaydet devam et
        By selective23=By.cssSelector(".button block green js-proceed-button");
        WebElement secici23=driver.findElement(selective23);
        secici23.click();
        waitBySecond(5);
        // tamamla
        By selective24=By.xpath("//div[@class='js-complete-with-masterpass']/button");
        WebElement secici24=driver.findElement(selective24);
        secici24.click();
        waitBySecond(5);
        //
        By selective25=By.xpath("//div[@class='installment-area']/span[@class='error']");
        Value_=driver.findElement(selective25).getText();
        waitBySecond(5);
        Assert.assertEquals("ödeme ekranı gelmedi","Lütfen kart seçin veya kart bilgisi girin.",Value_);
        waitBySecond(5);





    }
    public static void waitBySecond(Integer key) throws InterruptedException  {

        Thread.sleep(key*1000);
    }

}
