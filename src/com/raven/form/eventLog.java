// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */





// /**
//  *
//  * @author RAVEN
//  */
// public class eventLog extends javax.swing.JPanel {

//     /**
//      * Creates new form Form_1
//      */
//     public eventLog(String ev, String loc, int hours, String date) {
//         event = ev;
//         location = loc;
//         this.hours = hours;
//         this.date = date;
//         initComponents();
//               //Create the scroll pane and add the table to it
//               add(spTable, java.awt.BorderLayout.WEST);
//               spTable = new javax.swing.JScrollPane(table);
//               spTable.setVerticalScrollBar(new ScrollBar());
//               spTable.getVerticalScrollBar().setBackground(Color.WHITE);
//               spTable.getViewport().setBackground(Color.WHITE);
          
          
//               JPanel p = new JPanel();
//               p.setLayout(new GridLayout(6, 2, 5, 5));
//               p.setBackground(Color.WHITE);
//               p.setVisible(true);


//               card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), event,date, location));

              
              
//               // Set the layout and add the components
//               setLayout(new java.awt.BorderLayout());
//               add(p, java.awt.BorderLayout.WEST);
//               //table.addItem(new Model_Menu("10", "Log Out", Model_Menu.MenuType.MENU));
//               JLabel eventLabel = new JLabel("Event");
//               JLabel locationLabel = new JLabel("Location");
//               JLabel hoursLoggedLabel = new JLabel("Hours Logged");
//               JLabel dateLabel = new JLabel("Date");
//               JLabel statusLabel = new JLabel("Status");
      
//               // Create information labels
//               JLabel eventNameLabel = new JLabel(event);
//               JLabel locationTextLabel = new JLabel(location);
//               JLabel hoursLoggedTextLabel = new JLabel(Integer.toString(hours));
//               JLabel dateTextLabel = new JLabel(date);
//               //JLabel statusTextLabel = new JLabel(StatusType.PENDING.toString());


      
//               // Set label colors
//               eventLabel.setForeground(Color.BLUE);
//               locationLabel.setForeground(Color.BLUE);
//               hoursLoggedLabel.setForeground(Color.BLUE);
//               dateLabel.setForeground(Color.BLUE);
//               statusLabel.setForeground(Color.BLUE);

//               panel.add(p);
//               card1.setColor1(new java.awt.Color(142, 142, 250));
//               card1.setColor2(new java.awt.Color(123, 123, 245));
//               panel.add(card1);
            
//               //make big panel- ----------------------------------------------------------------------------------------------------------
//             javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
//         panelBorder1.setLayout(panelBorder1Layout);
//         panelBorder1Layout.setHorizontalGroup(
//             panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelBorder1Layout.createSequentialGroup()
//                 .addGap(20, 20, 20)
//                 .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panelBorder1Layout.createSequentialGroup()
//                         .addComponent(jLabel1)
//                         .addGap(0, 0, Short.MAX_VALUE))
//                     .addComponent(spTable))
//                 .addContainerGap())
//         );
//         panelBorder1Layout.setVerticalGroup(
//             panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panelBorder1Layout.createSequentialGroup()
//                 .addGap(20, 20, 20)
//                 .addComponent(jLabel1)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
//                 .addGap(20, 20, 20))
//         );

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//         this.setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addGap(20, 20, 20)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                     .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
//                 .addGap(20, 20, 20))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(20, 20, 20)
//                 .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(20, 20, 20)
//                 .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addGap(20, 20, 20))
//         );
//      //make big panel- ----------------------------------------------------------------------------------------------------------




//            //   panel.add(card1);
// // 
      
//               // Set layout and add components
//               //setLayout(new java.awt.GridLayout(6, 2, 5, 5));
//               panel.add(eventLabel);
//               p.add(eventNameLabel);
//               p.add(locationLabel);
//               p.add(locationTextLabel);
//               p.add(hoursLoggedLabel);
//               p.add(hoursLoggedTextLabel);
//               p.add(dateLabel);
//               p.add(dateTextLabel);
//               p.add(statusLabel);

//              // setupLabels();
        
//               //p.add(statusTextLabel);
//               //spTable.add(new Model_Menu("10", "Log Out", Model_Menu.MenuType.MENU))
//     }

