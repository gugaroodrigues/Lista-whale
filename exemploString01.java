import javax.swing.JOptionPane;

public class exemploString01{
    public static void main(String[] args){

        String nome = "curso de java";
        System.out.println(nome);
        System.out.println("tamanho do String: " + nome.length());

        String nick = JOptionPane.showInputDialog(null, 
        "Informe o nick do seu pager");
        if (nick.equals("")){
            JOptionPane.showMessageDialog(null, "Filho eu pedi seu nick, ta dificil ?");
        } 

    }
}