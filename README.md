Compile a release build to see the error:
    
    ./scripts/release

Looks like:

```bash
SEVERE: /Users/raspasov/projects/tmp/hello-world-mies/release/cljs/core/async.js:1426: ERROR - Parse error. No newline allowed before '=>'
var inst_14201 = async(inst_14200);
                                  ^

Feb 26, 2017 1:38:59 PM com.google.javascript.jscomp.LoggerErrorManager printSummary
WARNING: 1 error(s), 0 warning(s)
ERROR: JSC_PARSE_ERROR. Parse error. No newline allowed before '=>' at /Users/raspasov/projects/tmp/hello-world-mies/release/cljs/core/async.js line 1426 : 34
```