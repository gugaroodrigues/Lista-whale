import javax.swing.JOptionPane;
public class listaWhile3{
    public static void main(String[] args) {
        int quantidadeDePessoas = 0;        
        double peso = Double.parseDouble(JOptionPane.
                         showInputDialog(null, "Informe um peso"));

        while(peso > 0 && peso <300){
            peso = Double.parseDouble(JOptionPane.
                      showInputDialog(null, "Informe um peso"));

            quantidadeDePessoas = quantidadeDePessoas + 1;
            
            
        }

        JOptionPane.showMessageDialog(null, 
            "Quantidade de pessoas que informaram o peso: " +  quantidadeDePessoas
        );
    }
}