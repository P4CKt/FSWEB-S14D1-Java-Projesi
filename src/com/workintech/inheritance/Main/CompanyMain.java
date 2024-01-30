package com.workintech.inheritance.Main;

import com.workintech.inheritance.DevCompany.HRManager;
import com.workintech.inheritance.DevCompany.JuniorDeveloper;
import com.workintech.inheritance.DevCompany.MidDeveloper;
import com.workintech.inheritance.DevCompany.SeniorDeveloper;

public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloperF = new JuniorDeveloper(1,"T",26788);
        JuniorDeveloper juniorDeveloperM = new JuniorDeveloper(2,"Ö",26788);
        JuniorDeveloper[] juniors = new JuniorDeveloper[]{juniorDeveloperM,juniorDeveloperF};

        MidDeveloper middeveloperF = new MidDeveloper(1,"T",50232);
        MidDeveloper middeveloperM = new MidDeveloper(2,"Ö",50232);
        MidDeveloper[] middles = new MidDeveloper[]{middeveloperM,middeveloperF};

        SeniorDeveloper seniordeveloperF = new SeniorDeveloper(1,"T",95100);
        SeniorDeveloper seniordeveloperM = new SeniorDeveloper(2,"Ö",95100);
        SeniorDeveloper[] seniors = new SeniorDeveloper[]{seniordeveloperM,seniordeveloperF};

        HRManager hrManager= new HRManager(1,"Ömür",42322.2,juniors, middles, seniors);
        hrManager.getSalary();
    }
}
