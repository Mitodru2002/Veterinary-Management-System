package mypack;

import java.sql.*;
import java.util.Scanner;

public class OwnerService {
    public static void insertOwner(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Owner ID: ");
        int ownerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact Info: ");
        String contact = sc.nextLine();
        System.out.print("Enter Animal Owned: ");
        String animalOwned = sc.nextLine();

        PreparedStatement pstOwner = con.prepareStatement("INSERT INTO owners VALUES (?, ?, ?, ?)");
        pstOwner.setInt(1, ownerId);
        pstOwner.setString(2, name);
        pstOwner.setString(3, contact);
        pstOwner.setString(4, animalOwned);
        pstOwner.executeUpdate();
        System.out.println("Owner registered successfully!");
    }

    public static void viewOwners(Connection con) throws SQLException {
        Statement stOwners = con.createStatement();
        ResultSet rsOwners = stOwners.executeQuery("SELECT * FROM owners");
        System.out.println("\n--- Owners ---");
        while (rsOwners.next()) {
            System.out.println(rsOwners.getInt("owner_id") + " | " +
                               rsOwners.getString("name") + " | " +
                               rsOwners.getString("contact") + " | Animal: " +
                               rsOwners.getString("animal_owned"));
        }
    }

    public static void updateOwner(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Owner ID to update: ");
        int updateOwnerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Which field do you want to update? (name/contact/animal_owned): ");
        String field = sc.nextLine().toLowerCase();

        String sql = "UPDATE owners SET " + field + " = ? WHERE owner_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        System.out.print("Enter new " + field + ": ");
        String value = sc.nextLine();
        pst.setString(1, value);
        pst.setInt(2, updateOwnerId);

        int updated = pst.executeUpdate();
        System.out.println(updated > 0 ? "Owner updated." : "Owner not found.");
    }

    public static void deleteOwner(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Owner ID to delete: ");
        int deleteId = sc.nextInt();

        PreparedStatement pst = con.prepareStatement("DELETE FROM owners WHERE owner_id = ?");
        pst.setInt(1, deleteId);
        int deleted = pst.executeUpdate();
        System.out.println(deleted > 0 ? "Owner deleted." : "Owner not found.");
    }
}
