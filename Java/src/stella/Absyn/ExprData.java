// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella.Absyn;

public abstract class ExprData implements java.io.Serializable {
  public abstract <R,A> R accept(ExprData.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(stella.Absyn.NoExprData p, A arg);
    public R visit(stella.Absyn.SomeExprData p, A arg);

  }

}
