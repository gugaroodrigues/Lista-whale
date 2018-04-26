import javax.swing.JOptionPane;

public class teste{
    public static void main(String[] args) {
        
        int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Informe a quantidade de carros que deseja cadastrar")
        );

        int contador = 1;

        double somaValor = 0;

        int somaAnoCarro = 0;

        int modeloA = 0;
        
        int modeloG = 0;

        while(contador <= quantidade){

            int anoCarro = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o ano do " + contador + "º carro")
            );

            double valor = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor do " + contador + "º carro")
            );

            String modelo = JOptionPane.showInputDialog(null, "Informe o nome do modelo do " + contador + "º carro");

            somaValor = somaValor + valor;

            somaAnoCarro = somaAnoCarro + anoCarro;

            char letra = modelo.charAt(0);

            if(letra == 'a' || letra == 'A'){
                modeloA = modeloA + 1;
            }
            
            if(letra == 'g' || letra == 'G'){
                modeloG = modeloG + 1;
            }

            contador = contador + 1;
        }

        int mediaAnoCarro = somaAnoCarro / quantidade;

        double mediaValorCarro = somaValor / quantidade;

        JOptionPane.showMessageDialog(null, 
                "A média dos anos dos carros é: " + mediaAnoCarro
                + "\nA média dos valores dos carros é de: R$" + mediaValorCarro
                + "\nO número de modelos começados com a letra A é de: " + modeloA
                + "\nO número de modelos começados com a letra G é de: " + modeloG
        );
    }
}