// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella.Absyn;

public class Panic  extends Expr {
  public int line_num, col_num, offset;
  public Panic() { }

  public <R,A> R accept(stella.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof stella.Absyn.Panic) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}