package sample;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.util.ArrayList;
public class Controller {
    ArrayList<String> numberArray = new ArrayList<>();
    private int sum;


    @FXML

    private TextField talDisplay;


    }

    public void EqualsMethod(ActionEvent actionEvent) {
        String a = talDisplay.getText();
        numberArray.add(s);
        talDisplay.clear();

        for (String number: numberArray) {
            System.out.println(number);

        }
        talDisplay.setText(Integer.toString(sum));

    }

    public void Plusmethod(ActionEvent actionEvent) {
        String a = talDisplay.getText();
        numberArray.add(s);
        talDisplay.clear();

        System.out.println("s er nu tilføjet i arraylisten numberArray" ) + numberArray.toString;

    }
    public void testUdskrift (ActionEvent actionEvent) {
        System.out.println("Testen virkede");
    }
}
