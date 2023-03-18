#pragma once
#include "Eval.h"
#include "Stella/Absyn.H"

namespace Stella {

Expr *eval(Expr *expr) {
  if (!expr) {
    return nullptr;
  }

  return expr;
}

Expr *evalMainWith(Program *prog, Expr *expr) {
  if (!expr) {
    return nullptr;
  }

  return expr;
}

} // namespace Stella