//     public void f1ddRow(String[] m){
//         table.addRow(m);
//     }
//     /**
//      * This method is called from within the constructor to initialize the form.
//      * WARNING: Do NOT modify this code. The content of this method is always
//      * regenerated by the Form Editor.
//      */
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         jLabel1 = new javax.swing.JLabel();
//         panel = new javax.swing.JLayeredPane();
//         card1 = new com.raven.component.Card();
//         card2 = new com.raven.component.Card();
//         card3 = new com.raven.component.Card();
//         panelBorder1 = new com.raven.swing.PanelBorder();
//         jLabel1 = new javax.swing.JLabel();
//         spTable = new javax.swing.JScrollPane();
//         table = new com.raven.swing.Table();
//         p = new javax.swing.JPanel();
//        // setupLabels();

        

//     }
   
// // </editor-fold>//GEN-END:initComponents


//     // Variables declaration - do not modify//GEN-BEGIN:variables

//     private com.raven.component.Card card1;
//     private com.raven.component.Card card2;
//     private com.raven.component.Card card3;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLayeredPane panel;
//     private com.raven.swing.PanelBorder panelBorder1;
//     private javax.swing.JScrollPane spTable;
//     private com.raven.swing.Table table;
//     private javax.swing.JTextField textField;
//     private String event;
//     private String location;
//     private int hours;
//     private String date;
//     private JPanel p;

//     // End of variables declaration//GEN-END:variables
// }


package com.raven.form;

import com.raven.main.Main;
import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.model.VolEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import com.raven.model.Model_Menu;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * author RAVEN
 */
public class eventLog extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form Form_1
     */
    public eventLog(String evName,  String evLocation, int evHours, String evDate) {
        initComponents();

        this.setSize(evHours, evHours);
        
        nameLabel = new JLabel(evName);
        locationLabel = new JLabel(evLocation);
        hoursLabel = new JLabel("(" + evHours + " Hours)");
        dateLabel = new JLabel(evDate);
        backLabel = new JLabel("Back");

        subtitleFont = new Font("SansSerif", Font.PLAIN, 18);

        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 50));

        locationLabel.setFont(subtitleFont);
        locationLabel.setForeground(new Color(100, 100, 100));
        locationLabel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/raven/icon/gray_map_pin2.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));

        hoursLabel.setFont(subtitleFont);

        dateLabel.setFont(subtitleFont);

        backLabel.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/back.png")));
        backLabel.setFont(subtitleFont);
        backLabel.setForeground(new Color(100, 100, 100));
        backLabel.addMouseListener(this);

        // JPanel infoPanel = new JPanel(new BorderLayout());
        // JPanel timePanel = new JPanel(new BorderLayout());

        // infoPanel.add(locationLabel, BorderLayout.WEST);
        // timePanel.add(dateLabel, BorderLayout.WEST);
        // timePanel.add(hoursLabel, BorderLayout.EAST);
        // infoPanel.add(timePanel, BorderLayout.EAST);

        // infoPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        // timePanel.setBorder(BorderFactory.createLineBorder(Color.RED));

        // nameLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        // locationLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        // hoursLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        // dateLabel.setBorder(BorderFactory.createLineBorder(Color.RED));

        // // Set layout and add the label
        // setLayout(new BorderLayout());
        // setBorder(BorderFactory.createLineBorder(Color.RED));
        // add(nameLabel, BorderLayout.NORTH);
        // add(infoPanel, BorderLayout.SOUTH);

        // Set layout and add the labels
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

        int dateTimeGap = 10;
        int horizGap = 940 - locationLabel.getPreferredSize().width - dateLabel.getPreferredSize().width - dateTimeGap - hoursLabel.getPreferredSize().width;
        int backGap = 940 - nameLabel.getPreferredSize().width - backLabel.getPreferredSize().width;

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(nameLabel)
                    .addGap(backGap,backGap, backGap)
                    .addComponent(backLabel))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(locationLabel)
                    .addGap(horizGap, horizGap, horizGap)
                    .addComponent(dateLabel)
                    .addGap(dateTimeGap, dateTimeGap, dateTimeGap)
                    .addComponent(hoursLabel))
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(nameLabel)
                    .addComponent(backLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(dateLabel)
                    .addComponent(hoursLabel))
        );

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(242, 242, 242));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
        private Form_2 form2;
        private JLabel nameLabel;
        private JLabel locationLabel;
        private JLabel hoursLabel;
        private JLabel dateLabel;
        private JLabel backLabel;
        private Font subtitleFont;


        @Override
        public void mouseClicked(MouseEvent e) {
            if (!e.getSource().equals(backLabel)) return;
            form2 = new Form_2();
            Main.setForm(form2);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (!e.getSource().equals(backLabel)) return;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (!e.getSource().equals(backLabel)) return;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            return;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            return;
        }

}