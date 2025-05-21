import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    @DisplayName("Empty Cart creation")
    public void emptyCart() {
        ShoppingCart cart = new ShoppingCart();

        assertEquals(cart.getClass(), ShoppingCart.class);

        assertEquals(cart.getTotalPrice(), 0);
        assertEquals(cart.getItemCount(), 0);
    }

    @Test
    @DisplayName("Add products and remove")
    public void addProducts() {
        Product pomme = new Product("Pomme", 0.3);
        Product poire = new Product("Poire", 0.5);
        Product scoubidou = new Product("Scoubidou", 1.2);

        ShoppingCart cart = new ShoppingCart();

        assertEquals(cart.getTotalPrice(), 0);
        assertEquals(cart.getItemCount(), 0);

        cart.addProduct(pomme);
        cart.addProduct(poire);
        cart.addProduct(scoubidou);

        assertEquals(cart.getTotalPrice(), 2);
        assertEquals(cart.getItemCount(), 3);

        cart.clearCart();

        assertEquals(cart.getTotalPrice(), 0);
        assertEquals(cart.getItemCount(), 0);
    }

    @Test
    @DisplayName("Add null product")
    public void addNullProduct() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct(null));
    }

    
}
