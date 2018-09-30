
public class openDoorCalcPlus {
    static int openDoor;
    static public int openDoor(int choice, int winDoor) {
        switch (choice) {
            case 1:
                switch (winDoor) {
                    case 1:
                        openDoor = Random.No1To4();
                        break;
                    case 2:
                        openDoor = Random.No1No2To4();
                        break;
                    case 3:
                        openDoor = Random.No1No3To4();
                        break;
                    case 4:
                        openDoor = Random.No1No4To4();
                        break;
                }
                break;

            case 2:
                switch (winDoor) {
                    case 1:
                        openDoor = Random.No1No2To4();
                        break;
                    case 2:
                        openDoor = Random.No2To4();
                        break;
                    case 3:
                        openDoor = Random.No2No3To4();
                        break;
                    case 4:
                        openDoor = Random.No2No4To4();
                        break;
                }
                break;

            case 3:
                switch (winDoor) {
                    case 1:
                        openDoor = Random.No1No3To4();
                        break;
                    case 2:
                        openDoor = Random.No2No3To4();
                        break;
                    case 3:
                        openDoor = Random.No3To4();
                        break;
                    case 4:
                        openDoor = Random.No3No4To4();
                        break;
                }
                break;

            case 4:
                switch (winDoor) {
                    case 1:
                        openDoor = Random.No1No4To4();
                        break;
                    case 2:
                        openDoor = Random.No2No4To4();
                        break;
                    case 3:
                        openDoor = Random.No3No4To4();
                        break;
                    case 4:
                        openDoor = Random.No4to4();
                        break;
                }
        }
        return openDoor;
    }
}
