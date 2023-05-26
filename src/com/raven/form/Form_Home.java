package com.raven.form;

import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.model.VolEvent;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Home extends javax.swing.JPanel{
    public ArrayList<VolEvent> eventsFinished = new ArrayList<VolEvent>();

    // this is a test

    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Pleasanton FunRun", "Tomorrow", "4 hours"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/profit.png")), "Mohr PTSA", "Monday", "2 Hours"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/flag.png")), "Cancer Fundraiser", "Wednesday", "7 Hours"));
        //  add row table 
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        //  table.addRow(new VolEvent("Dog Shelter", "Pleasanton Dog Shelter", "3", "25 Apr, 2020", StatusType.PENDING));
        table.addRow(new Object[]{"Beach Cleanup", "Ocean Beach", "5", "12 Jul, 2021", StatusType.APPROVED});  
        table.addRow(new Object[]{"Beach Cleanup", "Ocean Beach", "5", "12 Jul, 2021", StatusType.APPROVED});
        table.addRow(new Object[]{"Youth Mentoring", "Community Center", "2", "8 Sep, 2022", StatusType.APPROVED});
        table.addRow(new Object[]{"Fundraising Gala", "Grand Ballroom", "6", "19 Nov, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Hospital Volunteer", "City General Hospital", "4", "2 Mar, 2024", StatusType.PENDING});
        table.addRow(new Object[]{"Senior Home Visits", "Golden Acres Senior Home", "3", "10 Aug, 2024", StatusType.APPROVED});
        table.addRow(new Object[]{"Community Garden", "Green Thumb Park", "4", "5 May, 2025", StatusType.PENDING});
        table.addRow(new Object[]{"Reading Program", "Public Library", "2", "14 Sep, 2025", StatusType.APPROVED});
        table.addRow(new Object[]{"Homeless Shelter", "Hope Haven Shelter", "5", "9 Dec, 2026", StatusType.PENDING});
        table.addRow(new Object[]{"Blood Drive", "Community Center", "3", "20 Mar, 2027", StatusType.PENDING});
        table.addRow(new Object[]{"Red Cross Fundraiser", "San Francisco", "5", "15 May, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Food Bank Volunteer", "Oakland Food Bank", "2", "10 May, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Beach Cleanup", "Santa Cruz Beach", "10", "22 May, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Youth Mentorship Program", "Boys and Girls Club", "4", "18 May, 2023", StatusType.REJECT});
        table.addRow(new Object[]{"Community Garden", "Berkeley Community Garden", "6", "20 May, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Music Festival", "Golden Gate Park", "12", "30 Jun,2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Eco-Friendly Campaign", "San Francisco City Hall", "8", "1 Jun, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Summer Camp Counselor", "Camp Concord", "3", "10 Jul, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Senior Center Volunteer", "Pleasanton Senior Center", "2", "5 Jul, 2023", StatusType.REJECT});
        table.addRow(new Object[]{"Art Festival", "Livermore Art Association", "5", "1 Sep, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Youth Sports Coach", "Tri-Valley YMCA", "4", "15 Sep, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Animal Shelter Volunteer", "East Bay SPCA", "2", "20 Sep, 2023", StatusType.REJECT});
        table.addRow(new Object[]{"Homeless Shelter", "Salvation Army", "6", "25 Sep, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Community Park Cleanup", "Dublin Community Park", "10", "5 Oct, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Teaching Assistant", "Dublin High School", "2", "10 Oct, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"After School Tutoring", "Livermore Public Library", "3", "15 Oct, 2023", StatusType.REJECT});
        table.addRow(new Object[]{"Museum Docent", "Oakland Museum of California", "4", "20 Oct, 2023", StatusType.PENDING});
        table.addRow(new Object[]{"Meals on Wheels", "Alameda County Meals on Wheels", "2", "25 Oct, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Children's Hospital Volunteer", "UCSF Benioff Children's Hospital", "5", "30 Oct, 2023", StatusType.APPROVED});
        table.addRow(new Object[]{"Nature Trail Maintenance", "East Bay Regional Park District", "6", "5 Nov, 2023", StatusType.PENDING});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Currently Done");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event", "Location", "Hours Logged", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

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
    }
    
    // </editor-fold>//GEN-END:initComponents
    public void formHaddRow(Object[] x){
        table.addRow(x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
