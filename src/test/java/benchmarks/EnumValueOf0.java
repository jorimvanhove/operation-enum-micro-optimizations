package benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10, time = 1)
public class EnumValueOf0 {

    @Param({"INDEX", "index", "CREATE", "create"})
    String strParams;

    @Benchmark
    public Operation enumValueOf() {
        return Operation.valueOf(strParams);
    }

    @Benchmark
    public Operation enumSwitch() {
        return Operation.valueOfSwitch(strParams);
    }

    @Benchmark
    public Operation enumMap() {
        return Operation.valueOfMap(strParams);
    }

    @Benchmark
    public Optional<Operation> naiveOf() {
        return Operation.naiveOf(strParams);
    }

    @Benchmark
    public Optional<Operation> ofMap() {
        return Operation.ofMap(strParams);
    }

    @Benchmark
    public Optional<Operation> ofSwitch() {
        return Operation.ofSwitch(strParams);
    }
}
