
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.test.MetotClass;
import web.test.Muhasebe;
import web.test.MuhasebeBuild;

public class MuhasebeTest {
    MetotClass metotClass=new MetotClass();

    @BeforeClass
    public void beforeClass(){
        Muhasebe muhasebe=MuhasebeBuild.startMuhasebe().setName("ayse")
                .setId(1).setMaas(50000).setKidem("personel").build();
    }

    @Test(priority = 1)
    public void zamTesti(){
        Assert.assertEquals(metotClass.zam(), 65000);
    }

    @Test(priority = 2)
    public void primTest(){
        Assert.assertEquals(metotClass.prim(), 150000);
    }


    @Test(priority = 3)
    public void titleTest(){
        Assert.assertEquals(metotClass.title(), "personel 2");
    }

}
