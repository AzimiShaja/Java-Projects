import java.util.Random;
import java.util.Scanner;

public class BookingHotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floorSize = 5;
        int roomSize = 9;

        int[][] hotel = new int[floorSize][roomSize];

        fullOrFree(hotel);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to the Hotel Reservation System");
        System.out.println("----------------------------------------------------------------");

        int option;

        do {
            System.out.println("1) Current Hotel Plan");
            System.out.println("2) Book a Room");
            System.out.println("3) Find First free Room ");
            System.out.println("4) Free a room");
            System.out.println("5) Find three consecutive rooms");
            System.out.println("6) Total Occupied Rooms");
            System.out.println("7) Total Free Rooms");
            System.out.println("0) Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose an option");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println("**Reminder: \nX stands for Occupied room ");
                    System.out.println("O stands for free room");
                    System.out.println("-------------------------------------------");
                    System.out.println("Hotel's Current Floor Plan :\n");
                    printPlan(hotel);
                    break;
                case 2:
                    System.out.println("Enter a the floor number (1-" + hotel.length + "): ");
                    int floorNo = sc.nextInt() - 1;
                    System.out.println("Rooms on floor [" + (floorNo + 1) + "] :");
                    for (int i = 0; i < hotel[floorNo].length; i++) {
                        if (hotel[floorNo][i] == 0) {
                            System.out.println("Room  [" + (i + 1) + "]  is Free");
                        } else {
                            System.out.println("Room  [" + (i + 1) + "]  is Full");
                        }
                    }
                    System.out.print("\nEnter a room number to book (1-" + hotel[floorNo].length + "): ");
                    int roomNumber = sc.nextInt() - 1;
                    bookAroom(hotel, floorNo, roomNumber);
                    break;
                case 3:
                    fristFree(hotel);
                    break;
                case 4:
                    System.out.println("Enter the floor number : ");
                    int freeFloor = sc.nextInt() - 1;
                    for (int i = 0; i < hotel[freeFloor].length; i++) {
                        if (hotel[freeFloor][i] == 0) {
                            System.out.println("Room  [" + (i + 1) + "]  is Free");
                        } else {
                            System.out.println("Room  [" + (i + 1) + "]  is Full");
                        }
                    }
                    System.out.println("Enter the room number you want to free: ");
                    int freeRoom = sc.nextInt() - 1;
                    freeARoom(hotel, freeFloor, freeRoom);
                    break;
                case 5:
                    findThree(hotel);
                    break;
                case 6:
                    int occupied = countRooms(hotel);
                    System.out.println("There are " + occupied + " Occupied rooms in Hotel\n");
                    break;
                case 7:
                    int free = CountFree(hotel);
                    System.out.println("There are " + free + " Free rooms in hotel\n");
                default:
                    System.out.println("Enter a vaild option!!");
                    break;

            }

        } while (option != 0);
        System.out.println("Thanks for choosing Us! ");
        System.out.println("See you Soon!");

    }

    public static void fullOrFree(int[][] hotel) {
        Random r = new Random();
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                hotel[i][j] = r.nextInt(2);
            }
        }

    }

    public static void printPlan(int[][] floorPlan) {

        for (int i = 0; i < floorPlan.length; i++) {
            System.out.print("\nFloor " + (i + 1) + " :");
            for (int j = 0; j < floorPlan[i].length; j++) {
                if (floorPlan[i][j] == 0) {
                    System.out.print("[O]  ");
                } else {
                    System.out.print("[X]  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void bookAroom(int[][] hotel, int floorNumber, int roomNo) {

        if (hotel[floorNumber][roomNo] == 0) {
            hotel[floorNumber][roomNo] = 1;
            System.out.println("The room [" + (roomNo + 1) +
                    "]  on floor  [" + (floorNumber + 1) + "]  has been booked.");
            System.out.println("----------------------------------------------------------------\n");
            System.out.println("Hotel's Floor Plan after booking :\n");
            printPlan(hotel);
        } else {
            System.out.println("This room is already occupied.");
            System.out.println("----------------------------------------------------------------\n");
        }

    }

    public static void freeARoom(int[][] freeRoom, int FloorNo, int RoomNo) {

        if (freeRoom[FloorNo][RoomNo] == 1) {
            freeRoom[FloorNo][RoomNo] = 0;
            System.out.println(
                    "You have Vacated the room [" + (RoomNo + 1) + "] on floor " + (FloorNo + 1) + " Successfully");
            System.out.println("----------------------------------------------------------------");
        } else {
            System.out.println("This room is already free.");
            System.out.println("----------------------------------------------------------------");
        }

    }

    public static void findThree(int[][] three) {
        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three[i].length - 2; j++) {
                if (three[i][j] == 0 && three[i][j + 1] == 0 && three[i][j + 2] == 0) {
                    System.out.println("Room No. [" + (j + 1) + "] , [" + (j + 2) + "] ,[" + (j + 3)
                            + "] are free rooms in floor [" + (i + 1) + "]");
                    return;
                }
            }
        }
        System.out.println("There are no free consecuitve rooms available at the moment.");
    }

    public static int countRooms(int[][] occupied) {

        int counter = 0;
        for (int i = 0; i < occupied.length; i++) {
            for (int j = 0; j < occupied[i].length; j++) {
                if (occupied[i][j] == 1) {
                    counter++;
                }
            }

        }

        return counter;
    }

    public static int CountFree(int[][] free) {
        int countFree = 0;
        for (int i = 0; i < free.length; i++) {
            for (int j = 0; j < free[i].length; j++) {
                if (free[i][j] == 0) {
                    countFree++;

                }

            }
        }
        return countFree;
    }

    public static void fristFree(int[][] firstFree) {
        for (int i = 0; i < firstFree.length; i++) {
            for (int j = 0; j < firstFree[i].length; j++) {
                if (firstFree[i][j] == 0) {
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("The free room found on floor [" + (i + 1) + "] room [" + (j + 1) + "]");
                    System.out.println("----------------------------------------------------------------------");
                    return;
                }
            }
        }

    }

}