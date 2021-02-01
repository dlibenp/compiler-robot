package MemoCompiler.Runtime;

/**
 * @author gandalf
 */
public class RuntimeComparisonGreaterThanOrEqualsFloat extends RuntimeOperator {

    public RuntimeComparisonGreaterThanOrEqualsFloat() {
        super();
    }

    @Override
    public void execute(Context context) {
        FloatValue der = (FloatValue) context.getStack().pop();
        FloatValue izq = (FloatValue) context.getStack().pop();

        IntValue rval = new IntValue(izq.getValue() >= der.getValue() ? 1 : 0);
        context.getStack().push(rval);
        context.setCurrent(context.getCurrent() + 1);
    }
}
