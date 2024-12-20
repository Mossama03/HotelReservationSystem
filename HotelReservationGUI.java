
package com.hotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelReservationGUI {
    private JFrame frame;

    public HotelReservationGUI() {
        frame = new JFrame("Hotel Reservation System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel roomLabel = new JLabel("Room Type:");
        roomLabel.setBounds(10, 20, 80, 25);
        panel.add(roomLabel);

        String[] roomTypes = {"Standard", "Deluxe", "Suite"};
        JComboBox<String> roomComboBox = new JComboBox<>(roomTypes);
        roomComboBox.setBounds(150, 20, 165, 25);
        panel.add(roomComboBox);

        JLabel customerLabel = new JLabel("Customer Type:");
        customerLabel.setBounds(10, 60, 100, 25);
        panel.add(customerLabel);

        String[] customerTypes = {"Regular", "VIP", "Corporate"};
        JComboBox<String> customerComboBox = new JComboBox<>(customerTypes);
        customerComboBox.setBounds(150, 60, 165, 25);
        panel.add(customerComboBox);

        JButton reserveButton = new JButton("Reserve");
        reserveButton.setBounds(10, 100, 150, 25);
        panel.add(reserveButton);

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedRoom = (String) roomComboBox.getSelectedItem();
                String selectedCustomer = (String) customerComboBox.getSelectedItem();

                Room room = RoomFactory.createRoom(selectedRoom);
                Customer customer = CustomerFactory.createCustomer(selectedCustomer);

                ReservationManager.getInstance().manageReservation(
                        "Room: " + room.getType() + ", Cost: $" + room.getCost() + ", Customer: " + customer.getProfile()
                );

                JOptionPane.showMessageDialog(frame, "Reservation Successful!\nRoom: " + room.getType() +
                        "\nCost: $" + room.getCost() + "\nCustomer: " + customer.getProfile());
            }
        });
    }
}
