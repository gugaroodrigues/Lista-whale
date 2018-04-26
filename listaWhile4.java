import javax.swing.JOptionPane;
public class listaWhile4{
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog(null,
            "Digite o numero de carros que deseja cadastrar:")
        );
        int cadastro = 0;

        while(cadastro <= quantidade){
           double valor = JOptionPane.showInputDialog
              (null, "Valor do carro");
           String modelo = JOptionPane.showInputDialog
              ("Modelo do carro");


        }

    
    }
}