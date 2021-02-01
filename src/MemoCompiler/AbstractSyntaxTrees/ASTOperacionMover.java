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
public class ASTOperacionMover extends ASTInstruction{
    private ASTIdentifier id;
    private ASTLogicExpression cantidad;

    public ASTOperacionMover(ASTIdentifier id, ASTLogicExpression cantidad, int line) {
        super(line);
        this.id = id;
        this.cantidad = cantidad;
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

    /**
     * @return the cantidad
     */
    public ASTLogicExpression getCantidad() {
        return cantidad;
    }
    
}
