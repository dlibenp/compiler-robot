package MemoCompiler.Runtime;

/**
 * @author gandalf
 */
public class RuntimeComparisonDiffersInt extends RuntimeOperator {

    public RuntimeComparisonDiffersInt() {
        super();
    }

    @Override
    public void execute(Context context) {
        IntValue der = (IntValue) context.getStack().pop();
        IntValue izq = (IntValue) context.getStack().pop();

        IntValue rval = new IntValue(izq.getValue() != der.getValue() ? 1 : 0);
        context.getStack().push(rval);
        context.setCurrent(context.getCurrent() + 1);
    }
}
