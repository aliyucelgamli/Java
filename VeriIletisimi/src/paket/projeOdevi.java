package paket;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Color;

public class projeOdevi{

	private JFrame frame;
	private JLabel foto;
	private JTextField txtTp;
	private JTextField txtTt;
	private JTextField txtThroughput;
	private JTextField txtBW;
	private JTextField txtHata;
	private JLabel lblGidenHatasizVeri;
	private JLabel lblEfficiency;
	private JTextField txtEfficiency;
	private JLabel baslik;
	private JLabel lblSender;
	private JLabel lblReceiver;
	private JTabbedPane tabbedPane;
	private JPanel StopAndWait;
	private JPanel GoBackN;
	private JLabel baslik1;
	private JTextField txtTp1;
	private JTextField txtBW1;
	private JTextField txtNtimes;
	private JTextField txtTt1;
	private JTextField txtEfficiency1;
	private JTextField txtThroughput1;
	private JLabel label;
	private JLabel foto1;
	private JTextField txtToplamVeri;
	private JTextField txtGoodput;
	private JLabel label_3;
	private JLabel lblGoodput;
	private JLabel lblHata;
	private JTextField txtHata1;
	private JLabel label_5;
	private JTextField txtToplamVeri1;
	private JLabel label_9;
	private JTextField txtGoodput1;
	private JLabel label_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projeOdevi window = new projeOdevi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public projeOdevi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 972, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/fotograf.jpg")).getImage();
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		tabbedPane.setBounds(10, 0, 944, 583);
		frame.getContentPane().add(tabbedPane);
		Image img1 = new ImageIcon(this.getClass().getResource("/fotograf1.jpg")).getImage();		
		
		StopAndWait = new JPanel();
		StopAndWait.setBackground(new Color(204, 255, 255));
		tabbedPane.addTab("Stop and Wait", null, StopAndWait, null);
		StopAndWait.setLayout(null);
		
		foto = new JLabel("");
		foto.setBounds(313, 87, 314, 282);
		StopAndWait.add(foto);
		foto.setIcon(new ImageIcon(img));
		
		baslik = new JLabel("Stop and Wait Protokol\u00FC");
		baslik.setBounds(313, 11, 314, 34);
		StopAndWait.add(baslik);
		baslik.setHorizontalAlignment(SwingConstants.CENTER);
		baslik.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		lblSender = new JLabel("G\u00F6nderici (Sender)");
		lblSender.setBounds(335, 56, 126, 34);
		StopAndWait.add(lblSender);
		lblSender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblReceiver = new JLabel("Al\u0131c\u0131 (Receiver)");
		lblReceiver.setBounds(531, 56, 96, 34);
		StopAndWait.add(lblReceiver);
		lblReceiver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblTp = new JLabel("Veri paketi i\u00E7in yay\u0131lma gecikmesi (Tp) (ms) :");
		lblTp.setBounds(10, 108, 293, 34);
		StopAndWait.add(lblTp);
		lblTp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtTp = new JTextField();
		txtTp.setBounds(10, 153, 293, 34);
		StopAndWait.add(txtTp);
		txtTp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTp.setColumns(10);
		
		JLabel lblTt = new JLabel("Veri paketi i\u00E7in iletim gecikmesi (Tt) (ms):");
		lblTt.setBounds(637, 108, 293, 34);
		StopAndWait.add(lblTt);
		lblTt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtTt = new JTextField();
		txtTt.setBounds(637, 153, 293, 34);
		StopAndWait.add(txtTt);
		txtTt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTt.setColumns(10);
		
		JLabel lblBW = new JLabel("Bant Geni\u015Fli\u011Fi (BandWidth) (BW) (Mbps):");
		lblBW.setBounds(10, 232, 293, 34);
		StopAndWait.add(lblBW);
		lblBW.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblGidenHatasizVeri = new JLabel("Hata:");
		lblGidenHatasizVeri.setBounds(637, 198, 293, 34);
		StopAndWait.add(lblGidenHatasizVeri);
		lblGidenHatasizVeri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtHata = new JTextField();
		txtHata.setBounds(637, 243, 293, 34);
		StopAndWait.add(txtHata);
		txtHata.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHata.setColumns(10);
		
		lblEfficiency = new JLabel("Verimlilik (Efficiency) (\u03B7):");
		lblEfficiency.setBounds(73, 450, 209, 34);
		StopAndWait.add(lblEfficiency);
		lblEfficiency.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtEfficiency = new JTextField();
		txtEfficiency.setBounds(85, 500, 185, 34);
		StopAndWait.add(txtEfficiency);
		txtEfficiency.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEfficiency.setColumns(10);
		
