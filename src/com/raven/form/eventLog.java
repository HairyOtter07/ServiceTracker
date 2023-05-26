
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
 * Make a array or arraylist full of descriptions for events
 * Make  arraylist full of job[] Strings for events
 * take the id for each event and plug it in to descriptions[id] and jobs[id]
 * when you click on an event it returns the id of that event, that id can be used to to take the specific description you wrote out in the array jobs
 * 
    


    /**
     * Creates new form Form_1
     */
    public eventLog(String evName,  String evLocation, int evHours, String evDate, int id) {
        initComponents();

         String[] descriptions = {"sucking dick ", "eating balls"};

        this.setSize(evHours, evHours);
        
        nameLabel = new JLabel(evName);
        locationLabel = new JLabel(evLocation);
        hoursLabel = new JLabel("(" + evHours + " Hours)");
        dateLabel = new JLabel(evDate);
        backLabel = new JLabel("Back");
        descLabel = new JLabel(descriptions[id]);

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
        private JLabel descLabel;


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