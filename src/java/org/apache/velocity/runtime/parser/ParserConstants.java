/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package org.apache.velocity.runtime.parser;

public interface ParserConstants {

  int EOF = 0;
  int LBRACKET = 1;
  int RBRACKET = 2;
  int COMMA = 3;
  int LPAREN = 4;
  int RPAREN = 5;
  int ESCAPE_SEQUENCE = 6;
  int TEXT = 7;
  int DOLLAR = 8;
  int DOLLARBANG = 9;
  int HASH = 13;
  int SINGLE_LINE_COMMENT = 14;
  int FORMAL_COMMENT = 15;
  int MULTI_LINE_COMMENT = 16;
  int STRING_LITERAL = 20;
  int TRUE = 21;
  int FALSE = 22;
  int NEWLINE = 23;
  int MINUS = 24;
  int PLUS = 25;
  int MULTIPLY = 26;
  int DIVIDE = 27;
  int MODULUS = 28;
  int LOGICAL_AND = 29;
  int LOGICAL_OR = 30;
  int LOGICAL_LT = 31;
  int LOGICAL_LE = 32;
  int LOGICAL_GT = 33;
  int LOGICAL_GE = 34;
  int LOGICAL_EQUALS = 35;
  int LOGICAL_NOT_EQUALS = 36;
  int LOGICAL_NOT = 37;
  int EQUALS = 38;
  int END = 39;
  int INCLUDE_DIRECTIVE = 40;
  int IF_DIRECTIVE = 41;
  int ELSEIF_DIRECTIVE = 42;
  int ELSE_DIRECTIVE = 43;
  int SET_DIRECTIVE = 44;
  int STOP_DIRECTIVE = 45;
  int DIGIT = 46;
  int NUMBER_LITERAL = 47;
  int LETTER = 48;
  int WORD = 49;
  int ALPHA_CHAR = 50;
  int ALPHANUM_CHAR = 51;
  int IDENTIFIER_CHAR = 52;
  int IDENTIFIER = 53;
  int DOT = 54;
  int LCURLY = 55;
  int RCURLY = 56;
  int REFERENCE_TERMINATOR = 57;

  int DIRECTIVE = 0;
  int REFMODIFIER = 1;
  int REFMOD2 = 2;
  int DEFAULT = 3;
  int REFERENCE = 4;
  int IN_MULTI_LINE_COMMENT = 5;
  int IN_FORMAL_COMMENT = 6;
  int IN_SINGLE_LINE_COMMENT = 7;

  String[] tokenImage = {
    "<EOF>",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "\"(\"",
    "\")\"",
    "<ESCAPE_SEQUENCE>",
    "<TEXT>",
    "\"$\"",
    "\"$!\"",
    "\"##\"",
    "<token of kind 11>",
    "\"#*\"",
    "\"#\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*#\"",
    "\"*#\"",
    "<token of kind 17>",
    "\" \"",
    "\"\\t\"",
    "<STRING_LITERAL>",
    "\"true\"",
    "\"false\"",
    "<NEWLINE>",
    "\"-\"",
    "\"+\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"&&\"",
    "\"||\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"==\"",
    "\"!=\"",
    "\"!\"",
    "\"=\"",
    "\"end\"",
    "\"include\"",
    "\"if\"",
    "\"elseif\"",
    "\"else\"",
    "\"set\"",
    "\"stop\"",
    "<DIGIT>",
    "<NUMBER_LITERAL>",
    "<LETTER>",
    "<WORD>",
    "<ALPHA_CHAR>",
    "<ALPHANUM_CHAR>",
    "<IDENTIFIER_CHAR>",
    "<IDENTIFIER>",
    "<DOT>",
    "\"{\"",
    "\"}\"",
    "<REFERENCE_TERMINATOR>",
  };

}