		JLabel lblThroughput = new JLabel("Verim (Throughput) :");
		lblThroughput.setBounds(299, 450, 185, 34);
		StopAndWait.add(lblThroughput);
		lblThroughput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtThroughput = new JTextField();
		txtThroughput.setBounds(299, 500, 185, 34);
		StopAndWait.add(txtThroughput);
		txtThroughput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtThroughput.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(313, 380, 314, 59);
		StopAndWait.add(btnNewButton);
		
		
		//butona basýnca hesaplamalar yapmasý
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				float Tp, Tt, BW, Efficiency, Throughput,Goodput,Hata,ToplamVeri;
				
				try {
					
					Tp = Float.parseFloat(txtTp.getText());
					Tt = Float.parseFloat(txtTt.getText());
					BW = Float.parseFloat(txtBW.getText());
					
					Hata = Float.parseFloat(txtHata.getText());
					ToplamVeri = Float.parseFloat(txtToplamVeri.getText());
					
					
					
					
					Efficiency = 1 / (1 + 2 * Tp / Tt);
					Efficiency = Efficiency * 100;
					Throughput = (1 / (1 + 2 * Tp / Tt) ) * BW;
					Goodput = ToplamVeri - Hata / ToplamVeri;
					
					txtEfficiency.setText(Float.toString(Efficiency));
					txtThroughput.setText(Float.toString(Throughput));
					txtGoodput.setText(Float.toString(Goodput));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Lütfen sayý giriniz!");
				}		
			}
			
			
			
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	
		txtBW = new JTextField();
		txtBW.setBounds(10, 277, 293, 34);
		StopAndWait.add(txtBW);
		txtBW.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBW.setColumns(10);
		
		JLabel lblMbps = new JLabel("Mbps");
		lblMbps.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMbps.setBounds(494, 500, 60, 34);
		StopAndWait.add(lblMbps);
		
		JLabel lblP = new JLabel("%");
		lblP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblP.setBounds(136, 500, 29, 34);
		StopAndWait.add(lblP);
		
		JLabel lblToplamVeri = new JLabel("Toplam veri:");
		lblToplamVeri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToplamVeri.setBounds(637, 279, 293, 34);
		StopAndWait.add(lblToplamVeri);
		
		txtToplamVeri = new JTextField();
		txtToplamVeri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtToplamVeri.setColumns(10);
		txtToplamVeri.setBounds(637, 324, 293, 34);
		StopAndWait.add(txtToplamVeri);
		
		txtGoodput = new JTextField();
		txtGoodput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGoodput.setColumns(10);
		txtGoodput.setBounds(565, 500, 185, 34);
		StopAndWait.add(txtGoodput);
		
		label_3 = new JLabel("%");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(760, 500, 60, 34);
		StopAndWait.add(label_3);
		
		lblGoodput = new JLabel("Goodput:");
		lblGoodput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGoodput.setBounds(565, 450, 185, 34);
		StopAndWait.add(lblGoodput);
		
		GoBackN = new JPanel();
		GoBackN.setBackground(new Color(255, 255, 204));
		tabbedPane.addTab("Go Back N", null, GoBackN, null);
		GoBackN.setLayout(null);
		
		baslik1 = new JLabel("Go Back N Protokol\u00FC");
		baslik1.setBounds(368, 11, 218, 29);
		baslik1.setHorizontalAlignment(SwingConstants.CENTER);
		baslik1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GoBackN.add(baslik1);
		
		
		
		
		JLabel lblTp1 = new JLabel("Veri paketi i\u00E7in yay\u0131lma gecikmesi (Tp) (ms) :");
		lblTp1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTp1.setBounds(10, 108, 293, 34);
		GoBackN.add(lblTp1);
		
		JLabel label_2 = new JLabel("G\u00F6nderici (Sender)");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(330, 33, 126, 34);
		GoBackN.add(label_2);
		
		JLabel label_4 = new JLabel("Al\u0131c\u0131 (Receiver)");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(531, 33, 96, 34);
		GoBackN.add(label_4);
		
		txtTp1 = new JTextField();
		txtTp1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTp1.setColumns(10);
		txtTp1.setBounds(10, 153, 293, 34);
		GoBackN.add(txtTp1);
		
		txtBW1 = new JTextField();
		txtBW1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBW1.setColumns(10);
		txtBW1.setBounds(10, 277, 293, 34);
		GoBackN.add(txtBW1);
		
		JButton button = new JButton("Hesapla");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				float Tp1, Tt1, BW1, Ntimes, Efficiency1, Throughput1,Goodput1,Hata1,ToplamVeri1;
				
				try {
					
					Tp1 = Float.parseFloat(txtTp.getText());
					Tt1 = Float.parseFloat(txtTt.getText());
					BW1 = Float.parseFloat(txtBW.getText());
					Ntimes = Float.parseFloat(txtHata.getText());
					
					Hata1 = Float.parseFloat(txtHata1.getText());
					ToplamVeri1 = Float.parseFloat(txtToplamVeri1.getText());
					
					Efficiency1 = Ntimes / (1 + 2 * Tp1 / Tt1);
					Efficiency1 = Efficiency1 * 100;
					Throughput1 = (Ntimes / (1 + 2 * Tp1 / Tt1) ) * BW1;
					Goodput1 = ToplamVeri1 - Hata1 + Ntimes / ToplamVeri1;
					txtGoodput1.setText(Float.toString(Goodput1));
					txtEfficiency1.setText(Float.toString(Efficiency1));
					txtThroughput1.setText(Float.toString(Throughput1));
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Lütfen sayý giriniz!");
				}		
			}
			
			
			
			
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(313, 380, 314, 59);
		GoBackN.add(button);
		
		JLabel label_6 = new JLabel("Verimlilik (Efficiency) (\u03B7):");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(52, 450, 209, 34);
		GoBackN.add(label_6);
		
		JLabel label_7 = new JLabel("Verim (Throughput) :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(271, 450, 185, 34);
		GoBackN.add(label_7);
		
		txtNtimes = new JTextField();
		txtNtimes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNtimes.setColumns(10);
		txtNtimes.setBounds(637, 243, 293, 34);
		GoBackN.add(txtNtimes);
		
		JLabel label_8 = new JLabel("Veri paketi i\u00E7in iletim gecikmesi (Tt) (ms):");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(637, 108, 293, 34);
		GoBackN.add(label_8);
		
		JLabel lblNtimes = new JLabel("N:");
		lblNtimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNtimes.setBounds(637, 198, 293, 34);
		GoBackN.add(lblNtimes);
		
		txtTt1 = new JTextField();
		txtTt1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTt1.setColumns(10);
		txtTt1.setBounds(637, 153, 293, 34);
		GoBackN.add(txtTt1);
		
		JLabel label_10 = new JLabel("%");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_10.setBounds(27, 500, 29, 34);
		GoBackN.add(label_10);
		
		txtEfficiency1 = new JTextField();
		txtEfficiency1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEfficiency1.setColumns(10);
		txtEfficiency1.setBounds(64, 500, 185, 34);
		GoBackN.add(txtEfficiency1);
		
		txtThroughput1 = new JTextField();
		txtThroughput1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtThroughput1.setColumns(10);
		txtThroughput1.setBounds(271, 500, 185, 34);
		GoBackN.add(txtThroughput1);
		
		JLabel label_11 = new JLabel("Mbps");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_11.setBounds(464, 500, 60, 34);
		GoBackN.add(label_11);
		
		label = new JLabel("Bant Geni\u015Fli\u011Fi (BandWidth) (BW) (Mbps):");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 232, 293, 34);
		GoBackN.add(label);
		
		
		foto1 = new JLabel("");
		foto1.setIcon(new ImageIcon(img1));
		foto1.setBounds(314, 80, 360, 289);
		GoBackN.add(foto1);
		
		lblHata = new JLabel("Hata:");
		lblHata.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHata.setBounds(637, 278, 293, 34);
		GoBackN.add(lblHata);
		
		txtHata1 = new JTextField();
		txtHata1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHata1.setColumns(10);
		txtHata1.setBounds(637, 310, 293, 34);
		GoBackN.add(txtHata1);
		
		label_5 = new JLabel("Toplam veri:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(637, 348, 293, 34);
		GoBackN.add(label_5);
		
		txtToplamVeri1 = new JTextField();
		txtToplamVeri1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtToplamVeri1.setColumns(10);
		txtToplamVeri1.setBounds(637, 393, 293, 34);
		GoBackN.add(txtToplamVeri1);
		
		label_9 = new JLabel("Goodput:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_9.setBounds(526, 450, 185, 34);
		GoBackN.add(label_9);
		
		txtGoodput1 = new JTextField();
		txtGoodput1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGoodput1.setColumns(10);
		txtGoodput1.setBounds(526, 500, 185, 34);
		GoBackN.add(txtGoodput1);
		
		label_12 = new JLabel("%");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_12.setBounds(721, 500, 60, 34);
		GoBackN.add(label_12);
	
	}
}

