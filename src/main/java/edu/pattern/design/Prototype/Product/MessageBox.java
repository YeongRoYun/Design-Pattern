package edu.pattern.design.Prototype.Product;

import edu.pattern.design.Prototype.Framework.Product;

/**
 * MessageBox
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
**/
public class MessageBox implements Product {
    @Override
    public String use(String content) {
        var output = "* " + content + " *";
        var deco = "*".repeat(output.length());
        return deco + "\n" + output + "\n" + deco;
    }

    @Override
    public Product createClone() {
        try{
            return (Product) clone();
        } catch(CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}