package task02.t03_nullability;

public class Solution {
    public static boolean checkIfOwnerIsNamed(House house, String ownerName) {
        if (house == null || ownerName == null) {
            return false;
        }

        Person owner = house.getOwner();

        if(owner == null || owner.getName() == null) {
            return false;
        }

        return owner.getName().equals(ownerName);
    }

    public static String getOwnerNameOrPlaceholder(House house, String placeholder) {
        if(house == null) {
            return placeholder;
        }

        Person owner = house.getOwner();

        if(owner == null || owner.getName() == null) {
            return placeholder;
        }

        return owner.getName();
    }
}