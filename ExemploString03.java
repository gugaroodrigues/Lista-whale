public class ExemploString03{

    public static void main(String[] args) {

        String sistemaOperacional = "LiNUX";
        System.out.println(sistemaOperacional);

        // colocar o texto todo em caixa alta
        sistemaOperacional = sistemaOperacional.toUpperCase();
        System.out.println(sistemaOperacional);

        // colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional.toLowerCase();
        System.out.println(sistemaOperacional);
        
    }
}