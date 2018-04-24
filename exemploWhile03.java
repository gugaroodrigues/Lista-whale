import javax.swing.JOptionPane;
public class ExemploWhile03{

    public static void main(String[] args){

        int quantidadeMaxima = 4;
        int atual = 0, maiorIdade = Integer.MIN_VALUE, 
              menorIdade = Integer.MAX_VALUE;
        String nome = "";
        while(atual < quantidadeMaxima){
            nome = JOptionPane.showInputDialog(null, 
                    "Digite o seu nome");

            int idade = Integer.parseInt(JOptionPane
                .showInputDialog("Digite a sua idade"));

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            if(idade < menorIdade){
                menorIdade = idade;
            }
            atual = atual + 1;
        }
        JOptionPane.showMessageDialog(null, 
            "A maior idade é: " + maiorIdade);

    }

}