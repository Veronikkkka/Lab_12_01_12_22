package Decorator;

import lombok.Getter;
import lombok.Setter;

public class CachedDocument extends SmartDocument {
    @Getter
    @Setter
    public SmartDocument doc;

    public CachedDocument(Document document) {
        super(String.valueOf(document));

    }
}
