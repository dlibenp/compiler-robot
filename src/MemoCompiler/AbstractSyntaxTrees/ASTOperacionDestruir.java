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
public class ASTOperacionDestruir extends ASTInstruction{
    private ASTIdentifier id;

    public ASTOperacionDestruir(ASTIdentifier id, int line) {
        super(line);
        this.id = id;
    }

    @Override
    public Object Visit(Visitor visitor) {
        return visitor.visit(this);
    }

    /**
     * @return the id
     */
    public ASTIdentifier getId() {
        return id;
    }
    
}
