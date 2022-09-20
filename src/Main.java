public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var BoxerWeigt1 = 78.2;
        var BoxerWeigt2 = 82.7;

        var ToltalWeigtBoxer = BoxerWeigt2 + BoxerWeigt1;
        System.out.println("общий вес двухбойцов " + ToltalWeigtBoxer + " кг");

        var DiferenceWeigtBoxer = BoxerWeigt2 - BoxerWeigt1;
        System.out.println("разница в весе бойцов " + DiferenceWeigtBoxer + " кг");

        var Diference = BoxerWeigt2 % BoxerWeigt1;
        System.out.println("разница в весе бойцов " + DiferenceWeigtBoxer + " кг");
        var TotalHours = 640;
        var WorkingTime = 8;
        var TotalEmployeesInTheCompany = TotalHours / WorkingTime;
        System.out.println("Всего работников в компании " + TotalEmployeesInTheCompany + " человек");
        TotalEmployeesInTheCompany = TotalEmployeesInTheCompany + 94;
        System.out.println("Всего работников в компании после увеличения " + TotalEmployeesInTheCompany+ " человка");
        var HoursToDivideAfterStaffIncreas = TotalEmployeesInTheCompany * WorkingTime- TotalHours ;
        System.out.println("Если в компании работает " + TotalEmployeesInTheCompany + " человека"+ " то всего "+ HoursToDivideAfterStaffIncreas + " часа работы может быть поделено между сотрудниками.");

    }
}