package sample;

import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

public class Controller {

    private ScriptEngineManager mgr = new ScriptEngineManager();
    private ScriptEngine engine = mgr.getEngineByName("JavaScript");

    public TextField textField;
    private BigDecimal result;
    private StringBuilder operations = new StringBuilder();
    private StringBuilder displayText = new StringBuilder();

    public void CancleButton() throws Exception {
        operations.delete(0, operations.length());
        textField.setText("");
    }
    public void OneButton() throws Exception{
        operations.append("1");
        display();
    }
    public void TwoButton() throws Exception{
        operations.append("2");
        display();
    }
    public void ThreeButton() throws Exception{
        operations.append("3");
        display();
    }
    public void FourButton() throws Exception{
        operations.append("4");
        display();
    }
    public void FiveButton() throws Exception{
        operations.append("5");
        display();
    }
    public void SixButton() throws Exception{
        operations.append("6");
        display();
    }
    public void SevenButton() throws Exception{
        operations.append("7");
        display();
    }
    public void EightButton() throws Exception{
        operations.append("8");
        display();
    }
    public void NineButton() throws Exception{
        operations.append("9");
        display();
    }
    public void ZeroButton() throws Exception{
        operations.append("0");
        display();
    }
    public void MultyButton() throws Exception{
        operations.append("*");
        display();
    }
    public void DivideButton() throws Exception{
        operations.append("/");
        display();
    }
    public void MinusButton() throws Exception{
        operations.append("-");
        display();
    }
    public void PlusButton() throws Exception{
        operations.append("+");
        display();
    }
    public void DecimalButton() throws Exception{
        operations.append(".");
        display();
    }
    public void EqualsButton() throws Exception{
        textField.setEditable(false);
        result = new BigDecimal(engine.eval(operations.toString()).toString());
        textField.setText(result.toString());
        operations.delete(0, operations.length());
        operations.append(result);
    }

    private void display() throws ScriptException {
        textField.setText(operations.toString());
    }
}
