
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
 
public class CalculatorController {
    @FXML private Label result;
    private long n1 = 0;
    private String operator = "";
    private boolean start = true;
    private Model model = new Model();
    
    @FXML protected void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML protected void processOperators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!value.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }

            operator = value;
            n1 = Long.parseLong(result.getText());
            result.setText("");
        }
        else {
            if (operator.isEmpty()) {
                return;
            }

            long n2 = Long.parseLong(result.getText());
            float output = model.calculate(n1, n2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
}
