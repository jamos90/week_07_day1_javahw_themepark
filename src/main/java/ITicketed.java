public interface ITicketed {

    double defaultPrice();

    double doublePriceFor(Visitor guest);
}
