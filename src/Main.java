public class Main {
    public static void main(String[] args)
    {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog= " + dog);
        System.out.println("cat= " + cat);
        System.out.println("paper= " + paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog= " + dog);
        System.out.println("cat= " + cat);
        System.out.println("paper= " + paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog= " + dog);
        System.out.println("cat= " + cat);
        System.out.println("paper= " + paper);
        //Задача 4
        var friend = 19;
        System.out.println("friend= " + friend);
        friend = friend +2;
        System.out.println("friend= " + friend);
        friend = friend / 7;
        System.out.println("friend= " + friend);
        //Задача 5
        var frog = 3.5;
        System.out.println("frog= " + frog);
        frog = frog * 10;
        System.out.println("frog= " + frog);
        frog = frog / 3.5;
        System.out.println("frog= " + frog);
        frog = frog + 4;
        System.out.println("frog= " + frog);
        //Задача 6
        var boxer1Mass = 78.2;
        var boxer2Mass = 82.7;
        var sumOfMass = boxer1Mass + boxer2Mass;
        var diffOfMass = boxer1Mass - boxer2Mass;
        System.out.println("sumOfMass= " + sumOfMass);
        System.out.println("diffOfMass= " + diffOfMass);
        //Задача 7
        diffOfMass = boxer2Mass - boxer1Mass;
        System.out.println("diffOfMass= " + diffOfMass);
        diffOfMass = boxer2Mass % boxer1Mass;
        System.out.println("diffOfMass= " + diffOfMass);
        //Задача 8
        var totalWorkingHours = 640;
        var oneWorkerHours = 8;
        var workerQuantity = totalWorkingHours / oneWorkerHours;
        System.out.println("Всего работников в компании — " + workerQuantity + " человек");
        workerQuantity = workerQuantity + 94;
        totalWorkingHours = workerQuantity * oneWorkerHours;
        System.out.println("Если в компании работает "+workerQuantity+" человек, то всего "+totalWorkingHours+" часов работы может быть поделено между сотрудниками");
    }
}