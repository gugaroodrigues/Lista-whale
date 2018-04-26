import javax.swing.JOptionPane;
public class listaWhile2{
    public static void main(String[] args){
        int idade = 0;
        while(idade != 128){
        idade = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite sua idade"));
        }
    }
}