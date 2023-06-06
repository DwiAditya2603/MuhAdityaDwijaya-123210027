/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.ModelData;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class RoomListView { 
    JFrame window = new JFrame("Renter Data");
     Object columnName []={"nama","size","price","status"};
    
    String data[][] = new String [100][4];
    DefaultTableModel tableModel = new DefaultTableModel(columnName,0);
    JTable tabel = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(tabel);
    
    JButton bcancel = new JButton("Logout");
    
    ModelData model = new ModelData();

    public RoomListView(){
        window.setLayout(null);
        window.setSize(550,600);
       
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        
        window.add(scrollPane);
        window.add(bcancel);
        scrollPane.setBounds(20, 35, 500, 300);
        bcancel.setBounds(20, 350, 100,50);
        
        showData();
        bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPageView().setVisible(true);
                window.dispose();
            }
        });
        
        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                super.mouseClicked(e);
                int row=tabel.getSelectedRow();
                int col=tabel.getSelectedColumn();
                String status=tabel.getValueAt(row, 3).toString();
                String room=tabel.getValueAt(row, 0).toString();
                int price=Integer.parseInt(tabel.getValueAt(row, 2).toString());
                if(status.equals("empty")){
                    window.dispose();
                    new RenterDataView(room, price);
                }else{
                    JOptionPane.showMessageDialog(null, "Kamar Terisi!");
                }
            }
        });
        
    }
    
    private void showData(){
        String data[][]=model.ReadRoom();
        tabel.setModel(new JTable(data, columnName).getModel()); 
    }
    
}
