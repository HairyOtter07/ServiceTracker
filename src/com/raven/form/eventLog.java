
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
import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import com.raven.model.Model_Menu;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

import javax.swing.JLabel;
import javax.swing.JPanel;
import com.raven.swing.Table;

import javax.swing.JTextArea;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * author RAVEN
 */
public class eventLog extends javax.swing.JPanel implements MouseListener, ActionListener {


    private String[][][] jobData = {
        { { "Cleaning", "10 AM", "2 hours", "2" }, { "Bag Holding", "12 PM", "3 hours", "1" }, { "Glove Distributer", "2 PM", "4 hours", "3" }, { "Event Setup", "4 PM", "2 hours", "4" } },
        { { "Food Bar", "2 PM", "2 hours", "2" }, { "Refreshments", "12 PM", "3 hours", "1" }, { "Event Set Up", "10 AM", "4 hours", "3" }, { "Event Clean Up", "4 PM", "1 hour", "4" } },
        { { "Math Teacher", "2 PM", "2 hours", "2" }, { "English Tutor", "2 PM", "2 hours", "1" }, { "Coding Instructor", "2 PM", "2 hours", "3" }, { "Snacks and Drinks", "4 PM", "1 hour", "4" } }
    };


    public eventLog(String evName, String evLocation, int evHours, String evDate, int id) {
        initComponents();
        initJobTable(id);

        this.name = evName;
        this.date = evDate;
        this.location = evLocation;
        this.hours = Integer.toString(evHours);

        String[] descriptions = {
            "Description: Join us for a rewarding volunteer activity as we come together to clean up Ocean Beach, one of the most beautiful coastal areas in our community. This initiative aims to preserve the natural beauty of the beach and protect marine life by removing litter and debris. ",
            "Description: Join us for a rewarding volunteer day at Mohr Elementary School and make a positive impact on the lives of young students. This volunteer activity aims to support the school community by providing assistance with various tasks and creating an enriching environment for students.",
            "Description: Become a mentor and make a positive impact on the lives of young individuals in our community by joining our Youth Mentoring Program at the Community Center. This volunteer activity aims to provide guidance, support, and encouragement to youth, empowering them to reach their full potential and navigate the challenges they may face."
        };

        this.setSize(evHours, evHours);

        descTextArea = new JTextArea(descriptions[id]); // Use JTextArea instead of JLabel
        descTextArea.setFont(subtitleFont);
        descTextArea.setForeground(new Color(100, 100, 100));
        descTextArea.setLineWrap(true); // Enable line wrapping
        descTextArea.setWrapStyleWord(true);
        descTextArea.setEditable(false);

        // descTextArea.setPreferredSize(new Dimension(400,50));

        int textAreaWidth = 100; // Set the desired width of the text area
        int textAreaHeight = 50; // Set the desired height of the text area
        descTextArea.setSize(textAreaWidth, textAreaHeight);
        descTextArea.setPreferredSize(new Dimension(textAreaWidth, textAreaHeight));
        descTextArea.setBounds(0, 100, 1000, 100);
        descTextArea.setPreferredSize(new Dimension(300, 50));

        nameLabel = new JLabel(evName);
        locationLabel = new JLabel(evLocation);
        hoursLabel = new JLabel("(" + evHours + " Hours)");
        dateLabel = new JLabel(evDate);
        backLabel = new JLabel("Back");
        // descLabel = new JLabel(descriptions[id]);

        subtitleFont = new Font("SansSerif", Font.PLAIN, 18);

        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 50));

        // descLabel.setFont(subtitleFont);
        // descLabel.setForeground(new Color(100, 100, 100));

        locationLabel.setFont(subtitleFont);
        locationLabel.setForeground(new Color(100, 100, 100));
        locationLabel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/raven/icon/gray_map_pin2.png"))
                .getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));

        hoursLabel.setFont(subtitleFont);

        dateLabel.setFont(subtitleFont);

        backLabel.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/back.png")));
        backLabel.setFont(subtitleFont);
        backLabel.setForeground(new Color(100, 100, 100));
        backLabel.addMouseListener(this);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

        int dateTimeGap = 10;
        int horizGap = 940 - locationLabel.getPreferredSize().width - dateLabel.getPreferredSize().width - dateTimeGap - hoursLabel.getPreferredSize().width;
        int backGap = 940 - nameLabel.getPreferredSize().width - backLabel.getPreferredSize().width;

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(nameLabel)
                    .addGap(backGap, backGap, backGap)
                    .addComponent(backLabel))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(locationLabel)
                    .addGap(horizGap, horizGap, horizGap)
                    .addComponent(dateLabel)
                    .addGap(dateTimeGap, dateTimeGap, dateTimeGap)
                    .addComponent(hoursLabel))
                .addComponent(descTextArea)
                .addComponent(scrollPane)
                .addComponent(addButton)
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
                .addComponent(descTextArea)
                .addComponent(scrollPane)
                .addComponent(addButton)
        );
    }

    private void initJobTable(int id) {
        // Create the table data
        String[][] jobs = jobData[id];
       

        // Create the table column names
        String[] columnNames = { "Job Name", "Time", "Duration", "Slots" };
        

        table = new Table();
        table.setModel(new DefaultTableModel(jobs, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        
        // Create a JScrollPane and add the JTable to it
        scrollPane = new JScrollPane(table);
        
        addButton = new JButton("Apply");
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
        
                if (selectedRow != -1) {
                    String jobName = table.getValueAt(selectedRow, 0).toString() + " at " +location;
                    String slots = table.getValueAt(selectedRow, 3).toString();
                    String jobDate = date;
                    String jobHours = hours;

        
                    int availableSlots = Integer.parseInt(slots);
                    if (availableSlots > 0) {
                        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to apply for the job: " + jobName + "?", "Confirm Application", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            String name = JOptionPane.showInputDialog(null, "Enter your name:");
                            if (name != null && !name.isEmpty()) {
                                // Apply logic here
                                // Decrease available slots by 1
                                availableSlots--;
        
                                // Update the table with the new slot count
                                table.setValueAt(availableSlots, selectedRow, 3);
                                Main.changeCard(jobName, jobDate, jobHours);
        
                                // You can display a panel with a message using JOptionPane.showMessageDialog
                                String message = "Application sent to Organization";
                                JOptionPane.showMessageDialog(null, message, "Application Confirmation", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter your name.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No slots available for this job.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a job to apply for.", "Apply For Job", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
    private JTextArea descTextArea;
    private Table table;
    private JScrollPane scrollPane;
    private JButton addButton;
    private String name;
    private String date;
    private String location;
    private String hours;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!e.getSource().equals(backLabel))
            return;
        form2 = new Form_2();
        Main.setForm(form2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!e.getSource().equals(backLabel))
            return;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (!e.getSource().equals(backLabel))
            return;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        return;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        return;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    

}