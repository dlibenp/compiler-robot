/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memo;

import MemoCompiler.AbstractSyntaxTrees.*;
import javax.swing.tree.*;

/**
 *
 * @author maikel
 */
public class BuildTree implements Visitor {
    //private DefaultTreeModel nodoRaiz;
    //DefaultMutableTreeNode

//    public BuildTree()
//    {
//        nodoRaiz = new DefaultTreeModel(null);
//    }
//
//    public DefaultTreeModel getNodoRaiz()
//    {
//        return nodoRaiz;
//    }
    public Object visit(ASTProgram o) {

        DefaultMutableTreeNode nodoProgram = new DefaultMutableTreeNode(o);

        for (int i = 0; i < o.Instructions().size(); i++) {
            DefaultMutableTreeNode nodoInst = (DefaultMutableTreeNode) o.Instructions().get(i).Visit(this);
            nodoProgram.insert(nodoInst, i);
        }
        //DefaultTreeModel nodoRaiz = new DefaultTreeModel(nodoProgram);
        //nodoRaiz.setRoot(nodoProgram);
        return nodoProgram;

    }

    public Object visit(ASTInstructionDec o) {
        DefaultMutableTreeNode nodoInstructionDec = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoType = new DefaultMutableTreeNode(o.getType());
        nodoInstructionDec.insert(nodoType, 0);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstructionDec.insert(nodoIdentifier, 1);

        return nodoInstructionDec;
    }

    public Object visit(ASTInstructionAssig o) {
        DefaultMutableTreeNode nodoInstructionAssig = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstructionAssig.insert(nodoIdentifier, 0);
        DefaultMutableTreeNode nodoExpresion = (DefaultMutableTreeNode) o.getExpresion().Visit(this);
        nodoInstructionAssig.insert(nodoExpresion, 1);

        return nodoInstructionAssig;

    }

    public Object visit(ASTInstructionWrite o) {
        DefaultMutableTreeNode nodoInstructionWrite = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoExpresion = (DefaultMutableTreeNode) o.getExpresion().Visit(this);
        nodoInstructionWrite.insert(nodoExpresion, 0);

        return nodoInstructionWrite;

    }

