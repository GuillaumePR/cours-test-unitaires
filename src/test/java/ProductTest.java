import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    @DisplayName("Create negative price product")
    public void negativePriceProduct() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Pomme", -1));
    }
}
