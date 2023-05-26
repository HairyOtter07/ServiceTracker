/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.main.Main;
import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.model.VolEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.font.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;





/**
 *
 * @author RAVEN
 */
public class Form_1 extends javax.swing.JPanel {

    private javax.swing.JTextField eventTextField;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JTextField hoursTextField;
    private javax.swing.JTextField dateTextField;
    private JLabel eventLabel;
    private JLabel locationLabel;
    private JLabel hoursLabel;
    private JLabel dateLabel;
    private javax.swing.JButton addButton;

    /**
     * Creates new form Form_1
     */
    public Form_1() {
        initComponents();
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
        panel = new javax.swing.JPanel();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        addButton = new javax.swing.JButton("Add Event");
         //10 is the radius
        addButton.setForeground(Color.WHITE);
        addButton.setBackground(new java.awt.Color(186, 123, 247));

        setBackground(new java.awt.Color(242, 242, 242));
        numberLabel = new JLabel();
        numberLabel.setFont(new Font("SansSerif", Font.BOLD, 85));
        numberLabel.setForeground(Color.WHITE);
        numberLabel.setBounds(700, -120, 400, 400);
        JLabel hoursApprovedLabel = new JLabel("Hours Approved");
        hoursApprovedLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        hoursApprovedLabel.setForeground(Color.WHITE);
        hoursApprovedLabel.setBounds(700, -50, 400, 400);



        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Hour Goal: 100", "1/01/2024", "PVSA Award"));
        card1.setBounds(700, -150, 400, 400);
        panel.setSize(1000, 1000);card2.setLocation(700, -150); 
        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        




// Set the card colors


        //numberLabel.setSize(300,300 );
        add(numberLabel);
        add(hoursApprovedLabel);
        add(panel);




        eventTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        hoursTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        eventLabel = new JLabel("Event:");
        locationLabel = new JLabel("Location:");
        hoursLabel = new JLabel("Hours Logged:");
        dateLabel = new JLabel("Date:");

        eventTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        locationTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        hoursTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        dateTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));

        eventLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        locationLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        hoursLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        dateLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        




        table = new com.raven.swing.Table();
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"Event", "Location", "Hours Logged", "Date"}
            
        ));
        
        // Create the scroll pane and add the table to it
        spTable = new javax.swing.JScrollPane(table);
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        //spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
      // Set the layout and add the components
        setLayout(new java.awt.BorderLayout());
        add(spTable, java.awt.BorderLayout.WEST);
        table.addRow(new Object[]{"Beach Cleanup", "Ocean Beach", "5", "07/12/2021"});
        table.addRow(new Object[]{"Youth Mentoring", "Community Center", "2", "09/08/2022"});
        table.addRow(new Object[]{"Fundraising Gala", "Grand Ballroom", "6", "11/19/2023"});
        table.addRow(new Object[]{"Hospital Volunteer", "City General Hospital", "4", "03/02/2024"});
        table.addRow(new Object[]{"Senior Home Visits", "Golden Acres Senior Home", "3", "08/10/2024"});
        table.addRow(new Object[]{"Community Garden", "Green Thumb Park", "4", "05/05/2025"});
        table.addRow(new Object[]{"Reading Program", "Public Library", "2", "09/14/2025"});
        table.addRow(new Object[]{"Homeless Shelter", "Hope Haven Shelter", "5", "12/09/2026"});
        table.addRow(new Object[]{"Blood Drive", "Community Center", "3", "03/20/2027"});
        table.addRow(new Object[]{"Red Cross Fundraiser", "San Francisco", "5", "05/15/2023"});

        
        
        //Goal NUmber
        
        panel.add(card1);
        //panel.add(card2);
        //panel.add(card3);
        add(panel);

       
       
       
         // Adjust the bounds as needed
        totalHours = 0;; // Replace with your desired number

        for(int i = 0; i<table.getRowCount(); i++){
            totalHours+=Integer.valueOf(table.getValueAt(i, 2).toString());
        }

        numberLabel.setText(Integer.toString(totalHours));


        eventTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        hoursTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        eventLabel = new JLabel(" Event:");
        locationLabel = new JLabel(" Location:");
        hoursLabel = new JLabel(" Hours Logged:");
        dateLabel = new JLabel(" Date (mm/dd/yyyy):");
        


        eventTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        locationTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        hoursTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));
        dateTextField.setFont(new Font("SansSerif", Font.PLAIN, 12));

        eventLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
        locationLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
        hoursLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
        dateLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));

        eventLabel.setForeground(Color.WHITE);
        locationLabel.setForeground(Color.WHITE);
        hoursLabel.setForeground(Color.WHITE);
        dateLabel.setForeground(Color.WHITE);

        
        eventTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        card1.setPreferredSize(new Dimension(500, 200));
        eventTextField.setPreferredSize(new Dimension(300, 36));
        locationTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));

        JPanel fields = new JPanel(new java.awt.GridLayout(8, 2));

        fields.add(eventLabel);
        fields.add(eventTextField);
        fields.add(locationLabel);
        fields.add(locationTextField);
        fields.add(hoursLabel);
        fields.add(hoursTextField);
        fields.add(dateLabel);
        fields.add(dateTextField);
        fields.add(addButton);
        eventTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        eventTextField.setSize(new Dimension(100, 20));
        locationTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        dateTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        hoursTextField.setFont(new Font("SansSerif", Font.PLAIN, 18));


        
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (eventTextField.getText().length() != 0) {
                    if (locationTextField.getText().length() != 0) {
                        if ((hoursTextField.getText().length() == 1 || hoursTextField.getText().length() == 2 || hoursTextField.getText().length() == 3) && (hoursTextField.getText().matches("\\d+"))) {
                            if (dateTextField.getText().matches("^\\d{1,2}/\\d{1,2}/\\d{4}$")) {
                                String ev = eventTextField.getText();
                                String loc = locationTextField.getText();
                                String hours = hoursTextField.getText();
                                String date = dateTextField.getText(); 
                                eventTextField.setText("");
                                hoursTextField.setText("");
                                locationTextField.setText("");
                                dateTextField.setText("");
                                
                                Main.formHaddRow(new Object[]{ev, loc, hours, date, StatusType.PENDING},0);
                                JOptionPane.showMessageDialog(null, "Event Submitted for Review!");
                                
                                

                                // Validate the entered date
                                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                                sdf.setLenient(false);
                                try {
                                    Date parsedDate = sdf.parse(date);
                                    // Date is valid
                                } catch (ParseException ex) {
                                    JOptionPane.showMessageDialog(null, "You need to enter a valid date.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "You need to fill out the Date field correctly (mm/dd/yyyy).");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "You need to put a valid number of hours into the Hours Logged field.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You need to fill out the Location field.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You need to fill out the Event field.");
                }
            }
        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
        
                // Create an array of options for the popup
                Object[] options = {"Delete", "Edit"};
        
                // Show the popup and get the user's choice
                int choice = JOptionPane.showOptionDialog(
                    null, // Parent component (null for default)
                    "Choose an action:", // Message
                    "Row Actions", // Title
                    JOptionPane.DEFAULT_OPTION, // Option type
                    JOptionPane.PLAIN_MESSAGE, // Message type
                    null, // Icon (null for default)
                    options, // Options array
                    options[0] // Default option
                );
        
                // Handle the user's choice
                switch (choice) {
                    case 0:
                        // Delete button clicked
                        // Add your delete logic here
                        totalHours -= Integer.valueOf(table.getValueAt(selectedRow, 2).toString());
                        table.removeRow(selectedRow);
                        numberLabel.setText(Integer.toString(totalHours));
                        break;
                        
                    case 1:
                        // Edit button clicked
                        // Add your edit logic here
                        showEditDialog(selectedRow);
                        
                    default:
                        // Do nothing or handle unexpected choice
                        break;
                }
            }
        });
        

// Rest of the code



        locationTextField.setPreferredSize(new Dimension(200, 20));  
        hoursTextField.setPreferredSize(new Dimension(200, 20));
        dateTextField.setPreferredSize(new Dimension(200, 20));

        fields.setBackground(new java.awt.Color(142, 142, 250));
        fields.setPreferredSize(new Dimension(500,400));
        panel.add(fields);



    }// </editor-fold>//GEN-END:initComponents

    private void showEditDialog(int selectedRow) {
        JPanel editPanel = new JPanel();
        editPanel.setLayout(new GridLayout(5, 2));
       
        String evName = table.getValueAt(selectedRow, 0).toString();
            String evLocation = table.getValueAt(selectedRow,1).toString();
            String evHours = table.getValueAt(selectedRow, 2).toString();
            String evDate = table.getValueAt(selectedRow, 3).toString();
    
        JTextField eventTextField = new JTextField(evName);
        JTextField locationTextField = new JTextField();
        JTextField dateTextField = new JTextField();
        JTextField hoursTextField = new JTextField();
    
        editPanel.add(new JLabel("Event:"));
        editPanel.add(eventTextField);
        editPanel.add(new JLabel("Location:"));
        editPanel.add(locationTextField);
        editPanel.add(new JLabel("Date:"));
        editPanel.add(dateTextField);
        editPanel.add(new JLabel("Hours:"));
        editPanel.add(hoursTextField);
    
        int result = JOptionPane.showOptionDialog(
            null, // Parent component (null for default)
            editPanel, // Custom panel to display
            "Edit Details", // Title
            JOptionPane.OK_CANCEL_OPTION, // Option type
            JOptionPane.PLAIN_MESSAGE, // Message type
            null, // Icon (null for default)
            new Object[] { "OK", "Cancel" }, // Options array
            "OK" // Default option
        );
    
        if (result == JOptionPane.OK_OPTION) {
            // OK button clicked, retrieve the values from the text fields
            

            eventTextField.setText(evName);
            hoursTextField.setText(evLocation);
            locationTextField.setText(evHours);
             dateTextField.setText(evDate);
    
            // Perform your edit logic here
            // ...
        } else {
            // Cancel button clicked or dialog closed
            // Handle cancel action or do nothing
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private JPanel panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    private javax.swing.JTextField textField;
    private JLabel numberLabel;
    private int totalHours;


    // End of variables declaration//GEN-END:variables
}
