function evaluateMath(str) {
 str = str.replace(/ /g, "") + ")";

  function primary() {
    if (str[0] == '(') {
      str = str.substr(1);
      return whatExpression();
    }
    var n = /^[-+]?\d*\.?\d*/.exec(str)[0];
    str = str.substr(n.length);
    return +n;
  }

function whatExpression() {
  var a = primary();
  for (; ;) {
    var operator = str[0];
    str = str.substr(1);

    if (operator == ')') {
      return a;
    }
    var b = primary();
    a = (operator == '+') ? a + b :
        (operator == '-') ? a - b :
        (operator == '*') ? a * b :
                            a / b;
  }
}
return whatExpression();
}

function MathChallenge(str) {
	
  // code goes here  
  let inputString = str, leftPar, rightPar, parString, result, tempLeftParVal, tempRightParVal;

  for (let i = 0; i < inputString.length; i++) {
    if (inputString[i] === '(') {
      tempLeftParVal = '';
      leftPar = i;
      if (inputString[leftPar - 1] !== undefined && inputString[leftPar - 1] !== ')' && inputString[leftPar - 1] !== '+' && inputString[leftPar - 1] !== '-' && inputString[leftPar - 1] !== '*' && inputString[leftPar - 1] !== '/') {
        tempLeftParVal = inputString[leftPar - 1];
      }
    }
    if (inputString[i] === ')') {
      tempRightParVal = '';
      rightPar = i;
      parString = inputString.slice(leftPar + 1, rightPar);
      result = eval(parString);

      if (tempLeftParVal !== '') {
        result = result * tempLeftParVal
      }
      if (inputString[rightPar + 1] !== undefined && inputString[rightPar + 1] !== '(' && inputString[rightPar + 1] !== '+' && inputString[rightPar + 1] !== '-' && inputString[rightPar + 1] !== '*' && inputString[rightPar + 1] !== '/') {
        result = result * parseInt(inputString[rightPar + 1]);
        tempRightParVal = inputString[rightPar + 1];
      }
      if (tempLeftParVal !== '' && tempRightParVal !== '') {
        inputString = inputString.substring(0, leftPar - 1) + result + inputString.substring(rightPar + 2);
        i = i - ((rightPar + 2) - (leftPar - 1));
      }
      else if (tempLeftParVal !== '') {

        inputString = inputString.substring(0, leftPar - 1) + result + inputString.substring(rightPar + 1);

        i = i - ((rightPar + 1) - (leftPar - 1));
      }
      else if (tempRightParVal !== '') {

        inputString = inputString.substring(0, leftPar) + result + inputString.substring(rightPar + 2);

        i = i - ((rightPar + 2) - leftPar);
      }
      else {
        inputString = inputString.substring(0, leftPar) + result + inputString.substring(rightPar + 1);
        i = i - ((rightPar + 1) - leftPar);
      }
    }
  }
  
  return evaluateMath(inputString);

}


console.log(MathChallenge("6*(4/2)+3*1"));