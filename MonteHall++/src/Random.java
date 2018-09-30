
public class Random {

    static int openDoor;

    public static int No1To4() {
        return openDoor = (int) (Math.random() * 3) + 2;
    }

    public static int No1No2To4() {
        return openDoor = (int) (Math.random() * 2) + 3;
    }

    public static int No1No3To4() {
        openDoor = (int) (Math.random() * 2) + 1;
        if (openDoor == 1) {
            return openDoor = 2;
        } else {
            return openDoor = 4;
        }
    }

    public static int No1No4To4() {
        return openDoor = (int) (Math.random() * 2) + 2;
    }

    public static int No2To4() {
        openDoor = (int) (Math.random() * 3) + 2;
        if (openDoor == 2) {
            openDoor = 1;
        }
        return openDoor;
    }

    public static int No2No3To4() {
        openDoor = (int) (Math.random() * 2) + 1;
        if (openDoor == 2) {
            openDoor = 4;
        }
        return openDoor;
    }

    public static int No2No4To4() {
        openDoor = (int) (Math.random() * 2) + 1;
        if ( openDoor == 2) {
             openDoor = 3;
        }
        return openDoor;
    }

    public static int No3To4() {
        openDoor = (int) (Math.random() * 3) + 1;
        if (openDoor == 3) {
            openDoor = 4;
        }
        return openDoor;
    }
    public static int No3No4To4(){
        return openDoor = (int) (Math.random() * 2) + 1;
    }

    public static int No4to4() {
        return openDoor = (int) (Math.random() * 3) + 1;
    }
}
