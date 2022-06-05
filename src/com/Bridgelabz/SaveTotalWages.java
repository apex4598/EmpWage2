package com.Bridgelabz;

public class SaveTotalWages {
    public final static int IS_PART_TIME = 1;
    public final static int IS_FULL_TIME = 2;

    public String company;
    int Emp_Rate_Per_Hr ;
    int Num_Of_Working_Days;
    int Max_Hrs_In_Month;


    public int  evaluateEmpWage(String company,int Emp_Rate_Per_Hr, int Num_Of_Working_Days,int Max_Hrs_In_Month)

    {
        int empHrs = 0 ;
        int totalEmpHrs = 0 ;
        int totalWorkingDays = 0;
        int totalEmpWage=0;


        while (totalEmpHrs <= Max_Hrs_In_Month &&
                totalWorkingDays < Num_Of_Working_Days)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs+= empHrs;
            System.out.println("Day: " + totalWorkingDays +"  "+ "Employee working hours:" + empHrs );
        }
        totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
        return totalEmpWage;
    }

    public static void main(String args[])
    {
        SaveTotalWages emp=new SaveTotalWages();
        SaveTotalWages obj1  = new SaveTotalWages();

        int[] wages=new int[3];

        wages[0]=emp.evaluateEmpWage("Flipkart",40,20,100);
        System.out.println("Employee Monthly wage"+wages[0]+"in Flipkart");
        System.out.println("---------------------------------------------");
        wages[1]=emp.evaluateEmpWage("Amazon",50,20,120);
        System.out.println("Employee Monthly wage"+wages[1]+"in Amazon");
        System.out.println("---------------------------------------------");
        wages[2]=emp.evaluateEmpWage("Mesho",50,18,20);
        System.out.println("Employee Monthly wage"+wages[2]+"in Mesho");
        System.out.println("---------------------------------------------");
    }
}
