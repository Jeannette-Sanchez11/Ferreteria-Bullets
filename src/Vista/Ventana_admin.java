/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Base.*;
import java.sql.*;
import java.sql.ResultSetMetaData;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author jesanher
 */
public class Ventana_admin extends javax.swing.JFrame {

    //variables para hacer posible el crud
    PreparedStatement ps;
    ResultSet rs;
    Insertar in;
    Eliminar elim;
    Buscar bu;
    Actualizar ac;
    Connection conex;
    Conexion c = new Conexion();
     DefaultTableModel modelo = new DefaultTableModel();

    //variable para el pago
    float Monto_final, precio_compra, precio_venta, Monto_FinalV;
    int cantidad, cantidadV;
     int con=0;

    /**
     * Creates new form Ventana_admin
     */
    public Ventana_admin() {
        conex = c.ConectarBD();
        in = new Insertar();
        elim = new Eliminar();
        bu = new Buscar();
        ac = new Actualizar();
        initComponents();

        //obtener fecha
        Calendar calendar = new GregorianCalendar();
        fechatxt.setText("" + calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR) + "");
        fechaVentxt.setText("" + calendar.get(Calendar.DAY_OF_MONTH) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR) + "");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    //---------------------------------------------------Metodos para limpiar-------------------------------------------
    public void limpiarProveedor()//guardar proveedor--------------------------------------------
    {
        Nombre_Proveedortxt.setText("");
        Telefono_Proveedortxt.setText("");
        rfc_proveedortxt.setText("");
    }

    public void limpiarEliProveedor() {
        eliminarProveTxt.setText("");
    }

    public void limpiarBusProveedor() {
        buscar_provetxt.setText("");
    }

    public void limpiarActProveedor() {//actualizar
        ActuaProveetxt.setText("");
        ActualizarNomP.setText("");
        ActualizarTelP.setText("");
        ActualizarRFCP.setText("");
    }

    //-----------------------------------------------Metodos para limpiar la parte de Categoria----------------------------
    public void limpiarCategoria()//guardar
    {
        NombreCatetxt.setText("");
        Descripciontxt.setText("");
    }

    public void limpiarbusquedaCat()//buscar
    {
        buscar_cattxt.setText("");

    }

    public void limpiarElCategoria() {//eliminar
        eliminarCatetxt.setText("");
    }

    public void limpiaActCategoria() {//ctualizar
        buscar_AcCatxt.setText("");
        ActualizarNomCat.setText("");
        actualizarDescripcion.setText("");
    }
    //-----------------------------------------------Metodos para limpiar materiales-------------------------------------------

    public void limpiarMaterial() {//guardar
        codigobarratxt.setText("");
        id_categoriatxt.setText("");
        nombre_materialtxt.setText("");
        PrecioMaterial.setText("");
        marcatxt1.setText("");
        stocktxt.setText("");
    }

    public void limpiarEliMaterial() {//eliminar
        eliminarMateTxt.setText("");
    }

    public void limpiarBusMaterial() {//buscar
        nombreMaterial_txt.setText("");
    }

    public void limpiarActMaterial() {//Actualizar
        codigoACtxt.setText("");
        ide_catAc.setText("");
        nombre_matActxt.setText("");
        PrecioMaAc.setText("");
        MarcaAct.setText("");
        stockActuatxt.setText("");
    }

    //------------------------------------------------------Limpiar compra-----------------------------------------------
    public void limpiarGuardarCom() {
        IDprovetxt.setText("");
        codigoCtxt1.setText("");
        DescrComtxt.setText("");
        canCtxt1.setText("");
        precio_compratxt.setText("");
        monto_finaltxt.setText("");
        tabla_compra.setModel(new DefaultTableModel(null,new String[]{"Numero","Codigo barras","Descripcion","Cantidad","Precio","Total"}));
    }
    
    public void limpiarAnadirCom(){
        codigoCtxt1.setText("");
        DescrComtxt.setText("");
        canCtxt1.setText("");
        precio_compratxt.setText("");
    }
    
    public void limpCompraD(){
        eliminarComTxt.setText("");
    }
    
    //-----------------------------------------------Limpiar venta-----------------------------------------------
    public void limpiarGuardarVenta(){
        codigobVtxt.setText("");
        cantidadVentxt.setText("");
        montoVentatxt.setText("");
        Tabla_Venta.setModel(new DefaultTableModel(null,new String[]{"Numero","Codigo barras","Nombre","Cantidad","Precio Venta","Monto"}));
    }
    
    public void limapiarAnadirM(){
        codigobVtxt.setText("");
        cantidadVentxt.setText("");
    }
    
    public void limpiarElimnarV()
    {
        eliminarVenTxt.setText("");
    }
    
    
    //----------------------------------------------------------------------limpiar consulta----------------------------
    public void limpiarCons(){
        fechaIntxt2.setText("");
        fechaIntxt1.setText("");
        montoIntxt1.setText("");
    }
    
   public void LimpCD(){
       fechaIntxt.setText("");
       montoIntxt.setText("");
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        hide = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_categoria = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Guardar_Cat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreCatetxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Descripciontxt = new javax.swing.JTextField();
        Boton_GuardarCate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Eliminar_Cat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        eliminarCatetxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Boton_EliminarCate = new javax.swing.JButton();
        MostrarEli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaE_Categoria = new javax.swing.JTable();
        Buscar_Cat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buscar_cattxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BuscarCate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_categoria = new javax.swing.JTable();
        MostrarCate = new javax.swing.JButton();
        Actualizar = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        actualizarDescripcion = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        ActualizarNomCat = new javax.swing.JTextField();
        Boton_ActualCate = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        ActualizarCategoria = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        buscar_AcCatxt = new javax.swing.JTextField();
        Panel_Proveedor = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        Guardar_Proveedor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        rfc_proveedortxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nombre_Proveedortxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Telefono_Proveedortxt = new javax.swing.JTextField();
        Boton_GuardarProvee = new javax.swing.JButton();
        Eliminar_Proveedor = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        eliminarProveTxt = new javax.swing.JTextField();
        Boton_EliminarProve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaE_Proveedor = new javax.swing.JTable();
        MostrarEliPro = new javax.swing.JButton();
        Buscar_Proveedor = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        buscar_provetxt = new javax.swing.JTextField();
        BuscarProveedor = new javax.swing.JButton();
        MostrarProvee = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_Proveedor = new javax.swing.JTable();
        Actualizar_Proveedor = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ActualizarTelP = new javax.swing.JTextField();
        ActualizarRFCP = new javax.swing.JTextField();
        ActualizarNomP = new javax.swing.JTextField();
        Boton_ActualProvee = new javax.swing.JButton();
        BuscarProveedorA = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        ActuaProveetxt = new javax.swing.JTextField();
        Panel_Materiales = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        Guardar_Material = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        stocktxt = new javax.swing.JTextField();
        PrecioMaterial = new javax.swing.JTextField();
        nombre_materialtxt = new javax.swing.JTextField();
        id_categoriatxt = new javax.swing.JTextField();
        codigobarratxt = new javax.swing.JTextField();
        Boton_GuardarMaterial = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        marcatxt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        Eliminar_Material = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        eliminarMateTxt = new javax.swing.JTextField();
        Boton_EliminarMaterial = new javax.swing.JButton();
        MostrarEliMate = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaEli_Material = new javax.swing.JTable();
        Actualizar_Material = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        codigoACtxt = new javax.swing.JTextField();
        ide_catAc = new javax.swing.JTextField();
        nombre_matActxt = new javax.swing.JTextField();
        PrecioMaAc = new javax.swing.JTextField();
        stockActuatxt = new javax.swing.JTextField();
        MarcaAct = new javax.swing.JTextField();
        Boton_ActualMaterial = new javax.swing.JButton();
        BuscarMaterialAc = new javax.swing.JButton();
        Buscar_Material = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        BuscarMaterial = new javax.swing.JButton();
        nombreMaterial_txt = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        MostrarMaterial = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tabla_Materiales = new javax.swing.JTable();
        Panel_Ventas = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        Guardar_Venta = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        fechaVentxt = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        cantidadVentxt = new javax.swing.JTextField();
        codigobVtxt = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tabla_Venta = new javax.swing.JTable();
        Boton_GuardarVenta = new javax.swing.JButton();
        Boton_anadirVenta = new javax.swing.JButton();
        montoVentatxt = new javax.swing.JTextField();
        Eliminar_Venta = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        eliminarVenTxt = new javax.swing.JTextField();
        Boton_EliminarVen = new javax.swing.JButton();
        Buscar_Venta = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        BuscarVenta = new javax.swing.JButton();
        buscar_Venta = new javax.swing.JTextField();
        MostrarVnetas = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        Tabla_venta = new javax.swing.JTable();
        Panel_Compra = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        Guardar_Compra = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        IDprovetxt = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        codigoCtxt1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        canCtxt1 = new javax.swing.JTextField();
        Boton_AnadirCompra = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_compra = new javax.swing.JTable();
        Boton_GuardarCompra = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        monto_finaltxt = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        DescrComtxt = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        precio_compratxt = new javax.swing.JTextField();
        Eliminar_Compra = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        eliminarComTxt = new javax.swing.JTextField();
        Boton_EliminarCompra = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        Tabla_compaEL = new javax.swing.JTable();
        MostrarCompras1 = new javax.swing.JButton();
        Buscar_Compra = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        buscarCompratxt = new javax.swing.JTextField();
        buscarCompra = new javax.swing.JButton();
        MostrarCompras = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        Tabla_compa = new javax.swing.JTable();
        Panel_Ingresos = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        Ingresos_dia = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        fechaIntxt = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        montoIntxt = new javax.swing.JTextField();
        BotonConsultarIN = new javax.swing.JButton();
        LimpiarCon1 = new javax.swing.JButton();
        Ingresos = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        fechaIntxt1 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        fechaIntxt2 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        montoIntxt1 = new javax.swing.JTextField();
        ConsultarIngre = new javax.swing.JButton();
        LimpiarCon = new javax.swing.JButton();
        Panel_Egresos = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        fechaE1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        fechaE2 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        montoIntxt2 = new javax.swing.JTextField();
        ConsultarIngre1 = new javax.swing.JButton();
        LimpiarCon2 = new javax.swing.JButton();
        Panel_Boton = new javax.swing.JPanel();
        CerrarSL = new javax.swing.JLabel();
        categoriaL = new javax.swing.JLabel();
        ProvvedoresL = new javax.swing.JLabel();
        MeterialesL = new javax.swing.JLabel();
        VentasL = new javax.swing.JLabel();
        EgresosL = new javax.swing.JLabel();
        IngresosL = new javax.swing.JLabel();
        ComprasL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 33, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setBackground(new java.awt.Color(9, 33, 71));

        javax.swing.GroupLayout hideLayout = new javax.swing.GroupLayout(hide);
        hide.setLayout(hideLayout);
        hideLayout.setHorizontalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        hideLayout.setVerticalGroup(
            hideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -40, 830, 80));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        Panel_categoria.setBackground(new java.awt.Color(9, 33, 71));

        jTabbedPane2.setBackground(new java.awt.Color(9, 33, 71));

        Guardar_Cat.setBackground(new java.awt.Color(9, 33, 71));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la categoría:");

        NombreCatetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrpción");

        Descripciontxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Boton_GuardarCate.setBackground(new java.awt.Color(26, 72, 142));
        Boton_GuardarCate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_GuardarCate.setForeground(new java.awt.Color(255, 255, 255));
        Boton_GuardarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        Boton_GuardarCate.setText("Guardar");
        Boton_GuardarCate.setBorder(null);
        Boton_GuardarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarCateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guardar Categoría");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Guardar_CatLayout = new javax.swing.GroupLayout(Guardar_Cat);
        Guardar_Cat.setLayout(Guardar_CatLayout);
        Guardar_CatLayout.setHorizontalGroup(
            Guardar_CatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Guardar_CatLayout.createSequentialGroup()
                .addGroup(Guardar_CatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel4))
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel2))
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(Boton_GuardarCate, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Guardar_CatLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(Guardar_CatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreCatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        Guardar_CatLayout.setVerticalGroup(
            Guardar_CatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Guardar_CatLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(NombreCatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(Descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(Boton_GuardarCate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Alta", Guardar_Cat);

        Eliminar_Cat.setBackground(new java.awt.Color(9, 33, 71));
        Eliminar_Cat.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Cat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eliminar Categoría");
        Eliminar_Cat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Cat.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 660, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese el nombre de la categoria  a eliminar:");
        Eliminar_Cat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        eliminarCatetxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminarCatetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Eliminar_Cat.add(eliminarCatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 310, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Eliminar_Cat.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        Boton_EliminarCate.setBackground(new java.awt.Color(26, 72, 142));
        Boton_EliminarCate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_EliminarCate.setForeground(new java.awt.Color(255, 255, 255));
        Boton_EliminarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elimiinara.png"))); // NOI18N
        Boton_EliminarCate.setText("Eliminar");
        Boton_EliminarCate.setBorder(null);
        Boton_EliminarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarCateActionPerformed(evt);
            }
        });
        Eliminar_Cat.add(Boton_EliminarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 227, 45));

        MostrarEli.setBackground(new java.awt.Color(26, 72, 142));
        MostrarEli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarEli.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarEli.setText("Mostrar");
        MostrarEli.setBorder(null);
        MostrarEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEliActionPerformed(evt);
            }
        });
        Eliminar_Cat.add(MostrarEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 227, 45));

        TablaE_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Ide categoria", "Nombre_c", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(TablaE_Categoria);

        Eliminar_Cat.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 520, 150));

        jTabbedPane2.addTab("Eliminar", Eliminar_Cat);

        Buscar_Cat.setBackground(new java.awt.Color(9, 33, 71));
        Buscar_Cat.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Cat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de la categoria:");
        Buscar_Cat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        buscar_cattxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Buscar_Cat.add(buscar_cattxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 300, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar Categoría");
        Buscar_Cat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Cat.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 660, 10));

        BuscarCate.setBackground(new java.awt.Color(26, 72, 142));
        BuscarCate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarCate.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarCate.setText("Buscar");
        BuscarCate.setBorder(null);
        BuscarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCateActionPerformed(evt);
            }
        });
        Buscar_Cat.add(BuscarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 227, 45));

        Tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Ide categoria", "Nombre_c", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabla_categoria);
        if (Tabla_categoria.getColumnModel().getColumnCount() > 0) {
            Tabla_categoria.getColumnModel().getColumn(0).setResizable(false);
            Tabla_categoria.getColumnModel().getColumn(1).setResizable(false);
        }

        Buscar_Cat.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 150));

        MostrarCate.setBackground(new java.awt.Color(26, 72, 142));
        MostrarCate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarCate.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarCate.setText("Mostrar");
        MostrarCate.setBorder(null);
        MostrarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCateActionPerformed(evt);
            }
        });
        Buscar_Cat.add(MostrarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 227, 45));

        jTabbedPane2.addTab("Buscar", Buscar_Cat);

        Actualizar.setBackground(new java.awt.Color(9, 33, 71));
        Actualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Nombre de la categoría:");
        Actualizar.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        actualizarDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar.add(actualizarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 238, 30));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Descrpción");
        Actualizar.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        ActualizarNomCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar.add(ActualizarNomCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 237, 30));

        Boton_ActualCate.setBackground(new java.awt.Color(26, 72, 142));
        Boton_ActualCate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_ActualCate.setForeground(new java.awt.Color(255, 255, 255));
        Boton_ActualCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar_2.png"))); // NOI18N
        Boton_ActualCate.setText("Actualizar");
        Boton_ActualCate.setBorder(null);
        Boton_ActualCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualCateActionPerformed(evt);
            }
        });
        Actualizar.add(Boton_ActualCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 227, 45));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Actualizar Categoría");
        Actualizar.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jSeparator19.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 660, 10));

        ActualizarCategoria.setBackground(new java.awt.Color(26, 72, 142));
        ActualizarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ActualizarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        ActualizarCategoria.setText("Buscar");
        ActualizarCategoria.setBorder(null);
        ActualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCategoriaActionPerformed(evt);
            }
        });
        Actualizar.add(ActualizarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 120, 40));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Id categoria:");
        Actualizar.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        buscar_AcCatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar.add(buscar_AcCatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 80, 237, 27));

        jTabbedPane2.addTab("Actualizar", Actualizar);

        javax.swing.GroupLayout Panel_categoriaLayout = new javax.swing.GroupLayout(Panel_categoria);
        Panel_categoria.setLayout(Panel_categoriaLayout);
        Panel_categoriaLayout.setHorizontalGroup(
            Panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        Panel_categoriaLayout.setVerticalGroup(
            Panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_categoriaLayout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Categoria", Panel_categoria);

        Panel_Proveedor.setBackground(new java.awt.Color(9, 33, 71));
        Panel_Proveedor.setForeground(new java.awt.Color(0, 0, 0));

        Guardar_Proveedor.setBackground(new java.awt.Color(9, 33, 71));
        Guardar_Proveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Proveedor");
        Guardar_Proveedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RFC:");
        Guardar_Proveedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Proveedor.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 660, 10));

        rfc_proveedortxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rfc_proveedortxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Proveedor.add(rfc_proveedortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 290, 27));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prove.png"))); // NOI18N
        Guardar_Proveedor.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 4, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre del Proveedor:");
        Guardar_Proveedor.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        Nombre_Proveedortxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Nombre_Proveedortxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Proveedor.add(Nombre_Proveedortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 290, 27));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefono:");
        Guardar_Proveedor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        Telefono_Proveedortxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Telefono_Proveedortxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Proveedor.add(Telefono_Proveedortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 290, 27));

        Boton_GuardarProvee.setBackground(new java.awt.Color(26, 72, 142));
        Boton_GuardarProvee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_GuardarProvee.setForeground(new java.awt.Color(255, 255, 255));
        Boton_GuardarProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        Boton_GuardarProvee.setText("Guardar");
        Boton_GuardarProvee.setBorder(null);
        Boton_GuardarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarProveeActionPerformed(evt);
            }
        });
        Guardar_Proveedor.add(Boton_GuardarProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 227, 45));

        jTabbedPane3.addTab("Alta", Guardar_Proveedor);

        Eliminar_Proveedor.setBackground(new java.awt.Color(9, 33, 71));
        Eliminar_Proveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Eliminar Proveedor");
        Eliminar_Proveedor.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jSeparator20.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Proveedor.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 48, 660, 13));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Eliminar_Proveedor.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Ingrese el Nombre del proveedor a eliminar:");
        Eliminar_Proveedor.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        eliminarProveTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminarProveTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Eliminar_Proveedor.add(eliminarProveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 300, 30));

        Boton_EliminarProve.setBackground(new java.awt.Color(26, 72, 142));
        Boton_EliminarProve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_EliminarProve.setForeground(new java.awt.Color(255, 255, 255));
        Boton_EliminarProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elimiinara.png"))); // NOI18N
        Boton_EliminarProve.setText("Eliminar");
        Boton_EliminarProve.setBorder(null);
        Boton_EliminarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarProveActionPerformed(evt);
            }
        });
        Eliminar_Proveedor.add(Boton_EliminarProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 227, 45));

        TablaE_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Ide proveedor", "Nombre_p", "Telefono", "RFC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaE_Proveedor);

        Eliminar_Proveedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 160));

        MostrarEliPro.setBackground(new java.awt.Color(26, 72, 142));
        MostrarEliPro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarEliPro.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEliPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarEliPro.setText("Mostrar");
        MostrarEliPro.setBorder(null);
        MostrarEliPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEliProActionPerformed(evt);
            }
        });
        Eliminar_Proveedor.add(MostrarEliPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 227, 45));

        jTabbedPane3.addTab("Eliminar", Eliminar_Proveedor);

        Buscar_Proveedor.setBackground(new java.awt.Color(9, 33, 71));
        Buscar_Proveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Buscar Proveedor");
        Buscar_Proveedor.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 6, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Proveedor.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 660, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre del proveedor:");
        Buscar_Proveedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        buscar_provetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Buscar_Proveedor.add(buscar_provetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 290, 27));

        BuscarProveedor.setBackground(new java.awt.Color(26, 72, 142));
        BuscarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        BuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarProveedor.setText("Buscar");
        BuscarProveedor.setBorder(null);
        BuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProveedorActionPerformed(evt);
            }
        });
        Buscar_Proveedor.add(BuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 227, 45));

        MostrarProvee.setBackground(new java.awt.Color(26, 72, 142));
        MostrarProvee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarProvee.setForeground(new java.awt.Color(255, 255, 255));
        MostrarProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarProvee.setText("Mostrar");
        MostrarProvee.setBorder(null);
        MostrarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarProveeActionPerformed(evt);
            }
        });
        Buscar_Proveedor.add(MostrarProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 227, 45));

        Tabla_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Ide proveedor", "Nombre_p", "Telefono", "RFC"
            }
        ));
        jScrollPane4.setViewportView(Tabla_Proveedor);

        Buscar_Proveedor.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 160));

        jTabbedPane3.addTab("Buscar", Buscar_Proveedor);

        Actualizar_Proveedor.setBackground(new java.awt.Color(9, 33, 71));
        Actualizar_Proveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Actualizar Proveedor");
        Actualizar_Proveedor.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jSeparator21.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar_Proveedor.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 660, 13));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar.png"))); // NOI18N
        Actualizar_Proveedor.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Nombre del Proveedor:");
        Actualizar_Proveedor.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Telefono:");
        Actualizar_Proveedor.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("RFC:");
        Actualizar_Proveedor.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        ActualizarTelP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ActualizarTelP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Proveedor.add(ActualizarTelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 260, 27));

        ActualizarRFCP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ActualizarRFCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Proveedor.add(ActualizarRFCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 260, 27));

        ActualizarNomP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ActualizarNomP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Proveedor.add(ActualizarNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 260, 27));

        Boton_ActualProvee.setBackground(new java.awt.Color(26, 72, 142));
        Boton_ActualProvee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_ActualProvee.setForeground(new java.awt.Color(255, 255, 255));
        Boton_ActualProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar_2.png"))); // NOI18N
        Boton_ActualProvee.setText("Actualizar");
        Boton_ActualProvee.setBorder(null);
        Boton_ActualProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualProveeActionPerformed(evt);
            }
        });
        Actualizar_Proveedor.add(Boton_ActualProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 227, 45));

        BuscarProveedorA.setBackground(new java.awt.Color(26, 72, 142));
        BuscarProveedorA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarProveedorA.setForeground(new java.awt.Color(255, 255, 255));
        BuscarProveedorA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarProveedorA.setText("Buscar");
        BuscarProveedorA.setBorder(null);
        BuscarProveedorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProveedorAActionPerformed(evt);
            }
        });
        Actualizar_Proveedor.add(BuscarProveedorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 120, 40));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Ide del proveedor:");
        Actualizar_Proveedor.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        ActuaProveetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Proveedor.add(ActuaProveetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 260, 27));

        jTabbedPane3.addTab("Actualizar", Actualizar_Proveedor);

        javax.swing.GroupLayout Panel_ProveedorLayout = new javax.swing.GroupLayout(Panel_Proveedor);
        Panel_Proveedor.setLayout(Panel_ProveedorLayout);
        Panel_ProveedorLayout.setHorizontalGroup(
            Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        Panel_ProveedorLayout.setVerticalGroup(
            Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Proveedor", Panel_Proveedor);

        Panel_Materiales.setBackground(new java.awt.Color(9, 33, 71));

        Guardar_Material.setBackground(new java.awt.Color(9, 33, 71));
        Guardar_Material.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Guardar Material");
        Guardar_Material.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Material.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 660, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Stock:");
        Guardar_Material.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Codigo de barras:");
        Guardar_Material.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ID de la Categoria:");
        Guardar_Material.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre del Material:");
        Guardar_Material.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Precio:");
        Guardar_Material.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        stocktxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(stocktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 260, 27));

        PrecioMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(PrecioMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 260, 27));

        nombre_materialtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(nombre_materialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 260, 27));

        id_categoriatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(id_categoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 260, 27));

        codigobarratxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(codigobarratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 260, 27));

        Boton_GuardarMaterial.setBackground(new java.awt.Color(26, 72, 142));
        Boton_GuardarMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_GuardarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        Boton_GuardarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        Boton_GuardarMaterial.setText("Guardar");
        Boton_GuardarMaterial.setBorder(null);
        Boton_GuardarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarMaterialActionPerformed(evt);
            }
        });
        Guardar_Material.add(Boton_GuardarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 227, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Marca:");
        Guardar_Material.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        marcatxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Material.add(marcatxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 260, 27));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Herramienta.png"))); // NOI18N
        Guardar_Material.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Herramienta.png"))); // NOI18N
        Guardar_Material.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jTabbedPane4.addTab("Alta", Guardar_Material);

        Eliminar_Material.setBackground(new java.awt.Color(9, 33, 71));
        Eliminar_Material.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Eliminar Material");
        Eliminar_Material.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 17, -1, -1));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Material.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 660, 20));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Eliminar_Material.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 12, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Ingrese el Codigo de barras del material a eliminar:");
        Eliminar_Material.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        eliminarMateTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminarMateTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Eliminar_Material.add(eliminarMateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 290, 30));

        Boton_EliminarMaterial.setBackground(new java.awt.Color(26, 72, 142));
        Boton_EliminarMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_EliminarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        Boton_EliminarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elimiinara.png"))); // NOI18N
        Boton_EliminarMaterial.setText("Eliminar");
        Boton_EliminarMaterial.setBorder(null);
        Boton_EliminarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarMaterialActionPerformed(evt);
            }
        });
        Eliminar_Material.add(Boton_EliminarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 227, 40));

        MostrarEliMate.setBackground(new java.awt.Color(26, 72, 142));
        MostrarEliMate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarEliMate.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEliMate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarEliMate.setText("Mostrar");
        MostrarEliMate.setBorder(null);
        MostrarEliMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEliMateActionPerformed(evt);
            }
        });
        Eliminar_Material.add(MostrarEliMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 227, 45));

        TablaEli_Material.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo de barras", "Categoria", "nombre", "Precio", "Marca", "Stock"
            }
        ));
        jScrollPane8.setViewportView(TablaEli_Material);

        Eliminar_Material.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 550, 160));

        jTabbedPane4.addTab("Eliminar", Eliminar_Material);

        Actualizar_Material.setBackground(new java.awt.Color(9, 33, 71));
        Actualizar_Material.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Actualizar Material");
        Actualizar_Material.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 6, -1, -1));

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator16.setRequestFocusEnabled(false);
        Actualizar_Material.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 660, 20));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Codigo de barras:");
        Actualizar_Material.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 83, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Ide de la Categoria:");
        Actualizar_Material.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 132, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Nombre del Material:");
        Actualizar_Material.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 178, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Precio:");
        Actualizar_Material.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 225, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Marca:");
        Actualizar_Material.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 265, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Stock:");
        Actualizar_Material.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 311, -1, -1));

        codigoACtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(codigoACtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 81, 260, 27));

        ide_catAc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(ide_catAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 130, 260, 27));

        nombre_matActxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(nombre_matActxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 176, 260, 27));

        PrecioMaAc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(PrecioMaAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 218, 260, 27));

        stockActuatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(stockActuatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 309, 260, 27));

        MarcaAct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Actualizar_Material.add(MarcaAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 263, 260, 27));

        Boton_ActualMaterial.setBackground(new java.awt.Color(26, 72, 142));
        Boton_ActualMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_ActualMaterial.setForeground(new java.awt.Color(255, 255, 255));
        Boton_ActualMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar_2.png"))); // NOI18N
        Boton_ActualMaterial.setText("Actualizar");
        Boton_ActualMaterial.setBorder(null);
        Boton_ActualMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualMaterialActionPerformed(evt);
            }
        });
        Actualizar_Material.add(Boton_ActualMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 227, 45));

        BuscarMaterialAc.setBackground(new java.awt.Color(26, 72, 142));
        BuscarMaterialAc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarMaterialAc.setForeground(new java.awt.Color(255, 255, 255));
        BuscarMaterialAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarMaterialAc.setText("Buscar");
        BuscarMaterialAc.setBorder(null);
        BuscarMaterialAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMaterialAcActionPerformed(evt);
            }
        });
        Actualizar_Material.add(BuscarMaterialAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 120, 40));

        jTabbedPane4.addTab("Actualizar", Actualizar_Material);

        Buscar_Material.setBackground(new java.awt.Color(9, 33, 71));
        Buscar_Material.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Buscar Material");
        Buscar_Material.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Material.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 620, 20));

        BuscarMaterial.setBackground(new java.awt.Color(26, 72, 142));
        BuscarMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        BuscarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarMaterial.setText("Buscar");
        BuscarMaterial.setBorder(null);
        BuscarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMaterialActionPerformed(evt);
            }
        });
        Buscar_Material.add(BuscarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 227, 45));

        nombreMaterial_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Buscar_Material.add(nombreMaterial_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 290, 27));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Nombre del Material:");
        Buscar_Material.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        MostrarMaterial.setBackground(new java.awt.Color(26, 72, 142));
        MostrarMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarMaterial.setForeground(new java.awt.Color(255, 255, 255));
        MostrarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarMaterial.setText("Mostrar");
        MostrarMaterial.setBorder(null);
        MostrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarMaterialActionPerformed(evt);
            }
        });
        Buscar_Material.add(MostrarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 227, 45));

        Tabla_Materiales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo de barras", "Categoria", "nombre", "Precio", "Marca", "Stock"
            }
        ));
        jScrollPane6.setViewportView(Tabla_Materiales);

        Buscar_Material.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 520, 160));

        jTabbedPane4.addTab("Buscar", Buscar_Material);

        javax.swing.GroupLayout Panel_MaterialesLayout = new javax.swing.GroupLayout(Panel_Materiales);
        Panel_Materiales.setLayout(Panel_MaterialesLayout);
        Panel_MaterialesLayout.setHorizontalGroup(
            Panel_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        Panel_MaterialesLayout.setVerticalGroup(
            Panel_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Materiales", Panel_Materiales);

        Panel_Ventas.setBackground(new java.awt.Color(9, 33, 71));

        Guardar_Venta.setBackground(new java.awt.Color(9, 33, 71));
        Guardar_Venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Guardar Venta");
        Guardar_Venta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 0, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Venta.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 660, 10));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Fecha:");
        Guardar_Venta.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Monto final:");
        Guardar_Venta.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        fechaVentxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaVentxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Venta.add(fechaVentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 27));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Codigo de barras:");
        Guardar_Venta.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Cantidad:");
        Guardar_Venta.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        cantidadVentxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cantidadVentxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Venta.add(cantidadVentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 214, 27));

        codigobVtxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        codigobVtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Venta.add(codigobVtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 214, 27));

        Tabla_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Codigo barras", "Nombre", "Cantidad", "Precio Venta", "Monto"
            }
        ));
        jScrollPane7.setViewportView(Tabla_Venta);

        Guardar_Venta.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 750, 162));

        Boton_GuardarVenta.setBackground(new java.awt.Color(26, 72, 142));
        Boton_GuardarVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_GuardarVenta.setForeground(new java.awt.Color(255, 255, 255));
        Boton_GuardarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        Boton_GuardarVenta.setText("Generar venta");
        Boton_GuardarVenta.setBorder(null);
        Boton_GuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarVentaActionPerformed(evt);
            }
        });
        Guardar_Venta.add(Boton_GuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 227, 40));

        Boton_anadirVenta.setBackground(new java.awt.Color(26, 72, 142));
        Boton_anadirVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_anadirVenta.setForeground(new java.awt.Color(255, 255, 255));
        Boton_anadirVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        Boton_anadirVenta.setText("Añadir");
        Boton_anadirVenta.setBorder(null);
        Boton_anadirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_anadirVentaActionPerformed(evt);
            }
        });
        Guardar_Venta.add(Boton_anadirVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 227, 40));

        montoVentatxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        montoVentatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Venta.add(montoVentatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 214, 27));

        jTabbedPane5.addTab("Alta", Guardar_Venta);

        Eliminar_Venta.setBackground(new java.awt.Color(9, 33, 71));
        Eliminar_Venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Eliminar Venta");
        Eliminar_Venta.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Venta.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 48, 660, 10));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Eliminar_Venta.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Ingrese el id de Venta a eliminar:");
        Eliminar_Venta.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 70, -1, 40));

        eliminarVenTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminarVenTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Eliminar_Venta.add(eliminarVenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 116, 240, 30));

        Boton_EliminarVen.setBackground(new java.awt.Color(26, 72, 142));
        Boton_EliminarVen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_EliminarVen.setForeground(new java.awt.Color(255, 255, 255));
        Boton_EliminarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elimiinara.png"))); // NOI18N
        Boton_EliminarVen.setText("Eliminar");
        Boton_EliminarVen.setBorder(null);
        Boton_EliminarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarVenActionPerformed(evt);
            }
        });
        Eliminar_Venta.add(Boton_EliminarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 176, 227, 40));

        jTabbedPane5.addTab("Eliminar", Eliminar_Venta);

        Buscar_Venta.setBackground(new java.awt.Color(9, 33, 71));
        Buscar_Venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Buscar Venta");
        Buscar_Venta.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 12, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Venta.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 43, 446, 10));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Ingrese la fecha de la venta:(DD-MM-AA)");
        Buscar_Venta.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        BuscarVenta.setBackground(new java.awt.Color(26, 72, 142));
        BuscarVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarVenta.setForeground(new java.awt.Color(255, 255, 255));
        BuscarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarVenta.setText("Buscar");
        BuscarVenta.setBorder(null);
        BuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVentaActionPerformed(evt);
            }
        });
        Buscar_Venta.add(BuscarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 120, 40));

        buscar_Venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Buscar_Venta.add(buscar_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 370, 270, 27));

        MostrarVnetas.setBackground(new java.awt.Color(26, 72, 142));
        MostrarVnetas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarVnetas.setForeground(new java.awt.Color(255, 255, 255));
        MostrarVnetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N
        MostrarVnetas.setText("Mostrar");
        MostrarVnetas.setBorder(null);
        MostrarVnetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarVnetasActionPerformed(evt);
            }
        });
        Buscar_Venta.add(MostrarVnetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 227, 45));

        Tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id venta", "Monto final", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(Tabla_venta);

        Buscar_Venta.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 140));

        jTabbedPane5.addTab("Buscar", Buscar_Venta);

        javax.swing.GroupLayout Panel_VentasLayout = new javax.swing.GroupLayout(Panel_Ventas);
        Panel_Ventas.setLayout(Panel_VentasLayout);
        Panel_VentasLayout.setHorizontalGroup(
            Panel_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        Panel_VentasLayout.setVerticalGroup(
            Panel_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_VentasLayout.createSequentialGroup()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ventas", Panel_Ventas);

        Panel_Compra.setBackground(new java.awt.Color(9, 33, 71));

        Guardar_Compra.setBackground(new java.awt.Color(9, 33, 71));
        Guardar_Compra.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Compra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Guardar Compra");
        Guardar_Compra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 6, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Compra.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 710, 20));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Id del proveedor:");
        Guardar_Compra.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Monto final:");
        Guardar_Compra.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        IDprovetxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        IDprovetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(IDprovetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, 30));

        jSeparator22.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Compra.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 710, 14));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Codigo de barra:");
        Guardar_Compra.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        codigoCtxt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        codigoCtxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(codigoCtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 240, 27));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Descripcion:");
        Guardar_Compra.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        canCtxt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        canCtxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(canCtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 240, 27));

        Boton_AnadirCompra.setBackground(new java.awt.Color(26, 72, 142));
        Boton_AnadirCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_AnadirCompra.setForeground(new java.awt.Color(255, 255, 255));
        Boton_AnadirCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        Boton_AnadirCompra.setText("Añadir");
        Boton_AnadirCompra.setBorder(null);
        Boton_AnadirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AnadirCompraActionPerformed(evt);
            }
        });
        Guardar_Compra.add(Boton_AnadirCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 227, 40));

        tabla_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Codigo barra", "descripcion", "cantidad", "precio", "Total"
            }
        ));
        jScrollPane5.setViewportView(tabla_compra);

        Guardar_Compra.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 690, 150));

        Boton_GuardarCompra.setBackground(new java.awt.Color(26, 72, 142));
        Boton_GuardarCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_GuardarCompra.setForeground(new java.awt.Color(255, 255, 255));
        Boton_GuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        Boton_GuardarCompra.setText("Procesar");
        Boton_GuardarCompra.setBorder(null);
        Boton_GuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarCompraActionPerformed(evt);
            }
        });
        Guardar_Compra.add(Boton_GuardarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 227, 40));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Fecha: ");
        Guardar_Compra.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        fechatxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(fechatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 30));

        monto_finaltxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        monto_finaltxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(monto_finaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 170, 30));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Precio compra:");
        Guardar_Compra.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        DescrComtxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DescrComtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(DescrComtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 240, 27));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Cantidad:");
        Guardar_Compra.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        precio_compratxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        precio_compratxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardar_Compra.add(precio_compratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, 30));

        jTabbedPane6.addTab("Alta", Guardar_Compra);

        Eliminar_Compra.setBackground(new java.awt.Color(9, 33, 71));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Eliminar Compra");

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Ingrese el id de compra a eliminar:");

        eliminarComTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        eliminarComTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Boton_EliminarCompra.setBackground(new java.awt.Color(26, 72, 142));
        Boton_EliminarCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_EliminarCompra.setForeground(new java.awt.Color(255, 255, 255));
        Boton_EliminarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elimiinara.png"))); // NOI18N
        Boton_EliminarCompra.setText("Eliminar");
        Boton_EliminarCompra.setBorder(null);
        Boton_EliminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarCompraActionPerformed(evt);
            }
        });

        Tabla_compaEL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id compra", "id preveedor", "Monto total", "Fecha "
            }
        ));
        jScrollPane11.setViewportView(Tabla_compaEL);

        MostrarCompras1.setBackground(new java.awt.Color(26, 72, 142));
        MostrarCompras1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarCompras1.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCompras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mostrar.png"))); // NOI18N
        MostrarCompras1.setText("Mostar todos los datos");
        MostrarCompras1.setBorder(null);
        MostrarCompras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCompras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Eliminar_CompraLayout = new javax.swing.GroupLayout(Eliminar_Compra);
        Eliminar_Compra.setLayout(Eliminar_CompraLayout);
        Eliminar_CompraLayout.setHorizontalGroup(
            Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarComTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(MostrarCompras1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_EliminarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        Eliminar_CompraLayout.setVerticalGroup(
            Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel41))
                .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarComTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Boton_EliminarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Eliminar_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_CompraLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(MostrarCompras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_CompraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );

        jTabbedPane6.addTab("Eliminar", Eliminar_Compra);

        Buscar_Compra.setBackground(new java.awt.Color(9, 33, 71));
        Buscar_Compra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Buscar Compra");
        Buscar_Compra.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 6, -1, -1));

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        Buscar_Compra.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 600, 10));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Ingrese la fecha de la compra:(DD-MM-AA)");
        Buscar_Compra.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        buscarCompratxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Buscar_Compra.add(buscarCompratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 230, 27));

        buscarCompra.setBackground(new java.awt.Color(26, 72, 142));
        buscarCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCompra.setForeground(new java.awt.Color(255, 255, 255));
        buscarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscarCompra.setText("Buscar");
        buscarCompra.setBorder(null);
        buscarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCompraActionPerformed(evt);
            }
        });
        Buscar_Compra.add(buscarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 227, 40));

        MostrarCompras.setBackground(new java.awt.Color(26, 72, 142));
        MostrarCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MostrarCompras.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mostrar.png"))); // NOI18N
        MostrarCompras.setText("Mostar todos los datos");
        MostrarCompras.setBorder(null);
        MostrarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarComprasActionPerformed(evt);
            }
        });
        Buscar_Compra.add(MostrarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 227, 40));

        Tabla_compa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id compra", "id preveedor", "Monto total", "Fecha "
            }
        ));
        jScrollPane10.setViewportView(Tabla_compa);

        Buscar_Compra.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, 220));

        jTabbedPane6.addTab("Buscar", Buscar_Compra);

        javax.swing.GroupLayout Panel_CompraLayout = new javax.swing.GroupLayout(Panel_Compra);
        Panel_Compra.setLayout(Panel_CompraLayout);
        Panel_CompraLayout.setHorizontalGroup(
            Panel_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        Panel_CompraLayout.setVerticalGroup(
            Panel_CompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CompraLayout.createSequentialGroup()
                .addComponent(jTabbedPane6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Compra", Panel_Compra);

        Panel_Ingresos.setBackground(new java.awt.Color(9, 33, 71));

        Ingresos_dia.setBackground(new java.awt.Color(9, 33, 71));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Monto:");

        fechaIntxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaIntxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Ingrese la fecha que quiere conocer sus ingresos:");

        montoIntxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        montoIntxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BotonConsultarIN.setBackground(new java.awt.Color(26, 72, 142));
        BotonConsultarIN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonConsultarIN.setForeground(new java.awt.Color(255, 255, 255));
        BotonConsultarIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        BotonConsultarIN.setText("Consultar");
        BotonConsultarIN.setBorder(null);
        BotonConsultarIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarINActionPerformed(evt);
            }
        });

        LimpiarCon1.setBackground(new java.awt.Color(26, 72, 142));
        LimpiarCon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LimpiarCon1.setForeground(new java.awt.Color(255, 255, 255));
        LimpiarCon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        LimpiarCon1.setText("Limpiar");
        LimpiarCon1.setBorder(null);
        LimpiarCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ingresos_diaLayout = new javax.swing.GroupLayout(Ingresos_dia);
        Ingresos_dia.setLayout(Ingresos_diaLayout);
        Ingresos_diaLayout.setHorizontalGroup(
            Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ingresos_diaLayout.createSequentialGroup()
                .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ingresos_diaLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(fechaIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Ingresos_diaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(montoIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimpiarCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarIN, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Ingresos_diaLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(413, 413, 413)))
        );
        Ingresos_diaLayout.setVerticalGroup(
            Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ingresos_diaLayout.createSequentialGroup()
                .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ingresos_diaLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(fechaIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ingresos_diaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BotonConsultarIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(montoIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimpiarCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(Ingresos_diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Ingresos_diaLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel71)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );

        jTabbedPane7.addTab("Ingresos por día", Ingresos_dia);

        Ingresos.setBackground(new java.awt.Color(9, 33, 71));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Ingrese la fecha segunda fecha (DD-MM-AA):");

        fechaIntxt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaIntxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Ingrese la fecha primera fecha (DD-MM-AA):");

        fechaIntxt2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaIntxt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Ingreso:");

        montoIntxt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        montoIntxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ConsultarIngre.setBackground(new java.awt.Color(26, 72, 142));
        ConsultarIngre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConsultarIngre.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarIngre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        ConsultarIngre.setText("Consultar");
        ConsultarIngre.setBorder(null);
        ConsultarIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarIngreActionPerformed(evt);
            }
        });

        LimpiarCon.setBackground(new java.awt.Color(26, 72, 142));
        LimpiarCon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LimpiarCon.setForeground(new java.awt.Color(255, 255, 255));
        LimpiarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        LimpiarCon.setText("Limpiar");
        LimpiarCon.setBorder(null);
        LimpiarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresosLayout = new javax.swing.GroupLayout(Ingresos);
        Ingresos.setLayout(IngresosLayout);
        IngresosLayout.setHorizontalGroup(
            IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresosLayout.createSequentialGroup()
                .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresosLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(IngresosLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IngresosLayout.createSequentialGroup()
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(montoIntxt1))
                            .addComponent(fechaIntxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaIntxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ConsultarIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LimpiarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        IngresosLayout.setVerticalGroup(
            IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresosLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaIntxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fechaIntxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngresosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LimpiarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(montoIntxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Ingresos", Ingresos);

        javax.swing.GroupLayout Panel_IngresosLayout = new javax.swing.GroupLayout(Panel_Ingresos);
        Panel_Ingresos.setLayout(Panel_IngresosLayout);
        Panel_IngresosLayout.setHorizontalGroup(
            Panel_IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );
        Panel_IngresosLayout.setVerticalGroup(
            Panel_IngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Ingresos", Panel_Ingresos);

        Panel_Egresos.setBackground(new java.awt.Color(9, 33, 71));

        jPanel3.setBackground(new java.awt.Color(9, 33, 71));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Ingrese la fecha primera fecha (DD-MM-AA):");
        jPanel3.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 73, 334, -1));

        fechaE1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.add(fechaE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 334, 30));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Ingrese la fecha segunda fecha (DD-MM-AA):");
        jPanel3.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 348, -1));

        fechaE2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.add(fechaE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 334, 30));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Egreso:");
        jPanel3.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        montoIntxt2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        montoIntxt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.add(montoIntxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 30));

        ConsultarIngre1.setBackground(new java.awt.Color(26, 72, 142));
        ConsultarIngre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConsultarIngre1.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarIngre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        ConsultarIngre1.setText("Consultar");
        ConsultarIngre1.setBorder(null);
        ConsultarIngre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarIngre1ActionPerformed(evt);
            }
        });
        jPanel3.add(ConsultarIngre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 200, 50));

        LimpiarCon2.setBackground(new java.awt.Color(26, 72, 142));
        LimpiarCon2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LimpiarCon2.setForeground(new java.awt.Color(255, 255, 255));
        LimpiarCon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        LimpiarCon2.setText("Limpiar");
        LimpiarCon2.setBorder(null);
        LimpiarCon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCon2ActionPerformed(evt);
            }
        });
        jPanel3.add(LimpiarCon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 200, 40));

        jTabbedPane8.addTab("Egresos por dia", jPanel3);

        javax.swing.GroupLayout Panel_EgresosLayout = new javax.swing.GroupLayout(Panel_Egresos);
        Panel_Egresos.setLayout(Panel_EgresosLayout);
        Panel_EgresosLayout.setHorizontalGroup(
            Panel_EgresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EgresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        Panel_EgresosLayout.setVerticalGroup(
            Panel_EgresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EgresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Egresos", Panel_Egresos);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 840, 590));

        Panel_Boton.setBackground(new java.awt.Color(26, 72, 142));

        CerrarSL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CerrarSL.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSL.setText("Cerrar Sesion");
        CerrarSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSLMouseClicked(evt);
            }
        });

        categoriaL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        categoriaL.setForeground(new java.awt.Color(255, 255, 255));
        categoriaL.setText("Categoría");
        categoriaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriaLMouseClicked(evt);
            }
        });

        ProvvedoresL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ProvvedoresL.setForeground(new java.awt.Color(255, 255, 255));
        ProvvedoresL.setText("Proveedores");
        ProvvedoresL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProvvedoresLMouseClicked(evt);
            }
        });

        MeterialesL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MeterialesL.setForeground(new java.awt.Color(255, 255, 255));
        MeterialesL.setText("Materiales");
        MeterialesL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeterialesLMouseClicked(evt);
            }
        });

        VentasL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        VentasL.setForeground(new java.awt.Color(255, 255, 255));
        VentasL.setText("Ventas");
        VentasL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasLMouseClicked(evt);
            }
        });

        EgresosL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EgresosL.setForeground(new java.awt.Color(255, 255, 255));
        EgresosL.setText("Egresos");
        EgresosL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EgresosLMouseClicked(evt);
            }
        });

        IngresosL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        IngresosL.setForeground(new java.awt.Color(255, 255, 255));
        IngresosL.setText("Ingresos");
        IngresosL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresosLMouseClicked(evt);
            }
        });

        ComprasL1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ComprasL1.setForeground(new java.awt.Color(255, 255, 255));
        ComprasL1.setText("Compras");
        ComprasL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprasL1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonLayout = new javax.swing.GroupLayout(Panel_Boton);
        Panel_Boton.setLayout(Panel_BotonLayout);
        Panel_BotonLayout.setHorizontalGroup(
            Panel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BotonLayout.createSequentialGroup()
                .addGroup(Panel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_BotonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CerrarSL))
                    .addGroup(Panel_BotonLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(Panel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProvvedoresL)
                            .addComponent(categoriaL)
                            .addComponent(MeterialesL)
                            .addComponent(VentasL)
                            .addComponent(EgresosL)
                            .addComponent(ComprasL1)
                            .addComponent(IngresosL))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Panel_BotonLayout.setVerticalGroup(
            Panel_BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BotonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(categoriaL)
                .addGap(28, 28, 28)
                .addComponent(ProvvedoresL)
                .addGap(35, 35, 35)
                .addComponent(MeterialesL)
                .addGap(31, 31, 31)
                .addComponent(VentasL)
                .addGap(30, 30, 30)
                .addComponent(EgresosL)
                .addGap(30, 30, 30)
                .addComponent(ComprasL1)
                .addGap(29, 29, 29)
                .addComponent(IngresosL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(CerrarSL)
                .addGap(76, 76, 76))
        );

        jPanel1.add(Panel_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//-----------------------Pestaña de botones--------------------------------------------------------
    private void CerrarSLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSLMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Ingreso in = new Ingreso();
        in.setVisible(true);
    }//GEN-LAST:event_CerrarSLMouseClicked

    private void categoriaLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_categoriaLMouseClicked

    private void ProvvedoresLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvvedoresLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ProvvedoresLMouseClicked

    private void MeterialesLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeterialesLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_MeterialesLMouseClicked

    private void VentasLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_VentasLMouseClicked

    private void EgresosLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EgresosLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_EgresosLMouseClicked

    private void IngresosLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresosLMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_IngresosLMouseClicked

    private void ComprasL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasL1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_ComprasL1MouseClicked
