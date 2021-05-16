package za.ac.cput.lance;

import java.util.Objects;

public class business {
    private String employeeID;

    public business(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        business business = (business) o;
        return Objects.equals(employeeID, business.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return  "business{" +
                "employeeID='" + employeeID + '\'' +
                '}';
    }
}
