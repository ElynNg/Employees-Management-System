package com.vti.frontend;

import com.vti.entity.Account;

public class Main {
    public static void main(String[] args) {
        int menuNumber; //số người dùng nhập trong menu
        boolean exit = false;

        while(!exit){
            menuNumber = Functions.displayMenu();

            while (menuNumber < 1 && menuNumber > 9) {
                System.out.println("Số bạn nhập không có trong menu");
                menuNumber = Functions.displayMenu();
            }

            switch (menuNumber) {
                case 1:
                    Functions.displayListOfExistingStaff();
                    break;
                case 2:
                    displayDepartment(depts);
                    break;
                case 3:
                    displayStaffbyDepartment(staffs, depts);
                    break;
                case 4:
                    addStaff(staffs,depts, managerTitle);
                    //XEM LẠI THÔNG TIN NHÂN VIÊN ĐÃ NHẬP
                    System.out.println("1. Xem danh sách nhân viên hiện có");
                    System.out.println("2. Chỉ xem thông tin nhân viên vừa nhập");
                    System.out.println("3. Thoát");
                    System.out.println("Bạn chọn: ");
                    int checkStaffInformation = input.nextInt();
                    switch (checkStaffInformation) {
                        case 1:
                            displayListOfExistingStaff(staffs);
                            break;
                        case 2:
                            staffs.get(staffs.size()-1).displayInformation();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Nhập lại:");
                            break;
                    }
                    break;
                case 5:
                    searchForStaffByNameOrID(staffs);
                    break;
                case 6:
                    displayAllStaffSalary(staffs);
                    break;
                case 7:
                    displaySalaryInAscending(staffs);
                    break;
                case 8:
                    displaySalaryInDescending(staffs);
                    break;
                case 9:
                    exit = true;
                    break;
            }
        }
    }
    }
}
