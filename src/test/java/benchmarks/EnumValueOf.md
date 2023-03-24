JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
//with random input
Benchmark                 Mode  Cnt   Score   Error  Units
EnumValueOf.enumValueOf   avgt   10  10,303 ± 0,244  ns/op
EnumValueOf.ofMap         avgt   10   6,769 ± 0,167  ns/op
EnumValueOf.ofSwitch      avgt   10   8,386 ± 0,733  ns/op
```