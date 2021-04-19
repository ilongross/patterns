package jav.adapter_and_facade_patterns.facade.operations.types_operations;

public class Stop  implements Execute{
    @Override
    public void exe() {
        System.out.print("stop ");
    }
}
