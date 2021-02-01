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
public class ASTOperacionCrear extends ASTInstruction{
    private ASTIdentifier id;
    private ASTLogicExpression pos1;
    private ASTLogicExpression pos2;
    private ASTLogicExpression dir;

    public ASTOperacionCrear(ASTIdentifier id, ASTLogicExpression pos1, ASTLogicExpression pos2, 
            ASTLogicExpression dir, int line) {
        super(line);
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.dir = dir;
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
     * @return the pos1
     */
    public ASTLogicExpression getPos1() {
        return pos1;
    }

    /**
     * @return the pos2
     */
    public ASTLogicExpression getPos2() {
        return pos2;
    }

    /**
     * @return the dir
     */
    public ASTLogicExpression getDir() {
        return dir;
    }
}
