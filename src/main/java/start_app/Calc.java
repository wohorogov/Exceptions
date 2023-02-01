package start_app;

import numbers.ComplexNumberlmpl;
import numbers.ComplexOpException;

public class Calc {
    public Calc() {
    }

    public void run() {
        ComplexNumberlmpl complexNumberlmpl = new ComplexNumberlmpl(12, 10);
        complexNumberlmpl.add(new ComplexNumberlmpl(2, 3));
        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());
        complexNumberlmpl.minus(new ComplexNumberlmpl(11, 6));
        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());
        complexNumberlmpl.multiply(new ComplexNumberlmpl(10, 7));
        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());

        try {
            complexNumberlmpl.divide(new ComplexNumberlmpl(0, 1));
            System.out.println("Деление выполнено успешно");
        }catch (ComplexOpException e) {
            System.out.println("Ошибка");
        }
    }
}
