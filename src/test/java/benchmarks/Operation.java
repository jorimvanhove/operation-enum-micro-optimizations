package benchmarks;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Operation {
    INDEX( "index" ),
    CREATE( "create" ),
    UPDATE( "update" ),
    DELETE( "delete" );

    private final String label;

    Operation( String label ) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static Optional<Operation> naiveOf( String value ) {
        return EnumSet.allOf( Operation.class )
                      .stream()
                      .filter( op -> op.label.equals( value ) || op.name().equals( value ) )
                      .findFirst();
    }

    public static Optional<Operation> ofMap( String value ) {
        return Optional.ofNullable( valueOfMap( value ) );
    }

    public static Optional<Operation> ofSwitch( String value ) {
        return Optional.ofNullable( valueOfSwitch( value ) );
    }

    private final static Map<String, Operation> cache;
    static {
        cache = new HashMap<>();
        for (Operation widgetProperty : values()) {
            cache.put(widgetProperty.name(), widgetProperty);
            cache.put(widgetProperty.label, widgetProperty);
        }
    }

    public static Operation valueOfMap(String value) {
        return cache.get(value);
    }

    public static Operation valueOfSwitch(String value) {
        switch (value) {
            case "index":
            case "INDEX" :
                return Operation.INDEX;
            case "create":
            case "CREATE" :
                return Operation.CREATE;
            case "update":
            case "UPDATE" :
                return Operation.UPDATE;
            case "delete":
            case "DELETE" :
                return Operation.DELETE;
        }
        return null;
    }

}
