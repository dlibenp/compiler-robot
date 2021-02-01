/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MemoCompiler.LexicalAnalyzer;

/**
 *
 * @author frodo
 */
public enum TokenKind {
    Int, 
    Float,
    
    Id,
    
    Write, 
        
    IntLiteral,
    FloatLiteral,
 
    SemiColon,
   
    LeftParen,
    RigthParen,
        
    Sum,
    Multiplication,
        
    Assignment,
        
    Error,
    EOT,
    
    // Tokens para las condiciones
    If,
    Then,
    Else,
    
    Bool,
    True,
    False,
    
    Equals,
    Differs,
    GreaterThan,
    LessThan,
    GreaterThanOrEquals,
    LessThanOrEquals,
    
    And,
    Or,
    Not,
    Void,
    Read,
    BoolLiteral,
    Minus,
    Division,
    Modulus,
    LeftKey,
    RightKey,
    Comma,
    // Tokens adicionados para el robot
    Main,
    Robot,
    Crear,
    Mover,
    Rotar,
    Destruir
}
