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
public class ASTOperacionRotar extends ASTInstruction{
    private ASTIdentifier id;
    private ASTLogicExpression orientacion;

    public ASTOperacionRotar(ASTIdentifier id, ASTLogicExpression orientacion, int line) {
        super(line);
        this.id = id;
        this.orientacion = orientacion;
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
     * @return the orientacion
     */
    public ASTLogicExpression getOrientacion() {
        return orientacion;
    }
    
}
