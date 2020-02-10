package lesson8.homeWork;

public final class VariablesFinal {
/*
2. Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
Создайте для всех полей getter и setter.
ps: Задание с подвохом. Если что-то заметили, закомментируйте эту часть кода и напишите комментарий.
*/
    final private int FIRST_FINAL_VARIABLE = 100;
    final private double SECOND_FINAL_VARIABLE = 2.5;
    final private String THIRD_FINAL_VARIABLE = "THIRD VARIABLE";

    public VariablesFinal() {
    }


//    //Поскольку поля константы(не меняют своего значения) и присвоены значения, то возможно реализовать
//    //только пустой конструктор!!!
//    public VariablesFinal(int FIRST_FINAL_VARIABLE) {
//        this.FIRST_FINAL_VARIABLE = FIRST_FINAL_VARIABLE;
//    }
//
//    public VariablesFinal(int FIRST_FINAL_VARIABLE, double SECOND_FINAL_VARIABLE) {
//        this.FIRST_FINAL_VARIABLE = FIRST_FINAL_VARIABLE;
//        this.SECOND_FINAL_VARIABLE = SECOND_FINAL_VARIABLE;
//    }
//
//    public VariablesFinal(int FIRST_FINAL_VARIABLE, double SECOND_FINAL_VARIABLE, String THIRD_FINAL_VARIABLE) {
//        this.FIRST_FINAL_VARIABLE = FIRST_FINAL_VARIABLE;
//        this.SECOND_FINAL_VARIABLE = SECOND_FINAL_VARIABLE;
//        this.THIRD_FINAL_VARIABLE = THIRD_FINAL_VARIABLE;
//    }


    public int getFIRST_FINAL_VARIABLE() {
        return FIRST_FINAL_VARIABLE;
    }

////Поскольку поле константа с присвоенным значением, то установить новое значение не возможно.
//    public void setFIRST_FINAL_VARIABLE(int FIRST_FINAL_VARIABLE) {
//        this.FIRST_FINAL_VARIABLE = FIRST_FINAL_VARIABLE;
//    }

    public double getSECOND_FINAL_VARIABLE() {
        return SECOND_FINAL_VARIABLE;
    }

////Поскольку поле константа с присвоенным значением, то установить новое значение не возможно.
//    public void setSECOND_FINAL_VARIABLE(double SECOND_FINAL_VARIABLE) {
//        this.SECOND_FINAL_VARIABLE = SECOND_FINAL_VARIABLE;
//    }

    public String getTHIRD_FINAL_VARIABLE() {
        return THIRD_FINAL_VARIABLE;
    }

////Поскольку поле константа с присвоенным значением, то установить новое значение не возможно.
//    public void setTHIRD_FINAL_VARIABLE(String THIRD_FINAL_VARIABLE) {
//        this.THIRD_FINAL_VARIABLE = THIRD_FINAL_VARIABLE;
//    }
}

