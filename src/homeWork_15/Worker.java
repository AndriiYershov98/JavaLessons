package homeWork_15;

public class Worker {


    String name;
    String profession;
    String workplace;
    int jobExp;
    double income;
    int yearSalary;

    public Worker(){

    }


    public void whoAmI(){
        System.out.println("I'm " + name + " i work as " +
                profession + " i work in " + workplace + " for " + jobExp + " year(s)" +
                " i make " + yearSalary + " a year.");
    }

    public Worker(String workername, String speciality, int exp,double salary, String place){
        name = workername;
        profession = speciality;
        jobExp = exp;
        income = (int) (salary * jobExp);
        workplace = place;
        int yearincome = (int)(salary * 12);
        int period = jobExp / 10;
        int bonus = (int)(period * 0.05 * yearincome);
        yearSalary = yearincome + bonus;

    }






    void learning(){
        System.out.println("I'm learning new material");
    }

    void healing(){
        System.out.println("I'm healing people");

    }

    void managing(){
        System.out.println("");
    }

    void mentoring(){
        System.out.println("I'm mentoring new recruits");
    }
    void firefighting(){}
    void patrol(){
        System.out.println("Dispatcher, I'm on patrol");
    }
    void count(){
        System.out.println("I'm counting your salary");
    }

    void arrest(){
        System.out.println("i'm arresting this criminal");

    }
    void defending(){
        System.out.println("Defending the innocent");
    }



}
