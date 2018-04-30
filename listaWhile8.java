import javax.swing.JOptionPane;

public class listaWhile8{
    public static void main(String[] args) {
        
        int caracters = Integer.parseInt(
            JOptionPane.showInputDialog(null,
               "Numero de caracteres que deseja inserir"));
            
        int contador = 0;
        String frase = "";
        
        while(contador < caracters){

            char letra = JOptionPane.showInputDialog(null,
             "Apresente o texto, sendo um caracter por vez").charAt(0);
             frase = frase + letra;
             
             
                

                contador = contador + 1;
            
        }
        JOptionPane.showMessageDialog(null, "Seu texto: " + frase);

        
    }
}