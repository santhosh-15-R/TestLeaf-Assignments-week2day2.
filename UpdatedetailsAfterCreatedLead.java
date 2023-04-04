package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdateLeadTask {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver(); //initiate driver


        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");

        driver.findElement(By.id("username")).sendKeys("DemoCsr");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TesLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhosh.r@tickingmindscom");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6380071111");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        WebElement Update = driver.findElement(By.id("updateLeadForm_companyName"));
        Update.clear();
        Update.sendKeys("TestLeaf");
        driver.findElement(By.name("submitButton")).click();
    }
}
