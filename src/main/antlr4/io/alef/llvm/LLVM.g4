grammar LLVM;

module              :   entity+;

AtomicOrdering      :   'unordered'
                    |   'monotonic'
                    |   'acquire'
                    |   'release'
                    |   'acq_rel'
                    |   'seq_cst'
                    ;

argumentList        :   typedValue (',' typedValue)*;


basicBlock          :   Label? (statement)+; //todo instruction*

clause              :   'catch' typedValue
                    |   'filter' typedValue
                    ;

comdat              :   ',' 'comdat' ( '(' ComdatIdentifier ')' )?;

entity              :   'define' functionHeader functionBody //todo functionMetadata
                    |   'declare' functionHeader
                    ;

functionAttribute   :   AttributeGroupID ('{' functionAttribute* '}')?
                    |   'alignstack' IntegerLiteral
                    |   'alignstack' '=' IntegerLiteral  //attribute group format
                    |   'align' IntegerLiteral
                    |   'align' '=' IntegerLiteral      //attribute group format
                    |   'alwaysinline'
                    |   'builtin'
                    |   'cold'
                    |   'convergent'
                    |   'inaccessiblememonly'
                    |   'inaccessiblemem_or_argmemonly'
                    |   'inlinehint'
                    |   'jumptable'
                    |   'minsize'
                    |   'naked'
                    |   'nobuiltin'
                    |   'noduplicate'
                    |   'noimplicitfloat'
                    |   'noinline'
                    |   'nonlazybind'
                    |   'noredzone'
                    |   'noreturn'
                    |   'norecurse'
                    |   'nounwind'
                    |   'optnone'
                    |   'optsize'
                    |   'readnone'
                    |   'readonly'

                    |   'argmemonly' //not in c++

                    |   'returns_twice'
                    |   'ssp'
                    |   'sspreq'
                    |   'sspstrong'
                    |   'safestack'
                    |   'sanitize_address'
                    |   'sanitize_thread'
                    |   'sanitize_memory'
                    |   'uwtable'
                    |   'thunk'        //not in c++

                    |   String
                    ;

functionHeader      :   Linkage?
                        Visibility?
                        DllStorageClass?
                        CallingConvention?
                        returnAttribute*
                        type
                        GlobalIdentifier
                        '(' parameterList? ')'
                        UnamedAddress?
                        functionAttribute*
                        section?
                        comdat?
                    ;

functionBody        :   '{' basicBlock+ '}'; //todo useListOrderDirective*


