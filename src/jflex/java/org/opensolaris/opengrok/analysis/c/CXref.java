/* The following code was generated by JFlex 1.4.3 on 12/11/26 22:11 */

/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").  
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2005, 2011, Oracle and/or its affiliates. All rights reserved.
 */

/*
 * Cross reference a C file
 */

package org.opensolaris.opengrok.analysis.c;
import org.opensolaris.opengrok.analysis.JFlexXref;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import org.opensolaris.opengrok.web.Util;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/11/26 22:11 from the specification file
 * <tt>/Users/takayuki/Workspace/SourceColon/src/main/java/org/opensolaris/opengrok/analysis/c/CXref.lex</tt>
 */
public class CXref extends JFlexXref {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 4;
  public static final int SCOMMENT = 6;
  public static final int QSTRING = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\0\1\1\1\2\22\0\1\1\1\6\1\45"+
    "\1\52\2\6\1\51\1\46\2\52\1\47\1\33\1\6\1\10\1\11"+
    "\1\36\1\37\11\5\1\54\1\6\1\43\1\6\1\44\1\6\1\55"+
    "\1\21\1\40\1\13\1\34\1\41\1\17\1\4\1\24\1\35\1\20"+
    "\1\4\1\32\1\31\1\16\1\15\1\23\2\4\1\53\1\26\1\42"+
    "\1\22\1\4\1\30\2\4\1\52\1\50\2\52\1\7\1\52\1\21"+
    "\1\40\1\14\1\34\1\41\1\17\1\4\1\25\1\35\1\20\1\4"+
    "\1\32\1\31\1\16\1\15\1\23\2\4\1\12\1\27\1\42\1\22"+
    "\1\4\1\30\2\4\3\52\1\6\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\2\3\1\4\1\5\3\4\1\6"+
    "\1\7\1\10\1\11\1\12\5\4\1\6\1\13\2\4"+
    "\1\2\2\14\1\15\1\4\1\16\1\0\1\5\1\0"+
    "\1\17\1\20\16\0\1\21\1\22\1\23\1\0\1\24"+
    "\2\5\1\0\1\5\6\0\1\25\1\0\1\25\3\0"+
    "\1\25\1\0\1\25\6\0\1\2\1\5\1\26\26\0"+
    "\1\27\17\0\1\25\2\0\1\25\1\30\12\0\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\346\0\u0170\0\u019e\0\346\0\u01cc\0\u01fa\0\u0228\0\346"+
    "\0\346\0\346\0\346\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e"+
    "\0\346\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4\0\346\0\u0422"+
    "\0\u0450\0\u0170\0\u047e\0\u04ac\0\u04da\0\346\0\346\0\u0508"+
    "\0\u0536\0\u0564\0\u0592\0\u05c0\0\u0256\0\u05ee\0\u061c\0\u064a"+
    "\0\u0284\0\u0678\0\u06a6\0\u06d4\0\u0702\0\346\0\346\0\346"+
    "\0\u0730\0\346\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816\0\u0844"+
    "\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u0256\0\u092a\0\u092a\0\u0958"+
    "\0\u0986\0\u09b4\0\u09b4\0\u09e2\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c"+
    "\0\u0a9a\0\u0ac8\0\u0af6\0\346\0\u0b24\0\346\0\u0b52\0\u0b80"+
    "\0\u0bae\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0"+
    "\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60"+
    "\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0"+
    "\0\u0ffe\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4\0\u1112\0\u1140"+
    "\0\u116e\0\u119c\0\u11ca\0\u11f8\0\346\0\u1226\0\u1254\0\u0eea"+
    "\0\u0f74\0\u1282\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396"+
    "\0\u13c4\0\u13f2\0\u1420\0\u1420";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\12"+
    "\2\14\21\12\1\14\2\12\1\15\1\16\3\12\1\17"+
    "\1\20\1\21\1\22\2\14\1\23\1\14\1\12\2\14"+
    "\1\6\1\7\1\10\1\11\1\24\1\25\1\14\3\25"+
    "\5\24\1\26\4\24\2\27\5\24\1\14\2\24\1\30"+
    "\1\25\3\24\1\31\1\20\1\32\2\14\1\33\1\23"+
    "\1\14\1\24\2\14\1\6\1\7\1\10\1\11\1\24"+
    "\1\25\1\14\3\25\5\24\1\26\4\24\2\27\5\24"+
    "\1\14\2\24\1\30\1\25\3\24\1\31\1\20\2\14"+
    "\1\34\1\14\1\23\1\14\1\24\2\14\1\6\1\35"+
    "\1\36\1\37\1\24\1\25\1\14\3\25\5\24\1\26"+
    "\4\24\2\27\5\24\1\14\2\24\1\30\1\25\3\24"+
    "\1\31\1\20\4\14\1\23\1\14\1\24\2\14\1\6"+
    "\1\7\1\10\1\11\1\24\1\25\1\14\3\25\5\24"+
    "\1\26\4\24\2\27\5\24\1\14\2\24\1\30\1\25"+
    "\3\24\1\31\1\20\1\14\1\40\1\14\1\41\1\23"+
    "\1\14\1\24\2\14\57\0\1\7\1\10\1\11\55\0"+
    "\1\11\56\0\2\42\1\0\1\42\2\0\21\42\1\0"+
    "\2\42\1\0\4\42\10\0\1\42\7\0\1\13\3\0"+
    "\1\43\5\0\1\44\12\0\1\44\1\0\1\44\2\0"+
    "\1\13\1\0\1\45\1\44\51\0\1\46\10\0\1\47"+
    "\13\0\1\50\3\0\1\43\16\0\1\51\6\0\1\50"+
    "\22\0\1\52\2\0\1\53\2\0\21\52\1\0\2\52"+
    "\1\54\1\0\3\52\10\0\1\52\6\0\2\55\1\0"+
    "\2\55\1\56\21\55\1\0\2\55\1\57\4\55\10\0"+
    "\1\55\1\0\1\60\4\0\2\61\1\0\24\61\1\0"+
    "\2\61\1\0\4\61\10\0\1\61\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\14\55\2\62\3\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\14\55\2\63\3\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\1\64\5\0\21\64\1\0\2\64\2\0\3\64\10\0"+
    "\1\64\3\0\1\65\121\0\1\66\2\0\1\67\43\0"+
    "\1\70\20\0\1\35\1\36\1\37\55\0\1\37\53\0"+
    "\1\71\122\0\1\72\1\0\1\67\12\0\1\73\31\0"+
    "\1\73\35\0\1\44\12\0\1\44\1\0\1\44\5\0"+
    "\1\44\20\0\1\74\2\0\1\75\22\0\1\75\3\0"+
    "\1\74\23\0\1\50\3\0\1\43\25\0\1\50\23\0"+
    "\1\76\5\0\2\76\2\0\1\76\1\0\1\76\12\0"+
    "\1\76\2\0\3\76\20\0\2\77\1\0\1\77\1\100"+
    "\1\101\21\77\1\0\2\77\1\102\4\77\10\0\1\77"+
    "\6\0\2\103\1\0\1\103\2\0\21\103\1\0\2\103"+
    "\1\0\4\103\10\0\1\103\6\0\1\104\5\0\21\104"+
    "\1\0\2\104\2\0\3\104\10\0\1\104\6\0\2\55"+
    "\1\0\2\55\1\56\1\105\1\106\1\107\3\55\1\110"+
    "\2\55\1\111\1\112\1\113\1\114\1\115\1\116\2\55"+
    "\1\0\1\117\1\55\1\57\4\55\10\0\1\55\1\0"+
    "\1\60\4\0\1\120\5\0\21\120\1\0\2\120\2\0"+
    "\3\120\10\0\1\120\6\0\2\121\1\0\24\121\1\0"+
    "\2\121\1\0\4\121\10\0\1\121\6\0\2\55\1\0"+
    "\2\55\1\56\11\55\1\122\7\55\1\0\2\55\1\57"+
    "\4\55\10\0\1\55\1\0\1\60\4\0\2\55\1\0"+
    "\2\55\1\56\14\55\2\123\3\55\1\0\2\55\1\57"+
    "\4\55\10\0\1\55\1\0\1\60\4\0\2\64\1\0"+
    "\24\64\1\0\2\64\1\57\4\64\10\0\1\64\3\0"+
    "\1\65\43\0\1\124\11\0\1\71\44\0\1\124\14\0"+
    "\1\73\11\0\1\44\12\0\1\44\1\0\1\44\2\0"+
    "\1\73\1\0\1\45\1\44\20\0\1\74\11\0\1\44"+
    "\12\0\1\44\1\0\1\44\2\0\1\74\2\0\1\44"+
    "\20\0\1\74\31\0\1\74\23\0\1\76\5\0\2\76"+
    "\2\0\1\76\1\0\1\76\10\0\1\44\1\0\1\76"+
    "\2\0\2\76\1\125\1\44\17\0\2\77\1\0\1\77"+
    "\1\100\1\101\21\77\1\0\2\77\1\102\4\77\1\0"+
    "\1\126\6\0\1\77\6\0\2\100\1\0\2\100\1\101"+
    "\21\100\1\0\2\100\1\102\4\100\10\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\1\127\1\130\1\131\3\100"+
    "\1\132\2\100\1\133\1\134\1\135\1\136\1\137\1\140"+
    "\2\100\1\0\1\141\1\100\1\102\4\100\10\0\1\100"+
    "\6\0\1\142\5\0\21\142\1\0\2\142\2\0\3\142"+
    "\10\0\1\142\6\0\2\103\1\0\1\103\2\0\21\103"+
    "\1\0\2\103\1\0\4\103\1\0\1\126\6\0\1\103"+
    "\6\0\2\104\1\0\24\104\1\0\2\104\1\102\4\104"+
    "\10\0\1\104\6\0\2\55\1\0\2\55\1\56\1\55"+
    "\2\105\1\143\5\55\1\144\4\55\1\145\2\55\1\146"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\7\55\1\147\11\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\7\55\1\150\10\55\1\105"+
    "\1\0\2\55\1\57\4\55\10\0\1\55\1\0\1\60"+
    "\4\0\2\55\1\0\2\55\1\56\11\55\1\144\2\105"+
    "\2\151\1\145\2\55\1\146\2\55\1\57\4\55\10\0"+
    "\1\55\1\0\1\60\4\0\2\55\1\0\2\55\1\56"+
    "\16\55\1\152\2\55\1\0\2\55\1\57\4\55\10\0"+
    "\1\55\1\0\1\60\4\0\2\55\1\0\2\55\1\56"+
    "\17\55\1\153\1\55\1\0\2\55\1\57\4\55\10\0"+
    "\1\55\1\0\1\60\4\0\2\55\1\0\2\55\1\56"+
    "\21\55\1\0\1\55\1\154\1\57\4\55\10\0\1\55"+
    "\1\0\1\60\4\0\2\155\1\0\3\120\21\155\1\0"+
    "\2\155\1\0\4\155\10\0\1\155\6\0\2\121\1\0"+
    "\2\121\1\156\21\121\1\0\2\121\1\0\4\121\10\0"+
    "\1\121\6\0\2\55\1\0\2\55\1\56\21\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\157\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\11\55\1\160\7\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\5\0"+
    "\1\76\2\0\1\75\2\0\2\76\2\0\1\76\1\0"+
    "\1\76\10\0\1\44\1\75\1\76\2\0\2\76\1\125"+
    "\1\44\17\0\2\100\1\0\2\100\1\101\21\100\1\0"+
    "\2\100\1\102\4\100\1\0\1\126\6\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\1\100\2\127\1\161\5\100"+
    "\1\162\4\100\1\163\2\100\1\164\2\100\1\102\4\100"+
    "\10\0\1\100\6\0\2\100\1\0\2\100\1\101\1\100"+
    "\2\127\1\161\5\100\1\162\4\100\1\163\2\100\1\164"+
    "\2\100\1\102\4\100\1\0\1\126\6\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\7\100\1\165\11\100\1\0"+
    "\2\100\1\102\4\100\10\0\1\100\6\0\2\100\1\0"+
    "\2\100\1\101\7\100\1\166\10\100\1\127\1\0\2\100"+
    "\1\102\4\100\10\0\1\100\6\0\2\100\1\0\2\100"+
    "\1\101\11\100\1\162\2\127\2\167\1\163\2\100\1\164"+
    "\2\100\1\102\4\100\10\0\1\100\6\0\2\100\1\0"+
    "\2\100\1\101\11\100\1\162\2\127\2\167\1\163\2\100"+
    "\1\164\2\100\1\102\4\100\1\0\1\126\6\0\1\100"+
    "\6\0\2\100\1\0\2\100\1\101\16\100\1\170\2\100"+
    "\1\0\2\100\1\102\4\100\10\0\1\100\6\0\2\100"+
    "\1\0\2\100\1\101\16\100\1\170\2\100\1\0\2\100"+
    "\1\102\4\100\1\0\1\126\6\0\1\100\6\0\2\100"+
    "\1\0\2\100\1\101\17\100\1\171\1\100\1\0\2\100"+
    "\1\102\4\100\10\0\1\100\6\0\2\100\1\0\2\100"+
    "\1\101\21\100\1\0\1\100\1\172\1\102\4\100\10\0"+
    "\1\100\6\0\2\173\1\0\3\142\21\173\1\0\2\173"+
    "\1\0\4\173\10\0\1\173\6\0\2\55\1\0\2\55"+
    "\1\56\4\55\1\174\14\55\1\0\2\55\1\57\4\55"+
    "\10\0\1\55\1\0\1\60\4\0\2\55\1\0\2\55"+
    "\1\56\11\55\1\105\7\55\1\0\2\55\1\57\4\55"+
    "\10\0\1\55\1\0\1\60\4\0\2\55\1\0\2\55"+
    "\1\56\16\55\1\105\2\55\1\0\2\55\1\57\4\55"+
    "\10\0\1\55\1\0\1\60\33\0\1\175\26\0\2\55"+
    "\1\0\2\55\1\56\10\55\1\176\10\55\1\0\2\55"+
    "\1\57\4\55\10\0\1\55\1\0\1\60\4\0\2\55"+
    "\1\0\2\55\1\56\14\55\2\177\3\55\1\0\2\55"+
    "\1\57\4\55\10\0\1\55\1\0\1\60\4\0\2\55"+
    "\1\0\2\55\1\56\17\55\1\200\1\55\1\0\2\55"+
    "\1\57\4\55\10\0\1\55\1\0\1\60\4\0\2\55"+
    "\1\0\2\55\1\56\14\55\2\105\3\55\1\0\2\55"+
    "\1\57\4\55\10\0\1\55\1\0\1\60\4\0\2\55"+
    "\1\0\2\55\1\56\20\55\1\105\1\0\2\55\1\57"+
    "\4\55\10\0\1\55\1\0\1\60\4\0\2\55\1\0"+
    "\2\55\1\56\5\55\1\174\13\55\1\0\2\55\1\57"+
    "\4\55\10\0\1\55\1\0\1\60\4\0\2\155\1\0"+
    "\3\120\21\155\1\0\2\155\1\57\4\155\10\0\1\155"+
    "\6\0\2\201\1\0\24\201\1\0\2\201\1\0\4\201"+
    "\10\0\1\201\40\0\1\202\23\0\2\55\1\0\2\55"+
    "\1\56\1\122\20\55\1\0\2\55\1\57\4\55\10\0"+
    "\1\122\1\157\1\60\4\0\2\100\1\0\2\100\1\101"+
    "\4\100\1\203\14\100\1\0\2\100\1\102\4\100\10\0"+
    "\1\100\6\0\2\100\1\0\2\100\1\101\11\100\1\127"+
    "\7\100\1\0\2\100\1\102\4\100\10\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\16\100\1\127\2\100\1\0"+
    "\2\100\1\102\4\100\10\0\1\100\35\0\1\204\26\0"+
    "\2\100\1\0\2\100\1\101\10\100\1\205\10\100\1\0"+
    "\2\100\1\102\4\100\10\0\1\100\6\0\2\100\1\0"+
    "\2\100\1\101\14\100\2\206\3\100\1\0\2\100\1\102"+
    "\4\100\10\0\1\100\6\0\2\100\1\0\2\100\1\101"+
    "\17\100\1\207\1\100\1\0\2\100\1\102\4\100\10\0"+
    "\1\100\6\0\2\100\1\0\2\100\1\101\14\100\2\127"+
    "\3\100\1\0\2\100\1\102\4\100\10\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\20\100\1\127\1\0\2\100"+
    "\1\102\4\100\10\0\1\100\6\0\2\100\1\0\2\100"+
    "\1\101\5\100\1\203\13\100\1\0\2\100\1\102\4\100"+
    "\10\0\1\100\6\0\2\173\1\0\3\142\21\173\1\0"+
    "\2\173\1\102\4\173\1\0\1\126\6\0\1\173\6\0"+
    "\2\55\1\0\2\55\1\56\5\55\1\105\13\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\7\55\1\105\11\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\4\0"+
    "\2\55\1\0\2\55\1\56\1\55\2\210\16\55\1\0"+
    "\2\55\1\57\4\55\10\0\1\55\1\0\1\60\36\0"+
    "\1\211\23\0\2\100\1\0\2\100\1\101\5\100\1\127"+
    "\13\100\1\0\2\100\1\102\4\100\10\0\1\100\46\0"+
    "\1\126\15\0\2\100\1\0\2\100\1\101\7\100\1\127"+
    "\11\100\1\0\2\100\1\102\4\100\10\0\1\100\6\0"+
    "\2\100\1\0\2\100\1\101\1\100\2\212\16\100\1\0"+
    "\2\100\1\102\4\100\10\0\1\100\6\0\2\100\1\0"+
    "\2\100\1\101\20\100\1\127\1\0\2\100\1\102\4\100"+
    "\1\0\1\126\6\0\1\100\6\0\2\55\1\0\2\55"+
    "\1\56\12\55\2\105\5\55\1\0\2\55\1\57\4\55"+
    "\10\0\1\55\1\0\1\60\4\0\37\213\4\0\3\213"+
    "\1\0\3\213\4\0\2\100\1\0\2\100\1\101\12\100"+
    "\2\127\5\100\1\0\2\100\1\102\4\100\10\0\1\100"+
    "\6\0\2\214\4\213\21\214\1\213\7\214\4\0\3\213"+
    "\1\0\1\214\2\213";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5198];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\2\1\1\11\2\1\1\11\3\1\4\11"+
    "\5\1\1\11\5\1\1\11\3\1\1\0\1\1\1\0"+
    "\2\11\16\0\3\11\1\0\1\11\2\1\1\0\1\1"+
    "\6\0\1\1\1\0\1\1\3\0\1\1\1\0\1\1"+
    "\6\0\1\11\1\1\1\11\26\0\1\1\17\0\1\11"+
    "\2\0\2\1\12\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  // TODO move this into an include file when bug #16053 is fixed
  @Override
  protected int getLineNumber() { return yyline; }
  @Override
  protected void setLineNumber(int x) { yyline = x; }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CXref(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public CXref(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { out.write("<span class=\"n\">"); out.write(yytext()); out.write("</span>");
          }
        case 26: break;
        case 4: 
          { out.write(yycharat(0));
          }
        case 27: break;
        case 9: 
          { yybegin(QSTRING);out.write("<span class=\"s\">\'");
          }
        case 28: break;
        case 18: 
          { out.write("\\\\");
          }
        case 29: break;
        case 8: 
          { yybegin(STRING);out.write("<span class=\"s\">\"");
          }
        case 30: break;
        case 12: 
          { yybegin(YYINITIAL); out.write("</span>");
                  startNewLine();
          }
        case 31: break;
        case 11: 
          { yybegin(YYINITIAL); out.write("\"</span>");
          }
        case 32: break;
        case 20: 
          { out.write("\\\'");
          }
        case 33: break;
        case 1: 
          { writeUnicodeChar(yycharat(0));
          }
        case 34: break;
        case 21: 
          { String path = yytext();
        out.write("<a href=\""+urlPrefix+"path=");
        out.write(path);
        appendProject();
        out.write("\">");
        out.write(path);
        out.write("</a>");
          }
        case 35: break;
        case 10: 
          { out.write( "&amp;");
          }
        case 36: break;
        case 13: 
          { yybegin(YYINITIAL); out.write("'</span>");
          }
        case 37: break;
        case 6: 
          { out.write( "&lt;");
          }
        case 38: break;
        case 24: 
          { writeEMailAddress(yytext());
          }
        case 39: break;
        case 22: 
          { out.write("&lt;");
        String path = yytext().substring(1, yylength() - 1);
        out.write(Util.breadcrumbPath(urlPrefix + "path=", path));
        out.write("&gt;");
          }
        case 40: break;
        case 3: 
          { startNewLine();
          }
        case 41: break;
        case 25: 
          { String url = yytext();
         out.write("<a href=\"");
         out.write(url);out.write("\">");
         out.write(url);out.write("</a>");
          }
        case 42: break;
        case 17: 
          { out.write("\\\"");
          }
        case 43: break;
        case 15: 
          { yybegin(SCOMMENT);out.write("<span class=\"c\">//");
          }
        case 44: break;
        case 16: 
          { yybegin(COMMENT);out.write("<span class=\"c\">/*");
          }
        case 45: break;
        case 2: 
          { out.write(yytext());
          }
        case 46: break;
        case 19: 
          { yybegin(YYINITIAL); out.write("*/</span>");
          }
        case 47: break;
        case 7: 
          { out.write( "&gt;");
          }
        case 48: break;
        case 14: 
          { String id = yytext();
    writeSymbol(id, Consts.kwd, yyline);
          }
        case 49: break;
        case 23: 
          { out.write(Util.breadcrumbPath(urlPrefix+"path=",yytext(),'/'));
          }
        case 50: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
