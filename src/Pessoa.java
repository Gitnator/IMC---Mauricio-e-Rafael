public class Pessoa {

    private String sexo;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Double calculaIMC() {
        if (altura == 0) {
            return null;
        }
        return (peso / (altura * altura));
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getPeso() {
        return peso;
    }

    public boolean setPeso(String peso) {
        try {
            double pesoD = Double.parseDouble(peso);
            if ((pesoD <= 0) || (pesoD > 1000)) {
                System.out.println("Peso Inválido");
                return false;
            }
            this.peso = pesoD;
            return true;
        } catch (NumberFormatException e){
            System.out.println("Valor Inválido para Peso");
            return false;
        }
    }

    public double getAltura() {
        return altura;
    }

    public boolean setAltura(String altura) {
        try {
            double alturaD = Double.parseDouble(altura);
            if ((alturaD <= 0) || (alturaD > 400)) {
                System.out.println("Altura Inválida");
                return false;
            }
            this.altura = alturaD;
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Valor Inválido para Altura");
            return false;
        }
    }

    public String exibeMSG() {
        String s = "";
        double imc = calculaIMC();
        if (sexo.equalsIgnoreCase("F")) {
            if (imc < 15) {
                s = "voce esta muito abaixo do peso";
            } else if (imc >= 15 && imc <= 17.9) {
                s = "voce esta abaixo do peso";
            } else if (imc >= 18 && imc <= 24.4) {
                s = "você esta muito bem, continue assim";
            } else if (imc >= 24.5 && imc <= 27.2) {
                s = "voce esta acima do peso recomendado. Cuidado";
            } else if (imc > 27.3) {
                s = "voce esta obeso, procure o acompanhamento de um nutricionista e realizar mais atividades fisicas";
            }
        } else if (sexo.equalsIgnoreCase("M")) {
            if (imc < 17.9) {
                s = "voce esta muito abaixo do peso";
            } else if (imc >= 17.9 && imc <= 18.9) {
                s = "voce esta abaixo do peso";
            } else if (imc >= 19 && imc <= 24.9) {
                s = "você esta muito bem, continue assim";
            } else if (imc >= 25 && imc <= 27.7) {
                s = "voce esta acima do peso recomendado. Cuidado";
            } else if (imc > 27.8) {
                s = "voce esta obeso, procure o acompanhamento de um nutricionista e realizar mais atividades fisicas";
            }
        } else {
            return "Sexo inválido";
        }
        return "O seu IMC é " + imc + "\n" + s;
    }
}
