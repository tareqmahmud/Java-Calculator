package sample;

import com.udojava.evalex.Expression;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private TextField displayText;

    @FXML
    private Double result;

    @FXML
    void handleOneActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "1";
        displayText.setText(setValue);
    }

    @FXML
    void handleTwoActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "2";
        displayText.setText(setValue);
    }

    @FXML
    void handleThreeActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "3";
        displayText.setText(setValue);
    }

    @FXML
    void handleFourActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "4";
        displayText.setText(setValue);
    }

    @FXML
    void handleFiveActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "5";
        displayText.setText(setValue);
    }

    @FXML
    void handleSixActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "6";
        displayText.setText(setValue);
    }

    @FXML
    void handleSevenActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "7";
        displayText.setText(setValue);
    }

    @FXML
    void handleEightActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "8";
        displayText.setText(setValue);
    }

    @FXML
    void handleNineActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "9";
        displayText.setText(setValue);
    }

    @FXML
    void handleZeroActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        // Add 0 only when there are some previous digits
        if (!oldValue.isEmpty()) {
            String setValue = oldValue + "0";
            displayText.setText(setValue);
        }
    }

    @FXML
    void handleDoubleZeroActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        // Add 0 only when there are some previous digits
        if (!oldValue.isEmpty()) {
            String setValue = oldValue + "00";
            displayText.setText(setValue);
        }
    }

    @FXML
    void handlePointActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        // If there are already .(point) available then don't add another point
        // If isn't only then add a .(point)
        if (!oldValue.contains(".")) {
            String setValue = oldValue + ".";
            displayText.setText(setValue);
        }
    }

    @FXML
    void handleFullClearActionEvent(ActionEvent event) {
        String setValue = "";
        displayText.setText(setValue);
    }

    @FXML
    void handleClearActionEvent(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = this.removeLastCharacter(oldValue);
        displayText.setText(setValue);
    }

    @FXML
    void handlePlusActionOperator(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "+";
        displayText.setText(setValue);
    }

    @FXML
    void handleMinusActionOperator(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "-";
        displayText.setText(setValue);
    }

    @FXML
    void handleProductsActionOperator(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "x";
        displayText.setText(setValue);
    }

    @FXML
    void handleDividesActionOperator(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "/";
        displayText.setText(setValue);
    }

    @FXML
    void handlePercentActionOperator(ActionEvent event) {
        String oldValue = displayText.getText();
        String setValue = oldValue + "%";
        displayText.setText(setValue);
    }

    @FXML
    void handleEqualsActionOperator(ActionEvent event) {
        String calculationString = displayText.getText();
        calculationString = calculationString.replace("x", "*");
        Expression expression = new Expression(calculationString);
        this.result = expression.eval().doubleValue();
        if (this.result % 1 == 0 && this.result < 999999999) {
            displayText.setText(String.format("%.0f", this.result));
        } else if (this.result % 1 == 0 && this.result > 999999999) {
            displayText.setText(String.valueOf(this.result));
        } else {
            displayText.setText(String.valueOf(this.result));
        }
    }

    /**
     * Remove last character from a string
     *
     * @param string [Pass the original String]
     * @return String
     */
    private String removeLastCharacter(String string) {
        if (!string.isEmpty()) {
            return string.substring(0, string.length() - 1);
        }
        return string;
    }
}
