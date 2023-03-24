JDK 17.0.5, OpenJDK 64-Bit Server VM, 17.0.5+8-LTS

```
//with predicted input
Benchmark                 (strParams)  Mode  Cnt   Score   Error  Units
EnumValueOf0.enumMap            INDEX  avgt   10   4,703 ± 0,120  ns/op
EnumValueOf0.enumMap            index  avgt   10   4,689 ± 0,122  ns/op
EnumValueOf0.enumMap           CREATE  avgt   10   4,706 ± 0,036  ns/op
EnumValueOf0.enumMap           create  avgt   10   5,844 ± 0,120  ns/op
EnumValueOf0.enumSwitch         INDEX  avgt   10   3,485 ± 0,076  ns/op
EnumValueOf0.enumSwitch         index  avgt   10   3,496 ± 0,104  ns/op
EnumValueOf0.enumSwitch        CREATE  avgt   10   3,558 ± 0,090  ns/op
EnumValueOf0.enumSwitch        create  avgt   10   3,547 ± 0,046  ns/op
EnumValueOf0.enumValueOf        INDEX  avgt   10   5,779 ± 0,094  ns/op
EnumValueOf0.enumValueOf       CREATE  avgt   10   5,883 ± 0,088  ns/op
EnumValueOf0.naiveOf            INDEX  avgt   10  31,916 ± 0,537  ns/op
EnumValueOf0.naiveOf            index  avgt   10  30,849 ± 0,885  ns/op
EnumValueOf0.naiveOf           CREATE  avgt   10  36,030 ± 0,453  ns/op
EnumValueOf0.naiveOf           create  avgt   10  34,657 ± 0,331  ns/op
EnumValueOf0.ofMap              INDEX  avgt   10   6,297 ± 0,124  ns/op
EnumValueOf0.ofMap              index  avgt   10   6,312 ± 0,121  ns/op
EnumValueOf0.ofMap             CREATE  avgt   10   6,259 ± 0,053  ns/op
EnumValueOf0.ofMap             create  avgt   10   7,263 ± 0,104  ns/op
EnumValueOf0.ofSwitch           INDEX  avgt   10   4,124 ± 0,053  ns/op
EnumValueOf0.ofSwitch           index  avgt   10   4,138 ± 0,085  ns/op
EnumValueOf0.ofSwitch          CREATE  avgt   10   4,240 ± 0,250  ns/op
EnumValueOf0.ofSwitch          create  avgt   10   4,189 ± 0,042  ns/op
```

JDK 11.0.14, Java HotSpot(TM) 64-Bit Server VM, 11.0.14+8-LTS-263
```
//with predicted input
Benchmark                 (strParams)  Mode  Cnt   Score   Error  Units
EnumValueOf0.enumMap            INDEX  avgt   10   7,878 ± 0,169  ns/op
EnumValueOf0.enumMap            index  avgt   10   8,170 ± 0,205  ns/op
EnumValueOf0.enumMap           CREATE  avgt   10   8,938 ± 0,147  ns/op
EnumValueOf0.enumMap           create  avgt   10   9,254 ± 0,475  ns/op
EnumValueOf0.enumSwitch         INDEX  avgt   10   5,222 ± 0,078  ns/op
EnumValueOf0.enumSwitch         index  avgt   10   5,234 ± 0,086  ns/op
EnumValueOf0.enumSwitch        CREATE  avgt   10   5,907 ± 0,090  ns/op
EnumValueOf0.enumSwitch        create  avgt   10   5,386 ± 0,071  ns/op
EnumValueOf0.enumValueOf        INDEX  avgt   10   8,342 ± 0,291  ns/op
EnumValueOf0.enumValueOf       CREATE  avgt   10   8,205 ± 0,126  ns/op
EnumValueOf0.naiveOf            INDEX  avgt   10  44,931 ± 1,125  ns/op
EnumValueOf0.naiveOf            index  avgt   10  41,364 ± 0,803  ns/op
EnumValueOf0.naiveOf           CREATE  avgt   10  51,015 ± 0,903  ns/op
EnumValueOf0.naiveOf           create  avgt   10  48,560 ± 1,393  ns/op
EnumValueOf0.ofMap              INDEX  avgt   10  11,238 ± 6,380  ns/op
EnumValueOf0.ofMap              index  avgt   10   8,698 ± 0,419  ns/op
EnumValueOf0.ofMap             CREATE  avgt   10   9,040 ± 0,224  ns/op
EnumValueOf0.ofMap             create  avgt   10   9,865 ± 0,315  ns/op
EnumValueOf0.ofSwitch           INDEX  avgt   10   7,786 ± 0,441  ns/op
EnumValueOf0.ofSwitch           index  avgt   10   6,662 ± 0,098  ns/op
EnumValueOf0.ofSwitch          CREATE  avgt   10   6,710 ± 0,144  ns/op
EnumValueOf0.ofSwitch          create  avgt   10   6,675 ± 0,096  ns/op
```