// File generated by the BNF Converter (bnfc 2.9.4.1).

package stella.Absyn;

public class PatternInr  extends Pattern {
  public final Pattern pattern_;
  public int line_num, col_num, offset;
  public PatternInr(Pattern p1) { pattern_ = p1; }

  public <R,A> R accept(stella.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof stella.Absyn.PatternInr) {
      stella.Absyn.PatternInr x = (stella.Absyn.PatternInr)o;
      return this.pattern_.equals(x.pattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.pattern_.hashCode();
  }


}
