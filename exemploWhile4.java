import javax.swing.JOptionPane;
public class exemploWhile4{
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(
            "Digite seu nome");

       /*while(!nome.equalsIgnoreCase("sair") &&
              !nome.equalsIgnoreCase("fim")){*/
        double somaMedia = 0;
        int quantidadeTotalDeAlunos = 0;
        while(!nome.equalsIgnoreCase("sair")){        
           double nota1 = Double.parseDouble
              (JOptionPane.showInputDialog(null, "Digite a sua nota 1"));
           double nota2 = Double.parseDouble
              (JOptionPane.showInputDialog(null, "Digite a sua nota 2"));
           double nota3 = Double.parseDouble
              (JOptionPane.showInputDialog(null, "Digite a sua nota 3"));
           double media = (nota1 + nota2 + nota3)/3;
              JOptionPane.showMessageDialog(null, "Olá " + nome +
              "\nSua media é " + media);
            somaMedia = somaMedia + media;
            quantidadeTotalDeAlunos = quantidadeTotalDeAlunos + 1;
           if(media < 7){
               JOptionPane.showMessageDialog(null, "nao passou nem de longe ");
           }else{
               JOptionPane.showMessageDialog(null, "Acertouu mizeravi ");
           }
        
        
        nome = JOptionPane.showInputDialog(
        "Digite seu nome. \nse desejas sair digite \"sair\". :)");
        double somaDasMedias = somaMedia + quantidadeTotalDeAlunos;
        JOptionPane.showMessageDialog(null, "média das médias é: " + somaDasMedias);
           }



    }
}