// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella;

/** All Visitor */

public interface AllVisitor<R,A> extends
  stella.Absyn.Program.Visitor<R,A>,
  stella.Absyn.LanguageDecl.Visitor<R,A>,
  stella.Absyn.Extension.Visitor<R,A>,
  stella.Absyn.Decl.Visitor<R,A>,
  stella.Absyn.LocalDecl.Visitor<R,A>,
  stella.Absyn.Annotation.Visitor<R,A>,
  stella.Absyn.ParamDecl.Visitor<R,A>,
  stella.Absyn.ReturnType.Visitor<R,A>,
  stella.Absyn.ThrowType.Visitor<R,A>,
  stella.Absyn.Expr.Visitor<R,A>,
  stella.Absyn.MatchCase.Visitor<R,A>,
  stella.Absyn.Pattern.Visitor<R,A>,
  stella.Absyn.LabelledPattern.Visitor<R,A>,
  stella.Absyn.Binding.Visitor<R,A>,
  stella.Absyn.Type.Visitor<R,A>,
  stella.Absyn.FieldType.Visitor<R,A>,
  stella.Absyn.Typing.Visitor<R,A>
{}