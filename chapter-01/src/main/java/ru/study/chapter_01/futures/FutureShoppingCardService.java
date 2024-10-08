package ru.study.chapter_01.futures;

import ru.study.chapter_01.commons.Input;
import ru.study.chapter_01.commons.Output;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureShoppingCardService implements ShoppingCardService {

    @Override
    public Future<Output> calculate(Input value) {
        FutureTask<Output> future = new FutureTask<>(() -> {
            Thread.sleep(1000);
            return new Output();
        });

        new Thread(future).start();

        return future;
    }
}
