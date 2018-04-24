import javax.swing.JOptionPane;
public class exemploWhile03{
    public static void main(String[] args){

        int quantidademaxima = 4;
        int atual =0, maiorIdade = Integer.MIN_VALUE,
        menorIdade = Integer.MAX_VALUE;
;
        
        while (atual < quantidademaxima) {
           String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite sua idade"));

            if(idade > maiorIdade){
             maiorIdade = idade;
            }
            if(idade < menorIdade){
                menorIdade = idade;
            }

            atual = atual + 1;



        }
        JOptionPane.showMessageDialog(null, "maoir idade é " + maiorIdade);

    }

    
}