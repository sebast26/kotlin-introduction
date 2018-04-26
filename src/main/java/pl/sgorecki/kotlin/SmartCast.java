package pl.sgorecki.kotlin;

class SmartCast {

    public int area(final Figure figure) {
        if (figure instanceof Square) {
            return ((Square) figure).getSide() * ((Square) figure).getSide();
        }
        if (figure instanceof Rectangle) {
            return ((Rectangle) figure).getA() * ((Rectangle) figure).getB();
        }
        throw new RuntimeException();
    }

}
