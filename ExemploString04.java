public class ExemploString04{

    public static void main(String[] args) {

        String nomeCompleto = "Juan Roberto da Rocha";
        
        // Vai imprimir 'Roberto'
        System.out.println(nomeCompleto.substring(5,12));

        // Vai imprimir Rob
        System.out.println(nomeCompleto.substring(5, 5 + 3));
        
    }
}