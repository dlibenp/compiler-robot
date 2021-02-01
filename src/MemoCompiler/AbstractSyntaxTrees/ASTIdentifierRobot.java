/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.AbstractSyntaxTrees;

/**
 *
 * @author orisha
 */
public class ASTIdentifierRobot extends ASTIdentifier{

    public ASTIdentifierRobot(String lexeme, int entry, int line) {
        super(lexeme, entry, line);
    }

    @Override
    public Object Visit(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
