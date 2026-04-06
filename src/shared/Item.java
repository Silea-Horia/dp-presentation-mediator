package shared;

import java.util.Objects;

public record Item(String name) {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item other) {
            return Objects.equals(other.name, this.name);
        }
        return false;
    }
}