instruction         :   'ret' typedValue
                    |   'ret' 'void'
                    |   'br' typedValue
                    |   'br' typedValue ',' typedValue ',' typedValue
                    |   'switch' typedValue ',' typedValue '['  (typedValue',' typedValue)* ']'
                    |   'indirectbr' typedValue ',' '[' typedValue (',' typedValue)* ']'
                    |   'invoke'
                            CallingConvention?
                            returnAttribute*
                            type
                            GlobalIdentifier
                            '(' argumentList? ')'
                            functionAttribute*
                            ('[' operandBundle (',' operandBundle)* ']')?
                            'to' typedValue
                            'unwind' typedValue
                    |   'resume' typedValue
                    |   'cleanupret' 'from' value 'unwind' 'to' 'caller'
                    |   'cleanupret' 'from' value 'unwind' typedValue
                    |   'catchret' 'from' value 'to' typedValue
                    |   'catchswitch' 'within' value '[' typedValue (',' typedValue)* ']' 'unwind' 'to' 'caller'
                    |   'catchswitch' 'within' value '[' typedValue (',' typedValue)* ']' 'unwind' typedValue
                    |   'catchpad' 'within' value '[' (typedValue (',' typedValue)*)? ']'
                    |   'cleanuppad' 'within' value '[' (typedValue (',' typedValue)*)? ']'
                    |   'add' 'nuw'? 'nsw'? type value ',' value
                    |   'sub' 'nuw'? 'nsw'? type value ',' value
                    |   'mul' 'nuw'? 'nsw'? type value ',' value
                    |   'shl' 'nuw'? 'nsw'? type value ',' value
                    |   'fadd' FastMathsFlag* type value ',' value
                    |   'fsub' FastMathsFlag* type value ',' value
                    |   'fmul' FastMathsFlag* type value ',' value
                    |   'fdiv' FastMathsFlag* type value ',' value
                    |   'frem' FastMathsFlag* type value ',' value
                    |   'sdiv' 'exact'? type value ',' value
                    |   'udiv' 'exact'? type value ',' value
                    |   'lshr' 'exact'? type value ',' value
                    |   'ashr' 'exact'? type value ',' value
                    |   'urem' type value ',' value
                    |   'srem' type value ',' value
                    |   'and' type value ',' value
                    |   'or' type value ',' value
                    |   'xor' type value ',' value
                    |   'icmp' IntPredicate type value ',' value
                    |   'fcmp' FastMathsFlag* FPPredicate type value ',' value
                    |   'trunc' typedValue 'to' type
                    |   'zext' typedValue 'to' type
                    |   'sext' typedValue 'to' type
                    |   'sext' typedValue 'to' type
                    |   'fptrunc' typedValue 'to' type
                    |   'fpext' typedValue 'to' type
                    |   'bitcast' typedValue 'to' type
                    |   'addrspacecast' typedValue 'to' type
                    |   'uitofp' typedValue 'to' type
                    |   'sitofp' typedValue 'to' type
                    |   'fptoui' typedValue 'to' type
                    |   'fptosi' typedValue 'to' type
                    |   'inttoptr' typedValue 'to' type
                    |   'ptrtoint' typedValue 'to' type
                    |   'select' typedValue ',' typedValue ','typedValue
                    |   'va_arg' typedValue ',' type
                    |   'extractelement' typedValue ',' typedValue
                    |   'insertelement' typedValue ',' typedValue ',' typedValue
                    |   'shufflevector' typedValue ',' typedValue ',' typedValue
                    |   'phi' type '[' value ',' value ']' (',' '[' value ',' value ']')*
                    |   'landingpad' type 'cleanup' clause*
                    |   'landingpad' type clause+
                    |   ('tail'| 'musttail'|'notail')? 'call' FastMathsFlag* CallingConvention? returnAttribute* type value '(' argumentList? ')' functionAttribute* operandBundle*
                    |   'alloca' 'inalloca'? type (',' typedValue)? (',' 'align' IntegerLiteral)?
                    |   'load' 'volatile'? type ',' typedValue (',' 'align' IntegerLiteral)?
                    |   'load' 'atomic' 'volatile'? type ',' typedValue 'singlethread'? AtomicOrdering  (',' 'align' IntegerLiteral)?
                    ;

operandBundle       :   String '(' typedValue (',' typedValue) * ')';

parameter           :   type parameterAttribute* LocalIdentifier?
                    |   '...'                               //must be last
                    ;

parameterAttribute  :   'align' IntegerLiteral
                    |   'byval'
                    |   'dereferenceable' '(' IntegerLiteral ')'
                    |   'dereferenceable_or_null' '(' IntegerLiteral ')'
                    |   'inalloca'
                    |   'inreg'
                    |   'nest'
                    |   'noalias'
                    |   'nocapture'
                    |   'nonnull'
                    |   'readnone'
                    |   'readonly'
                    |   'returned'
                    |   'signext'
                    |   'sret'
                    |   'zeroext'
                    |   String
                    ;

parameterList       :   parameter (',' parameter)*;

returnAttribute     :   String
                    |   'dereferenceable_or_null' '(' IntegerLiteral ')'
                    |   'dereferenceable' '(' IntegerLiteral ')'
                    |   'align' IntegerLiteral
                    |   'inreg'
                    |   'noalias'
                    |   'nonnull'
                    |   'signext'
                    |   'zeroext'
                    ;

section             :   ',' 'section' String;

statement           :   (LocalIdentifier '=')? instruction;

