package hospital;

import java.util.Scanner;

public class Hospital {
    public static void open(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин");
        String name;
        String surname;
        String id;
        String login = scan.nextLine();
        String[] table1 = new String[50];
        String[] table2 = new String[50];
        String[] table3 = new String[50];
        String [] hostages = new String[50];
        switch (login){
            case "Admin":
                int z =0;
                do{
                    System.out.println("Вы вошли, как администратор");
                    System.out.println("Выберите дальнейшее действие");
                    System.out.println("Зарегистрировать пациента введите - 1");
                    System.out.println("Записать пациента к врачу введите - 2");
                    System.out.println("Для выхода введи- 3");
                    int x = scan.nextInt();
                    if (x == 1) {
                        int h = 1;
                        for(h=1; h<50; h++){
                            int n=0;
                            do{
                            System.out.println("Введите имя пациента");
                            name = scan.nextLine();
                            System.out.println("Введите фамилию");
                            surname = scan.nextLine();
                            System.out.println("Введите логин из букв");
                            id = scan.nextLine();

                            hostages[h] = new Hostage();
                            hostages[h].setSurname(name);
                            hostages[h].setSurname(surname);
                            hostages[h].getLogin(login);
                            n++;
                            }while(n<1);
                            System.out.println("Пользователь успешно зарегистрирован");
                            break;
                        }
                    } else if (x == 2) {
                        System.out.println("Выберите врача");
                        System.out.println("Doc1 - введите 1");
                        System.out.println("Doc2 - введите 2");
                        System.out.println("Doc3 - введите 3");
                        int list = scan.nextInt();
                        if(list==1){
                            int h =1;
                            for(h=1;h<50;h++){
                                int n=0;
                                int year;
                                do{
                                    System.out.println("Введите год приёма");
                                    year = scan.nextInt();
                                    table1[h].setYear(year);
                                }while(year>2020||year<2019);
                                break;
                            }
                        } else if(list==2){

                        } else if (list==3){

                        }
                    } else if (x == 3) {
                        System.out.println("Вы вышли из системы");
                    }
                    z++;
                } while(z<1);
                break;

            case "Maindoctor":
                int a = 0;
                do{
                System.out.println("Вы вошли, как Главный врач");
                System.out.println("Выберите дальнейшее действие");
                System.out.println("Для просмотра пациентов Доктора1 введите - 1");
                System.out.println("Для просмотра пациентов Доктора2 введите - 2");
                System.out.println("Для просмотра пациентов Доктора3 введите - 3");
                System.out.println("Для выхода введи- 4");
                int x = scan.nextInt();
                if(x==1){
                    Doctor_1.gerTable1(table1);
                } else if(x==2){
                    Doctor_2.gerTable2(table2);
                } else if(x==3){
                    Doctor_3.gerTable3(table3);
                } else if(x==4){
                    System.out.println("Вы вышли из системы");
                } a++;
                } while (a<1);
                break;

            case "Doc1":
                int b = 0;
                do{
                    System.out.println("Вы вышли, как Доктор1");
                    System.out.println("Выберите дальнейшее действие");
                    System.out.println("Для просмотра пациентов - 1");
                    System.out.println("Для выхода введи - 2");
                    int x = scan.nextInt();
                    if(x==1){
                        Doctor_1.gerTable1(table1);
                }else if(x==2){
                        System.out.println("Вы вышли из системы");
                    } b++;
                } while (b<1);
                break;
            case "Doc2":
                int c = 0;
                do{
                    System.out.println("Вы вышли, как Доктор2");
                    System.out.println("Выберите дальнейшее действие");
                    System.out.println("Для просмотра пациентов - 1");
                    System.out.println("Для выхода введи - 2");
                    int x = scan.nextInt();
                    if(x==1){
                        Doctor_2.gerTable2(table2);
                    }else if(x==2){
                        System.out.println("Вы вышли из системы");
                    } c++;
                } while (c<1);
                break;
            case "Doc3":
                int v = 0;
                do{
                    System.out.println("Вы вышли, как Доктор3");
                    System.out.println("Выберите дальнейшее действие");
                    System.out.println("Для просмотра пациентов - 1");
                    System.out.println("Для выхода введи - 2");
                    int x = scan.nextInt();
                    if(x==1){
                        Doctor_3.gerTable3(table3);
                    }else if(x==2){
                        System.out.println("Вы вышли из системы");
                    } v++;
                } while (v<1);
                break;
        }
        System.out.println("Конец сессии");
    }
}
