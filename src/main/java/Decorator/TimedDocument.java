package Decorator;

import lombok.Getter;
import lombok.Setter;

public class TimedDocument extends SmartDocument {
    @Getter @Setter
    public SmartDocument doc;

    public TimedDocument(Document doc) {
        super(String.valueOf(doc));
    }
}