    public Object visit(ASTExpresionBinary o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq = (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer = (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTIdentifierDeclaration o) {
        DefaultMutableTreeNode nodoIdentifierDeclaration = new DefaultMutableTreeNode(o);
        return nodoIdentifierDeclaration;
    }

    public Object visit(ASTIdentifierReference o) {
        DefaultMutableTreeNode nodoIdentifierReference = new DefaultMutableTreeNode(o);
        return nodoIdentifierReference;

    }

    public Object visit(ASTIdentifierValue o) {
        DefaultMutableTreeNode nodoIdentifierValue = new DefaultMutableTreeNode(o);
        return nodoIdentifierValue;

    }

    public Object visit(ASTFloatValue o) {
        DefaultMutableTreeNode nodoFloatValue = new DefaultMutableTreeNode(o);
        return nodoFloatValue;

    }

    public Object visit(ASTIntValue o) {
        DefaultMutableTreeNode nodoIntValue = new DefaultMutableTreeNode(o);
        return nodoIntValue;

    }

    public Object visit(ASTBoolValue o) {
        DefaultMutableTreeNode nodoBoolValue = new DefaultMutableTreeNode(o);
        return nodoBoolValue;
    }

    public Object visit(ASTInstructionIf o) {
        DefaultMutableTreeNode nodoInstructionIf = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoExpresion = (DefaultMutableTreeNode) o.getCondition().Visit(this);
        nodoInstructionIf.insert(nodoExpresion, 0);
        DefaultMutableTreeNode nodoInstruccion = (DefaultMutableTreeNode) o.getIfInstruction().Visit(this);
        nodoInstructionIf.insert(nodoInstruccion, 0);
        if (o.getElseInstruction() != null) {
            DefaultMutableTreeNode nodoElse = (DefaultMutableTreeNode) o.getElseInstruction().Visit(this);
            nodoInstructionIf.insert(nodoElse, 0);
        }

        return nodoInstructionIf;
    }

    public Object visit(ASTLogicExpressionAnd o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq = (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer = (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionOr o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq = (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer = (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionNot o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq = (DefaultMutableTreeNode) o.getOperand().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionEquals o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionDiffers o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionGreaterThan o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionGreaterThanOrEquals o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionLessThan o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTLogicExpressionLessThanOrEquals o) {
        DefaultMutableTreeNode nodoExpresionBinary = new DefaultMutableTreeNode(o);

        DefaultMutableTreeNode nodoIzq =
                (DefaultMutableTreeNode) o.getIzq().Visit(this);
        nodoExpresionBinary.insert(nodoIzq, 0);

        DefaultMutableTreeNode nodoDer =
                (DefaultMutableTreeNode) o.getDer().Visit(this);
        nodoExpresionBinary.insert(nodoDer, 1);

        return nodoExpresionBinary;
    }

    public Object visit(ASTExpresionSuma o) {
        return visit((ASTExpresionBinary) o);
    }

    public Object visit(ASTExpresionMult o) {
        return visit((ASTExpresionBinary) o);
    }

    public Object visit(ASTWrongInstruction o) {
         DefaultMutableTreeNode nodoWrongInst = new DefaultMutableTreeNode(o);
         return nodoWrongInst;
    }

    public Object visit(ASTWrongExpression o) {
        DefaultMutableTreeNode nodoWrongExp = new DefaultMutableTreeNode(o);
        return nodoWrongExp;
    }
    
    // ---------------------
    // Métodos agregados para el robot
    // ---------------------

    @Override
    public Object visit(ASTOperacionCrear o) {
        
        DefaultMutableTreeNode nodoInstruction = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstruction.insert(nodoIdentifier, 0);
        DefaultMutableTreeNode nodoPos1 = (DefaultMutableTreeNode) o.getPos1().Visit(this);
        nodoInstruction.insert(nodoPos1, 1);
        DefaultMutableTreeNode nodoPos2 = (DefaultMutableTreeNode) o.getPos2().Visit(this);
        nodoInstruction.insert(nodoPos2, 2);
        DefaultMutableTreeNode nodoDir = (DefaultMutableTreeNode) o.getDir().Visit(this);
        nodoInstruction.insert(nodoDir, 3);
        
        return nodoInstruction;
    }

    @Override
    public Object visit(ASTOperacionMover o) {
        
        DefaultMutableTreeNode nodoInstruction = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstruction.insert(nodoIdentifier, 0);
        DefaultMutableTreeNode nodoCantidad = (DefaultMutableTreeNode) o.getCantidad().Visit(this);
        nodoInstruction.insert(nodoCantidad, 1);
        
        return nodoInstruction;
    }

    @Override
    public Object visit(ASTOperacionRotar o) {
        
        DefaultMutableTreeNode nodoInstruction = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstruction.insert(nodoIdentifier, 0);
        DefaultMutableTreeNode nodoOrientacion = (DefaultMutableTreeNode) o.getOrientacion().Visit(this);
        nodoInstruction.insert(nodoOrientacion, 1);
        
        return nodoInstruction;
    }

    @Override
    public Object visit(ASTOperacionDestruir o) {
        
        DefaultMutableTreeNode nodoInstruction = new DefaultMutableTreeNode(o);
        DefaultMutableTreeNode nodoIdentifier = (DefaultMutableTreeNode) o.getId().Visit(this);
        nodoInstruction.insert(nodoIdentifier, 0);
        
        return nodoInstruction;
    }

    @Override
    public Object visit(ASTRobotValue o) {
        DefaultMutableTreeNode nodoRobotValue = new DefaultMutableTreeNode(o);
        return nodoRobotValue;
    }

    @Override
    public Object visit(ASTIdentifierRobot o) {
        DefaultMutableTreeNode nodoIdentifierRobot = new DefaultMutableTreeNode(o);
        return nodoIdentifierRobot;
    }
}
