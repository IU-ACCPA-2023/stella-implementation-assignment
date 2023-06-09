// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella.Absyn;

public class TryCatch  extends Expr {
  public final Expr expr_1, expr_2;
  public final Pattern pattern_;
  public int line_num, col_num, offset;
  public TryCatch(Expr p1, Pattern p2, Expr p3) { expr_1 = p1; pattern_ = p2; expr_2 = p3; }

  public <R,A> R accept(stella.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof stella.Absyn.TryCatch) {
      stella.Absyn.TryCatch x = (stella.Absyn.TryCatch)o;
      return this.expr_1.equals(x.expr_1) && this.pattern_.equals(x.pattern_) && this.expr_2.equals(x.expr_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.expr_1.hashCode())+this.pattern_.hashCode())+this.expr_2.hashCode();
  }


}
