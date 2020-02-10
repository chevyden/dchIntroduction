package lesson8.homeWork;

public class Variables {

/*
1. Создайте новый класс, у которого должно быть 9 переменных (8 примитивов разного типа + String);
Для каждой переменной напишите getter и setter;
Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;
*/

    private byte variableByte;
    private short variableShort;
    private int variableInt;
    private long variableLong;
    private float variableFloat;
    private double variableDouble;
    private char variableChar;
    private boolean variableBoolean;

    private String variableString;

    public Variables() {
    }

    public Variables(byte variableByte) {
        this.variableByte = variableByte;
    }

    public Variables(byte variableByte, short variableShort) {
        this.variableByte = variableByte;
        this.variableShort = variableShort;
    }

    public Variables(byte variableByte, short variableShort, int variableInt) {
        this.variableByte = variableByte;
        this.variableShort = variableShort;
        this.variableInt = variableInt;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong) {
        this.variableByte = variableByte;
        this.variableShort = variableShort;
        this.variableInt = variableInt;
        this.variableLong = variableLong;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong, float variableFloat) {
        this(variableByte, variableShort, variableInt, variableLong);
        this.variableFloat = variableFloat;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong, float variableFloat,
                     double variableDouble) {
        this(variableByte, variableShort, variableInt, variableLong, variableFloat);
        this.variableDouble = variableDouble;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong, float variableFloat,
                     double variableDouble, char variableChar) {
        this(variableByte, variableShort, variableInt, variableLong, variableFloat, variableDouble);
        this.variableChar = variableChar;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong, float variableFloat,
                     double variableDouble, char variableChar, boolean variableBoolean) {
        this(variableByte, variableShort, variableInt, variableLong, variableFloat, variableDouble, variableChar);
        this.variableBoolean = variableBoolean;
    }

    public Variables(byte variableByte, short variableShort, int variableInt, long variableLong, float variableFloat,
                     double variableDouble, char variableChar, boolean variableBoolean, String variableString) {
        this(variableByte, variableShort, variableInt, variableLong, variableFloat, variableDouble, variableChar, variableBoolean);
        this.variableString = variableString;
    }

    public byte getVariableByte() {
        return variableByte;
    }

    public void setVariableByte(byte variableByte) {
        this.variableByte = variableByte;
    }

    public short getVariableShort() {
        return variableShort;
    }

    public void setVariableShort(short variableShort) {
        this.variableShort = variableShort;
    }

    public int getVariableInt() {
        return variableInt;
    }

    public void setVariableInt(int variableInt) {
        this.variableInt = variableInt;
    }

    public long getVariableLong() {
        return variableLong;
    }

    public void setVariableLong(long variableLong) {
        this.variableLong = variableLong;
    }

    public float getVariableFloat() {
        return variableFloat;
    }

    public void setVariableFloat(float variableFloat) {
        this.variableFloat = variableFloat;
    }

    public double getVariableDouble() {
        return variableDouble;
    }

    public void setVariableDouble(double variableDouble) {
        this.variableDouble = variableDouble;
    }

    public char getVariableChar() {
        return variableChar;
    }

    public void setVariableChar(char variableChar) {
        this.variableChar = variableChar;
    }

    public boolean getVariableBoolean() {
        return variableBoolean;
    }

    public void setVariableBoolean(boolean variableBoolean) {
        this.variableBoolean = variableBoolean;
    }

    public String getVariableString() {
        return variableString;
    }

    public void setVariableString(String variableString) {
        this.variableString = variableString;
    }
}
