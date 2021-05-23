package com.maheshalladi;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class zohoMain {
    public static void main(String[] args) {
        ArrayList<zohoClass> database = new ArrayList<>();
        database.add(new zohoClass(1, "n1", 11, "d1", "deg1", "r1"));
        database.add(new zohoClass(2, "n2", 22, "d2", "deg2", "n1"));
        database.add(new zohoClass(3, "n3", 33, "d3", "deg3", "n1"));
        database.add(new zohoClass(4, "n4", 44, "d4", "deg4", "n1"));
        database.add(new zohoClass(5, "n5", 55, "d5", "deg5", "n2"));
        database.add(new zohoClass(6, "n6", 66, "d6", "deg6", "n5"));
        database.add(new zohoClass(7, "n7", 77, "d7", "deg7", "n3"));
        database.add(new zohoClass(8, "n8", 88, "d8", "deg8", "n4"));
        database.add(new zohoClass(9, "n9", 99, "d9", "deg9", "n8"));
        database.add(new zohoClass(10, "n10", 101, "d10", "geg10", "n8"));
        //printDatabase(database);
        //searchRecords( database);
        //managerReport(database);
        System.out.println("If you give me the base name and i will give you the next level reporter to lead:");
        System.out.println("Give me the  name and i will give you the reporter to be");

        Scanner input = new Scanner(System.in);
        String n = input.next();
        reportingToTree(database, n);
    }

    public static void
    printDatabase(ArrayList<zohoClass> database) {
        System.out.printf("\n");
        System.out.printf("%3s %10s %5s %15s %10s %15s", "Name", "Id", "Age", "Department", "Designation", "ReportingTo");
        System.out.printf("\n");
        for (zohoClass data : database) {
            System.out.
                    printf("%3d %10s %5d %15s %10s %15s",
                            data.getId(), data.getName(), data.getAge(), data.getDepartment(), data.getDesignation(), data.getReportingTo());
            System.out.println();
        }
    }

    public static void searchRecords(ArrayList<zohoClass> database) {

        while (true) {
            System.out.println("1.Id 2.Name 3.Age 4.Department 5.Designation 6.ReprotingTo");
            Scanner input = new Scanner(System.in);
            int searchInput = input.nextInt();
            if (searchInput > 6 && searchInput < 1) {
                System.out.println("INVALID!!!!...");
            }
            switch (searchInput) {
                case (1): {
                    System.out.println("please enter id:");
                    int seachId = input.nextInt();
                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).getId() == seachId) {
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }
                    }
                    break;
                }

                case (2): {
                    System.out.println("please enter name:");
                    String sName = input.next();
                    //System.out.println(sName);
                    //String s=sName.charAt(0)+""+sName.charAt(1);
                    //System.out.println(s);
                    for (int i = 0; i < database.size(); i++) {
                        //System.out.println(sName);
                        //System.out.println(database.get(i).getName());
                        //System.out.println(database.get(i).getName()=="n1");
                        //System.out.println(sName=="n1");


                        if (database.get(i).getName().equals(sName)) {
                            //System.out.print(i);
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }

                    }
                    break;
                }
                case (3): {
                    System.out.println("please enter Age:");
                    int seachAge = input.nextInt();
                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).getAge() == seachAge) {
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }

                    }
                    break;
                }
                case (4): {
                    System.out.println("please enter Department:");
                    String seachDep = input.next();
                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).getDepartment().equals(seachDep)) {
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }

                    }
                    break;
                }

                case (5): {
                    System.out.println("please enter Designation:");
                    String seachDeg = input.next();
                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).getDesignation().equals(seachDeg)) {
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }

                    }
                    break;
                }
                case (6): {
                    System.out.println("please enter Repoarting to:");
                    String seachRT = input.next();
                    for (int i = 0; i < database.size(); i++) {

                        if (database.get(i).getReportingTo().equals(seachRT)) {
                            System.out.printf("%3s %10s %5s %15s %10s %15s", "Id", "Name", "Age", "Department", "Designation", "ReportingTo");
                            System.out.printf("\n");
                            System.out.printf("%3d %10s %5d %15s %10s %15s",
                                    database.get(i).getId(), database.get(i).getName(),
                                    database.get(i).getAge(), database.get(i).getDepartment(),
                                    database.get(i).getDesignation(), database.get(i).getReportingTo());
                            System.out.printf("\n");
                        }

                    }

                }
                break;
            }

            break;
        }
    }


    public static void managerReport(ArrayList<zohoClass> database) {

        System.out.println("You are in manager report:");

        System.out.println("Give me the desidnation name and i will give you the reporter to be");

        Scanner input = new Scanner(System.in);
        String ded = input.next();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getDesignation().equals(ded)) {
                System.out.println("your reporting manager is ;" + database.get(i).getReportingTo());
            }
        }

    }

    public static void reportingToTree(ArrayList<zohoClass> database, String n) {


        int i = 0;
        int z;
        while (i < 10) {
            if (database.get(i).getName().equals(n)) {
                // System.out.println(i+"for");
                System.out.println("name: " + database.get(i).getName() + " reporting to :" + database.get(i).getReportingTo());
                z = i;
                break;
            } else {
                i = i + 1;
                //String x1=database.get(i).getReportingTo();

            }

        }

        z=i;
        if(database.get(z).getReportingTo()!="r1") {
            reportingToTree(database, database.get(z).getReportingTo());
        }
    }
}