type                :   IntegerType
                    |   'half'
                    |   'float'
                    |   'double'
                    |   'fp128'
                    |   'x86_fp80'
                    |   'ppc_fp128'
                    |   'x86_mmx'
                    |   type '*'
                    |   '<' IntegerLiteral 'x' type '>'
                    |   'label'
                    |   'token'
                    |   'metadata'
                    |   '[' IntegerLiteral 'x' type ']'
                    |   '{' type (',' type)* '}'
                    |   '<' '{'  type (',' type)* '}' '>'
                    |   'opaque'
                    |   'void'
                    |   type '(' (type (',' type)*)? '...'? ')'
                    |   LocalIdentifier
                    ;

typedValue          :   type value;

value               :   GlobalIdentifier
                    |   LocalIdentifier
                    |   FloatLiteral
                    |   IntegerLiteral
                    |   CharArrayLiteral
                    |   'true'
                    |   'false'
                    |   'null'
                    |   'undef'
                    |   'zeroinitializer'
                    |   'none'
                    |   '{' typedValue (',' typedValue)* '}'
                    |   '<' typedValue (',' typedValue)* '>'
                    |   '[' typedValue (',' typedValue)* ']'
                    |   'asm' 'sideeffect'? 'alignstack'? 'inteldialect'? String ',' String
                    |   'blockaddress' '(' GlobalIdentifier ',' LocalIdentifier ')'
//                    http://llvm.org/docs/LangRef.html#constant-expressions
                    |   'trunc' '(' typedValue 'to' type ')'
                    |   'zext' '(' typedValue 'to' type ')'
                    |   'sext' '(' typedValue 'to' type ')'
                    |   'fptrunc' '(' typedValue 'to' type ')'
                    |   'fpext' '(' typedValue 'to' type ')'
                    |   'bitcast' '(' typedValue 'to' type ')'
                    |   'addrspacecast' '(' typedValue 'to' type ')'
                    |   'uitofp' '(' typedValue 'to' type ')'
                    |   'sitofp' '(' typedValue 'to' type ')'
                    |   'fptoui' '(' typedValue 'to' type ')'
                    |   'inttoptr' '(' typedValue 'to' type ')'
                    |   'ptrtoint' '(' typedValue 'to' type ')'
                    |   'extractvalue' '(' typedValue (',' index )+ ')'
                    |   'insertvalue' '(' value ',' value (',' index )+ ')'
                    |   'icmp' FPPredicate '(' typedValue ',' typedValue ')'
                    |   'fcmp' FPPredicate '(' typedValue ',' typedValue ')'
                    |   'add' '(' typedValue ',' typedValue  ')'
                    |   'fadd' '(' typedValue ',' typedValue  ')'
                    |   'sub' '(' typedValue ',' typedValue  ')'
                    |   'fsub' '(' typedValue ',' typedValue  ')'
                    |   'mul' '(' typedValue ',' typedValue  ')'
                    |   'fmul' '(' typedValue ',' typedValue  ')'
                    |   'udiv' '(' typedValue ',' typedValue  ')'
                    |   'sdiv' '(' typedValue ',' typedValue  ')'
                    |   'fdiv' '(' typedValue ',' typedValue  ')'
                    |   'urem' '(' typedValue ',' typedValue  ')'
                    |   'srem' '(' typedValue ',' typedValue  ')'
                    |   'frem' '(' typedValue ',' typedValue  ')'
                    |   'shl' '(' typedValue ',' typedValue  ')'
                    |   'lshl' '(' typedValue ',' typedValue  ')'
                    |   'ashr' '(' typedValue ',' typedValue  ')'
                    |   'and' '(' typedValue ',' typedValue  ')'
                    |   'or' '(' typedValue ',' typedValue  ')'
                    |   'xor' '(' typedValue ',' typedValue  ')'
                    //todo
                    ;

index               :   IntegerLiteral
                    |   MetadataIdentifier
                    ;

AttributeGroupID    :   '#' Digit+;

UnamedAddress       :   'unnamed_addr';

