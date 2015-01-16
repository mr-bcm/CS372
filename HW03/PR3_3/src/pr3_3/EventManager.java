/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import java.awt.Color;
import java.io.*;   // method saveFile() needs java.io.BufferedWriter
import java.util.regex.*;   // reading from file and retrieving proper info
import java.util.*;
import javax.swing.table.*;

/**
 * Program application that saves events entered by the user in a text file and
 * displays a current list of events based on what has been saved in the text
 * file.
 *
 * @author Brennan
 */
public class EventManager extends javax.swing.JFrame {

    /**
     * Write the contents of an event to a text file.
     *
     * @param event contents to write to file
     */
    public void writeToFile(String event) {
        // File f = new File("C:\\Users\\Brennan\\Documents\\GitHub\\CS372\\HW03\\PR3_3\\src\\pr3_3\\ioWriter.txt");
        File f = new File("Z:\\GitHub\\CS372\\HW03\\PR3_3\\src\\pr3_3\\ioWriter.txt");

        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            wrtr.write(event);
            wrtr.newLine();
            wrtr.close();
        } catch (Exception e) {
            System.out.println("ERROR: Writing To File");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Reads the contents from a saved text file, creates an Event object for
     * each line of the text file, and then returns a List of those array
     * objects.
     *
     * @return a list of Event objects that represent each line of the file that
     * was read in.
     */
    public List<Event> readFromFile() {
        // File f = new File("C:\\Users\\Brennan\\Documents\\GitHub\\CS372\\HW03\\PR3_3\\src\\pr3_3\\ioWriter.txt");
        File f = new File("Z:\\GitHub\\CS372\\HW03\\PR3_3\\src\\pr3_3\\ioWriter.txt");

        List<Event> eventList = new ArrayList<Event>();

        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;

            String tempName = "";
            String tempLocation = "";
            int month = 0;
            int day = 0;
            int year = 0;

            while ((line = rdr.readLine()) != null) {
                Pattern p = Pattern.compile("<name\\>(.*)?\\<1done>");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    tempName = m.group(1);
                }

                Pattern p2 = Pattern.compile("<location\\>(.*)?\\<2done>");
                Matcher m2 = p2.matcher(line);
                while (m2.find()) {
                    tempLocation = m2.group(1);
                }

                Pattern p3 = Pattern.compile("<month\\>(.*)?\\<3done>");
                Matcher m3 = p3.matcher(line);
                while (m3.find()) {
                    month = Integer.parseInt(m3.group(1));
                }

                Pattern p4 = Pattern.compile("<day\\>(.*)?\\<4done>");
                Matcher m4 = p4.matcher(line);
                while (m4.find()) {
                    day = Integer.parseInt(m4.group(1));

                }

                Pattern p5 = Pattern.compile("<year\\>(.*)?\\<5done>");
                Matcher m5 = p5.matcher(line);
                while (m5.find()) {
                    year = Integer.parseInt(m5.group(1));
                }

                Event event = new Event(tempName, tempLocation, month, day, year);
                eventList.add(event);
            }
            rdr.close();

        } catch (Exception e) {
            System.out.println("ERROR: Reading From File");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
        return eventList;
    }

