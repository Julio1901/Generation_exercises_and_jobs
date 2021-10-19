enum class Numbers (val number : Int) {
    /**
     * Classe feita para evitar Magic Numbers em situações onde os
     * valores são delimitadores sem nenhum significado conceitual
     *
     * ex: Usar dentro do método substring para delimitar um número x de
     * letras
     */

    ZERO (0), ONE(1), TWO (2), THREE(3),
    FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9)

}