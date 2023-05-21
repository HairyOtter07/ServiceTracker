/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.model.VolEvent;
import java.awt.Color;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.raven.model.Model_Menu;




/**
 *
 * @author RAVEN
 */
public class eventLog extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public eventLog(String ev, String loc, int hours, String date) {
        event = ev;
        location = loc;
        this.hours = hours;
        this.date = date;
        initComponents();
              //Create the scroll pane and add the table to it
              add(spTable, java.awt.BorderLayout.WEST);
              spTable = new javax.swing.JScrollPane(table);
              spTable.setVerticalScrollBar(new ScrollBar());
              spTable.getVerticalScrollBar().setBackground(Color.WHITE);
              spTable.getViewport().setBackground(Color.WHITE);
          
          
              JPanel p = new JPanel();
              p.setLayout(new GridLayout(6, 2, 5, 5));
              p.setBackground(Color.WHITE);
          
              p.setVisible(true);


              card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), event,date, location));

              
              
              // Set the layout and add the components
              setLayout(new java.awt.BorderLayout());
              add(p, java.awt.BorderLayout.WEST);
              //table.addItem(new Model_Menu("10", "Log Out", Model_Menu.MenuType.MENU));
              JLabel eventLabel = new JLabel("Event");
              JLabel locationLabel = new JLabel("Location");
              JLabel hoursLoggedLabel = new JLabel("Hours Logged");
              JLabel dateLabel = new JLabel("Date");
              JLabel statusLabel = new JLabel("Status");
      
              // Create information labels
              JLabel eventNameLabel = new JLabel(event);
              JLabel locationTextLabel = new JLabel(location);
              JLabel hoursLoggedTextLabel = new JLabel(Integer.toString(hours));
              JLabel dateTextLabel = new JLabel(date);
              //JLabel statusTextLabel = new JLabel(StatusType.PENDING.toString());


      
              // Set label colors
              eventLabel.setForeground(Color.BLUE);
              locationLabel.setForeground(Color.BLUE);
              hoursLoggedLabel.setForeground(Color.BLUE);
              dateLabel.setForeground(Color.BLUE);
              statusLabel.setForeground(Color.BLUE);

              panel.add(p);
              card1.setColor1(new java.awt.Color(142, 142, 250));
              card1.setColor2(new java.awt.Color(123, 123, 245));
              panel.add(card1);
            
              //make big panel- ----------------------------------------------------------------------------------------------------------
            javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spTable))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
     //make big panel- ----------------------------------------------------------------------------------------------------------




           //   panel.add(card1);
// 
      
              // Set layout and add components
              //setLayout(new java.awt.GridLayout(6, 2, 5, 5));
              panel.add(eventLabel);
              p.add(eventNameLabel);
              p.add(locationLabel);
              p.add(locationTextLabel);
              p.add(hoursLoggedLabel);
              p.add(hoursLoggedTextLabel);
              p.add(dateLabel);
              p.add(dateTextLabel);
              p.add(statusLabel);

             // setupLabels();
        
              //p.add(statusTextLabel);
              //spTable.add(new Model_Menu("10", "Log Out", Model_Menu.MenuType.MENU))
    }

    public void f1ddRow(String[] m){
        table.addRow(m);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JLayeredPane();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        p = new javax.swing.JPanel();
       // setupLabels();

        

    }
    
    private void setupLabels() {
        // Create information labels
        JLabel eventLabel = new JLabel("Event");
        JLabel locationLabel = new JLabel("Location");
        JLabel hoursLoggedLabel = new JLabel("Hours Logged");
        JLabel dateLabel = new JLabel("Date");
        JLabel statusLabel = new JLabel("Status");

        // Set label colors
        eventLabel.setForeground(Color.BLUE);
        locationLabel.setForeground(Color.BLUE);
        hoursLoggedLabel.setForeground(Color.BLUE);
        dateLabel.setForeground(Color.BLUE);
        statusLabel.setForeground(Color.BLUE);

        // Create labels for the event details
        JLabel eventNameLabel = new JLabel(event);
        JLabel locationTextLabel = new JLabel(location);
        JLabel hoursLoggedTextLabel = new JLabel(Integer.toString(hours));
        JLabel dateTextLabel = new JLabel(date);

        // Set layout and add components
        setLayout(new java.awt.GridLayout(6, 2, 5, 5));
        add(eventLabel);
        add(eventNameLabel);
        add(locationLabel);
        add(locationTextLabel);
        add(hoursLoggedLabel);
        add(hoursLoggedTextLabel);
        add(dateLabel);
        add(dateTextLabel);
        add(statusLabel);
        add(textField);
    }
// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    private javax.swing.JTextField textField;
    private String event;
    private String location;
    private int hours;
    private String date;
    private JPanel p;

    // End of variables declaration//GEN-END:variables
}
