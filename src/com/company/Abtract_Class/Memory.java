package Abtract_Class;

public class Memory {
    public static void main(String[] args) {

        // there are 2 types syntaxes for obj creation
        // 1.Shortcut
        Memory obj = new Memory();// unless new keyword encounter the memory is on stack area
        // 2. Long
        Memory obj2;// Stack
        obj2 = new Memory();
        // stack-> Temp Memory Area
        // Heap->permanemt memory area ,new Operator
    }
}