//-------------------------------------------Botenes--------------------------------------------
    private void Boton_GuardarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarCateActionPerformed
        // TODO add your handling code here:
        //Alta de Categorias
        try {
            String Nombre_c = NombreCatetxt.getText();
            String Descripcion = Descripciontxt.getText();
            if (!Nombre_c.equals("") && !Descripcion.equals(""))//checamos si hay elementos vacios
            {
                if (bu.ValidarCategoria(Nombre_c) == 1) //llamamos la metodo para validar si el dato existe
                {// si no existe se puede insertar el dato
                    if (in.insertarCategoria(Nombre_c, Descripcion)) {//llamamos el metodo de insertar el dato y se valida si se inserto
                        JOptionPane.showMessageDialog(rootPane, "Categoria Guardada");
                    } else {//no fue insertado el dato
                        JOptionPane.showMessageDialog(rootPane, "La Categoria NO ha sido guardado");
                    }
                } else {//el dato fue encontrado no deja guardar el dato
                    JOptionPane.showMessageDialog(rootPane, "Dato fue encontrado no puede prosegir con la alta!!!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Favor de ingresar todos datos!!!!");
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        limpiarCategoria();//metodo de limpiar 

    }//GEN-LAST:event_Boton_GuardarCateActionPerformed

    private void Boton_GuardarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarProveeActionPerformed
        // TODO add your handling code here:
        //Boton Guardar Proveedor
        String Nombre = Nombre_Proveedortxt.getText();
        String Telefono = Telefono_Proveedortxt.getText();
        String rfc = rfc_proveedortxt.getText();
        try {
            if (!Nombre.equals("") && !Telefono.equals("") && !rfc.equals("")) {//checamos si tiene valores faltantes por ingresar
                if (bu.ValidarProveedor(Nombre) == 1) {
                    if (in.insertarProveedor(Nombre, Telefono, rfc)) {
                        JOptionPane.showMessageDialog(rootPane, "Proveedor Guardado");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Proveedor no ha sido guardado");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Dato fue encontrado no puede prosegir con la alta!!!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Favor de ingresar todos datos!!!!");
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        limpiarProveedor();
    }//GEN-LAST:event_Boton_GuardarProveeActionPerformed

    private void Boton_GuardarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarMaterialActionPerformed
        // TODO add your handling code here:
        //Guardar Material
        String codigo_barras = codigobarratxt.getText();
        int id_categoria = Integer.parseInt(id_categoriatxt.getText());
        String nombre = nombre_materialtxt.getText();
        float precio_venta = Float.parseFloat(PrecioMaterial.getText());
        String marca = marcatxt1.getText();
        int stock = Integer.parseInt(stocktxt.getText());

        if (!codigo_barras.equals(null)) {
            if (bu.ValidarMaterial(codigo_barras) == 1) {
                if (in.insertarMateriales(codigo_barras, id_categoria, nombre, precio_venta, marca, stock)) {
                    JOptionPane.showMessageDialog(rootPane, "Material Guardado");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El material no ha sido guardado");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Dato fue encontrado no puede prosegir con la alta!!!");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar el codigo de barra!!");
        }
        /*    String codigo_barras = codigobarratxt.getText();
        int id_categoria = Integer.parseInt(id_categoriatxt.getText());
        String nombre = nombre_materialtxt.getText();
        float precio_venta = Float.parseFloat(PrecioMaterial.getText());
        String marca = marcatxt1.getText();
        int stock = Integer.parseInt(stocktxt.getText());
        
           
       
       
        if (!codigo_barras.equals(null)) {
            if (in.insertarMateriales(codigo_barras, id_categoria, nombre, precio_venta, marca, stock)) {
                JOptionPane.showMessageDialog(rootPane, "Material Guardado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "El material no ha sido guardado");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar el codigo de barra!!");
        }*/

        limpiarMaterial();
    }//GEN-LAST:event_Boton_GuardarMaterialActionPerformed

    private void Boton_EliminarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarCateActionPerformed
        // TODO add your handling code here:
        //Boton Eliminar Categorias
        String nombre_c = eliminarCatetxt.getText();
        if (!nombre_c.equals("")) {
            if (elim.eliminarCategoria(nombre_c)) {
                JOptionPane.showMessageDialog(rootPane, "Eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR, eliminación fallida!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre de la categoria");
        }
        limpiarElCategoria();

    }//GEN-LAST:event_Boton_EliminarCateActionPerformed

    private void Boton_EliminarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarProveActionPerformed
        // TODO add your handling code here:
        //Boton Eliminar Proveedor
        String nombre = eliminarProveTxt.getText();
        if (!nombre.equals("")) {
            if (elim.eliminarProveedor(nombre)) {
                JOptionPane.showMessageDialog(rootPane, "Eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR!! no se pudo eliminar el dato!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del proveedor!!");
        }

        limpiarEliProveedor();
    }//GEN-LAST:event_Boton_EliminarProveActionPerformed

    private void Boton_EliminarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarMaterialActionPerformed
        // TODO add your handling code here:
        //Elimina Material
        String codigo_barras = eliminarMateTxt.getText();
        if (!codigo_barras.equals("")) {
            if (elim.eliminarMateriales(codigo_barras)) {
                JOptionPane.showMessageDialog(rootPane, "Eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR!! no se pudo eliminar el dato!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el codigo de barras!!");
        }
        limpiarEliMaterial();
    }//GEN-LAST:event_Boton_EliminarMaterialActionPerformed

    private void BuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProveedorActionPerformed
        // TODO add your handling code here:
        //Buscar proveedor
        String nombre_p = buscar_provetxt.getText();
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Proveedor.setModel(modelo);
            String sql = " select * from proveedor where nombre='" + nombre_p + "';";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id proveedor");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("RFC");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        limpiarBusProveedor();
    }//GEN-LAST:event_BuscarProveedorActionPerformed

    private void BuscarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMaterialActionPerformed
        // TODO add your handling code here:
        //  Buscar Material
        String nombre_m = nombreMaterial_txt.getText();
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Materiales.setModel(modelo);
            String sql = "select ma.codigo_barras, cat.nombre_c, ma.nombre, ma.precio_venta, ma.marca, ma.stock from materiales ma inner join categoria cat on ma.id_categoria=cat.id_categoria where ma.nombre='" + nombre_m + "'";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Codigo de barras");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio de venta");
            modelo.addColumn("Marca");
            modelo.addColumn("Stock");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        limpiarBusMaterial();

    }//GEN-LAST:event_BuscarMaterialActionPerformed

    private void BuscarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCateActionPerformed
        // TODO add your handling code here:
        //Buscar un dato en categoria
        String nombre_c = buscar_cattxt.getText();
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_categoria.setModel(modelo);
            String sql = "select * from Categoria where nombre_c ='" + nombre_c + "';";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id categoria");
            modelo.addColumn("Nombre_c");
            modelo.addColumn("Descripcion");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        limpiarbusquedaCat();
    }//GEN-LAST:event_BuscarCateActionPerformed

    private void Boton_ActualProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualProveeActionPerformed
        // TODO add your handling code here:
        //Boton actualizar Proveedor
        int id_proveedor = Integer.parseInt(ActuaProveetxt.getText());
        String Nombre = ActualizarNomP.getText();
        String Telefono = ActualizarTelP.getText();
        String RFC = ActualizarRFCP.getText();

        int res = ac.actualizarProveedor(id_proveedor, Nombre, Telefono, RFC);
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor actualizado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al actualizar!!");
        }
        limpiarActProveedor();

    }//GEN-LAST:event_Boton_ActualProveeActionPerformed

    private void ActualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCategoriaActionPerformed
        // TODO add your handling code here:
        //Buscar Categoria en actualiza
        try {

            String nombre_c = ActualizarNomCat.getText();
            if (!nombre_c.equals(null)) {
                String Datos[] = bu.buscarCategoria(nombre_c);
                actualizarDescripcion.setText(Datos[0]);
                buscar_AcCatxt.setText(Datos[1]);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre de la categoria!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_ActualizarCategoriaActionPerformed

    private void BuscarProveedorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProveedorAActionPerformed
        // TODO add your handling code here:
        //Buscar proveedor en actualizacion
        try {
            String nombre = ActualizarNomP.getText();
            if (!nombre.equals("")) {
                String Datos[] = bu.buscarProveedor(nombre);
                ActuaProveetxt.setText(Datos[0]);
                ActualizarTelP.setText(Datos[1]);
                ActualizarRFCP.setText(Datos[1]);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del proveedor!!");
            }
        } catch (Exception n) {
            System.out.println(n);
        }

    }//GEN-LAST:event_BuscarProveedorAActionPerformed

    private void Boton_ActualCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualCateActionPerformed
        // TODO add your handling code here:}
        //Boton actualizar Categorias
        int id_categoria = Integer.parseInt(buscar_AcCatxt.getText());
        String nombre = ActualizarNomCat.getText();
        String descripcion = actualizarDescripcion.getText();

        int res = ac.actualizarCategoria(nombre, descripcion, id_categoria);
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Categoria actualizada");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al actualizar!!");
        }
        limpiaActCategoria();
    }//GEN-LAST:event_Boton_ActualCateActionPerformed

    private void Boton_ActualMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualMaterialActionPerformed
        // TODO add your handling code here:
        //bOTON Actualizar Material
        String codigo_barras = codigoACtxt.getText();
        int id_categoria = Integer.parseInt(ide_catAc.getText());
        String nombre = nombre_matActxt.getText();
        float precio_venta = Float.parseFloat(PrecioMaAc.getText());
        String marca = MarcaAct.getText();
        int stock = Integer.parseInt(stockActuatxt.getText());
        int res = ac.actualizarMateriales(codigo_barras, id_categoria, nombre, precio_venta, marca, stock);
        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Material actualizado");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al actualizar!!");
        }
        limpiarActMaterial();
    }//GEN-LAST:event_Boton_ActualMaterialActionPerformed

    private void BuscarMaterialAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMaterialAcActionPerformed
        // TODO add your handling code here:
        //Boton Buscar en actualizar Material
        try {
            String codigo_barras = codigoACtxt.getText();
            if (!codigo_barras.equals(null)) {
                String Datos[] = bu.buscarMateriales(codigo_barras);
                ide_catAc.setText(Datos[0]);
                nombre_matActxt.setText(Datos[1]);
                PrecioMaAc.setText(Datos[2]);
                MarcaAct.setText(Datos[3]);
                stockActuatxt.setText(Datos[4]);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el ide de la categoria!!");
            }
        } catch (Exception n) {
            System.out.println(n);
        }


    }//GEN-LAST:event_BuscarMaterialAcActionPerformed

    private void MostrarEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEliActionPerformed
        // TODO add your handling code here:
        //Mostrar la lista de datos en eliminar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            TablaE_Categoria.setModel(modelo);
            String sql = "select id_categoria, nombre_c, descripcion from Categoria order by id_categoria;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id categoria");
            modelo.addColumn("Nombre_c");
            modelo.addColumn("Descripcion");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarEliActionPerformed

    private void MostrarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCateActionPerformed
        // TODO add your handling code here:
        //Mostar las categorias en buscar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_categoria.setModel(modelo);
            String sql = "select id_categoria, nombre_c, descripcion from Categoria order by id_categoria;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id categoria");
            modelo.addColumn("Nombre_c");
            modelo.addColumn("Descripcion");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarCateActionPerformed

    private void MostrarEliProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEliProActionPerformed
        // TODO add your handling code here:
        //Mostrar proveedores en Eliminar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            TablaE_Proveedor.setModel(modelo);
            String sql = "select * from Proveedor order by id_proveedor;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id proveedor");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("RFC");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarEliProActionPerformed

    private void MostrarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarProveeActionPerformed
        // TODO add your handling code here:
        //Muestra proveedores en Buscar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Proveedor.setModel(modelo);
            String sql = "select * from Proveedor order by id_proveedor;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id proveedor");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("RFC");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarProveeActionPerformed

    private void MostrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarMaterialActionPerformed
        // TODO add your handling code here:
        //mostrar materal en buscar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_Materiales.setModel(modelo);
            String sql = "select ma.codigo_barras, cat.nombre_c, ma.nombre, ma.precio_venta, ma.marca, ma.stock from materiales ma inner join categoria cat on ma.id_categoria=cat.id_categoria order by ma.codigo_barras;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Codigo de barras");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio de venta");
            modelo.addColumn("Marca");
            modelo.addColumn("Stock");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarMaterialActionPerformed

    private void MostrarEliMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEliMateActionPerformed
        // TODO add your handling code here:
        //Mostrar los materiales en eliminar
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            TablaEli_Material.setModel(modelo);
            String sql = "select ma.codigo_barras, cat.nombre_c, ma.nombre, ma.precio_venta, ma.marca, ma.stock from materiales ma inner join categoria cat on ma.id_categoria=cat.id_categoria order by ma.codigo_barras;";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Codigo de barras");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio de venta");
            modelo.addColumn("Marca");
            modelo.addColumn("Stock");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_MostrarEliMateActionPerformed

    private void Boton_GuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarCompraActionPerformed
        // TODO add your handling code here:
        //guardar compra
        guardarCompra();
        guardarDetalleCompra();
        actualizarComM();
        limpiarGuardarCom();
    }//GEN-LAST:event_Boton_GuardarCompraActionPerformed

    private void Boton_AnadirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AnadirCompraActionPerformed
        // TODO add your handling code here:
        AgragarMaterial();
        limpiarAnadirCom();
    }//GEN-LAST:event_Boton_AnadirCompraActionPerformed

    private void Boton_anadirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_anadirVentaActionPerformed
        // TODO add your handling code here:
        //añadir productos en la tabla venta
        agregarMaterialV();
        limapiarAnadirM();
        

    }//GEN-LAST:event_Boton_anadirVentaActionPerformed

    private void Boton_EliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarCompraActionPerformed
        // TODO add your handling code here:
        //boton eliminar
        int id_compra = Integer.parseInt(eliminarComTxt.getText());
        
        if (id_compra != 0) {
            if (elim.eliminarCompra(id_compra)) {
                JOptionPane.showMessageDialog(rootPane, "Elimnación exitosaa!");
                limpCompraD();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Elimnación sin exito!");
                limpCompraD();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingresar el ID de la compra");
        }
        
    }//GEN-LAST:event_Boton_EliminarCompraActionPerformed

    private void Boton_EliminarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarVenActionPerformed
        // TODO add your handling code here:
        
        int id_venta = Integer.parseInt(eliminarVenTxt.getText());
        
        if (id_venta != 0) {
            if (elim.eliminarVenta(id_venta)) {
                JOptionPane.showMessageDialog(rootPane, "Elimnación exitosaa!xd");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Elimnación sin exito!!!");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingresar el ID de la venta");
        }
         limpiarElimnarV();
    }//GEN-LAST:event_Boton_EliminarVenActionPerformed

    private void buscarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCompraActionPerformed
        // TODO add your handling code here:
        int id_compra=Integer.parseInt(buscarCompratxt.getText());
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_compa.setModel(modelo);
            String sql = "select * from compram where id_compra="+id_compra+"";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id compra");
            modelo.addColumn("id proveedor");
            modelo.addColumn("Monto final");
            modelo.addColumn("fecha");
          
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        
    }//GEN-LAST:event_buscarCompraActionPerformed

    private void MostrarVnetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVnetasActionPerformed
        // TODO add your handling code here:
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_venta.setModel(modelo);
            String sql = "select * from venta order by id_venta";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id venta");
            modelo.addColumn("Monto final");
            modelo.addColumn("Fecha");
          
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarVnetasActionPerformed

    private void MostrarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarComprasActionPerformed
        // TODO add your handling code here:
       try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_compa.setModel(modelo);
            String sql = "select * from compram order by id_compra";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id compra");
            modelo.addColumn("id proveedor");
            modelo.addColumn("Monto final");
            modelo.addColumn("fecha");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
         
    }//GEN-LAST:event_MostrarComprasActionPerformed

    private void BuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarVentaActionPerformed
        // TODO add your handling code here:
         int  id_venta =Integer.parseInt(buscar_Venta.getText());
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_venta.setModel(modelo);
            String sql = "select * from venta where id_venta =" + id_venta + ";";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id categoria");
            modelo.addColumn("Nombre_c");
            modelo.addColumn("Descripcion");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_BuscarVentaActionPerformed

    private void Boton_GuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarVentaActionPerformed
        // TODO add your handling code here:
        guardarVenta();
        guardarDetalleVentaI();
        //Tabla_Venta.setModel(new DefaultTableModel(null,new String[]{"Numero","Codigo barras","Nombre","Cantidad","Precio Venta","Monto"}));
        actualizarVentaS();
        limpiarGuardarVenta();
        
    }//GEN-LAST:event_Boton_GuardarVentaActionPerformed

    private void MostrarCompras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCompras1ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
            Tabla_compaEL.setModel(modelo);
            String sql = "select * from compram order by id_compra";
            System.out.println(sql);
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadC = rsMd.getColumnCount();
            modelo.addColumn("Id compra");
            modelo.addColumn("id proveedor");
            modelo.addColumn("Monto final");
            modelo.addColumn("fecha");
            while (rs.next()) {
                Object[] filas = new Object[cantidadC];
                for (int i = 0; i < cantidadC; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_MostrarCompras1ActionPerformed

    private void ConsultarIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarIngreActionPerformed
        // TODO add your handling code here:
        String fecha1=fechaIntxt2.getText();
        String fecha2=fechaIntxt1.getText();
        if (!fecha1.equals("")&&!fecha2.equals("")) {
            String Ingresos=bu.consultaIngreso(fecha1, fecha2);
            montoIntxt1.setText(""+Ingresos);
        }else{
             JOptionPane.showMessageDialog(rootPane, "Favor de ingresar las fechas");
        }
    }//GEN-LAST:event_ConsultarIngreActionPerformed

    private void LimpiarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarConActionPerformed
        // TODO add your handling code here:
        limpiarCons();//limíar consulta
    }//GEN-LAST:event_LimpiarConActionPerformed

    private void BotonConsultarINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarINActionPerformed
        // TODO add your handling code here:
        String Fecha=fechaIntxt.getText();
        if (!Fecha.equals("")) {
            String DiaI=bu.IngresoDia(Fecha);
            montoIntxt.setText(""+DiaI);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar la fecha!!!");
        }
    
    }//GEN-LAST:event_BotonConsultarINActionPerformed

    private void LimpiarCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCon1ActionPerformed
        // TODO add your handling code here:
        LimpCD();
    }//GEN-LAST:event_LimpiarCon1ActionPerformed

    private void ConsultarIngre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarIngre1ActionPerformed
        // TODO add your handling code here:
        String fecha1=fechaE1.getText();
        String fecha2=fechaE2.getText();
         if (!fecha1.equals("")&&!fecha2.equals("")) {
            String Engresos=bu.consultaEgreso(fecha1, fecha2);
            montoIntxt2.setText(""+Engresos);
        }else{
             JOptionPane.showMessageDialog(rootPane, "Favor de ingresar las fechas");
        }
        
    }//GEN-LAST:event_ConsultarIngre1ActionPerformed

    private void LimpiarCon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCon2ActionPerformed
        // TODO add your handling code here:
       fechaE1.setText("");
       fechaE2.setText("");
       montoIntxt2.setText("");
    }//GEN-LAST:event_LimpiarCon2ActionPerformed
    //------------------------------------------------Metodos para realizar la compra de material----------------------
    public void AgragarMaterial() {//agraga el material a compra
       
        float total;
        DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
        modelo = (DefaultTableModel) tabla_compra.getModel();
        int cont=0;

        cont = cont + 1;

        String codigo_barras = codigoCtxt1.getText();
        String descripcion = DescrComtxt.getText();
        cantidad = Integer.parseInt(canCtxt1.getText());
        precio_compra = Float.parseFloat(precio_compratxt.getText());
        total = cantidad * precio_compra;
        ArrayList listar = new ArrayList();
        if (cantidad > 0) {
            listar.add(cont);//añadimos a un array los datos que vamos a meter en la tabla
            listar.add(codigo_barras);
            listar.add(descripcion);
            listar.add(cantidad);
            listar.add(precio_compra);
            listar.add(total);
            Object[] ob = new Object[6];//pasamos ese array a uno de obejtos para mostrarse en la tabla
            for (int i = 0; i < 6; i++) {
                ob[i] = listar.get(i);
            }
            modelo.addRow(ob);
            tabla_compra.setModel(modelo);
            calcularPago();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la cantidad del material!!!!");
        }
    }

    public void calcularPago() {
        Monto_final = 0;
        for (int i = 0; i < tabla_compra.getRowCount(); i++) {
            cantidad = Integer.parseInt(tabla_compra.getValueAt(i, 3).toString());
            precio_compra = Float.parseFloat(tabla_compra.getValueAt(i, 4).toString());
            Monto_final = Monto_final + (cantidad * precio_compra);
        }
        monto_finaltxt.setText("" + Monto_final);
    }

    public void guardarCompra() {

        int id_proveedor = Integer.parseInt(IDprovetxt.getText());
        String fecha = fechatxt.getText();
        float Monto_ct = Monto_final;

        if (id_proveedor != 0) {
            if (in.insertarCompra(id_proveedor, Monto_ct, fecha)) {
                JOptionPane.showMessageDialog(rootPane, "Compra Realizada");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No fue guardada la compra");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese el ide del proveedor!!");
        }
    }

    public void guardarDetalleCompra() {
        String idc = bu.buscarIdc();
        int id_compra = Integer.parseInt(idc);
        for (int i = 0; i < tabla_compra.getRowCount(); i++) {
            int cns = Integer.parseInt(tabla_compra.getValueAt(i, 0).toString());
            String Codigo_barras = tabla_compra.getValueAt(i, 1).toString();
            String descripcion = tabla_compra.getValueAt(i, 2).toString();
            int cant = Integer.parseInt(tabla_compra.getValueAt(i, 3).toString());
            float proeciodc = Float.parseFloat(tabla_compra.getValueAt(i, 4).toString());
            float montopc = Float.parseFloat(tabla_compra.getValueAt(i, 5).toString());
            if (in.insertarDetaCompra(id_compra, cns, Codigo_barras, descripcion, cant, proeciodc, montopc)) {
                System.out.println("Producta de compra guardado");
            } else {
                System.out.println("El producto de compra no se guardo");
            }
        }
    }

    void actualizarComM() {
        for (int i = 0; i < tabla_compra.getRowCount(); i++) {
            String Codigo_barras = tabla_compra.getValueAt(i, 1).toString();
            int cant = Integer.parseInt(tabla_compra.getValueAt(i, 3).toString());
            String obstock = bu.BuscarStock(Codigo_barras);
            int stock_prev = Integer.parseInt(obstock);
            int stock = stock_prev + cant;
            int res = ac.actualizar_stock(stock, Codigo_barras);
            if (res == 1) {
                System.out.println("Material actualizado");
            } else {
                System.out.println("El fue no fue actualizado!!!");
            }
        }
    }

    //------------------------------------Metodos para guardar la venta y su detalle en uno solo
    public void agregarMaterialV() {
        int cv = 0;
        float totalV = 0;
        DefaultTableModel modelo = new DefaultTableModel();//objeto para la tabla
        modelo = (DefaultTableModel) Tabla_Venta.getModel();

        cv = cv + 1;
        String codigo_barras = codigobVtxt.getText();
        cantidadV = Integer.parseInt(cantidadVentxt.getText());
        String Nombre = bu.BuscarNombre(codigo_barras);
        String precioob = bu.BuscarPrecio(codigo_barras);
        precio_venta = Float.parseFloat(precioob);
        totalV = cantidadV * precio_venta;
        ArrayList lista = new ArrayList();
        if (cantidadV > 0) {
            lista.add(cv);
            lista.add(codigo_barras);
            lista.add(Nombre);
            lista.add(cantidadV);
            lista.add(precio_venta);
            lista.add(totalV);
            Object[] ob = new Object[6];
            for (int i = 0; i < 6; i++) {
                ob[i] = lista.get(i);
            }
            modelo.addRow(ob);
            Tabla_Venta.setModel(modelo);
            CalcularCosto();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la cantidad del material!!!!");
        }
    }

    public void CalcularCosto() {
        Monto_FinalV = 0;
        for (int i = 0; i < Tabla_Venta.getRowCount(); i++) {
            cantidadV = Integer.parseInt(Tabla_Venta.getValueAt(i, 3).toString());
            precio_venta = Float.parseFloat(Tabla_Venta.getValueAt(i, 4).toString());
            Monto_FinalV = Monto_FinalV + (cantidadV * precio_venta);
        }
        montoVentatxt.setText("" + Monto_FinalV);
    }

    public void guardarVenta() {
        float monto_final= Float.parseFloat(montoVentatxt.getText());
        String Fecha=fechaVentxt.getText();
        
        if (monto_final!=0) {
            if (in.insertarVenta(monto_final, Fecha)) {
                 JOptionPane.showMessageDialog(rootPane, "La venta fue guardada exitosamente!!");
            }else{
                 JOptionPane.showMessageDialog(rootPane, "No se guardo la venta!!!");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No ghay venta!!");
        }
    }

    public void guardarDetalleVentaI() {
        
        
        String idv=bu.BuacarIDV();
        for (int i = 0; i < Tabla_Venta.getRowCount(); i++) {
            int cns=Integer.parseInt(Tabla_Venta.getValueAt(i, 0).toString());
            int id_venta=Integer.parseInt(idv);
            String codigo_barra=Tabla_Venta.getValueAt(i, 1).toString();
            int cantidad=Integer.parseInt(Tabla_Venta.getValueAt(i, 3).toString());
            float preciovt=Float.parseFloat(Tabla_Venta.getValueAt(i, 4).toString());
            float monto_pv=Float.parseFloat(Tabla_Venta.getValueAt(i, 5).toString());
            if (in.insertarDetalle_Venta(cns, id_venta, codigo_barra, cantidad, preciovt, monto_pv)) {
                System.out.println("Material capturado");
            }else{
                System.out.println("Material no fue guardado!!!");
            }
            
        }
    }
    
    public void actualizarVentaS()
    {
        for (int i = 0; i < Tabla_Venta.getRowCount(); i++) {
            String codigo_barras=Tabla_Venta.getValueAt(i, 1).toString();
            int cant=Integer.parseInt(Tabla_Venta.getValueAt(i, 3).toString());
            String ObSto=bu.BuscarStock(codigo_barras);
            int stockV=Integer.parseInt(ObSto);
            int stock=stockV-cant;
            int res=ac.actualizar_stock(stock, codigo_barras);
            if (res==1) {
                System.out.println("Stock actualizado en venta");
            }else{
                System.out.println("Stock No fue actualizado");
            }
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActuaProveetxt;
    private javax.swing.JPanel Actualizar;
    private javax.swing.JButton ActualizarCategoria;
    private javax.swing.JTextField ActualizarNomCat;
    private javax.swing.JTextField ActualizarNomP;
    private javax.swing.JTextField ActualizarRFCP;
    private javax.swing.JTextField ActualizarTelP;
    private javax.swing.JPanel Actualizar_Material;
    private javax.swing.JPanel Actualizar_Proveedor;
    private javax.swing.JButton BotonConsultarIN;
    private javax.swing.JButton Boton_ActualCate;
    private javax.swing.JButton Boton_ActualMaterial;
    private javax.swing.JButton Boton_ActualProvee;
    private javax.swing.JButton Boton_AnadirCompra;
    private javax.swing.JButton Boton_EliminarCate;
    private javax.swing.JButton Boton_EliminarCompra;
    private javax.swing.JButton Boton_EliminarMaterial;
    private javax.swing.JButton Boton_EliminarProve;
    private javax.swing.JButton Boton_EliminarVen;
    private javax.swing.JButton Boton_GuardarCate;
    private javax.swing.JButton Boton_GuardarCompra;
    private javax.swing.JButton Boton_GuardarMaterial;
    private javax.swing.JButton Boton_GuardarProvee;
    private javax.swing.JButton Boton_GuardarVenta;
    private javax.swing.JButton Boton_anadirVenta;
    private javax.swing.JButton BuscarCate;
    private javax.swing.JButton BuscarMaterial;
    private javax.swing.JButton BuscarMaterialAc;
    private javax.swing.JButton BuscarProveedor;
    private javax.swing.JButton BuscarProveedorA;
    private javax.swing.JButton BuscarVenta;
    private javax.swing.JPanel Buscar_Cat;
    private javax.swing.JPanel Buscar_Compra;
    private javax.swing.JPanel Buscar_Material;
    private javax.swing.JPanel Buscar_Proveedor;
    private javax.swing.JPanel Buscar_Venta;
    private javax.swing.JLabel CerrarSL;
    private javax.swing.JLabel ComprasL1;
    private javax.swing.JButton ConsultarIngre;
    private javax.swing.JButton ConsultarIngre1;
    private javax.swing.JTextField DescrComtxt;
    private javax.swing.JTextField Descripciontxt;
    private javax.swing.JLabel EgresosL;
    private javax.swing.JPanel Eliminar_Cat;
    private javax.swing.JPanel Eliminar_Compra;
    private javax.swing.JPanel Eliminar_Material;
    private javax.swing.JPanel Eliminar_Proveedor;
    private javax.swing.JPanel Eliminar_Venta;
    private javax.swing.JPanel Guardar_Cat;
    private javax.swing.JPanel Guardar_Compra;
    private javax.swing.JPanel Guardar_Material;
    private javax.swing.JPanel Guardar_Proveedor;
    private javax.swing.JPanel Guardar_Venta;
    private javax.swing.JTextField IDprovetxt;
    private javax.swing.JPanel Ingresos;
    private javax.swing.JLabel IngresosL;
    private javax.swing.JPanel Ingresos_dia;
    private javax.swing.JButton LimpiarCon;
    private javax.swing.JButton LimpiarCon1;
    private javax.swing.JButton LimpiarCon2;
    private javax.swing.JTextField MarcaAct;
    private javax.swing.JLabel MeterialesL;
    private javax.swing.JButton MostrarCate;
    private javax.swing.JButton MostrarCompras;
    private javax.swing.JButton MostrarCompras1;
    private javax.swing.JButton MostrarEli;
    private javax.swing.JButton MostrarEliMate;
    private javax.swing.JButton MostrarEliPro;
    private javax.swing.JButton MostrarMaterial;
    private javax.swing.JButton MostrarProvee;
    private javax.swing.JButton MostrarVnetas;
    private javax.swing.JTextField NombreCatetxt;
    private javax.swing.JTextField Nombre_Proveedortxt;
    private javax.swing.JPanel Panel_Boton;
    private javax.swing.JPanel Panel_Compra;
    private javax.swing.JPanel Panel_Egresos;
    private javax.swing.JPanel Panel_Ingresos;
    private javax.swing.JPanel Panel_Materiales;
    private javax.swing.JPanel Panel_Proveedor;
    private javax.swing.JPanel Panel_Ventas;
    private javax.swing.JPanel Panel_categoria;
    private javax.swing.JTextField PrecioMaAc;
    private javax.swing.JTextField PrecioMaterial;
    private javax.swing.JLabel ProvvedoresL;
    private javax.swing.JTable TablaE_Categoria;
    private javax.swing.JTable TablaE_Proveedor;
    private javax.swing.JTable TablaEli_Material;
    private javax.swing.JTable Tabla_Materiales;
    private javax.swing.JTable Tabla_Proveedor;
    private javax.swing.JTable Tabla_Venta;
    private javax.swing.JTable Tabla_categoria;
    private javax.swing.JTable Tabla_compa;
    private javax.swing.JTable Tabla_compaEL;
    private javax.swing.JTable Tabla_venta;
    private javax.swing.JTextField Telefono_Proveedortxt;
    private javax.swing.JLabel VentasL;
    private javax.swing.JTextField actualizarDescripcion;
    private javax.swing.JButton buscarCompra;
    private javax.swing.JTextField buscarCompratxt;
    private javax.swing.JTextField buscar_AcCatxt;
    private javax.swing.JTextField buscar_Venta;
    private javax.swing.JTextField buscar_cattxt;
    private javax.swing.JTextField buscar_provetxt;
    private javax.swing.JTextField canCtxt1;
    private javax.swing.JTextField cantidadVentxt;
    private javax.swing.JLabel categoriaL;
    private javax.swing.JTextField codigoACtxt;
    private javax.swing.JTextField codigoCtxt1;
    private javax.swing.JTextField codigobVtxt;
    private javax.swing.JTextField codigobarratxt;
    private javax.swing.JTextField eliminarCatetxt;
    private javax.swing.JTextField eliminarComTxt;
    private javax.swing.JTextField eliminarMateTxt;
    private javax.swing.JTextField eliminarProveTxt;
    private javax.swing.JTextField eliminarVenTxt;
    private javax.swing.JTextField fechaE1;
    private javax.swing.JTextField fechaE2;
    private javax.swing.JTextField fechaIntxt;
    private javax.swing.JTextField fechaIntxt1;
    private javax.swing.JTextField fechaIntxt2;
    private javax.swing.JTextField fechaVentxt;
    private javax.swing.JTextField fechatxt;
    private javax.swing.JPanel hide;
    private javax.swing.JTextField id_categoriatxt;
    private javax.swing.JTextField ide_catAc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField marcatxt1;
    private javax.swing.JTextField montoIntxt;
    private javax.swing.JTextField montoIntxt1;
    private javax.swing.JTextField montoIntxt2;
    private javax.swing.JTextField montoVentatxt;
    private javax.swing.JTextField monto_finaltxt;
    private javax.swing.JTextField nombreMaterial_txt;
    private javax.swing.JTextField nombre_matActxt;
    private javax.swing.JTextField nombre_materialtxt;
    private javax.swing.JTextField precio_compratxt;
    private javax.swing.JTextField rfc_proveedortxt;
    private javax.swing.JTextField stockActuatxt;
    private javax.swing.JTextField stocktxt;
    private javax.swing.JTable tabla_compra;
    // End of variables declaration//GEN-END:variables
}
