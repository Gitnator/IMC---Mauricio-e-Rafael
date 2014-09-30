import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    
    @Test
    public void test01() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals(19.53, p.calculaIMC(), 0.002);
        double imc = p.calculaIMC();
        Assert.assertTrue(p.exibeMSG().contains("você esta muito bem"));
    }
    
    @Test
    public void test02() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals(19.53, p.calculaIMC(), 0.002);
        double imc = p.calculaIMC();
        Assert.assertTrue(p.exibeMSG().contains("você esta muito bem"));
    }
    
    @Test
    public void test03() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("50");
        Assert.assertFalse(p.setAltura("0"));
    }
    
    @Test
    public void test04() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        Assert.assertFalse(p.setPeso("0"));
    }
    
    @Test
    public void test05() {
        Pessoa p = new Pessoa();
        p.setSexo("H");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals(p.exibeMSG(), "Sexo inválido");
    }
    
    @Test
    public void test06() {
        Pessoa p = new Pessoa();
        Assert.assertFalse(p.setAltura("400.1"));
    }
    
    @Test
    public void test07() {
        Pessoa p = new Pessoa();
        Assert.assertFalse(p.setPeso("1000.1"));
    }
    
    @Test
    public void test08() {
        Pessoa p = new Pessoa();
        Assert.assertFalse(p.setAltura("AA"));
    }
    
    @Test
    public void test09() {
        Pessoa p = new Pessoa();
        Assert.assertFalse(p.setPeso("AA"));
    }
    
    @Test
    public void test10() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("0.1");
        p.setAltura("1");
        Assert.assertEquals(p.calculaIMC(),0.1,0);
    }
    
    @Test
    public void test11() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setPeso("0.1");
        p.setAltura("1");
        Assert.assertEquals(p.calculaIMC(),0.1,0);
    }
    
    @Test
    public void test12() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("45");
        p.setAltura("1.6");
        Assert.assertTrue(p.exibeMSG().contains("abaixo do peso"));
    }
    
    @Test
    public void test14() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("45");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("muito bem"));
    }
    
    @Test
    public void test15() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setPeso("45");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("muito bem"));
    }
    
    @Test
    public void test16() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("60");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("acima do peso"));
    }
    
    @Test
    public void test17() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setPeso("60");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("acima do peso"));
    }
    
    @Test
    public void test18() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("70");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("obeso"));
    }
    
    @Test
    public void test19() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setPeso("70");
        p.setAltura("1.5");
        Assert.assertTrue(p.exibeMSG().contains("obeso"));
    }
    
    @Test
    public void test20() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setPeso("700");
        p.setAltura("0.1");
        Assert.assertEquals(p.calculaIMC(),70000,0);
    }
    
    @Test
    public void test21() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setPeso("700");
        p.setAltura("0.1");
        Assert.assertEquals(p.calculaIMC(),70000,0);
    }
}