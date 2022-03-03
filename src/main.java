import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FormData formdata = new FormData();
        formdata.addMount();
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        stepTracker.hello();
        stepTracker.createMap();
        //TestMount.testMap(); // тестовая табличка testMount надо раскомментировать
        // 94000 общее 8545 среднее случшая серия больше "10 000" 3,

        while (true) {
            stepTracker.menu();
            String select = scanner.next();

            if (select.equals("1")) {
                System.out.println("Введите месяц за который хотите ввести коллличество щагов например: Январь" );
                String mountStep = scanner.next();

                if (formdata.chekData(mountStep)) {

                    System.out.println("Введите день за который хотите ввести коллличество щагов");

                    String daytStepSеring = scanner.next();
                    int daytStep = 0;

                    try {
                        daytStep = Integer.parseInt(daytStepSеring);
                    } catch (NumberFormatException nfe) {
                        System.out.println("День введен неверно");
                    }

                    if (daytStep < 31 && daytStep > 0) {
                        System.out.println("нет такого дня в месяце");
                        continue;
                    }

                    System.out.println("Ввесдите колличество шагов пройденных в этот день числом напримр: 10000");
                    String stepsThatDay = scanner.next();

                    try {
                        if (Integer.parseInt(stepsThatDay)>0) {
                            stepTracker.insertStep(mountStep, daytStep, Integer.parseInt(stepsThatDay));
                        } else {
                            System.out.println("Ошибка. Вы ввели отрицательное значение");
                        }
                    } catch (NumberFormatException nfe) {
                        System.out.println("Шаги введены неверно");
                    }
                } else {
                    System.out.println("не верный ввод или формат месяца");

                }

            } else if (select.equals("2")) {
                System.out.println("За какой месяц напечатать статистику?");
                String mountPrint = scanner.next();

                if (formdata.chekData(mountPrint)) {
                    stepTracker.printStat(mountPrint);
                } else {
                    System.out.println("не верный ввод или формат месяца");
                }

            } else if (select.equals("3")) {
                System.out.println("Введите новую цель в шагах");
                String newTarget = scanner.next();

                try{
                    if (Integer.parseInt(newTarget)>0) {
                        stepTracker.changetargetStep(Integer.parseInt(newTarget));
                    } else {
                        System.out.println("Цель не может быть отрицательной");
                    }
                } catch (NumberFormatException nfe)
                {
                    System.out.println("Цель определена неверно");
                }

            } else if (select.equals("0")) {
                break;

            } else {
                System.out.println("Введена неверная комманда");
            }//иначе начинает занаво



        }
    }
}
