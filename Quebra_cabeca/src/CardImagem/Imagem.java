
package CardImagem;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Imagem {
    private final ImageIcon imagemOriginal;
    private final ImageIcon imagemSombreada;
    private final ImageIcon imagemPequena;

    public Imagem(ImageIcon imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
        this.imagemSombreada = ManipularImagem.ManipularImagens.addSomeFilter(imagemOriginal);
        this.imagemPequena = toScale(imagemOriginal, 0.7f);
    }
    private ImageIcon toScale(ImageIcon inicial, float scale)
    {
        ImageIcon d = (ImageIcon) inicial;
        int width = (int)((d.getIconWidth()*scale));
        int height = (int)((d.getIconHeight()*scale));
        ImageIcon img2 = new ImageIcon(d.getImage().getScaledInstance(width, 
                height, Image.SCALE_DEFAULT));
        return img2;
    }

    public ImageIcon getImagemOriginal() {
        return imagemOriginal;
    }

    public ImageIcon getImagemSombreada() {
        return imagemSombreada;
    }

    public ImageIcon getImagemPequena() {
        return imagemPequena;
    }
}
