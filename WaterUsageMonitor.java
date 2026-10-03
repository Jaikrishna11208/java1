public class WaterUsageMonitor {
    public static void main(String[] args) {
        int familyMembers = 6;            
        double waterConsumed = 1900.75; 
        int houseNumber = 209;           
        char waterUsageStatus = 'N';     

        System.out.println("--- Household Water-Usage Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Water Usage Status: " + waterUsageStatus);
    }
}