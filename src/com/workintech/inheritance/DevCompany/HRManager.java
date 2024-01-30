package com.workintech.inheritance.DevCompany;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    @Override
    public void work() {
        System.out.println("HRManager");
        setSalary(50000);
    }

    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }
    public  void  addEmployee (int index,JuniorDeveloper junDev){
        try {
          if( juniorDevelopers[index]==null){
              juniorDevelopers[index]=junDev;
          }
          else{
              System.out.println("Index Full");
          }
        }catch ( ArrayIndexOutOfBoundsException ex){
            System.out.println("Index Not Found " + ex.getMessage());
        }

    }
    public  void  addEmployee (int index,MidDeveloper midDev){
        try {
            if( midDevelopers[index]==null){
                midDevelopers[index]=midDev;
            }
            else{
                System.out.println("Index Full");
            }
        }catch ( ArrayIndexOutOfBoundsException ex){
            System.out.println("Index Not Found" + ex.getMessage());
        }
    }
    public  void  addEmployee (int index,SeniorDeveloper seniorDev){
        try {
            if( seniorDevelopers[index]==null){
                seniorDevelopers[index]=seniorDev;
            }
            else{
                System.out.println("Index Full");
            }
        }catch ( ArrayIndexOutOfBoundsException ex){
            System.out.println("Index Not Found" + ex.getMessage());
        }

    }
}
