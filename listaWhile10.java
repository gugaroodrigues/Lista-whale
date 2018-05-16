import javax.swing.JOptionPane;
public class listaWhile10 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                          "Digite seu texto", "Contador de letras",
                            JOptionPane.INFORMATION_MESSAGE);
        char letra = 0;
        int contador = 0;
        String auxiliar = "";
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
        int i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0;
        int q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
        
        while(contador < texto.length()){

            auxiliar = "" + texto.charAt(contador);

            if(auxiliar.equalsIgnoreCase("a")){
                a = a + 1;
            }else if (auxiliar.equalsIgnoreCase("c")){
                c = c + 1;
            }else if (auxiliar.equalsIgnoreCase("d")){
                d = d + 1;
            }else if (auxiliar.equalsIgnoreCase("e")){
                e = e + 1;
            }else if (auxiliar.equalsIgnoreCase("f")){
                f = f + 1;
            }else if (auxiliar.equalsIgnoreCase("g")){
                g = g + 1;
            }else if (auxiliar.equalsIgnoreCase("h")){
                h = h + 1;
            }else if (auxiliar.equalsIgnoreCase("i")){
                i = i + 1;
            }else if (auxiliar.equalsIgnoreCase("j")){
                j = j + 1;
            }else if (auxiliar.equalsIgnoreCase("k")){
                k = k + 1;
            }else if (auxiliar.equalsIgnoreCase("l")){
                l = l + 1;
            }else if (auxiliar.equalsIgnoreCase("m")){
                m = m + 1;
            }else if (auxiliar.equalsIgnoreCase("n")){
                n = n + 1;
            }else if (auxiliar.equalsIgnoreCase("o")){
                o = o + 1;
            }else if (auxiliar.equalsIgnoreCase("p")){
                p = p + 1;
            }else if (auxiliar.equalsIgnoreCase("q")){
                q = q + 1;
            }else if (auxiliar.equalsIgnoreCase("r")){
                r = r + 1;
            }else if (auxiliar.equalsIgnoreCase("s")){
                s = s + 1;
            }else if (auxiliar.equalsIgnoreCase("t")){
                t = t + 1;
            }else if (auxiliar.equalsIgnoreCase("u")){
                u = u + 1;
            }else if (auxiliar.equalsIgnoreCase("v")){
                v = v + 1;
            }else if (auxiliar.equalsIgnoreCase("w")){
                w = w + 1;
            }else if (auxiliar.equalsIgnoreCase("x")){
                x = x + 1;
            }else if (auxiliar.equalsIgnoreCase("y")){
                y = y + 1;
            }else if (auxiliar.equalsIgnoreCase("z")){
                z = z + 1;
        }
            letra ++ ;
            contador ++;
            
        }
        JOptionPane.showMessageDialog(null, 
        "\nSeu texto foi : " + texto +
        "\nQuantidade de letras possuidas:" + 
        "\na = " + a + "\nb = " + b + 
        "\nc = " + c + 
        "\nd = " + d +
        "\ne = " + e + 
        "\nf = " + f + 
        "\ng = " + g + 
        "\nh = " + h +
        "\ni = " + i + 
        "\nj = " + j + 
        "\nk = " + k + 
        "\nl = " + l +
        "\nm = " + m + 
        "\nn = " + n + 
        "\no = " + o + 
        "\np = " + p +
        "\nq = " + q + 
        "\nr = " + r + 
        "\ns = " + s + 
        "\nt = " + t +
        "\nu = " + u + 
        "\nv = " + v + 
        "\nw = " + w + 
        "\nx = " + x +
        "\ny = " + y + 
        "\nz = " + z, 
        "Contador de Letras", 
        JOptionPane.INFORMATION_MESSAGE);

    }

    
}