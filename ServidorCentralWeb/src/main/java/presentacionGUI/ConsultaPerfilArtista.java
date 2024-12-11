/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacionGUI;

import controladores.Fabrica;
import controladores.iSistema;
import excepciones.UsuarioNoExisteException;
import datatypes.DataUsuario;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorPersistencia;


/**
 *
 * @author dokgo
 */
public class ConsultaPerfilArtista extends javax.swing.JInternalFrame {
    ControladorPersistencia cpu;
    
    iSistema sys = new Fabrica().getSistema(cpu);
    public String nickname;
    
    private DefaultListModel<String> albumesModel;
    
    /**
     * Creates new form ConsultaPerfilArtista
     */
    public ConsultaPerfilArtista() {
        //sys = new Fabrica().getSistema();
        initComponents();
        
        jLabel_imagen = new javax.swing.JLabel();
        getContentPane().add(jLabel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 5, 150, 100));
        albumesModel = new DefaultListModel<>();
        
        this.setSize(700,300);
        
        jComboBox_nickname.setSelectedItem(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nickname = new javax.swing.JLabel();
        jComboBox_nickname = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_info = new javax.swing.JTable();
        jButton_salir = new javax.swing.JButton();
        jLabel_imagen = new javax.swing.JLabel();
        jLabel_listAlbumes = new javax.swing.JLabel();
        jLabel_seguidores = new javax.swing.JLabel();
        jLabel_seguidores_cantidad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_seguidores = new javax.swing.JList<>();
        jLabel_bio = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_albumes_artista = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        text_bio = new javax.swing.JTextArea();

        setTitle("Consulta Perfil Artista");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nickname.setText("Ingrese Nickname a consultar:");
        getContentPane().add(jLabel_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        try {
            DataUsuario[] dataArtistas = sys.getArtistas();
            String[] nicksA = new String[dataArtistas.length];
            for (int i = 0; i < dataArtistas.length; i++) {
                nicksA[i] = dataArtistas[i].getNick();
            }
            jComboBox_nickname.setModel(new javax.swing.DefaultComboBoxModel<>(nicksA));
        } catch (UsuarioNoExisteException e) {
            // Manejar la excepción
        }
        jComboBox_nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nicknameActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 280, -1));

