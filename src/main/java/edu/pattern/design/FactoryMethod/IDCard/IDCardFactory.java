package edu.pattern.design.FactoryMethod.IDCard;

import edu.pattern.design.FactoryMethod.Framework.Factory;
import edu.pattern.design.FactoryMethod.Framework.Product;
import lombok.Getter;

import java.util.ArrayList;

/**
 * IDCardFactory
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
@Getter
public class IDCardFactory extends Factory {
    private final ArrayList<String> idCards;

    public IDCardFactory() {
        idCards = new ArrayList<>();
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        idCards.add(((IDCard) product).getOwner());
    }
}