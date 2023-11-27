package drive;

public class ShuntingYard {
    public LinkedList Tokens;

    public OutputQueue ReversePolish;

    public ShuntingYard(){
        this.Tokens = new LinkedList();
        this.ReversePolish = new OutputQueue();
    }

    public void parse(String input){
        String numbers = "0123456789";
		String temp = "";
	
	for (int i = 0; i < input.length(); i++)
	{
	if (numbers.indexOf(input.charAt(i)) >= 0)
	{
		temp+= input.charAt(i);
	}
	else 
	{
		if (temp.length() > 0)
		{
			this.Tokens.append(temp);
		}
		
		temp = "";
		this.Tokens.append(Character.toString(input.charAt(i)));
	}
	}
	if (temp != null && temp.length() > 0)
	{
		this.Tokens.append(temp)
	}
}

    public void process()
    {
    OpStack operatorStack = new OpStack();
    Node current = this.Tokens.Head;

    while (current != null) {
        char currentChar = current.Data.charAt(0);

        if (currentChar == '(') {
            operatorStack.push(current.Data);
        } else if (currentChar == ')') {
            while (!operatorStack.isEmpty() && operatorStack.peek().Data.charAt(0) != '(') {
                queue.enqueue(operatorStack.pop().Data);
            }

            if (!operatorStack.isEmpty() && operatorStack.peek().Data.charAt(0) == '(') {
                operatorStack.pop();
            }
        } else if (isOperator(currentChar)) {
            if (currentChar == '+' || currentChar == '-') {
                while (!operatorStack.isEmpty() && (operatorStack.peek().Data.charAt(0) == '*' || operatorStack.peek().Data.charAt(0) == '/')) {
                    this.queue.enqueue(operatorStack.pop().Data);
                }
            }
            operatorStack.push(current.Data);
        } else {
            this.queue.enqueue(current.Data);
        }

        current = current.NextNode;
    }

    while (!symbs.isEmpty()) {
        queue.enqueue(symbs.pop().Data);
    }
    }
    
    public int run(){
        OpStack tempstack = new OpStack();
        String temp;
        String s = "*+/-";
        int x;
        int y;
        while(!ReversePolish.isEmpty()) {
	temp = ReversePolish.dequeue().Data;
	if(temp.indexOf(s) >= 0) {
		x = Integer.parseInt(tempstack.pop().Data);
		y = Integer.parseInt(tempstack.pop().Data);
	switch (temp.charAt(0)) {
	    case '*':
		x = y * x;
		break;
	    case '/':
		x = y / x;
		break;
	    case '+':
		x = y + x;
		break;
	    case '-':
		x = y - x;
		break;
	    default:
		break;
	}
		tempstack.push(Integer.toString(x));
	} else {
		tempstack.push(temp);
	}
}
        return Integer.parseInt(tempstack.pop().Data);
    }  
}
