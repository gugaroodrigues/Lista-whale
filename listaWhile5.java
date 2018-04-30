import javax.swing.JOptionPane;
public class listaWhile5{
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(
            null, "Primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(
            null, "Segundo numero"));
        int opcao = 0;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int dividir = numero1 / numero2;
        int multiplicar = numero1 * numero2;
opcao = JOptionPane.showOptionDialog(null, "Selecione o menu desejado!",
            "MENU DO SISTEMA",
            0,
            JOptionPane.INFORMATION_MESSAGE,
            null, new Object[]{
                "Somar", "Subtrair", "Multiplicar", "Dividir", "SAIR"
            },
            "SAIR");
        while(opcao != 4){
            
        if (opcao == 0){
            JOptionPane.showMessageDialog(null, "Soma: " + soma);
        }if(opcao == 1){
            JOptionPane.showMessageDialog(null, "Subtração: " + subtracao);
        }if(opcao == 2){
            JOptionPane.showMessageDialog(null, "Multiplicação: " + multiplicar);
        }if(opcao == 3){
            JOptionPane.showMessageDialog(null, "Dividir: " + dividir);
        }

        opcao = JOptionPane.showOptionDialog(null, "Selecione o menu desejado!",
            "MENU DO SISTEMA",
            0,
            JOptionPane.INFORMATION_MESSAGE,
            null, new Object[]{
                "Somar", "Subtrair", "Multiplicar", "Dividir", "SAIR"
            },
            "SAIR");

    }

            
            
              
    }
}
