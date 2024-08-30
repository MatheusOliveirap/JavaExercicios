package testemain;

public class exe4 {

    public String frase;

    

   public exe4(String frase) {
        this.frase = frase;
    };

   
        public int obterTamanho() {
        return frase.length();
    }

    public String converterMaiusculas() {
        return frase.toUpperCase();
    }

    public String converterMinusculas() {
        return frase.toLowerCase();
    }

    public String extrairSubstring() {

        return frase.substring(11, 28);
    }

    public void imprimaresultados() {

        System.out.println("Tamanho da frase: " + obterTamanho());

        System.out.println("Frase em maiúsculas: " + converterMaiusculas());

        System.out.println("Frase em minúsculas: " + converterMinusculas());

        System.out.println("Substring extraída: " + extrairSubstring());
    }

}
