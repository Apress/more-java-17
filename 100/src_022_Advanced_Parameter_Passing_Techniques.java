// Assigns 1969 to engineScopeYear and 1982 to 
// globalScopeYear 
int engineScopeYear = (Integer) ctx.getAttribute(
    "year", ScriptContext.ENGINE_SCOPE); 
int globalScopeYear = (Integer) ctx.getAttribute(
    "year", ScriptContext.GLOBAL_SCOPE); 
