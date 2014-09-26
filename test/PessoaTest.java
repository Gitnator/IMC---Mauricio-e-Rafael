import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void testCalculaIMC1() {
        Pessoa p = new Pessoa();
        p.setSexo("M");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals(19.53, p.calculaIMC(), 0.002);
        double imc = p.calculaIMC();
        Assert.assertEquals("O seu IMC é "+imc+"\nvocê esta muito bem, continue assim", p.exibeMSG());
    }
    
    @Test
    public void testCalculaIMC2() {
        Pessoa p = new Pessoa();
        p.setSexo("F");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals(19.53, p.calculaIMC(), 0.002);
        double imc = p.calculaIMC();
        Assert.assertEquals("O seu IMC é "+imc+"\nvocê esta muito bem, continue assim", p.exibeMSG());
    }

    @Test
    public void testSetPeso1() {
        Pessoa p = new Pessoa();
        p.setPeso("0");
    }
    
    @Test
    public void testSetPeso2() {
        Pessoa p = new Pessoa();
        p.setPeso("1000.1");
    }
    
    @Test
    public void testSetPeso3() {
        Pessoa p = new Pessoa();
        p.setPeso("palavras");
    }

    @Test
    public void testSetAltura1() {
        Pessoa p = new Pessoa();
        p.setAltura("0");
    }
    
    @Test
    public void testSetAltura2() {
        Pessoa p = new Pessoa();
        p.setAltura("400.1");
    }
    
    @Test
    public void testSetAltura3() {
        Pessoa p = new Pessoa();
        p.setAltura("palavras");
    }
    
    @Test
    public void testSetSexo(){
        Pessoa p = new Pessoa();
        p.setSexo("H");
        p.setAltura("1.6");
        p.setPeso("50");
        Assert.assertEquals("Sexo inválido", p.exibeMSG());
    }
}