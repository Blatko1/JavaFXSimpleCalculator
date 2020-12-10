package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Controller {

    public Button basta;
    public TextField textField;
    private float currentNum = 0;
    private float result;
    private StringBuilder operations = new StringBuilder();

    public void CancleButton() throws Exception {
        currentNum = 0;
        operations.delete(0, operations.length());
    }
    public void OneButton() throws Exception{
        operations.append("1");
    }
    public void TwoButton() throws Exception{
        operations.append("2");
    }
    public void ThreeButton() throws Exception{
        operations.append("3");
    }
    public void FourButton() throws Exception{
        operations.append("4");
    }
    public void FiveButton() throws Exception{
        operations.append("5");
    }
    public void SixButton() throws Exception{
        operations.append("6");
    }
    public void SevenButton() throws Exception{
        operations.append("7");
    }
    public void EightButton() throws Exception{
        operations.append("8");
    }
    public void NineButton() throws Exception{
        operations.append("9");
    }
    public void ZeroButton() throws Exception{
        operations.append("0");
    }
    public void MultyButton() throws Exception{

    }
    public void DivideButton() throws Exception{

    }
    public void MinusButton() throws Exception{

    }
    public void PlusButton() throws Exception{
        operations.append("+");
     /*   result = currentNum + Float.parseFloat(operations.toString());
        currentNum = result;
        operations.delete(0, operations.length());*/
    }
    public void DecimalButton() throws Exception{
        operations.append(".");
    }
    public void EqualsButton() throws Exception{
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println(engine.eval(operations.toString()));
      //  textField.setText(Float.toString(result));
        operations.delete(0, operations.length());
    }
}
