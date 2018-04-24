import javax.swing.JOptionPane;

public class listaWhile01{
    public static void main(String[] args){
        String nome = "";
        while(!nome.equalsIgnoreCase("sair")){
            nome = JOptionPane.showInputDialog(null, 
            "Digite um nome ou tecle \"Fim \" para sair");
        }


    }
}