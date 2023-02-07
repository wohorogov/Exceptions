package start_app;

import numbers.ComplexNumber;
import numbers.ComplexNumberlmpl;
import numbers.ComplexOpException;
import resource.MyResourceImpl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Calc {
    public static final int MAXCOUNT = 1000000;
    public static final int COUNT = 100000;
    public Calc() {
    }

    public void run() {

//        ComplexNumberlmpl complexNumberlmpl = new ComplexNumberlmpl(12, 10);
//        complexNumberlmpl.add(new ComplexNumberlmpl(2, 3));
//        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());
//        complexNumberlmpl.minus(new ComplexNumberlmpl(11, 6));
//        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());
//        complexNumberlmpl.multiply(new ComplexNumberlmpl(10, 7));
//        System.out.println("Действительная часть "+complexNumberlmpl.getRealPart() + " мнимая часть " + complexNumberlmpl.getImaginaryPart());
//
//        try(MyResourceImpl myResource = new MyResourceImpl()){
//            myResource.open();
//            complexNumberlmpl.divide(new ComplexNumberlmpl(0, 1));
//            System.out.println("Деление выполнено успешно");
//        }catch (ComplexOpException e) {
//            System.out.println("Ошибка");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        runWithCollections();
    }

    public void runWithCollections() {
        List<ComplexNumberlmpl> list = new ArrayList<>();
        List<ComplexNumberlmpl> listLink = new LinkedList<>();
        Map<Integer, ComplexNumber>  map = new HashMap<>();
        Set<ComplexNumber> set = new HashSet<>();
        System.out.println((int)(Math.random() * 100));
        System.out.println("Начало заполнения ArrayList " + LocalDateTime.now());
        for (int i = 0; i < MAXCOUNT; i++) {
            list.add(new ComplexNumberlmpl((int)(Math.random() * 100), (int)(Math.random() * 100)));
        }
        System.out.println("Конец заполнения ArrayList " + LocalDateTime.now());

        System.out.println("Начало заполнения LinkedList " + LocalDateTime.now());
        for (int i = 0; i < MAXCOUNT; i++) {
            listLink.add(new ComplexNumberlmpl((int)Math.random() * 100, (int)Math.random() *100));
        }
        System.out.println("Конец заполнения LinkedList " + LocalDateTime.now());

        System.out.println("Изменение " + COUNT + " элементов ArrayList " + LocalDateTime.now());
        for (int i = 0; i < COUNT; i++) {
            list.set(i + COUNT, new ComplexNumberlmpl((int)Math.random() * 100, (int)Math.random() *100));
        }
        System.out.println("Конец Изменение " + COUNT + " элементов ArrayList " + LocalDateTime.now());

        System.out.println("Изменение " + COUNT + " элементов LinkedList " + LocalDateTime.now());
        for (int i = 0; i < COUNT; i++) {
            listLink.set(i + COUNT, new ComplexNumberlmpl((int)Math.random() * 100, (int)Math.random() *100));
        }
        System.out.println("Конец Изменение " + COUNT + " элементов LinkedList " + LocalDateTime.now());

        ComplexNumber maxComplexArrayList = new ComplexNumberlmpl(0, 0);
        ComplexNumber maxComplexLinkedList = new ComplexNumberlmpl(0, 0);

        System.out.println("Нахождение сумм всех частей ArrayList " + LocalDateTime.now());
        for (int i = 0; i < MAXCOUNT; i++) {
            maxComplexArrayList.add(list.get(i));
        }
        System.out.println("Конец нахождения сумм всех частей ArrayList " + LocalDateTime.now());

        System.out.println("Нахождение сумм всех частей LinkedList " + LocalDateTime.now());
        for (int i = 0; i < MAXCOUNT; i++) {
            maxComplexLinkedList.add(listLink.get(i));
        }
        System.out.println("Конец нахождения сумм всех частей LinkedList " + LocalDateTime.now());
        Comparator<ComplexNumberlmpl> comparator = (o1, o2) -> o1.compareTo(o2);
        ComplexNumberlmpl maxComplexNumberlmpl = Collections.max(list, comparator);
        ComplexNumberlmpl minComplexNumberlmpl = Collections.min(list, comparator);
        System.out.println("Максимальное число " + maxComplexNumberlmpl.getRealPart() +
                           " + " + maxComplexNumberlmpl.getImaginaryPart() + "i");
        System.out.println("Минимальное число " + minComplexNumberlmpl.getRealPart() +
                           " + " + minComplexNumberlmpl.getImaginaryPart() + "i");
    }
}
