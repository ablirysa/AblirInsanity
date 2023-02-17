import java.util.*;

public class Hole {
    private ArrayList<Integer> red = new ArrayList<Integer>();
    private ArrayList<Integer> blue = new ArrayList<Integer>();
    private ArrayList<Integer> open = new ArrayList<Integer>();

    public Hole() {
        for (int i = 0; i <= 3; i++) {
            red.add(i);
        }
        for (int i = 6; i <= 9; i++) {
            blue.add(i);
        }
        for (int i = 4; i <= 5; i++) {
            open.add(i);
        }
    }

    public String whoIsHere(int place) {
        if (isAtLocation("red", place)) {
            return "R";
        } else if (isAtLocation("blue", place)) {
            return "B";
        } else {
            return "O";
        }
    }

    public boolean moveRed(int orig, int place) {
        if (place == orig + 1 || place == orig + 2) {
            if (isAtLocation("red", orig) && isAtLocation("open", place)) {
                for (int i = 0; i < red.size(); i++) {
                    if (red.get(i) == orig) {
                        red.remove(i);
                    }
                }
                red.add(place);
                return true;
            }
        }
        return false;
    }

    public boolean moveBlue(int orig, int place) {
        if (place == orig + 1 || place == orig + 2) {
            if (isAtLocation("blue", orig) && isAtLocation("open", place)) {
                for (int i = 0; i < blue.size(); i++) {
                    if (blue.get(i) == orig) {
                        blue.remove(i);
                    }
                }
                blue.add(place);
                return true;
            }
        }
        return false;
    }

    private boolean isAtLocation(String type, int place) {
        if (type == "red") {
            for (int r : red) {
                if (place == r) {
                    return true;
                }
            }
            return false;
        } else if (type == "blue") {
            for (int b : blue) {
                if (place == b) {
                    return true;
                }
            }
            return false;
        } else {
            for (int o : open) {
                if (place == o) {
                    return true;
                }
            }
            return false;
        }
    }
}
