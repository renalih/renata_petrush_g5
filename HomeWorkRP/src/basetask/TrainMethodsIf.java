package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int backInt) {
        if (backInt < 8) {
            return backInt * 7;
        } else {
            return backInt / 4;
        }
    }

    public long returnNewLong(long backLong) {
        if (backLong > 300) {
            return backLong - 300;
        } else {
            return backLong + 20;
        }
    }

    public String returnNewChar(char backChar) {
        if (backChar == 'g') {
            return "go";
        } else {
            String strChar = "o" + Character.toString(backChar);
            return strChar;
        }
    }

    public float returnNewFloat(float backFloat) {
        if (backFloat != 0.67) {
            return backFloat * 2;
        } else {
            return backFloat;
        }
    }

    public double returnNewDouble(double backDouble) {
        if (30 < backDouble && backDouble < 80) {
            return backDouble + 87;
        }

        if (80 < backDouble && backDouble < 400) {
            return backDouble - 87;
        }

        if (backDouble > 400) {
            return backDouble / 4;
        }

        return backDouble;
    }

    public void returnNewBoolean(boolean backBoolean) {

        if (backBoolean == true) {
            System.out.println("Я получил на вход значение истины");

        } else {
            System.out.println("Я получил на вход ложь");
        }


    }
}

