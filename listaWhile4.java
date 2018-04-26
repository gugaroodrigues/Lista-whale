import javax.swing.JOptionPane;
public class listaWhile4{
    public static void main(String[] args){
        int quantidade = Integer.parseInt(
            JOptionPane.showInputDialog(null,
            "Digite o numero de carros que deseja cadastrar:")
        );
        int cadastro = 1;
        double valor = 0;
        int anoDoCarro = 0;
        String modelo = "";
        String modeloA = "";
        String modeloG = "";
        int somaAno = 0;
        double somaValor = 0;
        
        while(quantidade > cadastro ){ 
            cadastro = cadastro + 1;

            modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro:");
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do carro: "));
            anoDoCarro = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ano do carro"));
        char letra = modelo.charAt('0');
             letra = Character.toLowerCase(letra);
             
                  
        if (letra == 'a'){
            modeloA = (modeloA + 1);

        }if (letra == 'g'){
            modeloG = (modeloG + 1);

        }
        somaAno = somaAno + anoDoCarro;
        somaValor= somaValor + valor;
        
        }
        int mediaAno = somaAno /quantidade;
        double mediaValor = somaValor / quantidade;
         JOptionPane.showMessageDialog(null, "|Media anos dos carros| " + mediaAno +
        "|Media valor| " + mediaValor + "|Carros que começam com \"G \"| " + modeloG +
        "|Carros que começam com \"A\"| " + modeloA);

        

    
    }
}