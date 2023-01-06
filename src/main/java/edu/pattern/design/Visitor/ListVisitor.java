package edu.pattern.design.Visitor;

/**
 * ListVisitor : Concrete Visitor
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class ListVisitor implements Visitor {
    private String currentDir = "";

    @Override
    public String visit(File file) {
        return currentDir + "/" + file + "\n";
    }

    @Override
    public String visit(Directory directory) {
        try {
            final var builder = new StringBuilder();
            builder.append(currentDir).append("/").append(directory).append("\n");
            var iter = directory.iterator();
            final var savedDir = currentDir;
            currentDir = currentDir + "/" + directory.getName();
            while (iter.hasNext()) {
                Entity entity = (Entity) iter.next();
                builder.append(entity.accept(this));
            }
            currentDir = savedDir;
            return builder.toString();
        } catch (FileTreatmentException e) {
            throw new RuntimeException(e);
        }
    }
}