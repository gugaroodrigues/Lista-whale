import javax.swing.JOptionPane;
public class listaWhile7{
    public static void main(String[] args) {
        int jogadores = 1;
        String maiorNome = ""; 
        String menorNome = "";

        String jogadorMaisCartoesVermelhos = "";
        int maisCartoesVermelhos = 0;

        String jogadorMenosCartoesVermelhos = "";
        int menosCartoesVermelhos = 0;

        String jogadorMaisCartoesAmarelos = "";
        int maisCartoesAmarelos = 0;

        String jogadorMenosCartoesAmarelos = "";
        int menosCartoesAmarelos = 0;

        String jogadorMaisAlto = "";
        double maiorAltura = 0;

        String jogadorMaisBaixo = "";
        double menorAltura = 0;

        String jogadorMaisPesado = "";
        double maiorPeso = 0;

        String jogadorMenosPeso = "";
        double menorPeso = 0;

        String jogadorMaisVelho = "";
        int maiorIdade = 0;

        String jogadorMaisNovo = "";
        int menorIdade = 0;

        int masculino = 0;
        int feminino = 0;

        while(jogadores <= 22){

            String nome = JOptionPane.showInputDialog(null, "Nome do jogador " + jogadores + "°");

            int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Idade do jogador " + jogadores + "°"));
            
            char sexo = JOptionPane.showInputDialog
            ("Sexo do jogador " + jogadores + "°").charAt(0);
            
            sexo = Character.toUpperCase(sexo);

            double altura = Double.parseDouble(JOptionPane.showInputDialog
            ("Altura do jogador " + jogadores + "°"));

            double peso = Double.parseDouble(JOptionPane.showInputDialog
            ("Peso do jogador " + jogadores + "°"));

            int gols = Integer.parseInt(JOptionPane.showInputDialog
            ("Gols marcados do jogador " + jogadores + "°"));

            int cartaoVermelho = Integer.parseInt(JOptionPane.showInputDialog
            ("Numero de cartões vermelhos do jogador " + jogadores + "°"));

            int cartaoAmarelo = Integer.parseInt(JOptionPane.showInputDialog
            ("Numero de cartões amarelos do jogador " + jogadores + "°"));

        if (nome.trim().length() < menorNome.trim().length()){
            menorNome = nome;
        }if(nome.trim().length() > maiorNome.trim().length()){
            maiorNome = nome;
        
        }if(sexo == 'F'){
            feminino = feminino + 1;
        }else if (sexo == 'M'){
            masculino = masculino + 1;

        }if(idade < menorIdade){
            menorIdade = idade;
            jogadorMaisNovo = nome;
        }if(idade > maiorIdade){
            maiorIdade = idade;
            jogadorMaisVelho = nome;
            
        }if(altura < menorAltura){
            menorAltura = altura;
            jogadorMaisBaixo = nome;
        }if (altura > maiorAltura){
            maiorAltura = altura;
            jogadorMaisAlto = nome;

        }if(peso < menorPeso){
            menorPeso = peso;
            jogadorMenosPeso = nome;
        }if(peso > maiorPeso){
            maiorPeso = peso;
            jogadorMaisPesado = nome;
        
        }if(cartaoAmarelo < menosCartoesAmarelos){
            menosCartoesAmarelos = cartaoAmarelo;
            jogadorMenosCartoesAmarelos = nome;
        }if(cartaoAmarelo > maisCartoesAmarelos){
            maisCartoesAmarelos = cartaoAmarelo;
            jogadorMaisCartoesAmarelos = nome;

        }if(cartaoVermelho < menosCartoesVermelhos){
            menosCartoesVermelhos = cartaoVermelho;
            jogadorMenosCartoesVermelhos = nome;
        }if(cartaoVermelho > maisCartoesVermelhos){
            maisCartoesVermelhos = cartaoVermelho;
            jogadorMaisCartoesVermelhos = nome;

        }

           jogadores = jogadores + 1;

    }
        JOptionPane.showMessageDialog(null,     
        "\nJogador com maior nome: " + maiorNome
        + "\nJogador com menor nome: " +  menorNome
        + "\nJogador mais velho: " + maiorIdade
        + "\nJogador mais novo: " + menorIdade
        + "\nJogador com o maior peso: " + maiorPeso + "Kg"
        + "\nJogador mais leve: " + menorPeso + "Kg"
        + "\nJogador mais alto: " + maiorAltura + "m"
        + "\nJogador mais baixo: " + menorAltura + "m"
        + "\nJogadores do sexo feminino: " + feminino
        + "\nJogadores do sexo masculino: " + masculino
        + "\nJogador com a maior quantidade de cartões vermelhos: " +     jogadorMaisCartoesVermelhos
        + "\nJogador com a menor quantidade de cartões vermelhos: " +     jogadorMenosCartoesVermelhos 
        + "\nJogador com a maior quantidade cartões amarelos: " +     jogadorMaisCartoesAmarelos
        + "\nJogador com a menor quantidade cartões Amarelos: " + jogadorMenosCartoesAmarelos);
    
        
        


    }
}