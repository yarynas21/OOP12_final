package apps.ucu.edu.ua.tasks;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    private Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    public Consumer<T> getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer<T> consumerFirst) {
        this.consumer = consumerFirst;
    }
}
