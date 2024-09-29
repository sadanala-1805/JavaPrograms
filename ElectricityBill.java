package aimlAssignments;

import java.util.Scanner;

class ElectricityBills {
    private int consumerNo;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String connectionType;

    public ElectricityBills(int consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    private int calculateUnits() {
        return currentReading - previousReading;
    }

    public double calculateBill() {
        int units = calculateUnits();
        double billAmount = 0;

        if (connectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                billAmount = units * 0.50;
            } else if (units <= 200) {
                billAmount = 100 * 0.50 + (units - 100) * 1.00;
            } else {
                billAmount = 100 * 0.50 + 100 * 1.00 + (units - 200) * 2.00;
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            if (units <= 100) {
                billAmount = units * 1.50;
            } else if (units <= 200) {
                billAmount = 100 * 1.50 + (units - 100) * 3.00;
            } else {
                billAmount = 100 * 1.50 + 100 * 3.00 + (units - 200) * 4.00;
            }
        }

        return billAmount;
    }

    public void displayBill() {
        System.out.println("\nElectricity Bill:");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Connection Type: " + connectionType);
        System.out.printf("Total Bill Amount: ₹%.2f\n", calculateBill());
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        int consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = sc.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousReading = sc.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentReading = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Type of Connection (domestic/commercial): ");
        String connectionType = sc.nextLine();

        ElectricityBills bill = new ElectricityBills(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();

        sc.close();
    }
}
