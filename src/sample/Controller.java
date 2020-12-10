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
    private boolean save = false;
    private BigDecimal result;
    private StringBuilder operations = new StringBuilder();
    private StringBuilder displayText = new StringBuilder();

    private void cleanCalc(){
        operations.delete(0, operations.length());
        textField.setText("");
        save = false;
    }

    public void CancleButton() throws Exception {
        cleanCalc();
    }
    public void OneButton() throws Exception{
        if(save) cleanCalc();
        operations.append("1");
        display();
    }
    public void TwoButton() throws Exception{
        if(save) cleanCalc();
        operations.append("2");
        display();
    }
    public void ThreeButton() throws Exception{
        if(save) cleanCalc();
        operations.append("3");
        display();
    }
    public void FourButton() throws Exception{
        if(save) cleanCalc();
        operations.append("4");
        display();
    }
    public void FiveButton() throws Exception{
        if(save) cleanCalc();
        operations.append("5");
        display();
    }
    public void SixButton() throws Exception{
        if(save) cleanCalc();
        operations.append("6");
        display();
    }
    public void SevenButton() throws Exception{
        if(save) cleanCalc();
        operations.append("7");
        display();
    }
    public void EightButton() throws Exception{
        if(save) cleanCalc();
        operations.append("8");
        display();
    }
    public void NineButton() throws Exception{
        if(save) cleanCalc();
        operations.append("9");
        display();
    }
    public void ZeroButton() throws Exception{
        if(save) cleanCalc();
        operations.append("0");
        display();
    }
    public void MultyButton() throws Exception{
        save = false;
        operations.append("*");
        display();
    }
    public void DivideButton() throws Exception{
        save = false;
        operations.append("/");
        display();
    }
    public void MinusButton() throws Exception{
        save = false;
        operations.append("-");
        display();
    }
    public void PlusButton() throws Exception{
        save = false;
        operations.append("+");
        display();
    }
    public void DecimalButton() throws Exception{
        save = false;
        operations.append(".");
        display();
    }
    public void EqualsButton() throws Exception{
        textField.setEditable(false);
        result = new BigDecimal(engine.eval(operations.toString()).toString());
        textField.setText(result.toString());
        operations.delete(0, operations.length());
        operations.append(result);
        save = true;
    }

    private void display() throws ScriptException {
        textField.setText(operations.toString());
    }
}