CallingConvention   :   'ccc'
                    |   'fastcc'
                    |   'coldcc'
                    |   'x86_stdcallcc'
                    |   'x86_fastcallcc'
                    |   'x86_thiscallcc'
                    |   'x86_vectorcallcc'
                    |   'arm_apcscc'
                    |   'arm_aapcscc'
                    |   'arm_aapcs_vfpcc'
                    |   'msp430_intrcc'
                    |   'ptx_kernel'
                    |   'ptx_device'
                    |   'spir_kernel'
                    |   'spir_func'
                    |   'intel_ocl_bicc'
                    |   'x86_64_sysvcc'
                    |   'x86_64_win64cc'
                    |   'webkit_jscc'
                    |   'anyregcc'
                    |   'preserve_mostcc'
                    |   'preserve_allcc'
                    |   'ghccc'
                    |   'x86_intrcc'
                    |   'hhvmcc'
                    |   'hhvm_ccc'
                    |   'cxx_fast_tlscc'
                    |   'cc' Digit+
                    ;

IntegerType         :   'i'Digit+;

Label               :   [-a-zA-Z$._0-9]+ ':';

Linkage             :   'private'
                    |   'internal'
                    |   'weak'
                    |   'weak_odr'
                    |   'linkonce'
                    |   'linkonce_odr'
                    |   'available_externally'
                    |   'appending'
                    |   'common'
                    |   'extern_weak'
                    |   'external'
                    ;

LocalIdentifier     :   '%'[-a-zA-Z$._][-a-zA-Z$._0-9]*
                    |   '%'[0-9]+
                    |   '%''"'(~'"')* '"'
                    ;

MetadataIdentifier  :   '!'[-a-zA-Z$._][-a-zA-Z$._0-9]*;

DllStorageClass     :   'dllimport'
                    |   'dllexport'
                    ;

Scope               :   ('global'|'constant'); //todo review name

Visibility          :   'default'
                    |   'hidden'
                    |   'protected'
                    ;

String              :   '"'(~'"')*'"';

ThreadLocal         :   'localdynamic'
                    |   'initialexec'
                    |   'localexec'
                    ;

FPPredicate         :   'oeq'
                    |   'one'
                    |   'olt'
                    |   'ogt'
                    |   'ole'
                    |   'oge'
                    |   'ord'
                    |   'uno'
                    |   'ueq'
                    |   'une'
                    |   'ult'
                    |   'ugt'
                    |   'ule'
                    |   'uge'
                    |   'true'      //todo review clash with value
                    |   'false'     //todo review clash with value
                    ;

IntPredicate        :   'eq'
                    |   'ne'
                    |   'ugt'
                    |   'uge'
                    |   'ult'
                    |   'ule'
                    |   'sqt'
                    |   'sge'
                    |   'slt'
                    |   'sle'
                    ;

CharArrayLiteral    :   'c'String;

ComdatIdentifier    :   '$'[-a-zA-Z$._][-a-zA-Z$._0-9]*;

FloatLiteral        :   HexFPLiteral
                    |   HexFP80Literal
                    |   HexFP128Literal
                    |   HexPPC128Literal
                    |   HexHalfLiteral
                    |   DecimalFPLiteral
                    ;

IntegerLiteral      :   [+-]?Digit+; //todo review - usage implies -ve numbers are allowed in contexts where they are not valid

//IntegerLiteral      :   Digit+;

fragment Digit      :	[0-9];

FastMathsFlag       :   'fast'
                    |   'nnan'
                    |   'ninf'
                    |   'nsz'
                    |   'arcp'
                    ;

GlobalIdentifier    :   '@'[-a-zA-Z$._][-a-zA-Z$._0-9]*
                    |   '@'[0-9]+
                    |   '@''"'(~'"')* '"'
                    ;

fragment
DecimalFPLiteral    :   [-+]?Digit+[.]Digit*([eE][-+]?Digit+)?;

fragment
HexFPLiteral        :   '0x'[0-9A-Fa-f]+;

fragment
HexFP80Literal      :   '0xK'[0-9A-Fa-f]+;

fragment
HexFP128Literal     :   '0xL'[0-9A-Fa-f]+;

fragment
HexPPC128Literal    :   '0xM'[0-9A-Fa-f]+;

fragment
HexHalfLiteral      :   '0xH'[0-9A-Fa-f]+;

WS                  :   [ \t\n\r] + -> skip;

COMMENT             :   ';' ~[\r\n]* -> skip;
