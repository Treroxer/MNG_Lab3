// class version 63.0 (63)
// access flags 0x21
public class BubbleSort {

  // compiled from: BubbleSort.java
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 1 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this LBubbleSort; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 3 L0
    BIPUSH 7
    NEWARRAY T_INT
    DUP
    ICONST_0
    BIPUSH 64
    IASTORE
    DUP
    ICONST_1
    BIPUSH 34
    IASTORE
    DUP
    ICONST_2
    BIPUSH 25
    IASTORE
    DUP
    ICONST_3
    BIPUSH 12
    IASTORE
    DUP
    ICONST_4
    BIPUSH 22
    IASTORE
    DUP
    ICONST_5
    BIPUSH 11
    IASTORE
    DUP
    BIPUSH 6
    BIPUSH 90
    IASTORE
    ASTORE 1
   L1
    LINENUMBER 4 L1
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Przed sortowaniem:"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L2
    LINENUMBER 5 L2
    ICONST_0
    ISTORE 2
   L3
   FRAME APPEND [[I I]
    ILOAD 2
    ALOAD 1
    ARRAYLENGTH
    IF_ICMPGE L4
   L5
    LINENUMBER 6 L5
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 1
    ILOAD 2
    IALOAD
    INVOKEDYNAMIC makeConcatWithConstants(I)Ljava/lang/String; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/StringConcatFactory.makeConcatWithConstants(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
      // arguments:
      "\u0001 "
    ]
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/String;)V
   L6
    LINENUMBER 5 L6
    IINC 2 1
    GOTO L3
   L4
    LINENUMBER 8 L4
   FRAME CHOP 1
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L7
    LINENUMBER 9 L7
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L8
    LINENUMBER 10 L8
    ICONST_0
    ISTORE 3
   L9
   FRAME APPEND [I I]
    ILOAD 3
    ILOAD 2
    ICONST_1
    ISUB
    IF_ICMPGE L10
   L11
    LINENUMBER 11 L11
    ICONST_0
    ISTORE 4
   L12
   FRAME APPEND [I]
    ILOAD 4
    ILOAD 2
    ILOAD 3
    ISUB
    ICONST_1
    ISUB
    IF_ICMPGE L13
   L14
    LINENUMBER 12 L14
    ALOAD 1
    ILOAD 4
    IALOAD
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    IALOAD
    IF_ICMPLE L15
   L16
    LINENUMBER 13 L16
    ALOAD 1
    ILOAD 4
    IALOAD
    ISTORE 5
   L17
    LINENUMBER 14 L17
    ALOAD 1
    ILOAD 4
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    IALOAD
    IASTORE
   L18
    LINENUMBER 15 L18
    ALOAD 1
    ILOAD 4
    ICONST_1
    IADD
    ILOAD 5
    IASTORE
   L15
    LINENUMBER 11 L15
   FRAME SAME
    IINC 4 1
    GOTO L12
   L13
    LINENUMBER 10 L13
   FRAME CHOP 1
    IINC 3 1
    GOTO L9
   L10
    LINENUMBER 19 L10
   FRAME CHOP 1
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Po sortowaniu:"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L19
    LINENUMBER 20 L19
    ICONST_0
    ISTORE 3
   L20
   FRAME APPEND [I]
    ILOAD 3
    ALOAD 1
    ARRAYLENGTH
    IF_ICMPGE L21
   L22
    LINENUMBER 21 L22
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 1
    ILOAD 3
    IALOAD
    INVOKEDYNAMIC makeConcatWithConstants(I)Ljava/lang/String; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/StringConcatFactory.makeConcatWithConstants(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
      // arguments:
      "\u0001 "
    ]
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/String;)V
   L23
    LINENUMBER 20 L23
    IINC 3 1
    GOTO L20
   L21
    LINENUMBER 23 L21
   FRAME CHOP 1
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L24
    LINENUMBER 24 L24
    RETURN
   L25
    LOCALVARIABLE i I L3 L4 2
    LOCALVARIABLE temp I L17 L15 5
    LOCALVARIABLE j I L12 L13 4
    LOCALVARIABLE i I L9 L10 3
    LOCALVARIABLE i I L20 L21 3
    LOCALVARIABLE args [Ljava/lang/String; L0 L25 0
    LOCALVARIABLE arr [I L1 L25 1
    LOCALVARIABLE n I L8 L25 2
    MAXSTACK = 5
    MAXLOCALS = 6
}
