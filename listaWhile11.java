import javax.swing.JOptionPane;

public class listaWhile11{
    public static void main(String[] args) {
        String nome = "";
        int quantidade = 0;
        double preco = 0;
        double total = 0;
        double desconto = 0;


        while(!nome.equalsIgnoreCase("sair")){

            nome = JOptionPane.showInputDialog(null, "Digite o nome do produto ou \nDigite \"SAIR\" para sair ");
            
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de produtos: "));

            double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço do produto: "));
            
            total = total + (preco*quantidade);
        }
            desconto = total*0.05;
            
            
            JOptionPane.showMessageDialog(null, 
            "\nO valor com desconto foi: R$" + total
            + "Total de produtos: " + quantidade);

    }
}