import javax.swing.JOptionPane;
public class listaWhile6{
    public static void main(String[] args) {


        int bolos = 0;
        int doces = 0;
        int sanduba = 0;
        int pizza = 0;
        double produto = 0;
        double preco = 0;
        double total = 0;
        
        String cardapio = JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
        "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
        "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
        "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
        "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
        "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
        "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
        "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
        "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
        "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
        "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
        "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
        "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
        "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
        "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
        "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n",
        "Cardapio",
        JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{
        " ","Bolo Brigadeiro", "Bolo Floresta Negra","Bolo Leite com Nutella", "Bolo Mousse de Chocolate","Bolo Nega Maluca", "Bomba de Creme", "Bomba de Morango",
        "Filé-Mignon com fritas e cheddar", "Hambúrguer com queijos, champignon e rúcula", "Provolone com salame", "Vegetariano de berinjela", "Calabresa", "Napolitana", "Peruana", "Portuguesa", "Sair"
},
""
).toString();
    while(!cardapio.equals("Sair")){

        if (cardapio.equals("Bolo Brigadeiro")){
                preco = 29.50;
                total = preco + total;
                bolos = bolos + 1;
            }if (cardapio.equals("Bolo Floresta negra")){
                preco += 2.0;
                total = preco + total;
                bolos = bolos + 1;
            }if (cardapio.equals("Bolo leite com Nutella")){
                preco = 29.23;
                total = preco + total;
                bolos = bolos + 1;
            }if (cardapio.equals("Bolo Mousse de chocolate")){
                preco = 7.10;
                total = preco + total;
                bolos = bolos + 1;     
            }if (cardapio.equals("Bolo nega maluca")){
                preco = 19.33;
                total = preco + total;
                bolos = bolos + 1;
            }if (cardapio.equals("Bomba de creme")){
                preco = 17.71;
                total = preco + total;
                doces = doces + 1;
            }if (cardapio.equals("Bomba de morango")){
                preco = 4.82;
                total = preco + total;
                doces = doces + 1;
            }if (cardapio.equals("File mignon com fritas e cheddar")){
                preco = 21.16;
                total = preco + total;
                sanduba = sanduba + 1;
            }if (cardapio.equals("Hamburguer com quejo champignon e rucula")){
                preco = 12.72;
                total = preco + total;
                sanduba = sanduba + 1;
            }if (cardapio.equals("Provolone com salame")){
                preco = 19.70;
                total = preco + total;
                sanduba = sanduba + 1;
            }if (cardapio.equals("Vegetariano de berinjela")){
                preco = 28.22;
                total = preco + total;
                sanduba = sanduba + 1;
            }if (cardapio.equals("Calabresa")){
                preco = 8.98;
                total = preco + total;
                pizza =pizza + 1;
            }if (cardapio.equals("Napolitana")){
                preco = 0.42;
                total = preco + total;
                pizza = pizza +1;
            }if (cardapio.equals("Peruana")){
                preco = 18.36;
                total = preco + total;
                pizza = pizza +1; 
            }if (cardapio.equals("Portuguesa")){
                preco = 27.50;
                total = preco + total;
                pizza = pizza +1;

            }
            double mediaProduto = total /produto;

            cardapio = JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
        "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
        "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
        "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
        "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
        "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
        "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
        "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
        "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
        "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
        "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
        "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
        "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
        "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
        "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
        "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n",
        "Cardapio",
        JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{
        " ","Bolo Brigadeiro", "Bolo Floresta Negra","Bolo Leite com Nutella", "Bolo Mousse de Chocolate","Bolo Nega Maluca", "Bomba de Creme", "Bomba de Morango",
        "Filé-Mignon com fritas e cheddar", "Hambúrguer com queijos, champignon e rúcula", "Provolone com salame", "Vegetariano de berinjela", "Calabresa", "Napolitana", "Peruana", "Portuguesa", "Sair"
},
""
).toString();
        }
        double mediaProduto = total /produto;
        JOptionPane.showMessageDialog(null, "Quantidade de bolos: " + bolos + "\nQuantidade de doces: " + doces + "\nQuantidade de Sanduíches" + sanduba + "\nQuantidade de Pizza: " + pizza +
        "\nMédia de Produtos: " + mediaProduto);

            

        
    }
}