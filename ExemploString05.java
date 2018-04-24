public class ExemploString05{

    public static void main(String[] args) {
        
        String nome = "casaS ".trim().toLowerCase();
        //nome = nome.trim();

        // Pega o tamanho da string subtraí 1
        // e pega nesta posição
        char letra = nome.charAt(nome.length() - 1);
        if(letra == 's'){
            System.out.println("Plural");
        }else{
            System.out.println("Singular");
        }
    }

}