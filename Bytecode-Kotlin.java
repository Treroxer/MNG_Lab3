// class version 52.0 (52)
// access flags 0x31
public final class MainKt {

  // compiled from: Main.kt

  @Lkotlin/Metadata;(mv={1, 7, 1}, k=2, xi=48, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"main", "", "args", "", "", "([Ljava/lang/String;)V", "MNG_Lab3_Kotlin"})

  // access flags 0x19
  public final static main([Ljava/lang/String;)V
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 0
    LDC "args"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 2 L1
    BIPUSH 7
    NEWARRAY T_INT
    ASTORE 2
    ALOAD 2
    ICONST_0
    BIPUSH 64
    IASTORE
    ALOAD 2
    ICONST_1
    BIPUSH 34
    IASTORE
    ALOAD 2
    ICONST_2
    BIPUSH 25
    IASTORE
    ALOAD 2
    ICONST_3
    BIPUSH 12
    IASTORE
    ALOAD 2
    ICONST_4
    BIPUSH 22
    IASTORE
    ALOAD 2
    ICONST_5
    BIPUSH 11
    IASTORE
    ALOAD 2
    BIPUSH 6
    BIPUSH 90
    IASTORE
    ALOAD 2
    ASTORE 1
   L2
    LINENUMBER 3 L2
    LDC "Przed sortowaniem:"
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    SWAP
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L3
    LINENUMBER 4 L3
    ICONST_0
    ISTORE 2
   L4
    ALOAD 1
    ARRAYLENGTH
    ISTORE 3
   L5
   FRAME APPEND [[I I I]
    ILOAD 2
    ILOAD 3
    IF_ICMPGE L6
   L7
    LINENUMBER 5 L7
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 1
    ILOAD 2
    IALOAD
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    BIPUSH 32
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    SWAP
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/Object;)V
   L8
    LINENUMBER 4 L8
    IINC 2 1
    GOTO L5
   L6
    LINENUMBER 7 L6
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L9
    LINENUMBER 8 L9
    ALOAD 1
    ARRAYLENGTH
    ISTORE 2
   L10
    LINENUMBER 9 L10
    ICONST_0
    ISTORE 3
   L11
    ILOAD 2
    ICONST_1
    ISUB
    ISTORE 4
   L12
   FRAME APPEND [I]
    ILOAD 3
    ILOAD 4
    IF_ICMPGE L13
   L14
    LINENUMBER 10 L14
    ICONST_0
    ISTORE 5
   L15
    ILOAD 2
    ILOAD 3
    ISUB
    ICONST_1
    ISUB
    ISTORE 6
   L16
   FRAME APPEND [I I]
    ILOAD 5
    ILOAD 6
    IF_ICMPGE L17
   L18
    LINENUMBER 11 L18
    ALOAD 1
    ILOAD 5
    IALOAD
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    IALOAD
    IF_ICMPLE L19
   L20
    LINENUMBER 12 L20
    ALOAD 1
    ILOAD 5
    IALOAD
    ISTORE 7
   L21
    LINENUMBER 13 L21
    ALOAD 1
    ILOAD 5
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    IALOAD
    IASTORE
   L22
    LINENUMBER 14 L22
    ALOAD 1
    ILOAD 5
    ICONST_1
    IADD
    ILOAD 7
    IASTORE
   L19
    LINENUMBER 10 L19
   FRAME SAME
    IINC 5 1
    GOTO L16
   L17
    LINENUMBER 9 L17
   FRAME SAME
    IINC 3 1
    GOTO L12
   L13
    LINENUMBER 18 L13
   FRAME CHOP 2
    LDC "Po sortowaniu:"
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    SWAP
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L23
    LINENUMBER 19 L23
    ICONST_0
    ISTORE 3
   L24
    ALOAD 1
    ARRAYLENGTH
    ISTORE 4
   L25
   FRAME SAME
    ILOAD 3
    ILOAD 4
    IF_ICMPGE L26
   L27
    LINENUMBER 20 L27
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 1
    ILOAD 3
    IALOAD
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    BIPUSH 32
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    SWAP
    INVOKEVIRTUAL java/io/PrintStream.print (Ljava/lang/Object;)V
   L28
    LINENUMBER 19 L28
    IINC 3 1
    GOTO L25
   L26
    LINENUMBER 22 L26
   FRAME SAME
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    INVOKEVIRTUAL java/io/PrintStream.println ()V
   L29
    LINENUMBER 23 L29
    RETURN
   L30
    LOCALVARIABLE i I L4 L6 2
    LOCALVARIABLE temp I L21 L19 7
    LOCALVARIABLE j I L15 L17 5
    LOCALVARIABLE i I L11 L13 3
    LOCALVARIABLE i I L24 L26 3
    LOCALVARIABLE arr [I L2 L30 1
    LOCALVARIABLE n I L10 L30 2
    LOCALVARIABLE args [Ljava/lang/String; L0 L30 0
    MAXSTACK = 5
    MAXLOCALS = 8
}
