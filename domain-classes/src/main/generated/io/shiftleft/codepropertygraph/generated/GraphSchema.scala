package io.shiftleft.codepropertygraph.generated

import flatgraph.FormalQtyType

object GraphSchema extends flatgraph.Schema {
  private val nodeLabels = IndexedSeq(
    "ANNOTATION",
    "ANNOTATION_LITERAL",
    "ANNOTATION_PARAMETER",
    "ANNOTATION_PARAMETER_ASSIGN",
    "ARRAY_INITIALIZER",
    "BINDING",
    "BLOCK",
    "CALL",
    "CLOSURE_BINDING",
    "COMMENT",
    "CONFIG_FILE",
    "CONTROL_STRUCTURE",
    "DEPENDENCY",
    "FIELD_IDENTIFIER",
    "FILE",
    "FINDING",
    "IDENTIFIER",
    "IMPORT",
    "JUMP_LABEL",
    "JUMP_TARGET",
    "KEY_VALUE_PAIR",
    "LITERAL",
    "LOCAL",
    "MEMBER",
    "META_DATA",
    "METHOD",
    "METHOD_PARAMETER_IN",
    "METHOD_PARAMETER_OUT",
    "METHOD_REF",
    "METHOD_RETURN",
    "MODIFIER",
    "MYNODETYPE",
    "NAMESPACE",
    "NAMESPACE_BLOCK",
    "RETURN",
    "TAG",
    "TAG_NODE_PAIR",
    "TEMPLATE_DOM",
    "TYPE",
    "TYPE_ARGUMENT",
    "TYPE_DECL",
    "TYPE_PARAMETER",
    "TYPE_REF",
    "UNKNOWN"
  )
  val nodeKindByLabel = nodeLabels.zipWithIndex.toMap
  val edgeLabels: Array[String] = Array(
    "ALIAS_OF",
    "ARGUMENT",
    "AST",
    "BINDS",
    "BINDS_TO",
    "CALL",
    "CAPTURE",
    "CAPTURED_BY",
    "CDG",
    "CFG",
    "CONDITION",
    "CONTAINS",
    "DOMINATE",
    "EVAL_TYPE",
    "IMPORTS",
    "INHERITS_FROM",
    "IS_CALL_FOR_IMPORT",
    "PARAMETER_LINK",
    "POST_DOMINATE",
    "REACHING_DEF",
    "RECEIVER",
    "REF",
    "SOURCE_FILE",
    "TAGGED_BY"
  )
  val edgeKindByLabel = edgeLabels.zipWithIndex.toMap
  val edgePropertyAllocators: Array[Int => Array[?]] = Array(
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => Array.fill(size)("<empty>") /* label = REACHING_DEF, id = 19 */,
    size => null,
    size => null,
    size => null,
    size => null
  )
  val nodeFactories: Array[(flatgraph.Graph, Int) => nodes.StoredNode] = Array(
    (g, seq) => new nodes.Annotation(g, seq),
    (g, seq) => new nodes.AnnotationLiteral(g, seq),
    (g, seq) => new nodes.AnnotationParameter(g, seq),
    (g, seq) => new nodes.AnnotationParameterAssign(g, seq),
    (g, seq) => new nodes.ArrayInitializer(g, seq),
    (g, seq) => new nodes.Binding(g, seq),
    (g, seq) => new nodes.Block(g, seq),
    (g, seq) => new nodes.Call(g, seq),
    (g, seq) => new nodes.ClosureBinding(g, seq),
    (g, seq) => new nodes.Comment(g, seq),
    (g, seq) => new nodes.ConfigFile(g, seq),
    (g, seq) => new nodes.ControlStructure(g, seq),
    (g, seq) => new nodes.Dependency(g, seq),
    (g, seq) => new nodes.FieldIdentifier(g, seq),
    (g, seq) => new nodes.File(g, seq),
    (g, seq) => new nodes.Finding(g, seq),
    (g, seq) => new nodes.Identifier(g, seq),
    (g, seq) => new nodes.Import(g, seq),
    (g, seq) => new nodes.JumpLabel(g, seq),
    (g, seq) => new nodes.JumpTarget(g, seq),
    (g, seq) => new nodes.KeyValuePair(g, seq),
    (g, seq) => new nodes.Literal(g, seq),
    (g, seq) => new nodes.Local(g, seq),
    (g, seq) => new nodes.Member(g, seq),
    (g, seq) => new nodes.MetaData(g, seq),
    (g, seq) => new nodes.Method(g, seq),
    (g, seq) => new nodes.MethodParameterIn(g, seq),
    (g, seq) => new nodes.MethodParameterOut(g, seq),
    (g, seq) => new nodes.MethodRef(g, seq),
    (g, seq) => new nodes.MethodReturn(g, seq),
    (g, seq) => new nodes.Modifier(g, seq),
    (g, seq) => new nodes.Mynodetype(g, seq),
    (g, seq) => new nodes.Namespace(g, seq),
    (g, seq) => new nodes.NamespaceBlock(g, seq),
    (g, seq) => new nodes.Return(g, seq),
    (g, seq) => new nodes.Tag(g, seq),
    (g, seq) => new nodes.TagNodePair(g, seq),
    (g, seq) => new nodes.TemplateDom(g, seq),
    (g, seq) => new nodes.Type(g, seq),
    (g, seq) => new nodes.TypeArgument(g, seq),
    (g, seq) => new nodes.TypeDecl(g, seq),
    (g, seq) => new nodes.TypeParameter(g, seq),
    (g, seq) => new nodes.TypeRef(g, seq),
    (g, seq) => new nodes.Unknown(g, seq)
  )
  val edgeFactories: Array[(flatgraph.GNode, flatgraph.GNode, Int, Any) => flatgraph.Edge] = Array(
    (s, d, subseq, p) => new edges.AliasOf(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Argument(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ast(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Binds(s, d, subseq, p),
    (s, d, subseq, p) => new edges.BindsTo(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Call(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Capture(s, d, subseq, p),
    (s, d, subseq, p) => new edges.CapturedBy(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cdg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cfg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Condition(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Contains(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Dominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.EvalType(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Imports(s, d, subseq, p),
    (s, d, subseq, p) => new edges.InheritsFrom(s, d, subseq, p),
    (s, d, subseq, p) => new edges.IsCallForImport(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ParameterLink(s, d, subseq, p),
    (s, d, subseq, p) => new edges.PostDominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ReachingDef(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Receiver(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ref(s, d, subseq, p),
    (s, d, subseq, p) => new edges.SourceFile(s, d, subseq, p),
    (s, d, subseq, p) => new edges.TaggedBy(s, d, subseq, p)
  )
  val nodePropertyAllocators: Array[Int => Array[?]] = Array(
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size)
  )
  val normalNodePropertyNames: Array[String] = Array(
    "ALIAS_TYPE_FULL_NAME",
    "ARGUMENT_INDEX",
    "ARGUMENT_NAME",
    "AST_PARENT_FULL_NAME",
    "AST_PARENT_TYPE",
    "CANONICAL_NAME",
    "CLOSURE_BINDING_ID",
    "CODE",
    "COLUMN_NUMBER",
    "COLUMN_NUMBER_END",
    "CONTAINED_REF",
    "CONTENT",
    "CONTROL_STRUCTURE_TYPE",
    "DEPENDENCY_GROUP_ID",
    "DISPATCH_TYPE",
    "DYNAMIC_TYPE_HINT_FULL_NAME",
    "EVALUATION_STRATEGY",
    "EVIDENCE_DESCRIPTION",
    "EXPLICIT_AS",
    "FILENAME",
    "FULL_NAME",
    "GENERIC_SIGNATURE",
    "HASH",
    "IMPORTED_AS",
    "IMPORTED_ENTITY",
    "INDEX",
    "INHERITS_FROM_TYPE_FULL_NAME",
    "IS_EXPLICIT",
    "IS_EXTERNAL",
    "IS_VARIADIC",
    "IS_WILDCARD",
    "KEY",
    "LANGUAGE",
    "LINE_NUMBER",
    "LINE_NUMBER_END",
    "METHOD_FULL_NAME",
    "MODIFIER_TYPE",
    "MYPROPERTY",
    "NAME",
    "OFFSET",
    "OFFSET_END",
    "ORDER",
    "OVERLAYS",
    "PARSER_TYPE_NAME",
    "POSSIBLE_TYPES",
    "ROOT",
    "SIGNATURE",
    "TYPE_DECL_FULL_NAME",
    "TYPE_FULL_NAME",
    "VALUE",
    "VERSION"
  )
  val nodePropertyByLabel = normalNodePropertyNames.zipWithIndex.toMap
    .updated("evidence", 51)
    .updated("keyValuePairs", 52)
    .updated("node", 53)
    .updated("tag", 54)
  val nodePropertyDescriptors: Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType] = {
    val nodePropertyDescriptors = new Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType](4840)
    for (idx <- Range(0, 4840)) {
      nodePropertyDescriptors(idx) =
        if ((idx & 1) == 0) FormalQtyType.NothingType
        else FormalQtyType.QtyNone
    }

    nodePropertyDescriptors(88) = FormalQtyType.IntType // ANNOTATION.ARGUMENT_INDEX
    nodePropertyDescriptors(89) = FormalQtyType.QtyOne
    nodePropertyDescriptors(176) = FormalQtyType.StringType // ANNOTATION.ARGUMENT_NAME
    nodePropertyDescriptors(177) = FormalQtyType.QtyOption
    nodePropertyDescriptors(616) = FormalQtyType.StringType // ANNOTATION.CODE
    nodePropertyDescriptors(617) = FormalQtyType.QtyOne
    nodePropertyDescriptors(704) = FormalQtyType.IntType // ANNOTATION.COLUMN_NUMBER
    nodePropertyDescriptors(705) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1760) = FormalQtyType.StringType // ANNOTATION.FULL_NAME
    nodePropertyDescriptors(1761) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2904) = FormalQtyType.IntType // ANNOTATION.LINE_NUMBER
    nodePropertyDescriptors(2905) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3344) = FormalQtyType.StringType // ANNOTATION.NAME
    nodePropertyDescriptors(3345) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3432) = FormalQtyType.IntType // ANNOTATION.OFFSET
    nodePropertyDescriptors(3433) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3520) = FormalQtyType.IntType // ANNOTATION.OFFSET_END
    nodePropertyDescriptors(3521) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3608) = FormalQtyType.IntType // ANNOTATION.ORDER
    nodePropertyDescriptors(3609) = FormalQtyType.QtyOne
    nodePropertyDescriptors(90) = FormalQtyType.IntType // ANNOTATION_LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(91) = FormalQtyType.QtyOne
    nodePropertyDescriptors(178) = FormalQtyType.StringType // ANNOTATION_LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(179) = FormalQtyType.QtyOption
    nodePropertyDescriptors(618) = FormalQtyType.StringType // ANNOTATION_LITERAL.CODE
    nodePropertyDescriptors(619) = FormalQtyType.QtyOne
    nodePropertyDescriptors(706) = FormalQtyType.IntType // ANNOTATION_LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(707) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2906) = FormalQtyType.IntType // ANNOTATION_LITERAL.LINE_NUMBER
    nodePropertyDescriptors(2907) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3346) = FormalQtyType.StringType // ANNOTATION_LITERAL.NAME
    nodePropertyDescriptors(3347) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3434) = FormalQtyType.IntType // ANNOTATION_LITERAL.OFFSET
    nodePropertyDescriptors(3435) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3522) = FormalQtyType.IntType // ANNOTATION_LITERAL.OFFSET_END
    nodePropertyDescriptors(3523) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3610) = FormalQtyType.IntType // ANNOTATION_LITERAL.ORDER
    nodePropertyDescriptors(3611) = FormalQtyType.QtyOne
    nodePropertyDescriptors(620) = FormalQtyType.StringType // ANNOTATION_PARAMETER.CODE
    nodePropertyDescriptors(621) = FormalQtyType.QtyOne
    nodePropertyDescriptors(708) = FormalQtyType.IntType // ANNOTATION_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(709) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2908) = FormalQtyType.IntType // ANNOTATION_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(2909) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3436) = FormalQtyType.IntType // ANNOTATION_PARAMETER.OFFSET
    nodePropertyDescriptors(3437) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3524) = FormalQtyType.IntType // ANNOTATION_PARAMETER.OFFSET_END
    nodePropertyDescriptors(3525) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3612) = FormalQtyType.IntType // ANNOTATION_PARAMETER.ORDER
    nodePropertyDescriptors(3613) = FormalQtyType.QtyOne
    nodePropertyDescriptors(622) = FormalQtyType.StringType // ANNOTATION_PARAMETER_ASSIGN.CODE
    nodePropertyDescriptors(623) = FormalQtyType.QtyOne
    nodePropertyDescriptors(710) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.COLUMN_NUMBER
    nodePropertyDescriptors(711) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2910) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.LINE_NUMBER
    nodePropertyDescriptors(2911) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3438) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.OFFSET
    nodePropertyDescriptors(3439) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3526) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.OFFSET_END
    nodePropertyDescriptors(3527) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3614) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.ORDER
    nodePropertyDescriptors(3615) = FormalQtyType.QtyOne
    nodePropertyDescriptors(96) = FormalQtyType.IntType // ARRAY_INITIALIZER.ARGUMENT_INDEX
    nodePropertyDescriptors(97) = FormalQtyType.QtyOne
    nodePropertyDescriptors(184) = FormalQtyType.StringType // ARRAY_INITIALIZER.ARGUMENT_NAME
    nodePropertyDescriptors(185) = FormalQtyType.QtyOption
    nodePropertyDescriptors(624) = FormalQtyType.StringType // ARRAY_INITIALIZER.CODE
    nodePropertyDescriptors(625) = FormalQtyType.QtyOne
    nodePropertyDescriptors(712) = FormalQtyType.IntType // ARRAY_INITIALIZER.COLUMN_NUMBER
    nodePropertyDescriptors(713) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2912) = FormalQtyType.IntType // ARRAY_INITIALIZER.LINE_NUMBER
    nodePropertyDescriptors(2913) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3440) = FormalQtyType.IntType // ARRAY_INITIALIZER.OFFSET
    nodePropertyDescriptors(3441) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3528) = FormalQtyType.IntType // ARRAY_INITIALIZER.OFFSET_END
    nodePropertyDescriptors(3529) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3616) = FormalQtyType.IntType // ARRAY_INITIALIZER.ORDER
    nodePropertyDescriptors(3617) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3090) = FormalQtyType.StringType // BINDING.METHOD_FULL_NAME
    nodePropertyDescriptors(3091) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3354) = FormalQtyType.StringType // BINDING.NAME
    nodePropertyDescriptors(3355) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4058) = FormalQtyType.StringType // BINDING.SIGNATURE
    nodePropertyDescriptors(4059) = FormalQtyType.QtyOne
    nodePropertyDescriptors(100) = FormalQtyType.IntType // BLOCK.ARGUMENT_INDEX
    nodePropertyDescriptors(101) = FormalQtyType.QtyOne
    nodePropertyDescriptors(188) = FormalQtyType.StringType // BLOCK.ARGUMENT_NAME
    nodePropertyDescriptors(189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(628) = FormalQtyType.StringType // BLOCK.CODE
    nodePropertyDescriptors(629) = FormalQtyType.QtyOne
    nodePropertyDescriptors(716) = FormalQtyType.IntType // BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(717) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1332) = FormalQtyType.StringType // BLOCK.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1333) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2916) = FormalQtyType.IntType // BLOCK.LINE_NUMBER
    nodePropertyDescriptors(2917) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3444) = FormalQtyType.IntType // BLOCK.OFFSET
    nodePropertyDescriptors(3445) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3532) = FormalQtyType.IntType // BLOCK.OFFSET_END
    nodePropertyDescriptors(3533) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3620) = FormalQtyType.IntType // BLOCK.ORDER
    nodePropertyDescriptors(3621) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3884) = FormalQtyType.StringType // BLOCK.POSSIBLE_TYPES
    nodePropertyDescriptors(3885) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4236) = FormalQtyType.StringType // BLOCK.TYPE_FULL_NAME
    nodePropertyDescriptors(4237) = FormalQtyType.QtyOne
    nodePropertyDescriptors(102) = FormalQtyType.IntType // CALL.ARGUMENT_INDEX
    nodePropertyDescriptors(103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(190) = FormalQtyType.StringType // CALL.ARGUMENT_NAME
    nodePropertyDescriptors(191) = FormalQtyType.QtyOption
    nodePropertyDescriptors(630) = FormalQtyType.StringType // CALL.CODE
    nodePropertyDescriptors(631) = FormalQtyType.QtyOne
    nodePropertyDescriptors(718) = FormalQtyType.IntType // CALL.COLUMN_NUMBER
    nodePropertyDescriptors(719) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1246) = FormalQtyType.StringType // CALL.DISPATCH_TYPE
    nodePropertyDescriptors(1247) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1334) = FormalQtyType.StringType // CALL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1335) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2918) = FormalQtyType.IntType // CALL.LINE_NUMBER
    nodePropertyDescriptors(2919) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3094) = FormalQtyType.StringType // CALL.METHOD_FULL_NAME
    nodePropertyDescriptors(3095) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3358) = FormalQtyType.StringType // CALL.NAME
    nodePropertyDescriptors(3359) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3446) = FormalQtyType.IntType // CALL.OFFSET
    nodePropertyDescriptors(3447) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3534) = FormalQtyType.IntType // CALL.OFFSET_END
    nodePropertyDescriptors(3535) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3622) = FormalQtyType.IntType // CALL.ORDER
    nodePropertyDescriptors(3623) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3886) = FormalQtyType.StringType // CALL.POSSIBLE_TYPES
    nodePropertyDescriptors(3887) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4062) = FormalQtyType.StringType // CALL.SIGNATURE
    nodePropertyDescriptors(4063) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4238) = FormalQtyType.StringType // CALL.TYPE_FULL_NAME
    nodePropertyDescriptors(4239) = FormalQtyType.QtyOne
    nodePropertyDescriptors(544) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_BINDING_ID
    nodePropertyDescriptors(545) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1424) = FormalQtyType.StringType // CLOSURE_BINDING.EVALUATION_STRATEGY
    nodePropertyDescriptors(1425) = FormalQtyType.QtyOne
    nodePropertyDescriptors(634) = FormalQtyType.StringType // COMMENT.CODE
    nodePropertyDescriptors(635) = FormalQtyType.QtyOne
    nodePropertyDescriptors(722) = FormalQtyType.IntType // COMMENT.COLUMN_NUMBER
    nodePropertyDescriptors(723) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1690) = FormalQtyType.StringType // COMMENT.FILENAME
    nodePropertyDescriptors(1691) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2922) = FormalQtyType.IntType // COMMENT.LINE_NUMBER
    nodePropertyDescriptors(2923) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3450) = FormalQtyType.IntType // COMMENT.OFFSET
    nodePropertyDescriptors(3451) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3538) = FormalQtyType.IntType // COMMENT.OFFSET_END
    nodePropertyDescriptors(3539) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3626) = FormalQtyType.IntType // COMMENT.ORDER
    nodePropertyDescriptors(3627) = FormalQtyType.QtyOne
    nodePropertyDescriptors(988) = FormalQtyType.StringType // CONFIG_FILE.CONTENT
    nodePropertyDescriptors(989) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3364) = FormalQtyType.StringType // CONFIG_FILE.NAME
    nodePropertyDescriptors(3365) = FormalQtyType.QtyOne
    nodePropertyDescriptors(110) = FormalQtyType.IntType // CONTROL_STRUCTURE.ARGUMENT_INDEX
    nodePropertyDescriptors(111) = FormalQtyType.QtyOne
    nodePropertyDescriptors(198) = FormalQtyType.StringType // CONTROL_STRUCTURE.ARGUMENT_NAME
    nodePropertyDescriptors(199) = FormalQtyType.QtyOption
    nodePropertyDescriptors(638) = FormalQtyType.StringType // CONTROL_STRUCTURE.CODE
    nodePropertyDescriptors(639) = FormalQtyType.QtyOne
    nodePropertyDescriptors(726) = FormalQtyType.IntType // CONTROL_STRUCTURE.COLUMN_NUMBER
    nodePropertyDescriptors(727) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1078) = FormalQtyType.StringType // CONTROL_STRUCTURE.CONTROL_STRUCTURE_TYPE
    nodePropertyDescriptors(1079) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2926) = FormalQtyType.IntType // CONTROL_STRUCTURE.LINE_NUMBER
    nodePropertyDescriptors(2927) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3454) = FormalQtyType.IntType // CONTROL_STRUCTURE.OFFSET
    nodePropertyDescriptors(3455) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3542) = FormalQtyType.IntType // CONTROL_STRUCTURE.OFFSET_END
    nodePropertyDescriptors(3543) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3630) = FormalQtyType.IntType // CONTROL_STRUCTURE.ORDER
    nodePropertyDescriptors(3631) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3806) = FormalQtyType.StringType // CONTROL_STRUCTURE.PARSER_TYPE_NAME
    nodePropertyDescriptors(3807) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1168) = FormalQtyType.StringType // DEPENDENCY.DEPENDENCY_GROUP_ID
    nodePropertyDescriptors(1169) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3368) = FormalQtyType.StringType // DEPENDENCY.NAME
    nodePropertyDescriptors(3369) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4424) = FormalQtyType.StringType // DEPENDENCY.VERSION
    nodePropertyDescriptors(4425) = FormalQtyType.QtyOne
    nodePropertyDescriptors(114) = FormalQtyType.IntType // FIELD_IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(115) = FormalQtyType.QtyOne
    nodePropertyDescriptors(202) = FormalQtyType.StringType // FIELD_IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(466) = FormalQtyType.StringType // FIELD_IDENTIFIER.CANONICAL_NAME
    nodePropertyDescriptors(467) = FormalQtyType.QtyOne
    nodePropertyDescriptors(642) = FormalQtyType.StringType // FIELD_IDENTIFIER.CODE
    nodePropertyDescriptors(643) = FormalQtyType.QtyOne
    nodePropertyDescriptors(730) = FormalQtyType.IntType // FIELD_IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(731) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2930) = FormalQtyType.IntType // FIELD_IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(2931) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3458) = FormalQtyType.IntType // FIELD_IDENTIFIER.OFFSET
    nodePropertyDescriptors(3459) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3546) = FormalQtyType.IntType // FIELD_IDENTIFIER.OFFSET_END
    nodePropertyDescriptors(3547) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3634) = FormalQtyType.IntType // FIELD_IDENTIFIER.ORDER
    nodePropertyDescriptors(3635) = FormalQtyType.QtyOne
    nodePropertyDescriptors(644) = FormalQtyType.StringType // FILE.CODE
    nodePropertyDescriptors(645) = FormalQtyType.QtyOne
    nodePropertyDescriptors(732) = FormalQtyType.IntType // FILE.COLUMN_NUMBER
    nodePropertyDescriptors(733) = FormalQtyType.QtyOption
    nodePropertyDescriptors(996) = FormalQtyType.StringType // FILE.CONTENT
    nodePropertyDescriptors(997) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1964) = FormalQtyType.StringType // FILE.HASH
    nodePropertyDescriptors(1965) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2932) = FormalQtyType.IntType // FILE.LINE_NUMBER
    nodePropertyDescriptors(2933) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3372) = FormalQtyType.StringType // FILE.NAME
    nodePropertyDescriptors(3373) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3460) = FormalQtyType.IntType // FILE.OFFSET
    nodePropertyDescriptors(3461) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3548) = FormalQtyType.IntType // FILE.OFFSET_END
    nodePropertyDescriptors(3549) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3636) = FormalQtyType.IntType // FILE.ORDER
    nodePropertyDescriptors(3637) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1526) = FormalQtyType.StringType // FINDING.EVIDENCE_DESCRIPTION
    nodePropertyDescriptors(1527) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4518) = FormalQtyType.RefType // FINDING.evidence
    nodePropertyDescriptors(4519) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4606) = FormalQtyType.RefType // FINDING.keyValuePairs
    nodePropertyDescriptors(4607) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(120) = FormalQtyType.IntType // IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(121) = FormalQtyType.QtyOne
    nodePropertyDescriptors(208) = FormalQtyType.StringType // IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(209) = FormalQtyType.QtyOption
    nodePropertyDescriptors(648) = FormalQtyType.StringType // IDENTIFIER.CODE
    nodePropertyDescriptors(649) = FormalQtyType.QtyOne
    nodePropertyDescriptors(736) = FormalQtyType.IntType // IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(737) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1352) = FormalQtyType.StringType // IDENTIFIER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1353) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2936) = FormalQtyType.IntType // IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(2937) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3376) = FormalQtyType.StringType // IDENTIFIER.NAME
    nodePropertyDescriptors(3377) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3464) = FormalQtyType.IntType // IDENTIFIER.OFFSET
    nodePropertyDescriptors(3465) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3552) = FormalQtyType.IntType // IDENTIFIER.OFFSET_END
    nodePropertyDescriptors(3553) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3640) = FormalQtyType.IntType // IDENTIFIER.ORDER
    nodePropertyDescriptors(3641) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3904) = FormalQtyType.StringType // IDENTIFIER.POSSIBLE_TYPES
    nodePropertyDescriptors(3905) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4256) = FormalQtyType.StringType // IDENTIFIER.TYPE_FULL_NAME
    nodePropertyDescriptors(4257) = FormalQtyType.QtyOne
    nodePropertyDescriptors(650) = FormalQtyType.StringType // IMPORT.CODE
    nodePropertyDescriptors(651) = FormalQtyType.QtyOne
    nodePropertyDescriptors(738) = FormalQtyType.IntType // IMPORT.COLUMN_NUMBER
    nodePropertyDescriptors(739) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1618) = FormalQtyType.BoolType // IMPORT.EXPLICIT_AS
    nodePropertyDescriptors(1619) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2058) = FormalQtyType.StringType // IMPORT.IMPORTED_AS
    nodePropertyDescriptors(2059) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2146) = FormalQtyType.StringType // IMPORT.IMPORTED_ENTITY
    nodePropertyDescriptors(2147) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2410) = FormalQtyType.BoolType // IMPORT.IS_EXPLICIT
    nodePropertyDescriptors(2411) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2674) = FormalQtyType.BoolType // IMPORT.IS_WILDCARD
    nodePropertyDescriptors(2675) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2938) = FormalQtyType.IntType // IMPORT.LINE_NUMBER
    nodePropertyDescriptors(2939) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3466) = FormalQtyType.IntType // IMPORT.OFFSET
    nodePropertyDescriptors(3467) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3554) = FormalQtyType.IntType // IMPORT.OFFSET_END
    nodePropertyDescriptors(3555) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3642) = FormalQtyType.IntType // IMPORT.ORDER
    nodePropertyDescriptors(3643) = FormalQtyType.QtyOne
    nodePropertyDescriptors(652) = FormalQtyType.StringType // JUMP_LABEL.CODE
    nodePropertyDescriptors(653) = FormalQtyType.QtyOne
    nodePropertyDescriptors(740) = FormalQtyType.IntType // JUMP_LABEL.COLUMN_NUMBER
    nodePropertyDescriptors(741) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2940) = FormalQtyType.IntType // JUMP_LABEL.LINE_NUMBER
    nodePropertyDescriptors(2941) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3380) = FormalQtyType.StringType // JUMP_LABEL.NAME
    nodePropertyDescriptors(3381) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3468) = FormalQtyType.IntType // JUMP_LABEL.OFFSET
    nodePropertyDescriptors(3469) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3556) = FormalQtyType.IntType // JUMP_LABEL.OFFSET_END
    nodePropertyDescriptors(3557) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3644) = FormalQtyType.IntType // JUMP_LABEL.ORDER
    nodePropertyDescriptors(3645) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3820) = FormalQtyType.StringType // JUMP_LABEL.PARSER_TYPE_NAME
    nodePropertyDescriptors(3821) = FormalQtyType.QtyOne
    nodePropertyDescriptors(126) = FormalQtyType.IntType // JUMP_TARGET.ARGUMENT_INDEX
    nodePropertyDescriptors(127) = FormalQtyType.QtyOne
    nodePropertyDescriptors(654) = FormalQtyType.StringType // JUMP_TARGET.CODE
    nodePropertyDescriptors(655) = FormalQtyType.QtyOne
    nodePropertyDescriptors(742) = FormalQtyType.IntType // JUMP_TARGET.COLUMN_NUMBER
    nodePropertyDescriptors(743) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2942) = FormalQtyType.IntType // JUMP_TARGET.LINE_NUMBER
    nodePropertyDescriptors(2943) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3382) = FormalQtyType.StringType // JUMP_TARGET.NAME
    nodePropertyDescriptors(3383) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3470) = FormalQtyType.IntType // JUMP_TARGET.OFFSET
    nodePropertyDescriptors(3471) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3558) = FormalQtyType.IntType // JUMP_TARGET.OFFSET_END
    nodePropertyDescriptors(3559) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3646) = FormalQtyType.IntType // JUMP_TARGET.ORDER
    nodePropertyDescriptors(3647) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3822) = FormalQtyType.StringType // JUMP_TARGET.PARSER_TYPE_NAME
    nodePropertyDescriptors(3823) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2768) = FormalQtyType.StringType // KEY_VALUE_PAIR.KEY
    nodePropertyDescriptors(2769) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4352) = FormalQtyType.StringType // KEY_VALUE_PAIR.VALUE
    nodePropertyDescriptors(4353) = FormalQtyType.QtyOne
    nodePropertyDescriptors(130) = FormalQtyType.IntType // LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(131) = FormalQtyType.QtyOne
    nodePropertyDescriptors(218) = FormalQtyType.StringType // LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(219) = FormalQtyType.QtyOption
    nodePropertyDescriptors(658) = FormalQtyType.StringType // LITERAL.CODE
    nodePropertyDescriptors(659) = FormalQtyType.QtyOne
    nodePropertyDescriptors(746) = FormalQtyType.IntType // LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(747) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1362) = FormalQtyType.StringType // LITERAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1363) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2946) = FormalQtyType.IntType // LITERAL.LINE_NUMBER
    nodePropertyDescriptors(2947) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3474) = FormalQtyType.IntType // LITERAL.OFFSET
    nodePropertyDescriptors(3475) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3562) = FormalQtyType.IntType // LITERAL.OFFSET_END
    nodePropertyDescriptors(3563) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3650) = FormalQtyType.IntType // LITERAL.ORDER
    nodePropertyDescriptors(3651) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3914) = FormalQtyType.StringType // LITERAL.POSSIBLE_TYPES
    nodePropertyDescriptors(3915) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4266) = FormalQtyType.StringType // LITERAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4267) = FormalQtyType.QtyOne
    nodePropertyDescriptors(572) = FormalQtyType.StringType // LOCAL.CLOSURE_BINDING_ID
    nodePropertyDescriptors(573) = FormalQtyType.QtyOption
    nodePropertyDescriptors(660) = FormalQtyType.StringType // LOCAL.CODE
    nodePropertyDescriptors(661) = FormalQtyType.QtyOne
    nodePropertyDescriptors(748) = FormalQtyType.IntType // LOCAL.COLUMN_NUMBER
    nodePropertyDescriptors(749) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1364) = FormalQtyType.StringType // LOCAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1365) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1892) = FormalQtyType.StringType // LOCAL.GENERIC_SIGNATURE
    nodePropertyDescriptors(1893) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2948) = FormalQtyType.IntType // LOCAL.LINE_NUMBER
    nodePropertyDescriptors(2949) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3388) = FormalQtyType.StringType // LOCAL.NAME
    nodePropertyDescriptors(3389) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3476) = FormalQtyType.IntType // LOCAL.OFFSET
    nodePropertyDescriptors(3477) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3564) = FormalQtyType.IntType // LOCAL.OFFSET_END
    nodePropertyDescriptors(3565) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3652) = FormalQtyType.IntType // LOCAL.ORDER
    nodePropertyDescriptors(3653) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3916) = FormalQtyType.StringType // LOCAL.POSSIBLE_TYPES
    nodePropertyDescriptors(3917) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4268) = FormalQtyType.StringType // LOCAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4269) = FormalQtyType.QtyOne
    nodePropertyDescriptors(310) = FormalQtyType.StringType // MEMBER.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(311) = FormalQtyType.QtyOne
    nodePropertyDescriptors(398) = FormalQtyType.StringType // MEMBER.AST_PARENT_TYPE
    nodePropertyDescriptors(399) = FormalQtyType.QtyOne
    nodePropertyDescriptors(662) = FormalQtyType.StringType // MEMBER.CODE
    nodePropertyDescriptors(663) = FormalQtyType.QtyOne
    nodePropertyDescriptors(750) = FormalQtyType.IntType // MEMBER.COLUMN_NUMBER
    nodePropertyDescriptors(751) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1366) = FormalQtyType.StringType // MEMBER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1367) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1894) = FormalQtyType.StringType // MEMBER.GENERIC_SIGNATURE
    nodePropertyDescriptors(1895) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2950) = FormalQtyType.IntType // MEMBER.LINE_NUMBER
    nodePropertyDescriptors(2951) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3390) = FormalQtyType.StringType // MEMBER.NAME
    nodePropertyDescriptors(3391) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3478) = FormalQtyType.IntType // MEMBER.OFFSET
    nodePropertyDescriptors(3479) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3566) = FormalQtyType.IntType // MEMBER.OFFSET_END
    nodePropertyDescriptors(3567) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3654) = FormalQtyType.IntType // MEMBER.ORDER
    nodePropertyDescriptors(3655) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3918) = FormalQtyType.StringType // MEMBER.POSSIBLE_TYPES
    nodePropertyDescriptors(3919) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4270) = FormalQtyType.StringType // MEMBER.TYPE_FULL_NAME
    nodePropertyDescriptors(4271) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1984) = FormalQtyType.StringType // META_DATA.HASH
    nodePropertyDescriptors(1985) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2864) = FormalQtyType.StringType // META_DATA.LANGUAGE
    nodePropertyDescriptors(2865) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3744) = FormalQtyType.StringType // META_DATA.OVERLAYS
    nodePropertyDescriptors(3745) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4008) = FormalQtyType.StringType // META_DATA.ROOT
    nodePropertyDescriptors(4009) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4448) = FormalQtyType.StringType // META_DATA.VERSION
    nodePropertyDescriptors(4449) = FormalQtyType.QtyOne
    nodePropertyDescriptors(314) = FormalQtyType.StringType // METHOD.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(315) = FormalQtyType.QtyOne
    nodePropertyDescriptors(402) = FormalQtyType.StringType // METHOD.AST_PARENT_TYPE
    nodePropertyDescriptors(403) = FormalQtyType.QtyOne
    nodePropertyDescriptors(666) = FormalQtyType.StringType // METHOD.CODE
    nodePropertyDescriptors(667) = FormalQtyType.QtyOne
    nodePropertyDescriptors(754) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER
    nodePropertyDescriptors(755) = FormalQtyType.QtyOption
    nodePropertyDescriptors(842) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER_END
    nodePropertyDescriptors(843) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1722) = FormalQtyType.StringType // METHOD.FILENAME
    nodePropertyDescriptors(1723) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1810) = FormalQtyType.StringType // METHOD.FULL_NAME
    nodePropertyDescriptors(1811) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1898) = FormalQtyType.StringType // METHOD.GENERIC_SIGNATURE
    nodePropertyDescriptors(1899) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1986) = FormalQtyType.StringType // METHOD.HASH
    nodePropertyDescriptors(1987) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2514) = FormalQtyType.BoolType // METHOD.IS_EXTERNAL
    nodePropertyDescriptors(2515) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2954) = FormalQtyType.IntType // METHOD.LINE_NUMBER
    nodePropertyDescriptors(2955) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3042) = FormalQtyType.IntType // METHOD.LINE_NUMBER_END
    nodePropertyDescriptors(3043) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3394) = FormalQtyType.StringType // METHOD.NAME
    nodePropertyDescriptors(3395) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3482) = FormalQtyType.IntType // METHOD.OFFSET
    nodePropertyDescriptors(3483) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3570) = FormalQtyType.IntType // METHOD.OFFSET_END
    nodePropertyDescriptors(3571) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3658) = FormalQtyType.IntType // METHOD.ORDER
    nodePropertyDescriptors(3659) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4098) = FormalQtyType.StringType // METHOD.SIGNATURE
    nodePropertyDescriptors(4099) = FormalQtyType.QtyOne
    nodePropertyDescriptors(580) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CLOSURE_BINDING_ID
    nodePropertyDescriptors(581) = FormalQtyType.QtyOption
    nodePropertyDescriptors(668) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CODE
    nodePropertyDescriptors(669) = FormalQtyType.QtyOne
    nodePropertyDescriptors(756) = FormalQtyType.IntType // METHOD_PARAMETER_IN.COLUMN_NUMBER
    nodePropertyDescriptors(757) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1372) = FormalQtyType.StringType // METHOD_PARAMETER_IN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1373) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1460) = FormalQtyType.StringType // METHOD_PARAMETER_IN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1461) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2252) = FormalQtyType.IntType // METHOD_PARAMETER_IN.INDEX
    nodePropertyDescriptors(2253) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2604) = FormalQtyType.BoolType // METHOD_PARAMETER_IN.IS_VARIADIC
    nodePropertyDescriptors(2605) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2956) = FormalQtyType.IntType // METHOD_PARAMETER_IN.LINE_NUMBER
    nodePropertyDescriptors(2957) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3396) = FormalQtyType.StringType // METHOD_PARAMETER_IN.NAME
    nodePropertyDescriptors(3397) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3484) = FormalQtyType.IntType // METHOD_PARAMETER_IN.OFFSET
    nodePropertyDescriptors(3485) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3572) = FormalQtyType.IntType // METHOD_PARAMETER_IN.OFFSET_END
    nodePropertyDescriptors(3573) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3660) = FormalQtyType.IntType // METHOD_PARAMETER_IN.ORDER
    nodePropertyDescriptors(3661) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3924) = FormalQtyType.StringType // METHOD_PARAMETER_IN.POSSIBLE_TYPES
    nodePropertyDescriptors(3925) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4276) = FormalQtyType.StringType // METHOD_PARAMETER_IN.TYPE_FULL_NAME
    nodePropertyDescriptors(4277) = FormalQtyType.QtyOne
    nodePropertyDescriptors(670) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.CODE
    nodePropertyDescriptors(671) = FormalQtyType.QtyOne
    nodePropertyDescriptors(758) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.COLUMN_NUMBER
    nodePropertyDescriptors(759) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1462) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.EVALUATION_STRATEGY
    nodePropertyDescriptors(1463) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2254) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.INDEX
    nodePropertyDescriptors(2255) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2606) = FormalQtyType.BoolType // METHOD_PARAMETER_OUT.IS_VARIADIC
    nodePropertyDescriptors(2607) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2958) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.LINE_NUMBER
    nodePropertyDescriptors(2959) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3398) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.NAME
    nodePropertyDescriptors(3399) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3486) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.OFFSET
    nodePropertyDescriptors(3487) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3574) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.OFFSET_END
    nodePropertyDescriptors(3575) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3662) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.ORDER
    nodePropertyDescriptors(3663) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4278) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.TYPE_FULL_NAME
    nodePropertyDescriptors(4279) = FormalQtyType.QtyOne
    nodePropertyDescriptors(144) = FormalQtyType.IntType // METHOD_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(145) = FormalQtyType.QtyOne
    nodePropertyDescriptors(232) = FormalQtyType.StringType // METHOD_REF.ARGUMENT_NAME
    nodePropertyDescriptors(233) = FormalQtyType.QtyOption
    nodePropertyDescriptors(672) = FormalQtyType.StringType // METHOD_REF.CODE
    nodePropertyDescriptors(673) = FormalQtyType.QtyOne
    nodePropertyDescriptors(760) = FormalQtyType.IntType // METHOD_REF.COLUMN_NUMBER
    nodePropertyDescriptors(761) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1376) = FormalQtyType.StringType // METHOD_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1377) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2960) = FormalQtyType.IntType // METHOD_REF.LINE_NUMBER
    nodePropertyDescriptors(2961) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3136) = FormalQtyType.StringType // METHOD_REF.METHOD_FULL_NAME
    nodePropertyDescriptors(3137) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3488) = FormalQtyType.IntType // METHOD_REF.OFFSET
    nodePropertyDescriptors(3489) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3576) = FormalQtyType.IntType // METHOD_REF.OFFSET_END
    nodePropertyDescriptors(3577) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3664) = FormalQtyType.IntType // METHOD_REF.ORDER
    nodePropertyDescriptors(3665) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3928) = FormalQtyType.StringType // METHOD_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(3929) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4280) = FormalQtyType.StringType // METHOD_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4281) = FormalQtyType.QtyOne
    nodePropertyDescriptors(674) = FormalQtyType.StringType // METHOD_RETURN.CODE
    nodePropertyDescriptors(675) = FormalQtyType.QtyOne
    nodePropertyDescriptors(762) = FormalQtyType.IntType // METHOD_RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(763) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1378) = FormalQtyType.StringType // METHOD_RETURN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1379) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1466) = FormalQtyType.StringType // METHOD_RETURN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1467) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2962) = FormalQtyType.IntType // METHOD_RETURN.LINE_NUMBER
    nodePropertyDescriptors(2963) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3490) = FormalQtyType.IntType // METHOD_RETURN.OFFSET
    nodePropertyDescriptors(3491) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3578) = FormalQtyType.IntType // METHOD_RETURN.OFFSET_END
    nodePropertyDescriptors(3579) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3666) = FormalQtyType.IntType // METHOD_RETURN.ORDER
    nodePropertyDescriptors(3667) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3930) = FormalQtyType.StringType // METHOD_RETURN.POSSIBLE_TYPES
    nodePropertyDescriptors(3931) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4282) = FormalQtyType.StringType // METHOD_RETURN.TYPE_FULL_NAME
    nodePropertyDescriptors(4283) = FormalQtyType.QtyOne
    nodePropertyDescriptors(676) = FormalQtyType.StringType // MODIFIER.CODE
    nodePropertyDescriptors(677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(764) = FormalQtyType.IntType // MODIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(765) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2964) = FormalQtyType.IntType // MODIFIER.LINE_NUMBER
    nodePropertyDescriptors(2965) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3228) = FormalQtyType.StringType // MODIFIER.MODIFIER_TYPE
    nodePropertyDescriptors(3229) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3492) = FormalQtyType.IntType // MODIFIER.OFFSET
    nodePropertyDescriptors(3493) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3580) = FormalQtyType.IntType // MODIFIER.OFFSET_END
    nodePropertyDescriptors(3581) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3668) = FormalQtyType.IntType // MODIFIER.ORDER
    nodePropertyDescriptors(3669) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3318) = FormalQtyType.StringType // MYNODETYPE.MYPROPERTY
    nodePropertyDescriptors(3319) = FormalQtyType.QtyOne
    nodePropertyDescriptors(680) = FormalQtyType.StringType // NAMESPACE.CODE
    nodePropertyDescriptors(681) = FormalQtyType.QtyOne
    nodePropertyDescriptors(768) = FormalQtyType.IntType // NAMESPACE.COLUMN_NUMBER
    nodePropertyDescriptors(769) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2968) = FormalQtyType.IntType // NAMESPACE.LINE_NUMBER
    nodePropertyDescriptors(2969) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3408) = FormalQtyType.StringType // NAMESPACE.NAME
    nodePropertyDescriptors(3409) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3496) = FormalQtyType.IntType // NAMESPACE.OFFSET
    nodePropertyDescriptors(3497) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3584) = FormalQtyType.IntType // NAMESPACE.OFFSET_END
    nodePropertyDescriptors(3585) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3672) = FormalQtyType.IntType // NAMESPACE.ORDER
    nodePropertyDescriptors(3673) = FormalQtyType.QtyOne
    nodePropertyDescriptors(682) = FormalQtyType.StringType // NAMESPACE_BLOCK.CODE
    nodePropertyDescriptors(683) = FormalQtyType.QtyOne
    nodePropertyDescriptors(770) = FormalQtyType.IntType // NAMESPACE_BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(771) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1738) = FormalQtyType.StringType // NAMESPACE_BLOCK.FILENAME
    nodePropertyDescriptors(1739) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1826) = FormalQtyType.StringType // NAMESPACE_BLOCK.FULL_NAME
    nodePropertyDescriptors(1827) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2970) = FormalQtyType.IntType // NAMESPACE_BLOCK.LINE_NUMBER
    nodePropertyDescriptors(2971) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3410) = FormalQtyType.StringType // NAMESPACE_BLOCK.NAME
    nodePropertyDescriptors(3411) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3498) = FormalQtyType.IntType // NAMESPACE_BLOCK.OFFSET
    nodePropertyDescriptors(3499) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3586) = FormalQtyType.IntType // NAMESPACE_BLOCK.OFFSET_END
    nodePropertyDescriptors(3587) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3674) = FormalQtyType.IntType // NAMESPACE_BLOCK.ORDER
    nodePropertyDescriptors(3675) = FormalQtyType.QtyOne
    nodePropertyDescriptors(156) = FormalQtyType.IntType // RETURN.ARGUMENT_INDEX
    nodePropertyDescriptors(157) = FormalQtyType.QtyOne
    nodePropertyDescriptors(244) = FormalQtyType.StringType // RETURN.ARGUMENT_NAME
    nodePropertyDescriptors(245) = FormalQtyType.QtyOption
    nodePropertyDescriptors(684) = FormalQtyType.StringType // RETURN.CODE
    nodePropertyDescriptors(685) = FormalQtyType.QtyOne
    nodePropertyDescriptors(772) = FormalQtyType.IntType // RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(773) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2972) = FormalQtyType.IntType // RETURN.LINE_NUMBER
    nodePropertyDescriptors(2973) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3500) = FormalQtyType.IntType // RETURN.OFFSET
    nodePropertyDescriptors(3501) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3588) = FormalQtyType.IntType // RETURN.OFFSET_END
    nodePropertyDescriptors(3589) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3676) = FormalQtyType.IntType // RETURN.ORDER
    nodePropertyDescriptors(3677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3414) = FormalQtyType.StringType // TAG.NAME
    nodePropertyDescriptors(3415) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4382) = FormalQtyType.StringType // TAG.VALUE
    nodePropertyDescriptors(4383) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4736) = FormalQtyType.RefType // TAG_NODE_PAIR.node
    nodePropertyDescriptors(4737) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4824) = FormalQtyType.RefType // TAG_NODE_PAIR.tag
    nodePropertyDescriptors(4825) = FormalQtyType.QtyOne
    nodePropertyDescriptors(162) = FormalQtyType.IntType // TEMPLATE_DOM.ARGUMENT_INDEX
    nodePropertyDescriptors(163) = FormalQtyType.QtyOne
    nodePropertyDescriptors(250) = FormalQtyType.StringType // TEMPLATE_DOM.ARGUMENT_NAME
    nodePropertyDescriptors(251) = FormalQtyType.QtyOption
    nodePropertyDescriptors(690) = FormalQtyType.StringType // TEMPLATE_DOM.CODE
    nodePropertyDescriptors(691) = FormalQtyType.QtyOne
    nodePropertyDescriptors(778) = FormalQtyType.IntType // TEMPLATE_DOM.COLUMN_NUMBER
    nodePropertyDescriptors(779) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2978) = FormalQtyType.IntType // TEMPLATE_DOM.LINE_NUMBER
    nodePropertyDescriptors(2979) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3418) = FormalQtyType.StringType // TEMPLATE_DOM.NAME
    nodePropertyDescriptors(3419) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3506) = FormalQtyType.IntType // TEMPLATE_DOM.OFFSET
    nodePropertyDescriptors(3507) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3594) = FormalQtyType.IntType // TEMPLATE_DOM.OFFSET_END
    nodePropertyDescriptors(3595) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3682) = FormalQtyType.IntType // TEMPLATE_DOM.ORDER
    nodePropertyDescriptors(3683) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1836) = FormalQtyType.StringType // TYPE.FULL_NAME
    nodePropertyDescriptors(1837) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3420) = FormalQtyType.StringType // TYPE.NAME
    nodePropertyDescriptors(3421) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4212) = FormalQtyType.StringType // TYPE.TYPE_DECL_FULL_NAME
    nodePropertyDescriptors(4213) = FormalQtyType.QtyOne
    nodePropertyDescriptors(694) = FormalQtyType.StringType // TYPE_ARGUMENT.CODE
    nodePropertyDescriptors(695) = FormalQtyType.QtyOne
    nodePropertyDescriptors(782) = FormalQtyType.IntType // TYPE_ARGUMENT.COLUMN_NUMBER
    nodePropertyDescriptors(783) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2982) = FormalQtyType.IntType // TYPE_ARGUMENT.LINE_NUMBER
    nodePropertyDescriptors(2983) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3510) = FormalQtyType.IntType // TYPE_ARGUMENT.OFFSET
    nodePropertyDescriptors(3511) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3598) = FormalQtyType.IntType // TYPE_ARGUMENT.OFFSET_END
    nodePropertyDescriptors(3599) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3686) = FormalQtyType.IntType // TYPE_ARGUMENT.ORDER
    nodePropertyDescriptors(3687) = FormalQtyType.QtyOne
    nodePropertyDescriptors(80) = FormalQtyType.StringType // TYPE_DECL.ALIAS_TYPE_FULL_NAME
    nodePropertyDescriptors(81) = FormalQtyType.QtyOption
    nodePropertyDescriptors(344) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(345) = FormalQtyType.QtyOne
    nodePropertyDescriptors(432) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_TYPE
    nodePropertyDescriptors(433) = FormalQtyType.QtyOne
    nodePropertyDescriptors(696) = FormalQtyType.StringType // TYPE_DECL.CODE
    nodePropertyDescriptors(697) = FormalQtyType.QtyOne
    nodePropertyDescriptors(784) = FormalQtyType.IntType // TYPE_DECL.COLUMN_NUMBER
    nodePropertyDescriptors(785) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1752) = FormalQtyType.StringType // TYPE_DECL.FILENAME
    nodePropertyDescriptors(1753) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1840) = FormalQtyType.StringType // TYPE_DECL.FULL_NAME
    nodePropertyDescriptors(1841) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1928) = FormalQtyType.StringType // TYPE_DECL.GENERIC_SIGNATURE
    nodePropertyDescriptors(1929) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2368) = FormalQtyType.StringType // TYPE_DECL.INHERITS_FROM_TYPE_FULL_NAME
    nodePropertyDescriptors(2369) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2544) = FormalQtyType.BoolType // TYPE_DECL.IS_EXTERNAL
    nodePropertyDescriptors(2545) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2984) = FormalQtyType.IntType // TYPE_DECL.LINE_NUMBER
    nodePropertyDescriptors(2985) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3424) = FormalQtyType.StringType // TYPE_DECL.NAME
    nodePropertyDescriptors(3425) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3512) = FormalQtyType.IntType // TYPE_DECL.OFFSET
    nodePropertyDescriptors(3513) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3600) = FormalQtyType.IntType // TYPE_DECL.OFFSET_END
    nodePropertyDescriptors(3601) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3688) = FormalQtyType.IntType // TYPE_DECL.ORDER
    nodePropertyDescriptors(3689) = FormalQtyType.QtyOne
    nodePropertyDescriptors(698) = FormalQtyType.StringType // TYPE_PARAMETER.CODE
    nodePropertyDescriptors(699) = FormalQtyType.QtyOne
    nodePropertyDescriptors(786) = FormalQtyType.IntType // TYPE_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(787) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2986) = FormalQtyType.IntType // TYPE_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(2987) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3426) = FormalQtyType.StringType // TYPE_PARAMETER.NAME
    nodePropertyDescriptors(3427) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3514) = FormalQtyType.IntType // TYPE_PARAMETER.OFFSET
    nodePropertyDescriptors(3515) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3602) = FormalQtyType.IntType // TYPE_PARAMETER.OFFSET_END
    nodePropertyDescriptors(3603) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3690) = FormalQtyType.IntType // TYPE_PARAMETER.ORDER
    nodePropertyDescriptors(3691) = FormalQtyType.QtyOne
    nodePropertyDescriptors(172) = FormalQtyType.IntType // TYPE_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(173) = FormalQtyType.QtyOne
    nodePropertyDescriptors(260) = FormalQtyType.StringType // TYPE_REF.ARGUMENT_NAME
    nodePropertyDescriptors(261) = FormalQtyType.QtyOption
    nodePropertyDescriptors(700) = FormalQtyType.StringType // TYPE_REF.CODE
    nodePropertyDescriptors(701) = FormalQtyType.QtyOne
    nodePropertyDescriptors(788) = FormalQtyType.IntType // TYPE_REF.COLUMN_NUMBER
    nodePropertyDescriptors(789) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1404) = FormalQtyType.StringType // TYPE_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1405) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2988) = FormalQtyType.IntType // TYPE_REF.LINE_NUMBER
    nodePropertyDescriptors(2989) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3516) = FormalQtyType.IntType // TYPE_REF.OFFSET
    nodePropertyDescriptors(3517) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3604) = FormalQtyType.IntType // TYPE_REF.OFFSET_END
    nodePropertyDescriptors(3605) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3692) = FormalQtyType.IntType // TYPE_REF.ORDER
    nodePropertyDescriptors(3693) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3956) = FormalQtyType.StringType // TYPE_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(3957) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4308) = FormalQtyType.StringType // TYPE_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4309) = FormalQtyType.QtyOne
    nodePropertyDescriptors(174) = FormalQtyType.IntType // UNKNOWN.ARGUMENT_INDEX
    nodePropertyDescriptors(175) = FormalQtyType.QtyOne
    nodePropertyDescriptors(262) = FormalQtyType.StringType // UNKNOWN.ARGUMENT_NAME
    nodePropertyDescriptors(263) = FormalQtyType.QtyOption
    nodePropertyDescriptors(702) = FormalQtyType.StringType // UNKNOWN.CODE
    nodePropertyDescriptors(703) = FormalQtyType.QtyOne
    nodePropertyDescriptors(790) = FormalQtyType.IntType // UNKNOWN.COLUMN_NUMBER
    nodePropertyDescriptors(791) = FormalQtyType.QtyOption
    nodePropertyDescriptors(966) = FormalQtyType.StringType // UNKNOWN.CONTAINED_REF
    nodePropertyDescriptors(967) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1406) = FormalQtyType.StringType // UNKNOWN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1407) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2990) = FormalQtyType.IntType // UNKNOWN.LINE_NUMBER
    nodePropertyDescriptors(2991) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3518) = FormalQtyType.IntType // UNKNOWN.OFFSET
    nodePropertyDescriptors(3519) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3606) = FormalQtyType.IntType // UNKNOWN.OFFSET_END
    nodePropertyDescriptors(3607) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3694) = FormalQtyType.IntType // UNKNOWN.ORDER
    nodePropertyDescriptors(3695) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3870) = FormalQtyType.StringType // UNKNOWN.PARSER_TYPE_NAME
    nodePropertyDescriptors(3871) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3958) = FormalQtyType.StringType // UNKNOWN.POSSIBLE_TYPES
    nodePropertyDescriptors(3959) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4310) = FormalQtyType.StringType // UNKNOWN.TYPE_FULL_NAME
    nodePropertyDescriptors(4311) = FormalQtyType.QtyOne
    nodePropertyDescriptors
  }
  private val newNodeInsertionHelpers: Array[flatgraph.NewNodePropertyInsertionHelper] = {
    val _newNodeInserters = new Array[flatgraph.NewNodePropertyInsertionHelper](4840)
    _newNodeInserters(88) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentIndex
    _newNodeInserters(176) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentName
    _newNodeInserters(616) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_code
    _newNodeInserters(704) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_columnNumber
    _newNodeInserters(1760) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_fullName
    _newNodeInserters(2904) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_lineNumber
    _newNodeInserters(3344) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_name
    _newNodeInserters(3432) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_offset
    _newNodeInserters(3520) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_offsetEnd
    _newNodeInserters(3608) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_order
    _newNodeInserters(90) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentIndex
    _newNodeInserters(178) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentName
    _newNodeInserters(618) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_code
    _newNodeInserters(706) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_columnNumber
    _newNodeInserters(2906) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_lineNumber
    _newNodeInserters(3346) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_name
    _newNodeInserters(3434) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_offset
    _newNodeInserters(3522) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_offsetEnd
    _newNodeInserters(3610) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_order
    _newNodeInserters(620) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_code
    _newNodeInserters(708) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_columnNumber
    _newNodeInserters(2908) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_lineNumber
    _newNodeInserters(3436) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_offset
    _newNodeInserters(3524) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_offsetEnd
    _newNodeInserters(3612) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_order
    _newNodeInserters(622) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_code
    _newNodeInserters(710) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_columnNumber
    _newNodeInserters(2910) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_lineNumber
    _newNodeInserters(3438) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_offset
    _newNodeInserters(3526) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_offsetEnd
    _newNodeInserters(3614) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_order
    _newNodeInserters(96) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentIndex
    _newNodeInserters(184) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentName
    _newNodeInserters(624) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_code
    _newNodeInserters(712) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_columnNumber
    _newNodeInserters(2912) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_lineNumber
    _newNodeInserters(3440) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_offset
    _newNodeInserters(3528) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_offsetEnd
    _newNodeInserters(3616) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_order
    _newNodeInserters(3090) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_methodFullName
    _newNodeInserters(3354) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_name
    _newNodeInserters(4058) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_signature
    _newNodeInserters(100) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentIndex
    _newNodeInserters(188) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentName
    _newNodeInserters(628) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_code
    _newNodeInserters(716) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_columnNumber
    _newNodeInserters(1332) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_dynamicTypeHintFullName
    _newNodeInserters(2916) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_lineNumber
    _newNodeInserters(3444) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_offset
    _newNodeInserters(3532) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_offsetEnd
    _newNodeInserters(3620) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_order
    _newNodeInserters(3884) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_possibleTypes
    _newNodeInserters(4236) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_typeFullName
    _newNodeInserters(102) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentIndex
    _newNodeInserters(190) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentName
    _newNodeInserters(630) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_code
    _newNodeInserters(718) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_columnNumber
    _newNodeInserters(1246) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dispatchType
    _newNodeInserters(1334) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dynamicTypeHintFullName
    _newNodeInserters(2918) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_lineNumber
    _newNodeInserters(3094) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_methodFullName
    _newNodeInserters(3358) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_name
    _newNodeInserters(3446) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_offset
    _newNodeInserters(3534) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_offsetEnd
    _newNodeInserters(3622) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_order
    _newNodeInserters(3886) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_possibleTypes
    _newNodeInserters(4062) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_signature
    _newNodeInserters(4238) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_typeFullName
    _newNodeInserters(544) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_closureBindingId
    _newNodeInserters(1424) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_evaluationStrategy
    _newNodeInserters(634) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_code
    _newNodeInserters(722) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_columnNumber
    _newNodeInserters(1690) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_filename
    _newNodeInserters(2922) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_lineNumber
    _newNodeInserters(3450) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_offset
    _newNodeInserters(3538) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_offsetEnd
    _newNodeInserters(3626) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_order
    _newNodeInserters(988) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_content
    _newNodeInserters(3364) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_name
    _newNodeInserters(110) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentIndex
    _newNodeInserters(198) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentName
    _newNodeInserters(638) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_code
    _newNodeInserters(726) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_columnNumber
    _newNodeInserters(1078) =
      nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_controlStructureType
    _newNodeInserters(2926) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_lineNumber
    _newNodeInserters(3454) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_offset
    _newNodeInserters(3542) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_offsetEnd
    _newNodeInserters(3630) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_order
    _newNodeInserters(3806) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_parserTypeName
    _newNodeInserters(1168) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_dependencyGroupId
    _newNodeInserters(3368) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_name
    _newNodeInserters(4424) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_version
    _newNodeInserters(114) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentIndex
    _newNodeInserters(202) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentName
    _newNodeInserters(466) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_canonicalName
    _newNodeInserters(642) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_code
    _newNodeInserters(730) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_columnNumber
    _newNodeInserters(2930) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_lineNumber
    _newNodeInserters(3458) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_offset
    _newNodeInserters(3546) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_offsetEnd
    _newNodeInserters(3634) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_order
    _newNodeInserters(644) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_code
    _newNodeInserters(732) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_columnNumber
    _newNodeInserters(996) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_content
    _newNodeInserters(1964) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_hash
    _newNodeInserters(2932) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_lineNumber
    _newNodeInserters(3372) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_name
    _newNodeInserters(3460) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_offset
    _newNodeInserters(3548) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_offsetEnd
    _newNodeInserters(3636) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_order
    _newNodeInserters(1526) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_evidenceDescription
    _newNodeInserters(4518) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_evidence
    _newNodeInserters(4606) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_keyValuePairs
    _newNodeInserters(120) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentIndex
    _newNodeInserters(208) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentName
    _newNodeInserters(648) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_code
    _newNodeInserters(736) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_columnNumber
    _newNodeInserters(1352) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_dynamicTypeHintFullName
    _newNodeInserters(2936) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_lineNumber
    _newNodeInserters(3376) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_name
    _newNodeInserters(3464) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_offset
    _newNodeInserters(3552) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_offsetEnd
    _newNodeInserters(3640) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_order
    _newNodeInserters(3904) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_possibleTypes
    _newNodeInserters(4256) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_typeFullName
    _newNodeInserters(650) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_code
    _newNodeInserters(738) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_columnNumber
    _newNodeInserters(1618) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_explicitAs
    _newNodeInserters(2058) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedAs
    _newNodeInserters(2146) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedEntity
    _newNodeInserters(2410) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isExplicit
    _newNodeInserters(2674) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isWildcard
    _newNodeInserters(2938) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_lineNumber
    _newNodeInserters(3466) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_offset
    _newNodeInserters(3554) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_offsetEnd
    _newNodeInserters(3642) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_order
    _newNodeInserters(652) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_code
    _newNodeInserters(740) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_columnNumber
    _newNodeInserters(2940) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_lineNumber
    _newNodeInserters(3380) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_name
    _newNodeInserters(3468) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_offset
    _newNodeInserters(3556) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_offsetEnd
    _newNodeInserters(3644) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_order
    _newNodeInserters(3820) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_parserTypeName
    _newNodeInserters(126) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_argumentIndex
    _newNodeInserters(654) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_code
    _newNodeInserters(742) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_columnNumber
    _newNodeInserters(2942) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_lineNumber
    _newNodeInserters(3382) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_name
    _newNodeInserters(3470) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_offset
    _newNodeInserters(3558) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_offsetEnd
    _newNodeInserters(3646) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_order
    _newNodeInserters(3822) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_parserTypeName
    _newNodeInserters(2768) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_key
    _newNodeInserters(4352) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_value
    _newNodeInserters(130) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentIndex
    _newNodeInserters(218) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentName
    _newNodeInserters(658) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_code
    _newNodeInserters(746) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_columnNumber
    _newNodeInserters(1362) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_dynamicTypeHintFullName
    _newNodeInserters(2946) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_lineNumber
    _newNodeInserters(3474) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_offset
    _newNodeInserters(3562) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_offsetEnd
    _newNodeInserters(3650) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_order
    _newNodeInserters(3914) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_possibleTypes
    _newNodeInserters(4266) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_typeFullName
    _newNodeInserters(572) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_closureBindingId
    _newNodeInserters(660) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_code
    _newNodeInserters(748) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_columnNumber
    _newNodeInserters(1364) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_dynamicTypeHintFullName
    _newNodeInserters(1892) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_genericSignature
    _newNodeInserters(2948) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_lineNumber
    _newNodeInserters(3388) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_name
    _newNodeInserters(3476) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_offset
    _newNodeInserters(3564) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_offsetEnd
    _newNodeInserters(3652) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_order
    _newNodeInserters(3916) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_possibleTypes
    _newNodeInserters(4268) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_typeFullName
    _newNodeInserters(310) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentFullName
    _newNodeInserters(398) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentType
    _newNodeInserters(662) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_code
    _newNodeInserters(750) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_columnNumber
    _newNodeInserters(1366) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_dynamicTypeHintFullName
    _newNodeInserters(1894) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_genericSignature
    _newNodeInserters(2950) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_lineNumber
    _newNodeInserters(3390) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_name
    _newNodeInserters(3478) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_offset
    _newNodeInserters(3566) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_offsetEnd
    _newNodeInserters(3654) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_order
    _newNodeInserters(3918) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_possibleTypes
    _newNodeInserters(4270) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_typeFullName
    _newNodeInserters(1984) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_hash
    _newNodeInserters(2864) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_language
    _newNodeInserters(3744) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_overlays
    _newNodeInserters(4008) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_root
    _newNodeInserters(4448) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_version
    _newNodeInserters(314) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentFullName
    _newNodeInserters(402) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentType
    _newNodeInserters(666) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_code
    _newNodeInserters(754) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumber
    _newNodeInserters(842) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumberEnd
    _newNodeInserters(1722) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_filename
    _newNodeInserters(1810) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_fullName
    _newNodeInserters(1898) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_genericSignature
    _newNodeInserters(1986) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_hash
    _newNodeInserters(2514) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_isExternal
    _newNodeInserters(2954) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumber
    _newNodeInserters(3042) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumberEnd
    _newNodeInserters(3394) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_name
    _newNodeInserters(3482) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offset
    _newNodeInserters(3570) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offsetEnd
    _newNodeInserters(3658) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_order
    _newNodeInserters(4098) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_signature
    _newNodeInserters(580) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_closureBindingId
    _newNodeInserters(668) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_code
    _newNodeInserters(756) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_columnNumber
    _newNodeInserters(1372) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_dynamicTypeHintFullName
    _newNodeInserters(1460) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_evaluationStrategy
    _newNodeInserters(2252) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_index
    _newNodeInserters(2604) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_isVariadic
    _newNodeInserters(2956) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_lineNumber
    _newNodeInserters(3396) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_name
    _newNodeInserters(3484) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_offset
    _newNodeInserters(3572) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_offsetEnd
    _newNodeInserters(3660) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_order
    _newNodeInserters(3924) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_possibleTypes
    _newNodeInserters(4276) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_typeFullName
    _newNodeInserters(670) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_code
    _newNodeInserters(758) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_columnNumber
    _newNodeInserters(1462) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_evaluationStrategy
    _newNodeInserters(2254) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_index
    _newNodeInserters(2606) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_isVariadic
    _newNodeInserters(2958) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_lineNumber
    _newNodeInserters(3398) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_name
    _newNodeInserters(3486) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_offset
    _newNodeInserters(3574) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_offsetEnd
    _newNodeInserters(3662) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_order
    _newNodeInserters(4278) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_typeFullName
    _newNodeInserters(144) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentIndex
    _newNodeInserters(232) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentName
    _newNodeInserters(672) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_code
    _newNodeInserters(760) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_columnNumber
    _newNodeInserters(1376) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_dynamicTypeHintFullName
    _newNodeInserters(2960) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_lineNumber
    _newNodeInserters(3136) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_methodFullName
    _newNodeInserters(3488) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_offset
    _newNodeInserters(3576) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_offsetEnd
    _newNodeInserters(3664) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_order
    _newNodeInserters(3928) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_possibleTypes
    _newNodeInserters(4280) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_typeFullName
    _newNodeInserters(674) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_code
    _newNodeInserters(762) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_columnNumber
    _newNodeInserters(1378) =
      nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_dynamicTypeHintFullName
    _newNodeInserters(1466) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_evaluationStrategy
    _newNodeInserters(2962) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_lineNumber
    _newNodeInserters(3490) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_offset
    _newNodeInserters(3578) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_offsetEnd
    _newNodeInserters(3666) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_order
    _newNodeInserters(3930) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_possibleTypes
    _newNodeInserters(4282) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_typeFullName
    _newNodeInserters(676) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_code
    _newNodeInserters(764) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_columnNumber
    _newNodeInserters(2964) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_lineNumber
    _newNodeInserters(3228) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_modifierType
    _newNodeInserters(3492) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_offset
    _newNodeInserters(3580) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_offsetEnd
    _newNodeInserters(3668) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_order
    _newNodeInserters(3318) = nodes.NewMynodetype.InsertionHelpers.NewNodeInserter_Mynodetype_myproperty
    _newNodeInserters(680) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_code
    _newNodeInserters(768) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_columnNumber
    _newNodeInserters(2968) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_lineNumber
    _newNodeInserters(3408) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_name
    _newNodeInserters(3496) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_offset
    _newNodeInserters(3584) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_offsetEnd
    _newNodeInserters(3672) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_order
    _newNodeInserters(682) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_code
    _newNodeInserters(770) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_columnNumber
    _newNodeInserters(1738) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_filename
    _newNodeInserters(1826) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_fullName
    _newNodeInserters(2970) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_lineNumber
    _newNodeInserters(3410) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_name
    _newNodeInserters(3498) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_offset
    _newNodeInserters(3586) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_offsetEnd
    _newNodeInserters(3674) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_order
    _newNodeInserters(156) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentIndex
    _newNodeInserters(244) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentName
    _newNodeInserters(684) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_code
    _newNodeInserters(772) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_columnNumber
    _newNodeInserters(2972) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_lineNumber
    _newNodeInserters(3500) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_offset
    _newNodeInserters(3588) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_offsetEnd
    _newNodeInserters(3676) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_order
    _newNodeInserters(3414) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_name
    _newNodeInserters(4382) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_value
    _newNodeInserters(4736) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_node
    _newNodeInserters(4824) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_tag
    _newNodeInserters(162) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentIndex
    _newNodeInserters(250) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentName
    _newNodeInserters(690) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_code
    _newNodeInserters(778) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_columnNumber
    _newNodeInserters(2978) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_lineNumber
    _newNodeInserters(3418) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_name
    _newNodeInserters(3506) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_offset
    _newNodeInserters(3594) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_offsetEnd
    _newNodeInserters(3682) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_order
    _newNodeInserters(1836) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_fullName
    _newNodeInserters(3420) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_name
    _newNodeInserters(4212) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_typeDeclFullName
    _newNodeInserters(694) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_code
    _newNodeInserters(782) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_columnNumber
    _newNodeInserters(2982) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_lineNumber
    _newNodeInserters(3510) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_offset
    _newNodeInserters(3598) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_offsetEnd
    _newNodeInserters(3686) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_order
    _newNodeInserters(80) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_aliasTypeFullName
    _newNodeInserters(344) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentFullName
    _newNodeInserters(432) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentType
    _newNodeInserters(696) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_code
    _newNodeInserters(784) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_columnNumber
    _newNodeInserters(1752) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_filename
    _newNodeInserters(1840) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_fullName
    _newNodeInserters(1928) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_genericSignature
    _newNodeInserters(2368) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_inheritsFromTypeFullName
    _newNodeInserters(2544) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_isExternal
    _newNodeInserters(2984) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_lineNumber
    _newNodeInserters(3424) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_name
    _newNodeInserters(3512) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offset
    _newNodeInserters(3600) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offsetEnd
    _newNodeInserters(3688) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_order
    _newNodeInserters(698) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_code
    _newNodeInserters(786) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_columnNumber
    _newNodeInserters(2986) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_lineNumber
    _newNodeInserters(3426) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_name
    _newNodeInserters(3514) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_offset
    _newNodeInserters(3602) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_offsetEnd
    _newNodeInserters(3690) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_order
    _newNodeInserters(172) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentIndex
    _newNodeInserters(260) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentName
    _newNodeInserters(700) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_code
    _newNodeInserters(788) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_columnNumber
    _newNodeInserters(1404) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_dynamicTypeHintFullName
    _newNodeInserters(2988) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_lineNumber
    _newNodeInserters(3516) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_offset
    _newNodeInserters(3604) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_offsetEnd
    _newNodeInserters(3692) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_order
    _newNodeInserters(3956) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_possibleTypes
    _newNodeInserters(4308) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_typeFullName
    _newNodeInserters(174) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentIndex
    _newNodeInserters(262) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentName
    _newNodeInserters(702) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_code
    _newNodeInserters(790) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_columnNumber
    _newNodeInserters(966) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_containedRef
    _newNodeInserters(1406) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_dynamicTypeHintFullName
    _newNodeInserters(2990) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_lineNumber
    _newNodeInserters(3518) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_offset
    _newNodeInserters(3606) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_offsetEnd
    _newNodeInserters(3694) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_order
    _newNodeInserters(3870) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_parserTypeName
    _newNodeInserters(3958) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_possibleTypes
    _newNodeInserters(4310) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_typeFullName
    _newNodeInserters
  }
  override def getNumberOfNodeKinds: Int              = 44
  override def getNumberOfEdgeKinds: Int              = 24
  override def getNodeLabel(nodeKind: Int): String    = nodeLabels(nodeKind)
  override def getNodeKindByLabel(label: String): Int = nodeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getEdgeLabel(nodeKind: Int, edgeKind: Int): String = edgeLabels(edgeKind)
  override def getEdgeKindByLabel(label: String): Int = edgeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNodePropertyNames(nodeLabel: String): Set[String] = {
    nodeLabel match {
      case "ANNOTATION" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "ANNOTATION_LITERAL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "ANNOTATION_PARAMETER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "ANNOTATION_PARAMETER_ASSIGN" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "ARRAY_INITIALIZER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "BINDING" => Set("METHOD_FULL_NAME", "NAME", "SIGNATURE")
      case "BLOCK" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "CALL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DISPATCH_TYPE",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "SIGNATURE",
          "TYPE_FULL_NAME"
        )
      case "CLOSURE_BINDING" => Set("CLOSURE_BINDING_ID", "EVALUATION_STRATEGY")
      case "COMMENT"         => Set("CODE", "COLUMN_NUMBER", "FILENAME", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "CONFIG_FILE"     => Set("CONTENT", "NAME")
      case "CONTROL_STRUCTURE" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTROL_STRUCTURE_TYPE",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "PARSER_TYPE_NAME"
        )
      case "DEPENDENCY" => Set("DEPENDENCY_GROUP_ID", "NAME", "VERSION")
      case "FIELD_IDENTIFIER" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CANONICAL_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "FILE" =>
        Set("CODE", "COLUMN_NUMBER", "CONTENT", "HASH", "LINE_NUMBER", "NAME", "OFFSET", "OFFSET_END", "ORDER")
      case "FINDING" => Set("EVIDENCE_DESCRIPTION")
      case "IDENTIFIER" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "IMPORT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EXPLICIT_AS",
          "IMPORTED_AS",
          "IMPORTED_ENTITY",
          "IS_EXPLICIT",
          "IS_WILDCARD",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "JUMP_LABEL" =>
        Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "OFFSET", "OFFSET_END", "ORDER", "PARSER_TYPE_NAME")
      case "JUMP_TARGET" =>
        Set(
          "ARGUMENT_INDEX",
          "CODE",
          "COLUMN_NUMBER",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "PARSER_TYPE_NAME"
        )
      case "KEY_VALUE_PAIR" => Set("KEY", "VALUE")
      case "LITERAL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCAL" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "GENERIC_SIGNATURE",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "MEMBER" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "GENERIC_SIGNATURE",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "META_DATA" => Set("HASH", "LANGUAGE", "OVERLAYS", "ROOT", "VERSION")
      case "METHOD" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "COLUMN_NUMBER_END",
          "FILENAME",
          "FULL_NAME",
          "GENERIC_SIGNATURE",
          "HASH",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "LINE_NUMBER_END",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "SIGNATURE"
        )
      case "METHOD_PARAMETER_IN" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_PARAMETER_OUT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "TYPE_FULL_NAME"
        )
      case "METHOD_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_RETURN" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "MODIFIER"   => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "MODIFIER_TYPE", "OFFSET", "OFFSET_END", "ORDER")
      case "MYNODETYPE" => Set("MYPROPERTY")
      case "NAMESPACE"  => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "OFFSET", "OFFSET_END", "ORDER")
      case "NAMESPACE_BLOCK" =>
        Set("CODE", "COLUMN_NUMBER", "FILENAME", "FULL_NAME", "LINE_NUMBER", "NAME", "OFFSET", "OFFSET_END", "ORDER")
      case "RETURN" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "TAG"           => Set("NAME", "VALUE")
      case "TAG_NODE_PAIR" => Set()
      case "TEMPLATE_DOM" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "TYPE"          => Set("FULL_NAME", "NAME", "TYPE_DECL_FULL_NAME")
      case "TYPE_ARGUMENT" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "OFFSET", "OFFSET_END", "ORDER")
      case "TYPE_DECL" =>
        Set(
          "ALIAS_TYPE_FULL_NAME",
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "FILENAME",
          "FULL_NAME",
          "GENERIC_SIGNATURE",
          "INHERITS_FROM_TYPE_FULL_NAME",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "TYPE_PARAMETER" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "OFFSET", "OFFSET_END", "ORDER")
      case "TYPE_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "UNKNOWN" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTAINED_REF",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "PARSER_TYPE_NAME",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case _ => Set.empty
    }
  }
  override def getEdgePropertyName(label: String): Option[String] = {
    label match {
      case "REACHING_DEF" => Some("VARIABLE")
      case _              => None
    }
  }

  override def getPropertyLabel(nodeKind: Int, propertyKind: Int): String = {
    if (propertyKind < 51) normalNodePropertyNames(propertyKind)
    else if (propertyKind == 51 && nodeKind == 15) "evidence"      /*on node FINDING*/
    else if (propertyKind == 52 && nodeKind == 15) "keyValuePairs" /*on node FINDING*/
    else if (propertyKind == 53 && nodeKind == 36) "node"          /*on node TAG_NODE_PAIR*/
    else if (propertyKind == 54 && nodeKind == 36) "tag"           /*on node TAG_NODE_PAIR*/
    else null
  }

  override def getPropertyKindByName(label: String): Int =
    nodePropertyByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNumberOfPropertyKinds: Int = 55
  override def makeNode(graph: flatgraph.Graph, nodeKind: Short, seq: Int): nodes.StoredNode =
    nodeFactories(nodeKind)(graph, seq)
  override def makeEdge(
    src: flatgraph.GNode,
    dst: flatgraph.GNode,
    edgeKind: Short,
    subSeq: Int,
    property: Any
  ): flatgraph.Edge = edgeFactories(edgeKind)(src, dst, subSeq, property)
  override def allocateEdgeProperty(
    nodeKind: Int,
    direction: flatgraph.Edge.Direction,
    edgeKind: Int,
    size: Int
  ): Array[?] = edgePropertyAllocators(edgeKind)(size)
  override def getNodePropertyFormalType(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalType =
    nodePropertyDescriptors(propertyOffsetArrayIndex(nodeKind, propertyKind)).asInstanceOf[FormalQtyType.FormalType]
  override def getNodePropertyFormalQuantity(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalQuantity =
    nodePropertyDescriptors(1 + propertyOffsetArrayIndex(nodeKind, propertyKind))
      .asInstanceOf[FormalQtyType.FormalQuantity]

  override def getNewNodePropertyInserter(nodeKind: Int, propertyKind: Int): flatgraph.NewNodePropertyInsertionHelper =
    newNodeInsertionHelpers(propertyOffsetArrayIndex(nodeKind, propertyKind))
}
