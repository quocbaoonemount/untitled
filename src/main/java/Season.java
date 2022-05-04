public enum Season {
    SPRING("Xuan"),
    SUMMER("Ha"),
    AUTUMN("Thu"),
    WINTER("Dong");

    String value;

    Season(String value) {this.value = value;}

    public String getValue() {
        return this.value;
    }

}
