
package kavitama.ExpressionEvaluator;

import java.util.ArrayList;
import java.util.List;

class Operations{
    public float RoundUptoThreeDecimalPoint(float number){
        float result = number * 1000;
        result = Math.round(result);
        return result / 1000;
    }
    public  float add(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 + num2));
    }
    public  float substract(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 - num2));
    }
    public  float multiply(float num1 ,float num2){
        return RoundUptoThreeDecimalPoint((num1 * num2));
    }
    public  float divide(float num1 ,float num2){
        float result = (num1 / num2) * 100;
        result = Math.round(result);
        return result / 100;
    }
    public double power(float num1, float num2){
        return Math.pow(num1 ,num2);
    }
}
public class ExpEval extends Operations {

    public boolean isOperator(String element){
        return (element.contains("+") || element.endsWith("-") || element.contains("*") || element.contains("/")|| element.contains("^"));
    }
    public float performOperation(List<String> operators , List<Float> operands){
        float result = operands.get(0);
        int i=1;
        for (String operator : operators) {
            switch (operator.charAt(0)){
                case '+':
                    result = add(result ,operands.get(i++));
                    break;
                case '-':
                    result = substract(result ,operands.get(i++));
                    break;
                case '*':
                    result = multiply(result, operands.get(i++));
                    break;
                case '/':
                    result = divide(result, operands.get(i++));
                    break;
                case '^':
                    result = (float)power(result, operands.get(i++));
                    break;
            }
        }
        return result;
    }
    public double evaluateExpression(String expression){
        String[] elements = expression.split(" ");
        List<Float> operands = new ArrayList();
        List<String> operators = new ArrayList();

        for (int i = 0; i <elements.length; i++) {
            if(isOperator(elements[i])) operators.add(elements[i]);
            else
                operands.add(Float.parseFloat(elements[i])) ;
        }

        return performOperation(operators ,operands);
    }
}
