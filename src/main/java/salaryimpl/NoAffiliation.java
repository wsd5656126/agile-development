package salaryimpl;

/**
 * @author wusd
 * @date 2020/2/18 22:18
 */
public class NoAffiliation implements Affiliation {
    @Override
    public double calculateDeductions(Paycheck pc) {
        return 0;
    }
}
