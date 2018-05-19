package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.FlowLayout;
import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;

public class EntradasAbiertasWindowBuilderPro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmAbiertas;
	private JTextField txtCampo1;
	private JTextField txtCampo2;
	private JTable tblEntradas;
	private JTable tabla;
	private DefaultTableModel modelo;
	private JTable Prueba1;
	/**
	 * Create the frame.
	 */
	public EntradasAbiertasWindowBuilderPro() {
		setAutoRequestFocus(false);
		inicializar();
	}
	
	public void inicializar(){

		frmAbiertas = new JFrame();
		frmAbiertas.setTitle("Entradas Abiertas");
		frmAbiertas.setBounds(100, 100, 800, 600);
		frmAbiertas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmAbiertas.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Norte = new JPanel();
		panel_Norte.setLayout(new FlowLayout(FlowLayout.LEFT,10,1));
		panel_Norte.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Parámetros de búsqueda"));
		frmAbiertas.getContentPane().add(panel_Norte, BorderLayout.NORTH);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_Norte.add(rigidArea);
		
		JLabel lblCampo1 = new JLabel("Campo1");
		panel_Norte.add(lblCampo1);
		
		txtCampo1 = new JTextField();
		txtCampo1.setText("campo1");
		panel_Norte.add(txtCampo1);
		txtCampo1.setColumns(10);
		
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		panel_Norte.add(rigidArea_1);
		
		JLabel lblCampo2 = new JLabel("Campo2");
		panel_Norte.add(lblCampo2);
		
		txtCampo2 = new JTextField();
		txtCampo2.setText("campo2");
		panel_Norte.add(txtCampo2);
		txtCampo2.setColumns(10);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		panel_Norte.add(rigidArea_2);
		
		JButton btnBuscar = new JButton("Buscar");
		panel_Norte.add(btnBuscar);
		
		JPanel panel_Este = new JPanel();
		frmAbiertas.getContentPane().add(panel_Este, BorderLayout.EAST);
		panel_Este.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btnUpTable = new JButton("Arriba");
		panel_Este.add(btnUpTable);
		
		JButton btnDownTable = new JButton("Abajo");
		panel_Este.add(btnDownTable);
		
		JPanel panel_Centro = new JPanel();
		frmAbiertas.getContentPane().add(panel_Centro, BorderLayout.CENTER);
		panel_Centro.setLayout(new BorderLayout(0,0));
		
		Component rigidArea_tblOeste = Box.createRigidArea(new Dimension(5, 5));
		panel_Centro.add(rigidArea_tblOeste, BorderLayout.WEST);
		Component rigidArea_tblEste = Box.createRigidArea(new Dimension(5, 5));
		panel_Centro.add(rigidArea_tblEste, BorderLayout.EAST);
		Component rigidArea_tblSur = Box.createRigidArea(new Dimension(5, 5));
		panel_Centro.add(rigidArea_tblSur, BorderLayout.SOUTH);
		Component rigidArea_tblNorte = Box.createRigidArea(new Dimension(5, 5));
		panel_Centro.add(rigidArea_tblNorte, BorderLayout.NORTH);
		
		JPanel panel_Centro2 = new JPanel();
		panel_Centro.add(panel_Centro2, BorderLayout.CENTER);
		panel_Centro2.setLayout(new BorderLayout(0,0));
		panel_Centro2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		crearTabla();
		tblEntradas=tabla;
		panel_Centro2.add(tblEntradas, BorderLayout.CENTER);
		
		
		Object [] nuevaFila = new Object[4];
		modelo.addRow(nuevaFila);
		modelo.addRow(nuevaFila);
		
	}
	
	private void crearTabla() {
		tabla= new JTable();
		//tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabla.setCellSelectionEnabled(true);
		tabla.setShowGrid(true);
		tabla.setShowVerticalLines(true);
		tabla.setGridColor(Color.BLACK);

		modelo = new DefaultTableModel() {
			private String[] columnNames = {"Unidades","Producto","Precio unidad","Subtotal"};
			public String getColumnName(int column) {
			    return columnNames[column];
			}
		    public int getColumnCount() {return 4;}
		    public boolean isCellEditable(int row, int col){ return false;}
		};
		tabla.setModel(modelo);
		TableColumn columna = tabla.getColumn("Unidades"); 
		columna.setPreferredWidth(70);
		columna.setMinWidth(70);
		columna.setMaxWidth(70);
		columna = tabla.getColumn("Producto"); 
		columna.setPreferredWidth(250);
		columna.setMinWidth(250);
		columna.setMaxWidth(250);

	}
	
	public void mostrarVentana(){
		frmAbiertas.setVisible(true);
	}

}
