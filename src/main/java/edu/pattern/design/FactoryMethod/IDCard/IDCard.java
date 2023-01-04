package edu.pattern.design.FactoryMethod.IDCard;

import edu.pattern.design.FactoryMethod.Framework.Product;
import lombok.Getter;

/**
 * IDCard
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
@Getter
public class IDCard extends Product {
    private final String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public String use() {
        return "Verify " + owner;
    }
}