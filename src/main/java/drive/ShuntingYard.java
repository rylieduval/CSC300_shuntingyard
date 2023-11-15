package drive;

public class ShuntingYard {
    public LinkedList Tokens;

    public OutputQueue ReversePolish;

    public ShuntingYard(){
        this.Tokens = new LinkedList();
        this.ReversePolish = new OutputQueue();
    }

    //parse a math expression into a linked list using Shunting Yard algorithm
    //input: the math expression as a string
    //parsed result will stored in ReversePolish
    public void read(String input){
        //to do
    }

    //process use the reverse polish format of expression to process the math result
    //output: the math result of the expression
    public int process(){
        //to do
        throw new Error("waiting for implement");
    }

    
}