    /**
     * Creates new form EventManager
     */
    public EventManager() {
        initComponents();

        // Get saved events
        List<Event> savedEvents = readFromFile();

        try {
            // Initial table sort
            Collections.sort(savedEvents, new CompareEvents() {
                @Override
                public int compare(Event x, Event y) {
                    return x.location.compareTo(y.location);
                }
            });

            // Write the list of saved events to the JTable
            DefaultTableModel model = (DefaultTableModel) tbEventTable.getModel();
            for (int i = 0; i < savedEvents.size(); i++) {
                Object[] row = {savedEvents.get(i).name, savedEvents.get(i).location, savedEvents.get(i).getDate()};
                model.addRow(row);
            }

            // Sort Table On Table Header Click
            tbEventTable.setAutoCreateRowSorter(rootPaneCheckingEnabled);

        } catch (Exception e) {
            System.out.println("ERROR: Populating startup table.");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEventName = new javax.swing.JLabel();
        lbLocation = new javax.swing.JLabel();
        lbMonth = new javax.swing.JLabel();
        lbDay = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnAddEvent = new javax.swing.JButton();
        txtMonth = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEventTable = new javax.swing.JTable();
        lbCurrentEvents = new javax.swing.JLabel();
        lbAddAnEvent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbEventName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbEventName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEventName.setText("Event Name");

        lbLocation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLocation.setText("Location");

        lbMonth.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMonth.setText("Month");

        lbDay.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDay.setText("Day");

        lbYear.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbYear.setText("Year");

        txtEventName.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        txtLocation.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        btnAddEvent.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btnAddEvent.setText("Add Event");
        btnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventActionPerformed(evt);
            }
        });

        txtMonth.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txtMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDay.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txtDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtYear.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tbEventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Location", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEventTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEventTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEventTable);

        lbCurrentEvents.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lbCurrentEvents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCurrentEvents.setText("Current Events");

        lbAddAnEvent.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lbAddAnEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddAnEvent.setText("Add An Event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAddAnEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCurrentEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lbEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMonth))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDay, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(txtDay))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtYear))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnAddEvent)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbAddAnEvent)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEventName)
                    .addComponent(lbLocation)
                    .addComponent(lbMonth)
                    .addComponent(lbDay)
                    .addComponent(lbYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddEvent)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(lbCurrentEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Upon clicking the Add Event button in the application the data that was
     * entered will written to a text file for future use.
     *
     * @param evt
     */
    private void btnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventActionPerformed
        try {
            // If textboxes are blank, they will be highlighted red
            if ((this.txtMonth.getText().equals(""))
                    || (this.txtDay.getText().equals(""))
                    || (this.txtYear.getText().equals(""))
                    || (this.txtEventName.getText().equals(""))
                    || (this.txtLocation.getText().equals(""))) {

                if (this.txtMonth.getText().equals("")) {
                    txtMonth.setBackground(Color.red);
                } else {
                    txtMonth.setBackground(Color.white);
                }

                if (this.txtDay.getText().equals("")) {
                    txtDay.setBackground(Color.red);
                } else {
                    txtDay.setBackground(Color.white);
                }

                if (this.txtYear.getText().equals("")) {
                    txtYear.setBackground(Color.red);
                } else {
                    txtYear.setBackground(Color.white);
                }

                if (this.txtEventName.getText().equals("")) {
                    txtEventName.setBackground(Color.red);
                } else {
                    txtEventName.setBackground(Color.white);
                }

                if (this.txtLocation.getText().equals("")) {
                    txtLocation.setBackground(Color.red);
                } else {
                    txtLocation.setBackground(Color.white);
                }
            } else {
                // Highlight text boxes back to white
                txtMonth.setBackground(Color.WHITE);
                txtDay.setBackground(Color.white);
                txtYear.setBackground(Color.white);
                txtEventName.setBackground(Color.white);
                txtLocation.setBackground(Color.white);

                // Get the date of the user's event
                int month = Integer.parseInt(this.txtMonth.getText());
                int day = Integer.parseInt(this.txtDay.getText());
                int year = Integer.parseInt(this.txtYear.getText());

                Event event = new Event(txtEventName.getText(), txtLocation.getText(), month, day, year);

                // Reset text boxes
                txtEventName.setText("");
                txtLocation.setText("");
                txtMonth.setText("");
                txtDay.setText("");
                txtYear.setText("");

                // Write event to file
                writeToFile(event.outputEventPattern());
            }
        } catch (Exception e) {
            System.out.println("ERROR: EventActionPerformed");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAddEventActionPerformed

    private void tbEventTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEventTableMouseClicked

    }//GEN-LAST:event_tbEventTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddAnEvent;
    private javax.swing.JLabel lbCurrentEvents;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbEventName;
    private javax.swing.JLabel lbLocation;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbYear;
    private javax.swing.JTable tbEventTable;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
