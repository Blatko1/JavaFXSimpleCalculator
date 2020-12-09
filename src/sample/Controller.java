package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button basta;
    private float currentNum;
    private StringBuilder operations = new StringBuilder();

    public void CancleButton() throws Exception {

    }
    public void OneButton() throws Exception{
        operations.append("1");
    }
    public void TwoButton() throws Exception{

    }
    public void ThreeButton() throws Exception{

    }
    public void FourButton() throws Exception{

    }
    public void FiveButton() throws Exception{

    }
    public void SixButton() throws Exception{

    }
    public void SevenButton() throws Exception{

    }
    public void EightButton() throws Exception{

    }
    public void NineButton() throws Exception{

    }
    public void ZeroButton() throws Exception{

    }
    public void MultyButton() throws Exception{

    }
    public void DivideButton() throws Exception{

    }
    public void MinusButton() throws Exception{

    }
    public void PlusButton() throws Exception{
        currentNum = operations
    }
    public void DecimalButton() throws Exception{

    }
    public void EqualsButton() throws Exception{
        float result = Integer.parseInt(operations.toString());
        System.out.println(result);
        operations.delete(0, operations.length());
    }
}
