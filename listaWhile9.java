import javax.swing.JOptionPane;
public class listaWhile9{
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
         "Digite seu texto ou frase ");
        String letra = "";
        int contadorWhile = 0;

        while(contadorWhile < texto.length()){
            letra = letra + "\n" + texto.charAt(contadorWhile);


            contadorWhile = contadorWhile + 1;
        }

        JOptionPane.showMessageDialog(null, "Seu texto na Vertical é :\n " + letra);

    }
    
}