        jTable_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nickname", "Nombre", "Apellido", "Correo", "Fecha Nac", "SitioWeb"
            }
        ));
        jTable_info.setEnabled(false);
        jScrollPane1.setViewportView(jTable_info);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 800, 110));

        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 190, -1));
        getContentPane().add(jLabel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 230, 80));

        jLabel_listAlbumes.setText("Albums:");
        getContentPane().add(jLabel_listAlbumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel_seguidores.setText("Seguidores: ");
        getContentPane().add(jLabel_seguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));
        getContentPane().add(jLabel_seguidores_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, 20));

        jScrollPane2.setViewportView(list_seguidores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 262, 140, 140));

        jLabel_bio.setText("Biografia");
        getContentPane().add(jLabel_bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 270, -1));

        jScrollPane4.setViewportView(jList_albumes_artista);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, 140));

        text_bio.setColumns(20);
        text_bio.setRows(5);
        text_bio.setEnabled(false);
        jScrollPane5.setViewportView(text_bio);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_info.getModel();
        model.setRowCount(0);
        
        jComboBox_nickname.setSelectedItem(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jComboBox_nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nicknameActionPerformed
        if (jComboBox_nickname.getSelectedItem() == null) {
        return;
        }

        String nickname = jComboBox_nickname.getSelectedItem().toString();

        try {
            DataUsuario[] artistas = sys.getArtistas();

            // busca al artista
            for (DataUsuario dataUsuario : artistas) {
                if (dataUsuario.getNick().equals(nickname)) {

                    // crea la tabla
                    DefaultTableModel model = new DefaultTableModel(){//(DefaultTableModel) jTable_info.getModel();
                    
                        @Override
                        public boolean isCellEditable(int row, int column){
                            return false;
                        }
                    };
                    model.setRowCount(0); // limpiar la tabla antes de agregar nuevos datos
                    model.setColumnIdentifiers(new Object[]{"Nickname", "Nombre", "Apellido", "Correo", "FechaNac", "SitioWeb"});

                    // mete los datos del artista en la tabla
                    model.addRow(new Object[]{
                        dataUsuario.getNick(),
                        dataUsuario.getNombre(),
                        dataUsuario.getApellido(),
                        dataUsuario.getCorreo(),
                        dataUsuario.getFechaNac().toString(),
                        //dataUsuario.getBiografia(),
                        dataUsuario.getSitioWeb()
                    });
                    jTable_info.setModel(model);
                    jTable_info.repaint();
                    
                    //biografia
                    
//                    DefaultListModel<String> bioModel = new DefaultListModel<>();
//                    bioModel.addElement(dataUsuario.getBiografia());
//                    jlist_biografia.setModel(bioModel);
                    
                    String biografia = dataUsuario.getBiografia();
                    
                    text_bio.setText(biografia);
                    text_bio.setLineWrap(true);
                    text_bio.setWrapStyleWord(true);
                    
                    jLabel_bio.setText("Biografia de "+nickname);
                    
                    String imagePath = dataUsuario.getImagen();
                    if (imagePath != null && !imagePath.isEmpty()) {
                        java.net.URL imageURL = getClass().getResource("/images/" + imagePath);
                        if (imageURL != null) {
                            ImageIcon imageIcon = new ImageIcon(imageURL);
                            java.awt.Image scaledImage = imageIcon.getImage().getScaledInstance(jLabel_imagen.getWidth(), jLabel_imagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
                            jLabel_imagen.setIcon(new ImageIcon(scaledImage));
                        } else {
                            System.out.println("No se pudo encontrar la imagen en la ruta: " + "/images/" + imagePath);
                            jLabel_imagen.setIcon(null);
                        }
                    } else {
                        jLabel_imagen.setIcon(null); //
                    }
                    
//                    List<Cliente> seguidores = sys.getSeguidores(nickname);
//                    int cantidadSeguidores = seguidores.size();
//                    
//                    jLabel_seguidores_cantidad.setText("Cant. "+cantidadSeguidores);
//                    
//                    DefaultListModel<String> modeloSeguidores = new DefaultListModel<>();
//                    for (Cliente seguidor : seguidores) {
//                        modeloSeguidores.addElement(seguidor.getNickname());
//                        }
//                        list_seguidores.setModel(modeloSeguidores);

                    List<DataUsuario> seguidores = sys.getSeguidores(nickname);
                    int cantidadSeguidores = seguidores.size();

                    // Mostrar la cantidad de seguidores
                    jLabel_seguidores_cantidad.setText("Cant. " + cantidadSeguidores);

                    // Crear el modelo de la lista para mostrar los nicks de los seguidores
                    DefaultListModel<String> modeloSeguidores = new DefaultListModel<>();
                    for (DataUsuario seguidor : seguidores) {
                        // Agregar el nickname de cada seguidor al modelo
                        modeloSeguidores.addElement(seguidor.getNick());
                    }

                    // Asignar el modelo a la lista
                    list_seguidores.setModel(modeloSeguidores);
                    
                    //albumbes del artista
                    cargarAlbumesArtista(nickname);
                    
                    break;
                }
            }
        } catch (UsuarioNoExisteException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron artistas registrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox_nicknameActionPerformed

    private void cargarAlbumesArtista(String nickname) {
        albumesModel.clear();
        
        List<String> albumesArtista = sys.traerAlbumesArtista(nickname);
        
        for (String albumNombre : albumesArtista){
            albumesModel.addElement(albumNombre);
        }
        
        jList_albumes_artista.setModel(albumesModel);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_salir;
    private javax.swing.JComboBox<String> jComboBox_nickname;
    private javax.swing.JLabel jLabel_bio;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JLabel jLabel_listAlbumes;
    private javax.swing.JLabel jLabel_nickname;
    private javax.swing.JLabel jLabel_seguidores;
    private javax.swing.JLabel jLabel_seguidores_cantidad;
    private javax.swing.JList<String> jList_albumes_artista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_info;
    private javax.swing.JList<String> list_seguidores;
    private javax.swing.JTextArea text_bio;
    // End of variables declaration//GEN-END:variables
}
