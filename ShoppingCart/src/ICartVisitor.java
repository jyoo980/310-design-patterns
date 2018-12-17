public interface ICartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
