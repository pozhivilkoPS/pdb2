package pack;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {
        ReceiveMagazineChanger changer = new ReceiveMagazineChanger();
        changer.changeRecord();

    }

}
