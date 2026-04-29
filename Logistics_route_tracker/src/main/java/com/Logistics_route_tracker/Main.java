package com.Logistics_route_tracker;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/logistics";
        String user = "root";
        String pwd = "Ishant@01";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, pwd)) {

                // ===== USER INPUT =====
                System.out.print("Enter Driver ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Driver Name: ");
                String name = sc.nextLine();

                Driver driver = new Driver(id, name);

                // ✅ Insert / Update
                insertDriver(con, driver);

                // ===== LOAD ROUTE =====
                RouteLinkedList<Checkpoint> route = driver.getRouteHistory();

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM checkpoints");

                while (rs.next()) {

                    String cid = rs.getString("id");
                    String cname = rs.getString("name");
                    String type = rs.getString("type");
                    double distance = rs.getDouble("distance");
                    double time = rs.getDouble("time");
                    double extra = rs.getDouble("extra");

                    Checkpoint cp;

                    switch (type.toLowerCase()) {
                        case "delivery":
                            cp = new DeliveryCheckpoint(cid, cname, distance, time, extra);
                            break;
                        case "fuel":
                            cp = new FuelCheckpoint(cid, cname, distance, time, extra);
                            break;
                        case "rest":
                            cp = new RestCheckpoint(cid, cname, distance, time, extra);
                            break;
                        default:
                            continue;
                    }

                    route.addCheckpoint(cp);
                }

                // ===== OUTPUT =====
                System.out.println("\n===== ROUTE SUMMARY =====");
                driver.printRouteSummary();
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    // ===== INSERT / UPDATE =====
    public static void insertDriver(Connection con, Driver driver) throws SQLException {

        String sql = "INSERT INTO drivers (driver_id, name) VALUES (?, ?) " +
                "ON DUPLICATE KEY UPDATE name = VALUES(name)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, driver.getDriverId());
        ps.setString(2, driver.getName());

        ps.executeUpdate();

        System.out.println("✅ Driver saved/updated!");
    }
}