import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Sudoku {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JLabel lblNumbers;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku window = new Sudoku();
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
	public Sudoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 923, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		int list[] = new int [81];

		for(int i = 0 ; i< 81 ; i++) 

		list[i]=i;
		
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 67, 518, 533);
		frame.getContentPane().add(panel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_57, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_58, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_59, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_60, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_61, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_62, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_66, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_70, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_71, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_72, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_73, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_74, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_75, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_76, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_77, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_78, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_79, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_80, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_81, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_57, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_58, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_59, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_60, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_61, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_62, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_63, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_64, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_65, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_66, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_67, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_68, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_69, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_70, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_71, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_72, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_73, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_74, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_75, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_76, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_77, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_78, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_79, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_80, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_81, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(608, 67, 229, 533);
		frame.getContentPane().add(panel_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBackground(new Color(255, 228, 196));
		
		JButton button_3 = new JButton("3");
		button_3.setBackground(new Color(255, 228, 196));
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setBackground(new Color(255, 228, 196));
		
		JButton button_5 = new JButton("5");
		button_5.setBackground(new Color(255, 228, 196));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_4 = new JButton("4");
		button_4.setBackground(new Color(255, 228, 196));
		
		JButton button_7 = new JButton("7");
		button_7.setBackground(new Color(255, 228, 196));
		
		JButton button_8 = new JButton("8");
		button_8.setBackground(new Color(255, 228, 196));
		
			JButton button_9 = new JButton("9");
			button_9.setBackground(new Color(255, 228, 196));
			/*button_9.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) 
				{
					JButton click = (JButton) e.getSource();
					
					if(click == button_9) 
					{
						txtEmpty.setText("9");
					}
			}
	});*/
		
		
		
		JButton goButton = new JButton("Test !");
		goButton.setBackground(new Color(173, 216, 230));
		
		JButton btnGreen = new JButton("Green");
		btnGreen.setBackground(new Color(152, 251, 152));
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(152, 251, 152));
			}
		});
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.setBackground(new Color(0, 255, 255));
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(0, 255, 255));
			}
		});
		
		JButton btnPink = new JButton("Pink");
		btnPink.setBackground(new Color(238, 130, 238));
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(238, 130, 238));
			}
		});
		
		JButton btnOrange = new JButton("Orange");
		btnOrange.setBackground(new Color(244, 164, 96));
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(244, 164, 96));
			}
		});
		
		JLabel labelBackground = new JLabel("Change Background");
		labelBackground.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNumbers = new JLabel("Numbers");
		lblNumbers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_1 = new JButton("1");
		button_1.setBackground(new Color(255, 228, 196));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNumbers)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(goButton, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnPink, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnOrange, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnGreen, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnBlue, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelBackground, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNumbers)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addComponent(goButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(labelBackground, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGreen, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBlue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPink, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrange, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblSudoku = new JLabel("SUDOKU");
		lblSudoku.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblSudoku.setBounds(51, 14, 161, 42);
		frame.getContentPane().add(lblSudoku);
	}
}
