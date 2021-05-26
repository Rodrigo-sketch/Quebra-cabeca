
package Interface;

import java.awt.Image;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class JDialogShowImage extends javax.swing.JDialog {

    
    private final int width;
    private final int height;
    public JDialogShowImage(Image image, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.width = jPanel1.getSize().width;
        this.height = jPanel1.getSize().height;
        jLabel1.setIcon(toScale(image));
    }

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Full Image");

        jPanel1.setToolTipText("Imagem Completa");
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    
    private ImageIcon toScale(Image inicial)
    {
        ImageIcon d = new ImageIcon(inicial);
        int width = (int)((d.getIconWidth()));
        int height = (int)((d.getIconHeight()));
        if(width > this.width)
            width = this.width;
        if(height > this.height)
            height = this.height;
        ImageIcon img2 = new ImageIcon(d.getImage().getScaledInstance(width, 
                height, Image.SCALE_DEFAULT));
        return img2;
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
  }
