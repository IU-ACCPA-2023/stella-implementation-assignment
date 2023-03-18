// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella;

/** Abstract Visitor */

public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
    /* Program */
    public R visit(stella.Absyn.AProgram p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LanguageDecl */
    public R visit(stella.Absyn.LanguageCore p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.LanguageDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Extension */
    public R visit(stella.Absyn.AnExtension p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Extension p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Decl */
    public R visit(stella.Absyn.DeclFun p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.DeclTypeAlias p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Decl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LocalDecl */
    public R visit(stella.Absyn.ALocalDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.LocalDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Annotation */
    public R visit(stella.Absyn.InlineAnnotation p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Annotation p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ParamDecl */
    public R visit(stella.Absyn.AParamDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.ParamDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ReturnType */
    public R visit(stella.Absyn.NoReturnType p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.SomeReturnType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.ReturnType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* ThrowType */
    public R visit(stella.Absyn.NoThrowType p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.SomeThrowType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.ThrowType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Expr */
    public R visit(stella.Absyn.If p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Let p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.LessThan p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.LessThanOrEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.GreaterThan p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.GreaterThanOrEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Equal p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.NotEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeAsc p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Abstraction p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Tuple p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Record p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Variant p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Match p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.List p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Add p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.LogicOr p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Multiply p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.LogicAnd p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Application p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.ConsList p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Head p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.IsEmpty p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Tail p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Succ p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.LogicNot p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Pred p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.IsZero p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Fix p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.NatRec p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Fold p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Unfold p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.DotRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.DotTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.ConstTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.ConstFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.ConstInt p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.Var p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Expr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* MatchCase */
    public R visit(stella.Absyn.AMatchCase p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.MatchCase p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Pattern */
    public R visit(stella.Absyn.PatternVariant p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternList p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternCons p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternInt p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternSucc p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.PatternVar p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Pattern p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* LabelledPattern */
    public R visit(stella.Absyn.ALabelledPattern p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.LabelledPattern p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Binding */
    public R visit(stella.Absyn.ABinding p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Binding p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Type */
    public R visit(stella.Absyn.TypeFun p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeRec p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeTuple p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeRecord p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeVariant p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeList p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeBool p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeNat p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeUnit p, A arg) { return visitDefault(p, arg); }
    public R visit(stella.Absyn.TypeVar p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* FieldType */
    public R visit(stella.Absyn.AFieldType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.FieldType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
    /* Typing */
    public R visit(stella.Absyn.ATyping p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(stella.Absyn.Typing p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
