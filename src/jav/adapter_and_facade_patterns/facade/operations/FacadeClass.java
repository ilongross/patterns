package jav.adapter_and_facade_patterns.facade.operations;

import jav.adapter_and_facade_patterns.facade.operations.types_operations.Execute;

public class FacadeClass {
    private Execute back, cycle, jump, repeat, run, stop, superSpeed;

    public FacadeClass(Execute back, Execute cycle, Execute jump,
                       Execute repeat, Execute run, Execute stop,
                       Execute superSpeed) {
        this.back = back;
        this.cycle = cycle;
        this.jump = jump;
        this.repeat = repeat;
        this.run = run;
        this.stop = stop;
        this.superSpeed = superSpeed;
    }

    public void standard() {
        System.out.print("Standard: ");
        run.exe();
        stop.exe();
        System.out.println();
    }

    public void cycles() {
        System.out.print("Cycles: ");
        run.exe();
        stop.exe();
        cycle.exe();
        repeat.exe();
        stop.exe();
        System.out.println();
    }

    public void variable() {
        System.out.print("Variable: ");
        run.exe();
        superSpeed.exe();
        back.exe();
        cycle.exe();
        jump.exe();
        superSpeed.exe();
        stop.exe();
        run.exe();
        stop.exe();
        System.out.println();
    }

}
