package edu.pattern.design.Prototype.Product;

import edu.pattern.design.Prototype.Framework.Product;

/**
 * UnderlinePen
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class UnderlinePen implements Product {
    @Override
    public String use(String content) {
        var output = "\"" + content + "\"\n";
        output += "~".repeat(output.length());
        return output;
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}