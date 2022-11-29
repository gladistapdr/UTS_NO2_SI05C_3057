/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gladista.uts_no2_c_3057;

/**
 *
 * @author hp
 */
public class UTS_NO2_C_3057 {

    public static void main(String[] args) {

        CommissionEmployee c1 = new CommissionEmployee(200000,30000,5,"Hendri","87A8SF6A8");
        ProjectPlanner p1 = new ProjectPlanner(300000,20000,6,"Rendi","A8SF6A78");
        SalariedEmployee s1 = new SalariedEmployee(100000,"Ojan","ASDG869S");
        
        System.out.println("DATA COMMISION EMPLOYEE");
        c1.tampilData();
        c1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA PROJECT PLANNER");
        p1.tampilData();
        p1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA SALARIED EMPLOYEE");
        s1.tampilData();
        s1.hitungGaji();
        
    }

}
